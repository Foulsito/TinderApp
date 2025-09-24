# Workshop 4 – Final OOP Integration with GUI and File Storage

This folder contains the fourth workshop of the Object-Oriented Programming project developed by:

- **Julián Carvajal Garnica** – 20242020024  
- **Andrés Mauricio Cepeda Villanueva** – 20242020010  

---

## 📑 Table of Contents

- [📘 Workshop Overview](#-workshop-overview)
- [🎯 Objectives](#-objectives)
- [✅ Functional Requirements](#-functional-requirements)
- [🔐 Non-Functional Requirements](#-non-functional-requirements)
- [🧩 User Stories](#-user-stories)
- [🖼️ Mockups](#-mockups)
- [🧠 CRC Cards](#-crc-cards)
- [🧱 UML Diagrams](#-uml-diagrams)
- [🔄 Activity Diagrams](#-activity-diagrams)
- [💡 OOP Concepts](#-oop-concepts)
- [🧪 SOLID-Focused Implementation](#-solid-focused-implementation)
- [🖥️ GUI Prototype](#-gui-prototype)

---

## 📘 Workshop Overview

This workshop consolidates all previous progress into a final **dating app prototype inspired by Tinder**, developed in Java.  
It includes:  

- **User authentication system** (registration & login)  
- **Profile customization** with editable data and photo upload  
- **Interaction features** (like, dismiss, match)  
- **Notifications system** for user engagement  
- **Swing-based GUI** for user-friendly interaction  
- **File storage** to persist user data between executions  

The structure adheres strictly to **Object-Oriented Programming** and **SOLID principles**, ensuring maintainability, extensibility, and usability.

---

## 🎯 Objectives

### General Objective
Build a functional and modular dating app prototype using Java and OOP principles, focusing on secure user interaction, scalability, and persistence.

### Specific Objectives
- Implement authentication with registration and secure login.  
- Enable complete profile editing (bio, interests, photo, lifestyle, etc.).  
- Develop interaction logic (like/dismiss) with **notification and match system**.  
- Integrate **file storage** to persist user data.  
- Create a **graphical interface (Swing)** aligned with the mockups.  
- Apply UML diagrams to represent structure and behavior.  
- Demonstrate SOLID and OOP concepts through implementation.

---

## ✅ Functional Requirements

- User registration, login, and logout.  
- Profile editing (name, birthday, gender, orientation, bio, interests).  
- Uploading a profile picture.  
- Browsing and interacting with other profiles (like/dismiss).  
- Notifications when a user likes your profile.  
- Match detection when mutual likes occur.  

---

## 🔐 Non-Functional Requirements

- Intuitive and responsive graphical interface.  
- Secure login with validation of credentials.  
- Aesthetic and consistent design following mockups.  
- Efficient file storage system to persist user data.  
- Scalability for future modules (e.g., advanced match system).  

---

## 🧩 User Stories

Final user stories include:  

- **Register a user**  
- **Complete profile information**  
- **Log in**  
- **Upload photo**  
- **Interact with profiles (like/dismiss)**  
- **Receive notifications**  
- **View profile from notification**  
- **Edit profile**  
- **Log out**  

Each story has acceptance criteria and estimated development times.

---

## 🖼️ Mockups

Screens were designed to represent the **welcome screen, login, registration, profile, and notifications**.  
[🔗 Click here to view the mockups](https://udistritaleduco-my.sharepoint.com/:b:/g/personal/amcepedav_udistrital_edu_co/ESnVCitJE9lHvu0vyJ3UpSsB1WN7jCG1uWP6NL17o4NSYg?e=1wzKZF)

---

## 🧠 CRC Cards

- **User**: Registers, logs in, edits profile, uploads photo, interacts with other users.  
- **Notification**: Manages and displays alerts when likes or matches occur.  
- **App**: Orchestrates system flow, simulates interactions, manages users and profiles.  
- **Photo**: Handles photo uploads and storage path.  

---

## 🧱 UML Diagrams

- **Class Diagram**: Defines `User`, `Photo`, `Notification`, `App`.  
- **Sequence Diagrams**: Registration, login, logout, edit profile, interaction flows.  
- **Activity Diagrams**: Login/Register, main frame, profile management.  

[🔗 View UML Diagrams](https://lucid.app/lucidchart/03ad0193-ff99-4b08-9336-efa20bfca03c/edit?page=HWEp-vi-RSFO)

---

## 🔄 Activity Diagrams

Covers processes such as:  
- Register/Login  
- Main menu navigation  
- Profile editing  
- Interaction and notification flow  

---

## 💡 OOP Concepts

| Concept        | Applied To                                                                 |
|----------------|-----------------------------------------------------------------------------|
| Encapsulation  | User credentials, notification lists, photo path, app logic                 |
| Inheritance    | ✘ Not implemented (could be extended in future versions)                   |
| Polymorphism   | ✘ Not implemented (simple actions only)                                    |
| Abstraction    | User actions, app orchestration, photo handling, and notifications behavior |

---

## 🧪 SOLID-Focused Implementation

- **SRP**: Each class handles one core responsibility (User, Notification, Photo, App).  
- **OCP**: System supports extension (e.g., adding Match class) without modifying existing logic.  
- **LSP**: Not applicable (no inheritance).  
- **ISP**: Not applied (no interfaces).  
- **DIP**: Dependencies are minimal, with clear separation of responsibilities.  

---

## 🖥️ GUI Prototype

Implemented using **Java Swing**:  

- **Welcome screen** with `Log In` and `Create Account`.  
- **Registration form** with fields for user details.  
- Components: `JFrame`, `JPanel`, `JLabel`, `JButton`, `JTextField`, `JPasswordField`.  
- Layout: `BoxLayout` for clean alignment.  

The GUI directly integrates with the core logic, ensuring consistency with the UML activity and sequence diagrams.

