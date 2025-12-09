package service;

import java.io.BufferedReader;
import java.io.FileReader;
import model.Catalogue;
import model.Exemplaire;
import model.Livre;

public class CatalogueLoader {

    public static Catalogue chargerCatalogue(String cheminFichier) {

        Catalogue catalogue = new Catalogue();

        try (BufferedReader br = new BufferedReader(new FileReader(cheminFichier))) {

            String line;
            br.readLine(); // ignorer header "RFID;Titre;Auteur;..."

            while ((line = br.readLine()) != null) {

                String[] parts = line.split(";");
                String rfid = parts[0];
                String titre = parts[1];
                String auteur = parts[2];
                String edition = parts[3];
                int annee = Integer.parseInt(parts[4]);
                int pages = Integer.parseInt(parts[5]);

                Livre livre = new Livre(titre, auteur, edition, annee, pages);
                catalogue.ajouterLivre(livre);

                Exemplaire ex = new Exemplaire(rfid, livre);
                catalogue.ajouterExemplaire(ex);
            }

        } catch (Exception e) {
            System.out.println("Erreur lors du chargement du catalogue : " + e.getMessage());
        }

        System.out.println("Catalogue chargé : " 
            + catalogue.getLivres().size() + " livres, "
            + catalogue.getExemplaires().size() + " exemplaires");

        return catalogue;
    }
}
