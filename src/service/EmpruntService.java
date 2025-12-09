package service;

import model.Catalogue;
import model.Exemplaire;
import model.Usager;

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

        ex.setDisponible(false);
        usager.ajouterEmprunt(ex);

        System.out.println("Emprunt réussi : " + ex.getLivre().getTitre());
        return true;
    }
}
