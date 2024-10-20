[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/9J9TrW2r)
[![Open in Visual Studio Code](https://classroom.github.com/assets/open-in-vscode-2e0aaae1b6195c2367325f4f02e2d04e9abb55f0b24a779b69b11b9e10269abc.svg)](https://classroom.github.com/online_ide?assignment_repo_id=16650189&assignment_repo_type=AssignmentRepo)
# Práctica 2: Introducción al desarrollo. Ponlo en práctica. 

Apoyate en los siguientes recursos para realizar la práctica:

[Descripción de la práctica](https://revilofe.github.io/section3/u01/practica/EDES-U1.-Practica011/)


---

# Título de la Actividad

## Identificación de la Actividad
- **ID de la Actividad:** [ID de la actividad]
- **Módulo:** [Nombre del módulo] (`PROG`, `IS`, `EDES`, etc.)
- **Unidad de Trabajo:** [Número y nombre de la unidad de trabajo]
- **Fecha de Creación:** [Fecha de creación]
- **Fecha de Entrega:** [Fecha de entrega]
- **Alumno(s):** 
  - **Nombre y Apellidos:** [Nombre y Apellidos del alumno o integrantes del grupo]
  - **Correo electrónico:** [Correo electrónico g.educaand.es]
  - **Iniciales del Alumno/Grupo:** [Iniciales del alumno o del grupo]

## Descripción de la Actividad
[Descripción detallada de la actividad, objetivos, y contexto necesario para comprenderla. Explicar en qué consiste la actividad y qué se espera que el alumno desarrolle o implemente.]

## Instrucciones de Compilación y Ejecución
1. **Requisitos Previos:**
   - [Lenguaje de programación y versión]
   - [Entorno de desarrollo o dependencias necesarias]

2. **Pasos para Compilar el Código:**
   ```bash
   [Comando para compilar el código]
   ```

3. **Pasos para Ejecutar el Código:**
   ```bash
   [Comando para ejecutar la aplicación]
   ```

4. **Ejecución de Pruebas:**
   ```bash
   [Comandos para ejecutar pruebas, si las hubiera]
   ```

## Desarrollo de la Actividad
### Descripción del Desarrollo
[Explicación de cómo se ha abordado el desarrollo de la actividad, incluyendo las decisiones de diseño, estructura del código y enfoque de resolución de problemas. Se recomienda adjuntar diagramas o capturas de pantalla si es necesario.]

### Código Fuente
[Aquí se incluirá un enlace directo a los archivos de código fuente en el repositorio, por ejemplo, si se está usando GitHub: `src/main.java` o algún enlace directo.]

### Ejemplos de Ejecución
- **Entrada 1:** Descripción de la entrada y valor de prueba.
- **Salida Esperada 1:** Explicación de la salida esperada y el resultado de la prueba.

### Resultados de Pruebas
[Aquí se detallará cómo se ha verificado la funcionalidad del código, incluyendo resultados de pruebas automatizadas o manuales, en caso de que las haya.]

## Documentación Adicional
- **Manual de Usuario:** [Enlace a la documentación del usuario, si existe]
- **Autorización de Permisos:** Verificar que el profesor tenga permisos de lectura en el repositorio para revisar el código.

## Conclusiones
[Resumen de las conclusiones alcanzadas al desarrollar la actividad, las lecciones aprendidas, y posibles mejoras que se puedan implementar en futuras entregas.]

## Referencias y Fuentes
[Aquí se listarán las fuentes consultadas para el desarrollo de la actividad, tales como documentación oficial, artículos, o cualquier recurso externo relevante.]

### Notas Adicionales:
1. **Nombres de Archivos y Repositorios:**
   - Asegúrate de que el nombre del archivo o repositorio siga la estructura definida: `XXX-idActividad-Iniciales`.
2. **Permisos:**
   - Verifica que el profesor tenga los permisos necesarios para acceder al repositorio o documento.
3. **Formato:**
   - Si se entrega en formato PDF o Google Docs, asegúrate de cumplir con el mínimo y máximo de folios establecidos.
4. **Compilación y Ejecución:**
   - Detalla claramente cómo compilar y ejecutar el código, incluyendo las instrucciones en el archivo `README.md`.
  





# 5. Preguntas y Actividades para Evaluar Cada Criterio de Evaluación
Contesta a estás preguntas de forma concisa y clara. Las respuestas deben estar bien estructuradas e ir al grano. Si es necesario añade capturas de pantalla para ilustrar tus respuestas.
## 5.1. Criterio de Evaluación 1.a: Relación entre Software y Hardware
pregunta:

1. Describe cómo el software que has creado se ha relacionado con los componentes físicos del dispositivo (memoria RAM, procesador, periféricos, etc.) durante la ejecución de los tres lenguajes (interpretado, compilado y en máquina virtual).
Puntos a incluir:
- Cómo se almacenaron los datos en memoria.
- Qué hizo el procesador con el código.
- Si se interactuó con periféricos, como la pantalla para mostrar la salida.

  Pues se ah relacionado con claridad, al escribir los códigos y al guardarlos se guardan en arcihivos con un extension expecifica cada uno en su lenguje, el procesasor ejecuta los códigos y no se interactuó con periféricos.

  ## 5.2 5.2. Criterio de Evaluación 1.c: Diferenciación entre Código Fuente, Código Objeto y Ejecutable

  1. Explica cómo el código fuente que escribiste se transformó en código objeto y ejecutable en el caso de los lenguajes compilados. ¿Generaste archivos intermedios (código objeto)? ¿Qué nombres tomaron estos archivos?
     Se transformo añadiendo funciones que ayudan a que el código pueda ejecutarse, en mi caso al ejecutar el código de java si se te genera un código intermedio que seria un bytecode y el nombre del archivo seria nombre.class

  2. Para los lenguajes interpretados, describe cómo el código fuente se ejecutó directamente, sin generar archivos de código objeto o ejecutable.
     Pues gracias a lo intepretes de python donde directament pones la ruta donde esta el archivo de python y te lo ejecuta y en Java utilizando java virtual machine, que te lo ejecuta directamente en código de bytes que solamnete se podria ejecutar en JVM.

     3. Para el lenguaje que genera código intermedio (Java, C#), explica cómo el código fuente se transformó en código intermedio (bytecode) y cómo este fue ejecutado por la máquina virtual.
        Primero lo que haras es escribir el código que te lo compila java virtual machine, primero lo copila en bytes, que esos bytes solo se pueden ejecutar en JVM y despues JVM lo ejecuta para que se pueda ver en el hardware, es decir si se ejecuta en linux po se vera en linux y si se ejecuta en window pues se vera en windows.

  ## 5.3. Criterio de Evaluación 1.d: Generación de Código Intermedio para Máquinas Virtuales

   1. Describe el proceso de generación de código intermedio (bytecode) en el lenguaje que utilizaste que emplea una máquina virtual (por ejemplo, Java o C#).
      Primero lo que haras es escribir el código que te lo compila java virtual machine, primero lo copila en bytes, que esos bytes solo se pueden ejecutar en JVM y despues JVM lo ejecuta para que se pueda ver en el hardware, es decir si se ejecuta en linux po se vera en linux y si se ejecuta en window pues se vera en windows.

  2. Explica qué rol juega la máquina virtual en la ejecución del código y cómo difiere de la ejecución directa en un sistema operativo como ocurre con los lenguajes compilados e interpretados.
 


  ## 5.4. Criterio de Evaluación 1.e: Clasificación de Lenguajes de Programación
  1. Clasifica los tres lenguajes utilizados (interpretado, compilado y en máquina virtual) según su:

- Modo de ejecución (interpretado vs compilado vs máquina virtual).
- Nivel de abstracción (alto nivel vs bajo nivel).
- Paradigma de programación (imperativo, orientado a objetos, funcional).

  - Modo de Ejecución: En este Caso Python y Java seria los mas sencillos porque al ser interpretados aunque son mas lentos porque traduce línea por línea, son mas flexibles y faciles de probar a diferencia de un copilado que seria C que aun sea mas rapido porque se ejecuta directamente ya que el código esta traducido directamente son mas complejo a la hora de escribirlo
- Nivel de abstracción: En este caso Python y Java son mas sencillos porque estan escrito para que lo entienda un humano, en caso de C son mas complejos porque estan mas cerca de lenguaje de maquina
- paradigma de programación : En este caso python y java son orientado a objetos, igual que pueden ser imperativos porque estos estan como mas parecido a la realidad puedes hacer como implemetar el mundo real dentro del software, igual que java que seria imperativo y da instrucciones detalladas de como hacer las cosas igaul que java y python

2. Explica qué características de estos lenguajes influyeron en su clasificación.
   Pues en la complejidad que hay en uno en otros, en mi caso para mi al ver el codigo de java y C, C es muchisimo mas complejo que java y python.

## 5.5. Criterio de Evaluación 1.f: Evaluación de Herramientas Utilizadas en el Desarrollo

Para cada uno de los tres lenguajes (interpretado, compilado y en máquina virtual), describe las herramientas que utilizaste en el proceso de desarrollo:
- Sistema operativo (¿en qué sistema ejecutaste el programa?). En linux Java y C y en windows Python
- Editor de texto o IDE (¿dónde escribiste el código?). En visual Studio Code
- Compilador o intérprete (¿cómo se transformó o ejecutó el código?). En caso de C de forma copilada y python y java de forma interpretada
- Depurador (si lo usaste, ¿cómo lo empleaste para encontrar errores?). No lo use
- Sistema de gestión de versiones (si lo usaste, ¿cómo guardaste las versiones del código?). No lo use
  

     
