# 🎬 Videoclub E.C. - Sistema de Gestión de Películas

Este proyecto es una aplicación de consola desarrollada en **Java** que implementa un sistema CRUD (Create, Read, Update, Delete) para la gestión de un inventario de películas, conectado a una base de datos **MySQL**.

## 🏗️ Arquitectura del Proyecto (MVC)
El sistema sigue el patrón de diseño **Modelo-Vista-Controlador**, lo que garantiza una separación clara de responsabilidades:

* **Model (`org.example.model`)**: Contiene la entidad `Movie`, que representa los datos de las películas con sus atributos encapsulados.
* **View (`org.example.view`)**: Gestiona la interfaz de usuario por consola, utilizando `Scanner` para la interacción.
* **Controller (`org.example.controller`)**: Actúa como intermediario, procesando la lógica antes de enviarla a la base de datos.
* **Repository (`org.example.repository`)**: Capa de persistencia que ejecuta las sentencias SQL mediante JDBC.
* **Config (`org.example.config`)**: Centraliza la conexión técnica con el servidor MySQL.

## 🛠️ Tecnologías Utilizadas
* **Java SDK 17+**
* **MySQL Server**
* **JDBC (Java Database Connectivity)**: Para la comunicación con la base de datos.
* **IntelliJ IDEA**: Entorno de desarrollo.

## 🚀 Instalación y Configuración

1.  **Base de Datos**: 
    * Asegúrate de tener MySQL funcionando.
    * Crea la base de datos ejecutando: `CREATE DATABASE videoclub_db;`.
    * Crea la tabla `movies` con los campos: `id`, `title`, `year_release`, `description` y `price`.

2.  **Configuración de Conexión**:
    * Dirígete a `src/main/java/org/example/config/ConexionBD.java`.
    * Actualiza las variables `USER` y `PASS` con tus credenciales locales de MySQL.

3.  **Ejecución**:
    * Ejecuta la clase `Main.java` para iniciar el menú interactivo.

## 📋 Funcionalidades
1.  **Registrar Película**: Captura título, año, descripción y precio.
2.  **Listar Catálogo**: Muestra todas las películas almacenadas en la base de datos.
3.  **Eliminar por ID**: Permite borrar registros específicos mediante su identificador único.
4.  **Validación de Datos**: Manejo de excepciones SQL para evitar cierres inesperados.

---
