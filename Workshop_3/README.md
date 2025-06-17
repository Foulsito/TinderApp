# Workshop 3 – Object-Oriented Final Integration

This folder contains the third workshop of the Object-Oriented Programming project developed by:

- **Julián Carvajal Garnica** – 20242020024  
- **Andrés Mauricio Cepeda Villanueva** – 20242020010  

---

## 📑 Table of Contents

- [📘 Workshop Overview](#-workshop-overview)
- [🎯 Objectives](#-objectives)
- [✅ Functional Requirements](#-functional-requirements)
- [🔐 Non-Functional Requirements](#-non-functional-requirements)
- [🧩 User Stories](#-user-stories)
- [🧠 CRC Cards](#-crc-cards)
- [🧱 UML Diagrams](#-uml-diagrams)
- [🔄 Activity Diagrams](#-activity-diagrams)
- [💡 OOP Concepts](#-oop-concepts)
- [🧪 SOLID-Focused Implementation](#-solid-focused-implementation)
- [📂 Code Prototype](#-code-prototype)
- [📄 Files](#-files)

---

## 📘 Workshop Overview

This workshop builds upon the previous stages by consolidating the project into a working prototype. The application now includes user registration, profile editing, photo upload, basic user interaction (like), and a notification system. The structure strictly adheres to core OOP principles.

---

## 🎯 Objectives

### General Objective
Develop a functional and modular dating app prototype inspired by Tinder, using Java and Object-Oriented Programming principles, focusing on user interaction, notifications, and profile personalization.

### Specific Objectives
- Implement user registration and login functionalities securely.
- Allow profile customization with editable information and image upload.
- Enable basic interactions (like/dismiss) between users.
- Show notifications when a user receives a like.
- Visualize system structure through class and sequence diagrams aligned with real behavior.
- Apply OOP and SOLID principles for maintainability and clarity.

---

## ✅ Functional Requirements

- User registration and login.
- Profile editing and photo upload.
- Viewing and liking other users.
- Notification when liked.

---

## 🔐 Non-Functional Requirements

- Simple and responsive interface.
- Secure login system.
- Consistent UI elements and clear structure.
- Performance and scalability readiness.

---

## 🧩 User Stories

Final user stories include:

- Register a user  
- Log in  
- Complete profile  
- Upload profile photo  
- Like another user  
- Receive notification  
- Edit profile  
- View profile from notification  
- Log out

Each story includes acceptance criteria and diagrams to visualize the behavior.

---

## 🧠 CRC Cards

- **User**: Registers, logs in, edits profile, interacts with others.  
- **Notification**: Adds and displays alert messages.  
- **Photo**: Manages a user’s profile image.  
- **App**: Orchestrates system flow (main class).

---

## 🧱 UML Diagrams

- **Class Diagram**: Final structure with `User`, `Photo`, `Notification`, and `App`.
- **Sequence Diagrams**: Register, login, logout, interaction, and profile update flows.

🔗 [View UML Diagrams](https://lucid.app/lucidchart/03ad0193-ff99-4b08-9336-efa20bfca03c/edit?page=HWEp-vi-RSFO)

---

## 🔄 Activity Diagrams

Includes activities for:

- Login/Register
- Main screen
- Notification flow
- Profile management

---

## 💡 OOP Concepts

| Concept         | Applied To                             |
|----------------|-----------------------------------------|
| Encapsulation  | All classes use private fields + methods |
| Inheritance    | ✘ Not used                             |
| Polymorphism   | ✘ Not applied                          |
| Abstraction    | Through structured responsibilities     |

---

## 🧪 SOLID-Focused Implementation

- **SRP**: Each class handles one responsibility.
- **OCP**: Design allows adding features (e.g., MatchSystem) without modifying existing code.
- **LSP**: Not applied (no inheritance used).
- **ISP**: Not applied (no interfaces).
- **DIP**: Low coupling; `App` coordinates without direct hard dependencies.

---

## 📂 Code Prototype

Java code reflects the finalized UML and functionality.

🔗 [Click here for the code](https://github.com/Foulsito/TinderApp/tree/main/Workshop_3)

---

## 📄 Files

- `Workshop_3.pdf`: Final documentation
- `Code of TinderApp/`: Java source files
- `LICENSE`: Apache License 2.0

---

This workshop completes the OOP Tinder-inspired project, delivering a clean, testable, and extensible core structure.
