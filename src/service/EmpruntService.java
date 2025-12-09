package service;

import model.Catalogue;
import model.Exemplaire;
import model.Emprunt;
import model.Usager;

import java.time.LocalDate;

public class EmpruntService {

    public boolean emprunter(String rfid, Usager usager, Catalogue catalogue) {

        Exemplaire ex = catalogue.trouverExemplaireParRfid(rfid);

        if (ex == null) {
            System.out.println("Erreur : RFID introuvable.");
            return false;
        }

        if (!ex.isDisponible()) {
            System.out.println("Erreur : exemplaire déjà emprunté.");
            return false;
        }

        // Marquer comme emprunté
        ex.setDisponible(false);

        // Dates
        LocalDate aujourdHui = LocalDate.now();
        LocalDate dateRetour = aujourdHui.plusDays(21);

        // Créer l'emprunt
        Emprunt emprunt = new Emprunt(ex, aujourdHui, dateRetour);
        usager.ajouterEmprunt(emprunt);

        System.out.println("Emprunt réussi : " + ex.getLivre().getTitre());
        return true;
    }
}
