🏞️ Llanquihue Tour App
---  
Actividad formativa 5 (Semana 7)

### Autor:

Alonso Antonio Bonansco Vergara  
Desarrollo Orientado a Objetos I - 006A  
Analista Programador Computacional  
Campus Virtual

---

### Descripción:

"La agencia necesita un sistema que permita almacenar diferentes
tipos de servicios turísticos en una misma colección. Recorrer y
mostrar su información. Escalar el sistema de manera flexible,
permitiendo integrar nuevas subclases sin modificar el código existente."

Para solucionar la problemática, dentro de GestorServicios se crean objetos
de las subclases de ServicioTuristico y se añaden a una List<>. Luego, el
método recorrerServicios() recorre la lista, diferenciando en tiempo
real a qué tipo de objeto corresponde (ruta, paseo o excursión) para luego
llamar automáticamente al método mostrarInformacion() de cada subclase.

---

### Estructura:

```text
📁 src/
├── 📁 ui/                              # Punto de entrada de la aplicación
│   └── 📄 Main.java               
├── 📁 data/                            # Instancia y añade los objetos a una lista
│   └── 📄 GestorServicios.java
└── 📁 model/                           # Clases del dominio
    ├── 📄 ServicioTuristico.java       - Superclase (nombre, duracionHoras)
    ├── 📄 RutaGastronomica.java        - Subclase (numeroDeParadas)
    ├── 📄 PaseoLacustre.java           - Subclase (tipoEmbarcacion)
    └── 📄 ExcursionCultural.java       - Subclase (lugarHistorico)
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