1. Architecture du projet
Le projet est structuré en trois couches :
/model
•	Livre.java
•	Exemplaire.java
•	Usager.java
•	Emprunt.java
•	Catalogue.java
/service
•	AuthService.java
•	EmpruntService.java
•	CatalogueLoader.java
/ui
•	UIConsole.java
•	Main.java

2. Sprint 1  Structure et chargement du catalogue
Objectif : permettre au système de démarrer et de charger les données du catalogue.
Tâches :
•	Créer les classes Livre, Exemplaire et Catalogue.
•	Définir le format du fichier de données (CSV recommandé).
•	Implémenter CatalogueLoader pour lire le fichier CSV.
•	Créer les objets Livre et Exemplaire à partir des lignes du fichier.
•	Ajouter les objets au Catalogue.
•	Afficher un message de validation : « Catalogue chargé : X livres, Y exemplaires ».
Choix technique :
•	Utilisation d’un fichier CSV converti depuis Excel (plus simple et plus robuste que la lecture directe d’un fichier Excel).
Format CSV recommandé :
RFID;Titre;Auteur;Edition;DateParution;Pages
123456;La peste;Albert Camus;Gallimard;1947;336
789012;Les misérables;Victor Hugo;Folio Junior;2011;291

3. Sprint 2  Authentification et boucle d’emprunt
Objectif : permettre à un usager de se connecter et d’emprunter des exemplaires.
Tâches :
•	Créer la classe Usager avec les comptes de test Jean et Jeanne.
•	Implémenter AuthService pour vérifier le numéro de compte et le NIP.
•	Implémenter EmpruntService pour gérer la logique d’emprunt.
•	Ajouter la méthode emprunter(String rfid, Usager u).
•	Vérifier la disponibilité d’un exemplaire.
•	Créer un objet Emprunt et calculer la date de retour.
•	Associer l’emprunt à l’usager et mettre à jour l’état de l’exemplaire.
•	Implémenter la boucle de saisie du RFID dans l’interface console.
•	Terminer la saisie des emprunts avec le code 000000.
Points à valider :
•	Localisation correcte de l’exemplaire dans le catalogue.
•	Contrôle de disponibilité.
•	Création de l’emprunt.
•	Calcul et enregistrement de la date de retour.
•	Mise à jour des données de l’usager.

4. Sprint 3  Finalisation et génération du reçu
Objectif : compléter le cas d’utilisation « Emprunter documents ».
Tâches :
•	Générer un reçu listant les exemplaires empruntés.
•	Afficher le reçu dans la console ou le sauvegarder dans un fichier texte.
•	Nettoyer et structurer le code final.
•	Tester le système avec un emprunt simple.
•	Tester le système avec plusieurs emprunts.
•	Produire le fichier exécutable .jar dans le dossier dist.

5. Gestion des fichiers de données
Décisions :
•	Le fichier Excel est conservé pour la documentation.
•	Le code Java utilise un fichier CSV pour faciliter le chargement.
Avantages du CSV :
•	Lecture plus simple et plus rapide.
•	Aucun besoin de librairie externe.
•	Moins d’erreurs liées au format.

6. Tests à effectuer
Les tests suivants doivent être réalisés avant la livraison finale :
•	Chargement du catalogue au démarrage.
•	Authentification valide.
•	Authentification invalide.
•	Lecture d’un RFID valide.
•	Lecture d’un RFID inexistant.
•	Lecture d’un RFID déjà emprunté.
•	Emprunt d’un seul exemplaire.
•	Emprunt de plusieurs exemplaires successifs.
•	Vérification du reçu généré.

7. Organisation Git
Branches recommandées :
•	main
•	develop
•	feature/catalogue-loader
•	feature/auth
•	feature/emprunt
•	feature/ui

