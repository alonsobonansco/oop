🏞️ Llanquihue Tour App
---  
Actividad formativa 3 (Semana 4)

Autor:  
Alonso Antonio Bonansco Vergara  
Desarrollo Orientado a Objetos I - 006A  
Analista Programador Computacional  
Campus Virtual

---


Descripción:  
Problemática: Llanquihue Tour desea gestionar de manera eficiente
la información de sus tours clasificados por tipo, para mostrarlos
en catálogos según las preferencias de sus clientes.

Para solucionar el problema se cargan los datos desde un archivo
`tours.txt` a un objeto Tour. Se recorren todos los tours de la lista
de tours, filtrando aquellos que duren menos de cuatro horas. Para aquellos
que deseen un circuito no muy exigente.

---

Estructura:

```text
📁 resources/                     # Contiene el archivo txt solicitado    
└── 📄 tours.txt
📁 src/
├── 📁 ui/                        # Contiene la clase principal con el método main
│   └── 📄 Main.java                
├── 📁 model/                     # Contiene la clase del dominio
│   └── 📄 Tour.java    
└── 📁 data/                      # Contiene la clase que carga desde el archivo a los objetos 
    └── 📄 GestorDatos.java           
```

---
Instrucciones para clonar y ejecutar:

1. Clonar el repositorio desde GitHub  
   git clone https://github.com/alonsobonansco/llanquihue-tour.git
2. Abrir la carpeta del proyecto (LlanquihueTourApp) en Intellij
3. Verificar que el archivo `tours.txt` se encuentra dentro de la carpeta resources
4. Ejecutar el main desde su clase en el paquete ui

Repositorio Github:
https://github.com/alonsobonansco/llanquihue-tour