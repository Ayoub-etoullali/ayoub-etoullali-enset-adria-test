# Documentation de l'Application de Gestion de Portefeuilles et de Transferts

## Introduction

Cette documentation a pour objectif de fournir un aperçu complet de l'application de gestion de portefeuilles et de transferts. L'application est basée sur une architecture microservices utilisant l'écosystème Spring Boot et Spring Cloud pour le backend, et Angular pour le frontend.

## Table des Matières

1. Conception
2. Architecture de l'Application
3. Microservices
   - Wallet Service
   - Transfer Service
   - Gateway Service
   - Discovery Service
   - Config Service
4. Frontend
5. Sécurité de l'Application
6. Conclusion

## 1. Conception

![Diagram 2023-10-30 09-57-58](https://github.com/Ayoub-etoullali/ayoub-etoullali-enset-adria-test/assets/92756846/875ace76-2fa5-4b18-b32e-d9afe7b48ab4)

## 2. Architecture de l'Applicatio

L'architecture de l'application est basée sur des microservices interagissant via des appels API RESTful. Elle comprend les composants suivants :
- **Wallet Service** : Gère les portefeuilles des clients.
- **Transfer Service** : Gère les transferts d'argent entre les portefeuilles.
- **Gateway Service** : Agit comme point d'entrée pour l'application, gère la redirection des demandes aux microservices appropriés.
- **Discovery Service** : Permet aux microservices de s'enregistrer et de découvrir les autres services.
- **Config Service** : Fournit une configuration centralisée pour l'ensemble de l'application.

  ![image](https://github.com/Ayoub-etoullali/ayoub-etoullali-enset-adria-test/assets/92756846/549e7fac-c49f-4225-a938-deb2e5b6c391)

## 2. Microservices

### Wallet Service

#### Description
Le service Wallet gère les portefeuilles des clients, enregistrant les informations sur le solde, la devise et la date de création.

#### Endpoints API
- `GET /wallets/`
  
![image](https://github.com/Ayoub-etoullali/ayoub-etoullali-enset-adria-test/assets/92756846/ba502c1d-75cb-490a-8098-f5b106c94099)

- `GET /clients/` : Récupérer les détails d'un portefeuille par ID.
  
![image](https://github.com/Ayoub-etoullali/ayoub-etoullali-enset-adria-test/assets/92756846/f93e3322-9a9e-488f-9778-5ad1ec837372)

- `POST /wallets` : Créer un nouveau portefeuille.
- `PUT /wallets/{id}` : Mettre à jour les informations d'un portefeuille.
- `DELETE /wallets/{id}` : Supprimer un portefeuille.

### Transfer Service

#### Description
Le service Transfer gère les transferts d'argent entre les portefeuilles des clients.

#### Endpoints API
- `GET /transfers`

![image](https://github.com/Ayoub-etoullali/ayoub-etoullali-enset-adria-test/assets/92756846/9711b6a1-9e21-42ae-8202-3127681f52fa)

- `POST /transfers` : Créer un nouveau transfert.
- `PUT /transfers/{id}` : Mettre à jour l'état d'un transfert.

### Gateway Service

![image](https://github.com/Ayoub-etoullali/ayoub-etoullali-enset-adria-test/assets/92756846/a620711c-155a-4881-ba01-a9463acf4d0b)

#### Description
Le service Gateway agit comme point d'entrée de l'application, gérant les demandes entrantes et les redirigeant vers les microservices appropriés.

### Discovery Service

![image](https://github.com/Ayoub-etoullali/ayoub-etoullali-enset-adria-test/assets/92756846/5f0df342-0c21-40ad-ab35-f938b74f22b4)

#### Description
Le service Discovery permet aux microservices de s'enregistrer et de découvrir les autres services au sein de l'application.

IP Addresse

![image](https://github.com/Ayoub-etoullali/ayoub-etoullali-enset-adria-test/assets/92756846/0c4803bf-51ea-47cf-9149-3091c42d5b84)

Consul 

![image](https://github.com/Ayoub-etoullali/ayoub-etoullali-enset-adria-test/assets/92756846/284d35a5-52d1-4754-93a1-f4b051ac8003)

### Config Service

#### Description
Le service Config fournit une configuration centralisée pour l'ensemble de l'application, permettant une gestion efficace de la configuration.

![image](https://github.com/Ayoub-etoullali/ayoub-etoullali-enset-adria-test/assets/92756846/aab25df3-f40f-4a1c-8ac7-f2504f4c7e40)

![image](https://github.com/Ayoub-etoullali/ayoub-etoullali-enset-adria-test/assets/92756846/36edada2-71aa-4588-85c9-fa296902fe2b)

![image](https://github.com/Ayoub-etoullali/ayoub-etoullali-enset-adria-test/assets/92756846/9f01334f-bada-4452-bf42-6d4015b6a916)

## 3. Configuration

Expliquez comment la configuration de l'application est gérée, y compris l'utilisation du service de configuration centralisée.

![image](https://github.com/Ayoub-etoullali/ayoub-etoullali-enset-adria-test/assets/92756846/1cb05a48-8f6d-4979-89b8-6aa26c0b4f5c)

![image](https://github.com/Ayoub-etoullali/ayoub-etoullali-enset-adria-test/assets/92756846/a774a033-f5b2-4d9e-8529-d4325b321d5a)

![image](https://github.com/Ayoub-etoullali/ayoub-etoullali-enset-adria-test/assets/92756846/c4f9cf24-5ea1-485a-b04e-94850f699f4f)

## 4. Sécurité de l'Application

L'application utilise la sécurité Spring Boot et Spring Security pour garantir que seuls les utilisateurs authentifiés ont accès aux fonctionnalités sensibles. L'authentification et l'autorisation sont gérées à l'aide de tokens JWT (JSON Web Tokens).

## 5. Conception Frontend

![image](https://github.com/Ayoub-etoullali/ayoub-etoullali-enset-adria-test/assets/92756846/7d2d2b8e-2ec5-4e06-a145-167e0dbcde35)

![image](https://github.com/Ayoub-etoullali/ayoub-etoullali-enset-adria-test/assets/92756846/6abd063d-a557-4247-868f-3a66db1f8742)

![image](https://github.com/Ayoub-etoullali/ayoub-etoullali-enset-adria-test/assets/92756846/cb43d280-54d0-440a-af77-3bc09beaf03f)

## 9. Conclusion

La mise en place d'une architecture orientée Stream Processing avec Spring Cloud Discovery (Eureka), Consul, Vault et Kafka ouvre de vastes opportunités pour les entreprises à la recherche de solutions de traitement de données en temps réel. Ce contrôle de contenu a jeté les bases de l'intégration de ces technologies clés, démontrant leur utilité dans un contexte de traitement de flux en temps réel.
La combinaison de la découverte de services, de la gestion sécurisée des secrets et du traitement de flux en continu offre une solution complète pour relever les défis posés par le monde des données en temps réel. Les applications vont de la surveillance en temps réel à l'analyse de la fraude, en passant par la gestion logistique et bien d'autres. La réactivité devient la norme, et ces technologies jouent un rôle crucial dans la construction d'infrastructures robustes et sécurisées.
En continuant à explorer, expérimenter et intégrer ces technologies, les entreprises sont mieux préparées à répondre aux exigences changeantes du monde moderne des données. Le potentiel est vaste, et il appartient à chaque organisation de mettre en place des architectures de traitement de flux innovantes pour prospérer dans cet environnement en constante évolution.

<br>

![ayoub](https://user-images.githubusercontent.com/92756846/220727344-dbb21e84-4584-4055-bde5-a3c90a64a618.jpg)

<kbd>Enjoy Code</kbd> 👨‍💻
[My portfolio](https://ayoub-etoullali.netlify.app/)

