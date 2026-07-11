🏞️ Llanquihue Tour App
---  
Actividad sumativa 3 (Semana 8)

### Autor:

Alonso Antonio Bonansco Vergara  
Desarrollo Orientado a Objetos I - 006A  
Analista Programador Computacional  
Campus Virtual

---

### Descripción:

"La agencia necesita ampliar su sistema para gestionar otras entidades
relevantes para sus operaciones, como guías turísticos, vehículos y
colaboradores externos, permitiendo que todas ellas compartan un
comportamiento común y puedan ser gestionadas desde una misma colección.
Además, se busca dotar al sistema de una interfaz gráfica básica para
facilitar la interacción por parte del personal administrativo."

Para solucionar la problemática, se implementa una interfaz que permita
tratar distintas entidades de forma unificada. Se aplica herencia y utiliza
una ArrayList para almacenar y recorrer objetos, diferenciándolos mediante
instanceof. Por último, se crea una interfaz visual simple que permite
ingresar nuevos objetos y mostrar los existentes.

---

### Estructura:

```text
📁 src/
├── 📁 app/                             # Punto de entrada de la aplicación
│   └── 📄 Main.java               
├── 📁 data/                            # Funciones sobre la lista de arreglos
│   └── 📄 GestorEntidades.java
├── 📁 model/                           # Clases del dominio
│   ├── 📄 Persona.java                 - Superclase
│   ├── 📄 Chofer.java                  - Subclase 
│   ├── 📄 ColaboradorExterno.java      - Subclase
│   ├── 📄 GuiaTuristico.java           - Subclase
│   └── 📄 Registrable.java             - Interfaz
└── 📁 ui/                              # Instancia y añade los objetos a una lista
    └── 📄 VentanaAgencia.java
```

---

### Instrucciones para clonar y ejecutar

Requisitos del sistema:

* **JDK:** Java 25 (LTS) o superior

1. Clonar el repositorio desde la terminal en Intellij:  
   git clone https://github.com/alonsobonansco/LlanquihueTourS7.git
2. Marcar la carpeta `src` como "sources root" haciendo click derecho en ella
   -> Mark Directory As -> Sources Root
3. Ejecutar el main desde su clase en el paquete ui

Repositorio Github:
https://github.com/alonsobonansco/LlanquihueTourS7