package model;

import java.time.LocalDate;

public class Emprunt {

    private final Exemplaire exemplaire;
    private final LocalDate dateEmprunt;
    private final LocalDate dateRetour;

    public Emprunt(Exemplaire exemplaire, LocalDate dateEmprunt, LocalDate dateRetour) {
        this.exemplaire = exemplaire;
        this.dateEmprunt = dateEmprunt;
        this.dateRetour = dateRetour;
    }

    public Exemplaire getExemplaire() {
        return exemplaire;
    }

    public LocalDate getDateEmprunt() {
        return dateEmprunt;
    }

    public LocalDate getDateRetour() {
        return dateRetour;
    }
}
