Projet INF1163 - Modélisation et conception orientée objet

Titre du projet 
Système de contrôle d’une borne de prêt en libre-service (Library Self-Checkout System)

Description générale :
Ce projet consiste à analyser, modéliser et implémenter un système simplifié permettant 
à un usager de bibliothèque d’emprunter lui-même des documents à l’aide d’une borne de 
prêt autonome.

Le système permet notamment :
- l’identification de l’usager (numéro de compte + NIP)
- la lecture des codes RFID des exemplaires déposés
- la vérération de la disponibilité des documents
- l’enregistrement des emprunts
- la génération d’un reçu (imprimé, affiché ou simulé)
- le chargement d’un catalogue de livres (Excel ou SQLite)

Structure du projet :
Le dossier du projet contient les éléments suivants :

/docs  
    - Cas d'utilisation détaillés (Emprunter des documents + Démarrer le système)  
    - Rapport final (Word/PDF)  
    - Annexe des contributions des membres  

/uml  
    - Diagrammes UML (DSS, diagramme de classes)  
    - Fichiers Modelio (.mdj)

/src  
    - Code source Java de l'application  
    - Packages de la couche d’affaires  

/data  
    - Catalogue des livres au format Excel (.xlsx)  
    - Fichiers de données de tests  

/dist  
    - impression de réçu

/README.txt  
    - Ce fichier expliquant la structure du projet

Membres de l'équipe et responsabilités :
-Ramatoulaye Bah : Analyse UML, cas d’utilisation, DSS, diagramme de classes  
- Abdoulaye Soumah : Programmation Java (logique principale de l’application)  
- Cherif : Interface graphique  
- Billy : Rapport final, organisation du livrable, création du fichier .jar, préparation du ZIP final  

Technologies utilisées :

- Java (Eclipse IDE)  
- Modelio (diagrammes UML)  
- Git et GitHub (travail collaboratif)  
- Excel ou SQLite (catalogue des documents)


