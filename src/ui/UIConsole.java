package ui;

import model.Catalogue;
import model.Emprunt;
import model.Usager;
import service.AuthService;
import service.EmpruntService;

import java.io.PrintWriter;
import java.util.Scanner;

public class UIConsole {

    private AuthService authService;
    private EmpruntService empruntService;
    private Catalogue catalogue;

    public UIConsole(AuthService authService, EmpruntService empruntService, Catalogue catalogue) {
        this.authService = authService;
        this.empruntService = empruntService;
        this.catalogue = catalogue;
    }

    public void lancer() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Authentification ===");
        System.out.print("Numéro de compte : ");
        String numero = scanner.nextLine();

        System.out.print("NIP : ");
        String nip = scanner.nextLine();

        Usager usager = authService.authentifier(numero, nip);

        if (usager == null) {
            System.out.println("Authentification échouée.");
            return;
        }

        System.out.println("Bienvenue " + usager.getNumeroCompte());
        System.out.println("Scannez les RFID (000000 pour terminer)");

        while (true) {
            System.out.print("RFID : ");
            String rfid = scanner.nextLine();

            if (rfid.equals("000000")) {
                break;
            }

            empruntService.emprunter(rfid, usager, catalogue);
        }

        System.out.println("Fin des emprunts.");

        genererRecu(usager);
        sauvegarderRecu(usager);
    }

    private void genererRecu(Usager usager) {
        System.out.println("\n===== REÇU D'EMPRUNT =====");
        System.out.println("Usager : " + usager.getNumeroCompte());
        System.out.println();

        int i = 1;
        for (Emprunt e : usager.getEmprunts()) {
            System.out.println(i + ". "
                    + e.getExemplaire().getLivre().getTitre()
                    + " (retour : " + e.getDateRetour() + ")");
            i++;
        }

        System.out.println("==========================\n");
    }

    private void sauvegarderRecu(Usager usager) {
        try {
            String nomFichier = "dist/recu_" + usager.getNumeroCompte() + ".txt";
            PrintWriter writer = new PrintWriter(nomFichier);

            writer.println("===== REÇU D'EMPRUNT =====");
            writer.println("Usager : " + usager.getNumeroCompte());
            writer.println();

            int i = 1;
            for (Emprunt e : usager.getEmprunts()) {
                writer.println(i + ". "
                        + e.getExemplaire().getLivre().getTitre()
                        + " (retour : " + e.getDateRetour() + ")");
                i++;
            }

            writer.println("==========================");
            writer.close();

            System.out.println("Reçu sauvegardé dans : " + nomFichier);

        } catch (Exception e) {
            System.out.println("Erreur lors de l'enregistrement du reçu : " + e.getMessage());
        }
    }
}
