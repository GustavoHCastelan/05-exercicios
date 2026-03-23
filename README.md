# Static Arrays Exercises

Java exercises focused on the use of **static arrays** for data modeling and manipulation.

## Overview

This repository contains practical exercises developed as part of a Java programming course. Each exercise applies object-oriented programming (OOP) concepts alongside static arrays to solve real-world inspired problems.

## Exercises

### Exercise 01 — Energy Monitor (`exercicio01`)

Models an energy consumption tracker using a fixed-size array.

**Classes:**
- `MonitorEnergia` — stores energy readings in a `double[]` array
  - `registrar(double valor)` — records a new consumption value
  - `media()` — calculates the average of all recorded values
  - `media(int inicio, int fim)` — calculates the average over a specific index range

### Exercise 03 — Transit Card (`exercicio03`)

Simulates a public transport card system inspired by São Paulo's "Bilhete Único".

**Classes:**
- `Usuario` — represents a registered user with balance information
- `BilheteUnico` — manages user data and fare deductions using a static array of users

## Technologies

- **Language:** Java
- **Paradigm:** Object-Oriented Programming (OOP)
- **Data Structure:** Static arrays

## How to Run

1. Clone the repository:
   ```bash
   git clone https://github.com/GustavoHCastelan/05-exercicios.git
   ```
2. Open the project in your preferred Java IDE (e.g., IntelliJ IDEA).
3. Navigate to the desired exercise folder under `src/` and run the `Main.java` file.
