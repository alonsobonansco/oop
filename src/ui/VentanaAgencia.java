package ui;

import data.GestorEntidades;
import model.Chofer;
import model.ColaboradorExterno;
import model.GuiaTuristico;
import model.Vehiculo;

import javax.swing.*;
import java.awt.*;

public class VentanaAgencia extends JFrame {
    private final GestorEntidades gestorEntidades;

    public VentanaAgencia(GestorEntidades gestorEntidades) {
        this.gestorEntidades = gestorEntidades;

        setTitle("Sistema de Registro - Llanquihue Tour App");
        setSize(500, 290);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panelBotones = new JPanel();
        panelBotones.setLayout(new GridLayout(3, 1, 0, 5));
        panelBotones.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));

        JButton btnRegistrar = new JButton("Registrar nueva entidad");
        btnRegistrar.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        btnRegistrar.setFocusable(false);
        JButton btnMostrar = new JButton("Ver todos los registros");
        btnMostrar.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        btnMostrar.setFocusable(false);
        JButton btnSalir = new JButton("Salir");
        btnSalir.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        btnSalir.setFocusable(false);
        panelBotones.add(btnRegistrar);
        panelBotones.add(btnMostrar);
        panelBotones.add(btnSalir);

        add(panelBotones, BorderLayout.CENTER);

        btnRegistrar.addActionListener(e -> registrarEntidad());
        btnMostrar.addActionListener(e -> mostrarRegistros());
        btnSalir.addActionListener(e -> salir());

    }

    public void registrarEntidad() {
        String[] opciones = {"Vehículo", "Colaborador"};

        int opcionElegida = JOptionPane.showOptionDialog(
                this, "¿Qué tipo de entidad desea registrar?",
                "Seleccionar tipo", JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]
        );

        switch (opcionElegida) {
            case 0 -> {
                try {
                    String tipoVehiculo = JOptionPane.showInputDialog(this, "Tipo Vehículo:");
                    if (tipoVehiculo == null || tipoVehiculo.isBlank()) return;

                    String patente = JOptionPane.showInputDialog(this, "Patente:");
                    if (patente == null || patente.isBlank()) return;

                    String stringCapacidad = JOptionPane.showInputDialog(this, "Capacidad máxima:");
                    if (stringCapacidad == null || stringCapacidad.isBlank()) return;
                    int capacidadMaxima = Integer.parseInt(stringCapacidad);

                    gestorEntidades.agregarRegistrable(new Vehiculo(tipoVehiculo, patente, capacidadMaxima));
                    JOptionPane.showMessageDialog(this, "Registro exitoso");
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(this, "Debe ingresar una edad válida.");
                }
            }

            case 1 -> {
                String nombre = JOptionPane.showInputDialog(this, "Nombre:");
                if (nombre == null || nombre.isBlank()) return;

                String stringEdad = JOptionPane.showInputDialog(this, "Edad:");
                if (stringEdad == null || stringEdad.isBlank()) return;
                int edad = Integer.parseInt(stringEdad);

                String cargo = JOptionPane.showInputDialog(this, "¿Cuál es su cargo?:");
                if (cargo == null || cargo.isBlank()) return;

                gestorEntidades.agregarRegistrable(new ColaboradorExterno(nombre, edad, cargo));
                JOptionPane.showMessageDialog(this, "Registro exitoso");
            }

            default -> {
            }
        }
    }

    public void mostrarRegistros() {
        String registros = gestorEntidades.mostrarRegistrables();

        JOptionPane.showMessageDialog(
                this, registros, "Hola", JOptionPane.INFORMATION_MESSAGE);
    }

    public void salir() {
        JOptionPane.showMessageDialog(
                this, "¡Gracias por usar la aplicación!",
                "Saliendo de Llanquihue Tour App...",
                JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }

    public void iniciarVentana() {
        SwingUtilities.invokeLater(() -> setVisible(true));
    }
}
