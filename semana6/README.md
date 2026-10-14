🏞️ Llanquihue Tour App
---  
Actividad formativa 4 (Semana 6)

Autor:  
Alonso Antonio Bonansco Vergara  
Desarrollo Orientado a Objetos I - 006A  
Analista Programador Computacional  
Campus Virtual

---


Instrucciones literales de la actividad:  
"La agencia necesita una estructura flexible para modelar
distintos servicios turísticos que comparten información básica
(como nombre y duración), pero que también requieren atributos
propios según su categoría. Para ello, se solicita diseñar
una jerarquía de clases que permita reutilizar elementos
comunes y especializar otros."

---

Estructura:

```text
📁 src/
├── 📁 ui/                              # Punto de entrada de la aplicación
│   └── 📄 Main.java               
├── 📁 data/                            # Instancia y muestra los objetos
│   └── 📄 GestorServicios.java
└── 📁 model/                           # Clases del dominio
    ├── 📄 ServicioTuristico.java       - Superclase (nombre, duracionHoras)
    ├── 📄 RutaGastronomica.java        - Subclase (numeroDeParadas)
    ├── 📄 PaseoLacustre.java           - Subclase (tipoEmbarcacion)
    └── 📄 ExcursionCultural.java       - Subclase (lugarHistorico)
```

---
Instrucciones para clonar y ejecutar:

1. Clonar el repositorio desde la terminal en Intellij:  
   git clone https://github.com/alonsobonansco/LlanquihueTourS6.git
2. Marcar la carpeta `src` como "sources root" haciendo click derecho en ella
   -> Mark Directory As -> Sources Root
3. Ejecutar el main desde su clase en el paquete ui

Repositorio Github:
https://github.com/alonsobonansco/LlanquihueTourS6