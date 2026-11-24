# Application Web JEE – Gestion des Produits avec Spring Boot

## 1. Objectif du projet

L'objectif de ce travail pratique est de créer une application Web JEE basée sur Spring Boot, Spring MVC, Spring Data JPA, Hibernate, Thymeleaf et Spring Security permettant de gérer des produits.

L'application permet de consulter, ajouter, supprimer et rechercher des produits. Elle intègre également un système d'authentification et de gestion des autorisations selon les rôles des utilisateurs.

**Vidéo de référence :** [Tutoriel Spring Boot – Gestion des produits](https://www.youtube.com/watch?v=FHy7raIldgg)

## 2. Technologies et dépendances utilisées

- **Java 25** : langage de programmation.
- **Spring Boot** : framework principal de l'application.
- **Spring Web / Spring MVC** : création des contrôleurs et gestion des requêtes HTTP.
- **Spring Data JPA** : gestion de la couche d'accès aux données.
- **Hibernate** : implémentation ORM pour la communication avec la base de données.
- **H2 Database** : base de données utilisée pour les tests.
- **MySQL** : dépendance prévue pour la connexion à une base de données MySQL.
- **Thymeleaf** : création des pages HTML dynamiques.
- **Thymeleaf Layout Dialect** : création d'un template commun aux différentes pages.
- **Bootstrap 5** : conception de l'interface utilisateur.
- **Spring Security** : authentification et gestion des rôles.
- **Spring Validation** : validation des données des formulaires.
- **Maven** : gestion du projet et des dépendances.

## 3. Fonctionnalités réalisées

### 3.1 Création du projet Spring Boot
Création du projet avec les dépendances nécessaires pour développer une application Web JEE.

### 3.2 Création de l'entité Product
Création de l'entité JPA représentant un produit avec les informations suivantes :
- ID : identifiant du produit.
- Name : nom du produit.
- Price : prix du produit.
- Quantity : quantité disponible.

### 3.3 Couche DAO avec Spring Data JPA
Création de l'interface `ProductRepository` basée sur `JpaRepository` pour effectuer les opérations sur les produits.

### 3.4 Test de la couche DAO
Vérification du fonctionnement des opérations de persistance et de récupération des produits.

### 3.5 Configuration de Spring Security
Configuration de la sécurité de l'application et personnalisation du système d'authentification.

### 3.6 Contrôleur Spring MVC et vues Thymeleaf
Développement des pages permettant de :
- Afficher la liste des produits.
- Supprimer un produit.
- Ajouter un nouveau produit.
- Valider les données du formulaire.
- Utiliser un template commun avec Thymeleaf Layout et Bootstrap.

### 3.7 Sécurisation de l'application
Mise en place de Spring Security avec deux rôles :
- **USER** : consulter la liste des produits.
- **ADMIN** : accéder aux fonctionnalités d'administration et gérer les produits.

Utilisation de `@PreAuthorize` pour protéger les méthodes du contrôleur et limiter l'accès selon les rôles.

### 3.8 Fonctionnalités supplémentaires
- Gestion des autorisations et des accès refusés.
- Page de connexion personnalisée.
- Gestion des sessions.
- Affichage d'une page d'erreur en cas d'accès non autorisé.

## 4. Comptes de test

| Nom d'utilisateur | Mot de passe | Rôle |
|---|---|---|
| user1 | 1234 | USER |
| user2 | 1234 | USER |
| admin | 1234 | USER, ADMIN |

Ces comptes sont configurés pour les tests locaux de l'application.

## 5. Architecture du projet

```text
bdcc-enset-spring-mvc/
│
├── src/
│   └── main/
│       ├── java/
│       │   └── net/amine/bdccensetspringmvc/
│       │       ├── entities/
│       │       ├── repository/
│       │       ├── sec/
│       │       └── web/
│       │
│       └── resources/
│           ├── templates/
│           ├── static/
│           └── application.properties
│
├── screenshots/
├── pom.xml
└── README.md
```
## 6. Captures d'écran

Les captures d'écran illustrant les différentes fonctionnalités de l'application sont disponibles dans le dossier `screenshots/` à la racine du projet.


## 7. Installation et exécution

### Prérequis
- JDK 25
- IntelliJ IDEA
- Maven

### Étapes

1. Cloner le dépôt GitHub :

```bash
git clone URL_DU_DEPOT
```

2. Ouvrir le projet dans IntelliJ IDEA.
3. Vérifier la configuration Java et Maven.
4. Lancer l'application depuis la classe principale Spring Boot.
5. Ouvrir le navigateur à l'adresse :

```text
http://localhost:8094
```

## 8. Auteur

- **Nom :** Haress El Mostafa Amine
- **Établissement :** Université Mundiapolis
- **Filière :** Génie Informatique
- **Année universitaire :** 2026-2027

---

**Projet réalisé dans le cadre d'un travail pratique sur le développement d'une application Web JEE avec Spring Boot, Spring MVC, Spring Data JPA, Hibernate, Thymeleaf et Spring Security.**