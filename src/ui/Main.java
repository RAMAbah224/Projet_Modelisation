package ui;

import model.Catalogue;
import service.AuthService;
import service.CatalogueLoader;
import service.EmpruntService;

public class Main {
    public static void main(String[] args) {

        Catalogue catalogue = CatalogueLoader.chargerCatalogue("data/catalogue.csv");

        AuthService authService = new AuthService();
        EmpruntService empruntService = new EmpruntService();

        UIConsole ui = new UIConsole(authService, empruntService, catalogue);
        ui.lancer();
    }
}
