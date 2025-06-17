# MiniTinder

A simple Java-based application for user registration, login, and notification management.

## Table of Contents
1. [Overview](#overview)
2. [Features](#features)
3. [Classes](#classes)
4. [How to Run](#how-to-run)
5. [Future Improvements](#future-improvements)

## Overview

MiniTinder is a basic Java application that allows users to:
- Register with their name, email, password, and birthday.
- Log in using their email and password.
- Manage notifications through a simple notification system.

## Features

- **User Registration:** Users can register and their data is stored in a static list.
- **User Login:** Users can log in by verifying their email and password.
- **Notification Management:** Notifications are stored in a list and can be added or retrieved.

## Classes

### 1. App
- Entry point of the application.
- Displays a menu for user interaction (register, login, exit).

### 2. User
- Represents a user with attributes like name, email, password, and birthday.
- Includes static methods for `register` and `login`.

### 3. Photo
- Represents a photo file with a `photoName` attribute.
- Provides methods to get and set the photo name.

### 4. Notification
- Manages a list of notification messages.
- Includes methods to add and retrieve messages.

## How to Run

1. **Compile the Code:**
   ```bash
   javac src/*.java
