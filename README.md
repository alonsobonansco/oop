🏞️ Llanquihue Tour App
---  
Actividad sumativa 2 (Semana 5)

Autor:  
Alonso Antonio Bonansco Vergara  
Desarrollo Orientado a Objetos I - 006A  
Analista Programador Computacional  
Campus Virtual

---


Descripción:  
Problemática: La agencia ha crecido rápidamente y esto ha generado 
dificultades admnistrativas. Actualmente no cuentan con herramientas
que les permitan: consultar datos eficientemente, validar información
ingresada o buscar y filtrar registros.

Para solucionar el problema se cargan los datos desde un archivo
`empleados.txt` a una lista de empleados. Se recorren todos los empleados 
de la lista, diferenciando si corresponden a guías turísticos 
o a transportistas. Se ofrecen algunos filtros para poder encontrar a la 
persona indicada en caso de que sea necesario.

---

Estructura:

```text
📁 resources/                           # Archivo txt con los datos de los empleados   
└── 📄 tours.txt

📁 src/
├── 📁 app/                             # Punto de entrada de la aplicación
│   └── 📄 Main.java               
├── 📁 data/                            # Carga e instanciación 
│   ├── 📄 CargadorEmpleados.java
│   └── 📄 EmpleadosFactory.java
├── 📁 model/                           # Clases del dominio
│   ├── 📄 Contacto.java
│   ├── 📄 Direccion.java
│   ├── 📄 Empleado.java
│   ├── 📄 GuiaTuristico.java
│   ├── 📄 Persona.java
│   └── 📄 Transportista.java           
├── 📁 service/                         # Lógica del negocio. Búsquedas y filtrados
│   └── 📄 GestorAgencia.java
├── 📁 ui/                              # Interfaz de usuario
│   └── 📄 Menu.java       
└── 📁 util/                            # Herramientas y excepciones
    ├── 📄 LineaInvalidaException.java
    └── 📄 TextoUtil.java         
```

---
Instrucciones para clonar y ejecutar:

1. Clonar el repositorio desde GitHub  
   git clone https://github.com/alonsobonansco/LlanquihueTourApp.git
2. Abrir la carpeta del proyecto (LlanquihueTourApp) en Intellij
3. Verificar que el archivo `empleados.txt` se encuentra dentro de la carpeta resources  
(y esta debe estar marcada como resources root en Intellij)
4. Ejecutar el main desde su clase en el paquete app

Repositorio Github:
https://github.com/alonsobonansco/LlanquihueTourApp