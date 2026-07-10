package gui;

import data.GestorEntidades;
import model.Chofer;
import model.ColaboradorExterno;
import model.GuiaTuristico;

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
        //btnRegistrar.setFont(new Font("Poppins", Font.PLAIN, 16));
        btnRegistrar.setFocusable(false);
        JButton btnMostrar = new JButton("Ver todos los registros");
        //btnRevisar.setFont(new Font("Poppins", Font.PLAIN, 16));
        btnMostrar.setFocusable(false);
        JButton btnSalir = new JButton("Salir");
        //btnSalir.setFont(new Font("Poppins", Font.PLAIN, 16));
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
        String[] opciones = {"Chofer", "Colaborador", "Guía"};

        int seleccion = JOptionPane.showOptionDialog(
                this,
                "¿Qué tipo de entidad desea registrar?",
                "Seleccionar tipo",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                opciones,
                opciones[0]
        );

        switch (seleccion) {
            case 0 -> {
                String nombre = JOptionPane.showInputDialog(
                        this, "Nombre:");
                if (nombre == null || nombre.isBlank()) return;

                String stringEdad = JOptionPane.showInputDialog(
                        this, "Edad:");
                if (stringEdad == null || stringEdad.isBlank()) return;
                int edad = Integer.parseInt(stringEdad);

                String tipoVehiculo = JOptionPane.showInputDialog(
                        this, "Tipo de Vehículo:");
                if (tipoVehiculo == null || tipoVehiculo.isBlank()) return;

                gestorEntidades.agregarRegistrable(new Chofer(nombre, edad, tipoVehiculo));
                JOptionPane.showMessageDialog(this, "Registro exitoso");
            }

            case 1 -> {
                String nombre = JOptionPane.showInputDialog(
                        this, "Nombre:");
                if (nombre == null || nombre.isBlank()) return;

                String stringEdad = JOptionPane.showInputDialog(
                        this, "Edad:");
                if (stringEdad == null || stringEdad.isBlank()) return;
                int edad = Integer.parseInt(stringEdad);

                String cargo = JOptionPane.showInputDialog(
                        this, "¿Cuál es su cargo?:");
                if (cargo == null || cargo.isBlank()) return;

                gestorEntidades.agregarRegistrable(new ColaboradorExterno(nombre, edad, cargo));
                JOptionPane.showMessageDialog(this, "Registro exitoso");
            }

            case 2 -> {
                String nombre = JOptionPane.showInputDialog(
                        this, "Nombre:");
                if (nombre == null || nombre.isBlank()) return;
                String stringEdad = JOptionPane.showInputDialog(
                        this, "Edad:");
                if (stringEdad == null || stringEdad.isBlank()) return;
                int edad = Integer.parseInt(stringEdad);

                String idiomaSecundario = JOptionPane.showInputDialog(
                        this, "Idioma secundario:");
                if (idiomaSecundario == null || idiomaSecundario.isBlank()) return;

                gestorEntidades.agregarRegistrable(new GuiaTuristico(nombre, edad, idiomaSecundario));
                JOptionPane.showMessageDialog(this, "Registro exitoso");
            }

            default -> {}
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
