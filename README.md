## 🏦 Sistema Bancario en Java (POO)

Proyecto desarrollado en Java con enfoque en Programación Orientada a Objetos, estructuras de datos y buenas prácticas básicas.
Simula el funcionamiento de un sistema bancario simple mediante consola.

## 📌 Funcionalidades principales

- Crear cuentas bancarias

- Tipos de cuenta:

   - Ahorros

   - Débito

- Consultar saldo

- Depositar dinero

- Retirar dinero
 
- Ver información del cliente

- Validaciones básicas (montos, existencia de cuenta, etc.)


## 🧠 Conceptos aplicados
- Programación Orientada a Objetos (POO)

 - Clases

 - Encapsulación

 - Métodos

- Uso de HashMap para:

 - Almacenar cuentas

 - Búsqueda eficiente por identificador (correo / cédula / cuenta)

- Separación por capas:

 - model → lógica y entidades

 - app → interacción con el usuario (Main)

- Uso de Scanner

- Control de flujo con:

 - do-while

 - switch

- Buenas prácticas básicas de diseño

## 🎯 Objetivo del repositorio
Este proyecto tiene fines educativos y de portafolio, con el objetivo de:

 - Reforzar POO en Java

 - Comprender el uso correcto de HashMap

 - Simular un sistema real de forma estructurada

 - Prepararse para roles Junior Java Developer

 ## 🚀 Próximas mejoras

- Persistencia de datos (archivos o base de datos)

- Manejo de excepciones personalizado

- Interfaz gráfica o API REST

- Pruebas unitarias

## 👤 Autor
**Kendarg Real**  
Estudiante de Ingeniería de Software  
Enfoque en desarrollo Java Backend

## ▶️ Cómo compilar y ejecutar

Desde la carpeta raíz del proyecto:

```bash
javac -d out src/com/kendarg/Zoologico/model/Acciones/*.java \
src/com/kendarg/Zoologico/model/Acciones/Animales/*.java \
src/com/kendarg/Zoologico/app/Main.java

java -cp out com.kendarg.Zoologico.app.Main

