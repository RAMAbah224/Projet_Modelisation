package model;

public class Livre {
    private String titre;
    private String auteur;
    private String edition;
    private int anneeParution;
    private int pages;

    public Livre(String titre, String auteur, String edition, int anneeParution, int pages) {
        this.titre = titre;
        this.auteur = auteur;
        this.edition = edition;
        this.anneeParution = anneeParution;
        this.pages = pages;
    }

    public String getTitre() { return titre; }
    public String getAuteur() { return auteur; }
    public String getEdition() { return edition; }
    public int getAnneeParution() { return anneeParution; }
    public int getPages() { return pages; }
}
