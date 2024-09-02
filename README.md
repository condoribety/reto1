# Proyecto Spring Boot con OpenJDK 21

## Descripción del Proyecto

Este proyecto, desarrollado por **estudianteX**, es una aplicación básica de Spring Boot utilizando OpenJDK 21. El objetivo es proporcionar una estructura inicial para un proyecto de Spring Boot, que puede ser expandida según las necesidades específicas.

## Requisitos Previos

Antes de comenzar, asegúrate de tener instalados los siguientes componentes:

- OpenJDK 21
- Apache Maven
- Spring Boot CLI

## Estructura del Proyecto

La estructura del proyecto es la siguiente:


springboot-openjdk21-example/ 
├── src/ 
│ ├── main/ 
│ │ ├── java/ 
│ │ │ └── condori.bety.reto1/ 
│ │ │ ├── Reto1Application.java
│ │ └── application.properties 
│ │ └── resources/ 
├── pom.xml 
└── README.md


## Comandos para Iniciar el Proyecto

### 1. Crear un Nuevo Proyecto Spring Boot

Usa el siguiente comando para crear un nuevo proyecto Spring Boot:

```bash
spring init --dependencies=web springboot-openjdk21-example

2. Navegar al Directorio del Proyecto
cd springboot-openjdk21-example

3. Compilar y Ejecutar el Proyecto
Para compilar y ejecutar el proyecto, utiliza Maven:

mvn clean install
mvn spring-boot:run
