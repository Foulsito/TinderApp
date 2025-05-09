# Workshop 2 – Object-Oriented Implementation

This folder contains the second workshop of the Object-Oriented Programming project developed by:

- **Julián Carvajal Garnica** – 20242020024  
- **Andrés Mauricio Cepeda Villanueva** – 20242020010  

## 📘 Workshop Overview

This workshop builds upon the conceptual design introduced in Workshop 1. It focuses on implementing object-oriented principles and translating the initial design into UML diagrams, user stories, and basic code structure.

## 🎯 Objectives

Implement the structure and interactions of a simplified dating app based on the Tinder model, emphasizing functionality, data flow, and maintainability through good object-oriented practices.

## ✅ Functional Requirements

- User registration, login, and profile customization (name, birthday, lifestyle, interests, photos).
- Swipe-based interactions: like, dismiss.
- Notification system when a user receives a like.
- Reporting users for inappropriate behavior.

## 🔐 Non-Functional Requirements

- Secure authentication with encrypted data.
- Modern and consistent UI with clean navigation.
- Fast system response and scalability.
- Content control mechanisms (report/block).

## 🧩 User Stories

This workshop includes six updated user stories, such as:

- Account registration and profile setup
- Image uploading
- Interacting with other profiles (like/dismiss)
- Receiving notifications when liked
- Reporting inappropriate users

Each story includes acceptance criteria based on user flows and mockups.

## 🧠 CRC Cards

Updated CRC cards reflect class responsibilities and design changes guided by UML analysis. Examples include:

- **User**: edit profile, upload photos, interact
- **Account**: shared logic for user/admin access
- **MatchSystem**: register interactions, detect matches
- **Reports**: collect and store user reports
- **Notifications**: show who liked the user

## 🧱 UML Diagrams

- **Class Diagram**: models relationships between `User`, `Admin`, `Account`, `MatchSystem`, `Reports`, and `Notifications`.
- **Sequence Diagrams**: show flows for registering, liking, generating notifications, and reporting users.

## 💡 OOP Concepts

- **Encapsulation**: attributes are private and accessed through getters/setters.
- **Inheritance**: `User` and `Admin` extend `Account`.
- **Polymorphism**: Not applied, as the roles are clearly separated and don’t require method overriding.

## 🔄 Code Mapping

Initial Java classes were created to reflect the UML structure. For example:

| UML Class      | Code File         | Functionality Implemented                    |
|----------------|-------------------|----------------------------------------------|
| `User`         | `User.java`        | Profile editing, photo upload                |
| `Account`      | `Account.java`     | Login/logout, change password                |
| `Admin`        | `Admin.java`       | View reports, block/delete user              |
| `MatchSystem`  | `MatchSystem.java` | Register like/dismiss, suggest profiles      |
| `Reports`      | `Reports.java`     | Submit and store reports                     |
| `Notifications`| `Notifications.java`| Notify user when receiving a like           |

## 🎨 Mockups

Visual updates were made to streamline interactions and UI clarity:

🔗 [View mockups on Figma](https://www.figma.com/design/Fjw8QTU486SoliSIwdrVPO/Mockup-WorkShop)

## 📄 Files

- `Workshop_N°2.pdf`: Full documentation (stories, CRCs, UML, and analysis)
- `Code of TinderApp/`: Initial code fragments reflecting UML structure
- `LICENSE`: Apache License 2.0

---

This workshop transitions from theory to implementation, laying the foundation for a fully functional app in Workshop 3.
