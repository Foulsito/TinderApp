# Workshop 1 – Object-Oriented Design

This folder contains the first workshop of the Object-Oriented Programming project developed by:

- **Julián Carvajal Garnica** – 20242020024  
- **Andrés Mauricio Cepeda Villanueva** – 20242020010  

## 📘 Workshop Overview

This workshop introduces the conceptual design of a simplified Tinder-like application. It focuses on defining core functionalities, user interaction flows, and class structure using object-oriented principles.

## 🎯 Objectives

Develop a small-scale version of Tinder that allows for user matching, profile customization, and in-app communication through a secure and intuitive interface.

## ✅ Functional Requirements

- User registration, login, and profile editing (photos, bio, interests).
- Swipe-based interactions: like, dismiss.
- Matching system with real-time notifications.
- In-app messaging after a match.
- User reporting/blocking features.

## 🔐 Non-Functional Requirements

- Secure authentication and encrypted data.
- Responsive and clean UI.
- Accessible from multiple devices.
- Fast performance and scalability.

## 🧩 User Stories

Includes six user stories, covering:
- Account registration and profile setup.
- Image uploading.
- App interaction tutorial.
- Liking, super liking, and dismissing profiles.
- Match notification and chatting with matched users.

Each story includes acceptance criteria for validation.

## 🎨 Mockups

UI sketches were created in Figma to visualize the interface:

🔗 [View mockups on Figma](https://www.figma.com/board/fnGljgUhbNpFASJmIpG6rC/Untitled?node-id=0-1&t=pt9D6LsBvTT4PDfy-1)

## 🧠 CRC Cards

| Class Name     | Responsibilities                                           | Collaborators         |
|----------------|------------------------------------------------------------|------------------------|
| **User**       | Register/login, edit profile, upload photos                | MatchSystem            |
| **MatchSystem**| Show profiles, handle interactions, detect matches         | User, MessageSystem    |
| **MessageSystem** | Manage chat between matched users, store messages       | Match, User            |
| **Match**      | Represent mutual interest and unlock chat feature          | User, MessageSystem    |
| **Reports**    | Report users, log inappropriate behavior                   | User, MatchSystem, MessageSystem |

## 📄 Files

- `Workshop_1.pdf`: Complete documentation (requirements, stories, mockups, CRCs)
- `LICENSE`: Apache License 2.0 applied to this project

---

This workshop lays the foundation for future implementation and development of the Tinder-inspired app in upcoming workshops.

