# Frases aleatorias de animes
Esta es una adaptación de la aplicación web "Frases Clásicas de Películas y Series", desarrollada en el curso "Java: Creando tu Primera API y Conectándola al Front End" como parte del programa Alura ONE (Oracle Next Education). En esta versión, la aplicación despliega de forma aleatoria frases de anime almacenadas en una base de datos.<br>
Esta aplicación sirve como un complemento para otra aplicación llamada Screenmatch, una plataforma para ver anime. Proporciona a los usuarios una experiencia adicional al ofrecer frases inspiradoras, emocionantes o memorables de sus animes favoritos.


## ¿Como funciona?
Este proyecto consta de dos partes:
- **Interfaz de Usuario:** Desarrollada con JavaScript, HTML y CSS, esta parte es responsable de desplegar todo el contenido visual de la aplicación en el navegador. Aquí es donde los usuarios pueden interactuar con la aplicación y ver las frases de anime de manera aleatoria.
- **Lado del Servidor:** Implementado en Java con Spring, se utiliza spring-boot-starter-web para crear un servidor REST y spring-boot-starter-data-jpa para la gestión de la base de datos. La base de datos utilizada es PostgreSQL, donde se almacenan las diferentes frases junto con sus títulos y pósteres correspondientes.

### Dependencias
Las principales dependencias utilizadas en este proyecto son:
- *spring-boot-starter-web:* Para crear y gestionar el servidor REST.
- *spring-boot-starter-data-jpa:* Para interactuar con la base de datos PostgreSQL.
- *spring-boot-devtools:* Para facilitar el desarrollo con características como la recarga automática.

## Imagenes del proyecto
<img width="40%" src="https://github.com/IsaacCuautle/generador-de-frases-de-series-aleatorias/assets/65583500/57d3d3bf-d4e6-4280-b29a-e5dc29d4f3cc"/>
<img width="40%" src="https://github.com/IsaacCuautle/generador-de-frases-de-series-aleatorias/assets/65583500/d4e3116b-b84e-4893-a35a-8ac7963100a8"/>
<img width="40%" src="https://github.com/IsaacCuautle/generador-de-frases-de-series-aleatorias/assets/65583500/79b27cab-a4e4-4595-a4ae-1fbf0967cf48"/>
<img width="40%" src="https://github.com/IsaacCuautle/generador-de-frases-de-series-aleatorias/assets/65583500/c7219701-b370-45bc-abf2-00dc0a835b73"/>
<img width="50%" src="https://github.com/IsaacCuautle/generador-de-frases-de-series-aleatorias/assets/65583500/002795cb-b322-4eb0-bc1f-1c18906194fb"/>

## ¿Como utilizarlo?
1. Clone o descargue el proyecto aqui
2. Descomprima el archivo
3. Abra la carpeta raiz en Visual Studio Code
4. Seleccione el index.html y ejecute la extension live server para inciar el front-end
6. Abra la carpeta Screenmatch-frases en IntelliJ y ejecute el proyecto en la clase ScreenmatchFrasesAplication.java para iniciar el backend


>Nota:
>  - Instalación de PostgreSQL: Asegúrate de tener PostgreSQL instalado en tu sistema. Al ejecutar el proyecto con IntelliJ, se creará la base de datos correspondiente automáticamente.
>  - Poblar la Base de Datos: Deberás llenar manualmente los campos de la base de datos con los animes, pósters y las frases que desees que se desplieguen en el navegador. 

## Tecnologias utilizadas
![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white)
![Postgres](https://img.shields.io/badge/postgres-%23316192.svg?style=for-the-badge&logo=postgresql&logoColor=white)
![Apache Maven](https://img.shields.io/badge/Apache%20Maven-C71A36?style=for-the-badge&logo=Apache%20Maven&logoColor=white)
![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![HTML5](https://img.shields.io/badge/html5-%23E34F26.svg?style=for-the-badge&logo=html5&logoColor=white)
![JavaScript](https://img.shields.io/badge/javascript-%23323330.svg?style=for-the-badge&logo=javascript&logoColor=%23F7DF1E)
![CSS3](https://img.shields.io/badge/css3-%231572B6.svg?style=for-the-badge&logo=css3&logoColor=white)
![IntelliJ IDEA](https://img.shields.io/badge/IntelliJIDEA-000000.svg?style=for-the-badge&logo=intellij-idea&logoColor=white)
![Visual Studio Code](https://img.shields.io/badge/Visual%20Studio%20Code-0078d7.svg?style=for-the-badge&logo=visual-studio-code&logoColor=white)
![Git](https://img.shields.io/badge/git-%23F05033.svg?style=for-the-badge&logo=git&logoColor=white)
