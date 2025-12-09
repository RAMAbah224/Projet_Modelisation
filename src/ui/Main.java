package ui;

import model.Catalogue;
import service.CatalogueLoader;

public class Main {
    public static void main(String[] args) {

        String chemin = "data/catalogue.csv";

        System.out.println("Chargement du catalogue...");
        Catalogue catalogue = CatalogueLoader.chargerCatalogue(chemin);

        System.out.println("Système prêt.");
    }
}
