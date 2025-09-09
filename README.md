# 🚀 Todo Backend - Projet d'apprentissage

Ce projet est conçu pour accompagner l'apprentissage du développement backend. Vous allez construire une application de gestion de tâches (Todo) en utilisant le framework **Quarkus** et en suivant les bonnes pratiques de l'architecture **MVC**.

## 📋 Objectifs d'apprentissage

Ce projet vous permettra de :
- Comprendre l'architecture MVC (Model-View-Controller)
- Maîtriser les concepts de base du développement backend
- Apprendre à utiliser un framework moderne (Quarkus)
- Découvrir la persistance des données avec JPA/Hibernate
- Créer des API REST
- Gérer les DTOs et la validation des données
- Implémenter des fonctionnalités progressivement

---

## 🎯 Roadmap des versions

### 📦 Version 1.0 - Base MVC Simple
**Objectif :** Comprendre les fondamentaux de l'architecture MVC

#### Fonctionnalités attendues :
- ✅ **CRUD basique** : Créer, Lire, Modifier, Supprimer des tâches
- ✅ **API REST** : Endpoints GET, POST, PUT, DELETE
- ✅ **Persistance** : Sauvegarde en base de données H2
- ✅ **Validation** : Vérification des données d'entrée

#### Endpoints à implémenter :
```
GET    /api/todos          - Lister toutes les tâches
GET    /api/todos/{id}     - Récupérer une tâche
POST   /api/todos          - Créer une nouvelle tâche
PUT    /api/todos/{id}     - Modifier une tâche
DELETE /api/todos/{id}     - Supprimer une tâche
```

#### Structure de données :
```json
{
  "id": 1,
  "text": "Apprendre Quarkus",
  "completed": false
}
```

---

### 🚀 Version 2.0 - Fonctionnalités avancées
**Objectif :** Améliorer l'expérience utilisateur et la robustesse

#### Nouvelles fonctionnalités :
- 🔄 **Statut des tâches** : Marquer comme terminée/en cours
- 📅 **Dates** : Date de création et d'échéance
- 🔍 **Recherche** : Filtrer les tâches par statut
- 📊 **Pagination** : Gérer de grandes listes de tâches
- 🏷️ **Catégories** : Organiser les tâches par catégories
- ✅ **Validation avancée** : Contraintes métier

#### Structure de données étendue :
```json
{
  "id": 1,
  "text": "Apprendre Quarkus",
  "completed": false,
  "category": "formation",
  "createdAt": "2024-01-15T10:30:00",
  "dueDate": "2024-01-20T18:00:00",
  "priority": "HIGH"
}
```

---

### 🌟 Version 3.0 - Fonctionnalités expertes
**Objectif :** Maîtriser les concepts avancés du développement backend

#### Fonctionnalités expertes :
- 👥 **Authentification** : Système de connexion utilisateurs
- 🔐 **Autorisation** : Gestion des rôles et permissions
- 📧 **Notifications** : Rappels par email
- 🔄 **API versioning** : Gestion des versions d'API
- 📈 **Monitoring** : Métriques et logs
- 🧪 **Tests** : Tests unitaires et d'intégration
- 📚 **Documentation** : API documentée avec OpenAPI/Swagger

---

## 🏗️ Architecture MVC - Explication

L'architecture **MVC** (Model-View-Controller) est un pattern fondamental en développement backend. Voici comment elle est implémentée dans ce projet :

### 📁 Structure des packages

```
src/main/java/fr/lents/go/
├── controller/     # 🎮 Controllers (API REST)
├── service/        # 🧠 Business Logic
├── repository/     # 💾 Data Access Layer
├── entity/         # 📊 Models (Entités JPA)
└── dto/           # 📦 Data Transfer Objects
```

### 🔄 Flux de données MVC

```
🌐 Client Request
    ↓
🎮 Controller (TodoController)
    ↓
🧠 Service (TodoService) - Business Logic
    ↓
💾 Repository (TodoRepository) - Data Access
    ↓
📊 Entity (TodoItem) - Database
```

### 📋 Rôle de chaque couche

#### 🎮 **Controller** (`TodoController.java`)
- **Rôle** : Point d'entrée de l'API REST
- **Responsabilités** :
  - Recevoir les requêtes HTTP
  - Valider les données d'entrée
  - Appeler les services
  - Retourner les réponses HTTP
- **Technologies** : JAX-RS (REST), Bean Validation

#### 🧠 **Service** (`TodoService.java`)
- **Rôle** : Logique métier
- **Responsabilités** :
  - Implémenter les règles métier
  - Orchestrer les opérations
  - Gérer les transactions
  - Valider les données métier
- **Technologies** : CDI (Contexts and Dependency Injection)

#### 💾 **Repository** (`TodoRepository.java`)
- **Rôle** : Accès aux données
- **Responsabilités** :
  - Interagir avec la base de données
  - Exécuter les requêtes
  - Gérer la persistance
- **Technologies** : Spring Data JPA, Hibernate

#### 📊 **Entity** (`TodoItem.java`)
- **Rôle** : Modèle de données
- **Responsabilités** :
  - Représenter les données en base
  - Définir la structure des tables
  - Gérer les relations entre entités
- **Technologies** : JPA, Hibernate ORM

#### 📦 **DTO** (`TodoItemDto.java`)
- **Rôle** : Transfert de données
- **Responsabilités** :
  - Définir les données exposées via l'API
  - Séparer les modèles internes des modèles externes
  - Optimiser les transferts de données
- **Technologies** : POJOs simples

---

## 🛠️ Technologies utilisées

- **Framework** : Quarkus 3.25.4
- **Langage** : Java 21
- **Base de données** : H2 (développement)
- **ORM** : Hibernate/JPA
- **API** : JAX-RS (REST)
- **Validation** : Bean Validation
- **Build** : Maven

---

## 🚀 Démarrage rapide

### Prérequis
- Java 21+
- Maven 3.8+

### Installation
```bash
# Cloner le projet
git clone <repository-url>
cd todo-backend

# Lancer en mode développement
./mvnw quarkus:dev
```

### Accès
- **Application** : http://localhost:8080
- **Dev UI** : http://localhost:8080/q/dev/

---

## 📚 Ressources d'apprentissage

- [Documentation Quarkus](https://quarkus.io/guides/)
- [Guide JAX-RS](https://quarkus.io/guides/rest)
- [Guide Hibernate ORM](https://quarkus.io/guides/hibernate-orm)
- [Architecture MVC](https://en.wikipedia.org/wiki/Model%E2%80%93view%E2%80%93controller)

---

## 🎯 Prochaines étapes

1. **Implémentez la Version 1.0** en commençant par le Controller
2. **Testez chaque endpoint** avec Postman ou curl
3. **Comprenez chaque couche** avant de passer à la suivante
4. **Posez des questions** si vous bloquez sur un concept

**Bonne chance dans votre apprentissage ! 🚀**
