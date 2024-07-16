# Rizz Runner

Rizz Runner is a Java application designed to track and manage running activities. This repository contains the source code and related files for the application.

## Table of Contents

- [Introduction](#introduction)
- [Features](#features)
- [Installation](#installation)
- [Usage](#usage)
- [Project Structure](#project-structure)

## Introduction

Rizz Runner is a simple Java application built using Spring Boot. It helps users track their runs, including details such as the run's title, start and completion times, distance covered, and location.

## Features

- Track running activities
- Record start and completion times
- Record the distance covered (in miles)
- Record the location of the run

## Installation

To set up the Rizz Runner application on your local machine, follow these steps:

1. **Clone the repository**:
   ```
   git clone https://github.com/yourusername/rizz-runner.git
   cd rizz-runner
   ```

2. **Ensure you have Java Development Kit (JDK) installed**:
   - Download and install JDK from Oracle or use an open-source version like OpenJDK.

3. **Install dependencies**:
   - If you are using Maven, you can install dependencies by running:
     ```
     mvn clean install
     ```
   - If you are using Gradle, you can install dependencies by running:
     ```
     gradle build
     ```

4. **Run the application**:
   ```
   ./mvnw spring-boot:run
   ```
   or
   ```
   ./gradlew bootRun
   ```

## Usage

1. **Access the application**:
   - Once the application is running, open your browser and navigate to `http://localhost:9090`.

2. **Interact with the API**:
   - You can use tools like Postman or `curl` to interact with the API.

## Project Structure

```
rizz-runner
├── src
│   └── main
│       └── java
│           └── rizz
│               └── com
│                   └── rizz_runner
│                       ├── run
│                       │   └── Run.java
│                       └── location
│                           └── Location.java
├── .vscode
│   └── launch.json
├── bin
└── README.md
```
---
**Reference:**
- [YouTube Tutorial: Building a Java Application with Spring Boot](https://youtu.be/31KTdfRH6nY?si=v6C2QBFUN-EaIugO)
