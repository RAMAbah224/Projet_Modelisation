package ui;

import model.Catalogue;
import model.Usager;
import service.AuthService;
import service.EmpruntService;

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
    }
}
