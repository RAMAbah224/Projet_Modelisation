package model;

import java.util.ArrayList;
import java.util.List;

public class Usager {
    private String numeroCompte;
    private String nip;
    private List<Exemplaire> emprunts = new ArrayList<>();

    public Usager(String numeroCompte, String nip) {
        this.numeroCompte = numeroCompte;
        this.nip = nip;
    }

    public String getNumeroCompte() { return numeroCompte; }
    public String getNip() { return nip; }

    public List<Exemplaire> getEmprunts() {
        return emprunts;
    }

    public void ajouterEmprunt(Exemplaire ex) {
        emprunts.add(ex);
    }
}
