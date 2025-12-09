1. Objectif général

Implémenter en Java un système simplifié de borne de prêt en libre-service permettant :

l’authentification d’un usager,

la lecture manuelle de codes RFID,

la validation de disponibilité des exemplaires,

l’enregistrement des emprunts,

la génération d’un reçu,

le chargement du catalogue à partir d’un fichier Excel/CSV.

Le développement doit respecter les principes de modélisation enseignés (diagramme de classes, DSS, cas d’utilisation détaillés).

2. Architecture prévue

Le projet sera structuré en trois couches :

2.1 Couche Modèle (model)

Représentation des objets métiers :

Livre

Exemplaire

Usager

Emprunt

Catalogue

2.2 Couche Service (service)

Logique applicative :

AuthService

EmpruntService

CatalogueLoader

2.3 Couche Présentation (ui)

Interface console simplifiée :

Main

UIConsole

3. Plan de développement (3 phases)

Les tâches sont réparties de manière progressive pour permettre le développement et les tests en parallèle.

Phase 1 – Mise en place du projet et chargement du catalogue

Objectif : le système démarre et charge les données.

Tâches :

Créer la structure du projet (packages model, service, ui).

Implémenter les classes du modèle : Livre, Exemplaire, Catalogue.

Définir le format du fichier de données (Excel ou CSV).

Implémenter CatalogueLoader (lecture des données + instanciation des objets).

Tester l'affichage du catalogue chargé (nombre de livres, exemplaires).

Livrable :

Catalogue fonctionnel et chargé automatiquement au démarrage.

Phase 2 – Authentification et logique d’emprunt

Objectif : un usager peut se connecter et emprunter des exemplaires.

Tâches :

Implémenter la classe Usager (compte, NIP, emprunts).

Créer AuthService (vérification du compte + NIP).

Implémenter EmpruntService :

valider la disponibilité d’un exemplaire,

enregistrer l’emprunt,

calculer la date de retour,

associer l’emprunt à l’usager.

Implémenter la boucle de saisie du RFID dans l’interface console.

Tester différents scénarios d’emprunt.

Livrable :

Un usager peut s'authentifier et emprunter un ou plusieurs exemplaires.

Phase 3 – Finalisation du système

Objectif : rendre le prototype utilisable du début à la fin.

Tâches :

Générer un reçu (affiché dans la console ou écrit dans fichier texte).

Ajouter la gestion des erreurs (RFID invalide, exemplaire déjà emprunté).

Nettoyer le code (organisation, commentaires).

Créer la classe Main avec le flux complet :

démarrage → chargement → login → emprunts → reçu.

Générer la version distribuable (.jar).

Livrables :

Reçu fonctionnel.

Version finale prête à l'exécution.

Jar dans le dossier /dist.

4. Répartition des responsabilités (équipe de 4)
Ramatoulaye ( lead ) : Cas d’utilisation, DSS, diagramme de classes.
Abdoulaye Soumah : Implémentation des services principaux (authentification, emprunts, logique globale).

Chérif : Support au développement, tests unitaires simples, interface console.

Billy : Rapport final, packaging du projet, génération du .jar, ZIP final.

5. Règles Git et workflow

Une branche principale : main

Une branche de développement : develop

Branches par fonctionnalité :

feature/catalogue

feature/auth

feature/emprunt

feature/ui

Chaque branche doit :

contenir une description courte et technique (pull request),

être révisée par un autre membre avant fusion.

6. Tests à effectuer

Démarrage du système : catalogue chargé.

Connection correcte + incorrecte.

RFID valide, invalide.

Emprunt d'un exemplaire disponible.

Emprunt d’un exemplaire déjà emprunté.

Emprunt multiple (2 exemplaires).

Génération du reçu.

7. Livraison finale

Le dépôt GitHub doit contenir :

/docs : cas d’utilisation, DSS, diagramme de classes

/src : code source Java

/data : catalogue Excel/CSV

/dist : fichier .jar final

README (plan d’action + instructions d’exécution)

La version finale sera compressée dans un fichier nommé :
INF1163_Projet_Equipe_X.zip