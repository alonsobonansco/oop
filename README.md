# 🏛️ Core Academic Monorepo: Software Engineering Foundations & Advanced OOP

This repository serves as a formal **Engineering Portfolio Index**. It centralizes the iterative evolution of my software design foundations, defensive programming mechanics, and runtime persistence strategies during my academic track [Months 3 - 5] at **Duoc UC**.

---

## 📈 Conceptual & Architectural Evolution Timeline

The modules below represent a chronological shift from basic state manipulation to decoupled, multi-tier runtime environments.

### 🟢 Phase 1: Inception & Domain Representation [Month 3]
Focused on memory modeling, encapsulation boundaries, and preventing primitive obsession.

#### 📦 Module 00: State Traceability Engine (Veterinary System)
* **Core Objective:** Establish immutable state control and deterministic execution paths.
* **Engineering Impact:** Prevented data corruption in business transactions through strict setter validation and sequential execution flows.

#### 📦 Module 01: Domain Structural Modeling (Llanquihue Tour v1)
* **Core Objective:** Mitigate *Primitive Obsession* and enforce architectural dry compliance.
* **Engineering Impact:** Introduced **Domain Composition** by decoupling raw attributes into discrete, reusable Value Objects (`Direccion`, `Contacto`). Utilized inheritance hierarchies (`Persona` -> `Empleado` -> `GuiaTuristico`) to optimize memory layouts and reuse validation blueprints.

---

### 🟡 Phase 2: Stream Ingestion & Polymorphic Extensibility [Month 4]
Shifted focus toward processing data from persistent hardware storage and driving runtime flexibility via open-ended hierarchies.

#### 📦 Module 02: Linear Data Ingestion & In-Memory Stream Parsing
* **Core Objective:** Efficient handling of Operating System file descriptors and sub-4-hour computational data filtering.
* **Engineering Impact:** Developed custom file parsing routines to stream flat-file records (`tours.txt`) into memory. Implemented in-memory analytical filters optimizing time complexity (O(N)) during catalog rendering.

#### 📦 Module 03: Late Binding & Runtime Polymorphic Arrays (Service Hierarchies)
* **Core Objective:** Design structures capable of scaling horizontally without structural regression.
* **Engineering Impact:** Leveraged polymorphism by grouping heterogenous subclasses under a homogeneous base contract (`ServicioTuristico`). Enforced **Late Binding** via dynamic dispatch (`mostrarInformacion()`), enabling the runtime to dynamically resolve underlying execution paths.

---

### 🔴 Phase 3: Creational Patterns, Multitier Decoupling & Hardening [Month 5]
Transitioned into a fully production-oriented architecture, managing decoupled application layers and defensive runtime safety.

#### 📦 Module 04: Full Multi-Tier Core Engine (Llanquihue Tour v3)
* **Core Objective:** Complete isolation of concerns and unified object creational mechanics.
* **Engineering Impact:** Implemented a **Simple Factory Pattern** (`EmpleadosFactory`) to decouple file ingestion pipelines from domain object instantiation. Enforced rigid separation of concerns by segregating codebase into explicit namespaces: `model`, `data`, `service`, `ui`, and `util`.

#### 📦 Module 05 [Capestone Project]: Petrochemical Ingestion Engine & Runtime Hardening
* **Core Objective:** End-to-end data processing system utilizing advanced JDK language features with strict security policies.
* **Engineering Impact:** Integrated **Java Streams, Comparators, and Pattern Matching** inside switch expressions for highly optimized in-memory query processing.

---

## 🔒 Defensive Engineering & Security-by-Design (Academic Baseline)

Even within academic boundaries, code safety was treated as a first-class citizen:
* **Cryptographic Identity Verification:** Built-in implementation of the standard **Modulo 11 Algorithm** inside `RutValidator` to prevent synthetic or malformed identity injections at the entry barrier.
* **OS Resource Hardening:** Safe management of system file descriptors via **try-with-resources** blocks, ensuring deterministic cleanup of `BufferedReader`/`BufferedWriter` streams even during catastrophic unhandled runtime exceptions.
* **Exception Layering (Bubble-up Mitigation):** Created custom unchecked domain exceptions (`LineaInvalidaException`, `RutInvalidoException`) to prevent raw, leaky infrastructure failures from bubbling straight into the UI presentation layer.

---

## ⚠️ Architectural Debt & Post-Mortem Analysis (Self-Auditing)

True engineering maturity relies on identifying the constraints of your own code. The following technical debt was audited and acknowledged across this learning track:

1. **Open/Closed Principle (OCP) Violation:** `GestorEntidades` relies heavily on the `instanceof` operator. Adding a new structural entity triggers mandatory modifications across multiple business logic engines.
2. **Leaky Layer Abstraction:** The file analyzer (`CargadorEntidades`) directly triggers UI presentation objects (`Swing/JOptionPane`), creating an unmaintainable tight coupling between the data infrastructure and the client view layer.
3. **Cyclomatic Complexity Spikes:** `EntidadesFactory` centralizes creation logic through massive conditional blocks (`if/switch`). 
4. **Business Logic Incoherency:** The validation method `validarEdadEmpleado` exists in the abstract layer but was not wired into the active execution path during instantiation, creating a risk for invalid entity states.

> 💡 *How I solved this debt:* These specific architectural limitations (especially the OCP violation and tight layer coupling) directly drove the decoupled, interface-driven design paradigm I implemented later in **[SchoolLibrary System]**.

---
⚙️ *Developed utilizing Java OpenJDK, Swing API for layout rendering, and Local Flat-File Datastores.*
