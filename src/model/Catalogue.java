package model;

import java.util.ArrayList;
import java.util.List;

public class Catalogue {

    private List<Livre> livres = new ArrayList<>();
    private List<Exemplaire> exemplaires = new ArrayList<>();

    public void ajouterLivre(Livre livre) {
        livres.add(livre);
    }

    public void ajouterExemplaire(Exemplaire exemplaire) {
        exemplaires.add(exemplaire);
    }

    public List<Livre> getLivres() {
        return livres;
    }

    public List<Exemplaire> getExemplaires() {
        return exemplaires;
    }

    public Exemplaire trouverExemplaireParRfid(String rfid) {
        for (Exemplaire e : exemplaires) {
            if (e.getRfid().equals(rfid)) return e;
        }
        return null;
    }
}
