package com.reto5.view;

import javax.swing.*;
import java.awt.event.*;
import java.awt.BorderLayout;

public class MenuJFrame extends JFrame {
    // ATRIBUTOS
    private JFrame frame;
    private JScrollPane miBarra;
    private ModeloDatos tablaInforme;

    // CONSTRUCTOR
    public MenuJFrame() {
        // Crear el marco principal (Frame)
        frame = new JFrame();
        frame.setSize(800, 600);
        frame.setTitle("VISUALIZADOR DE INFORMES");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        inicializarComponentes();
        frame.setVisible(true);
    }

    public void inicializarComponentes() {
        // Creando MenuBar y agregando componentes
        JMenuBar menuBar = new JMenuBar();
        JMenu informes = new JMenu("INFORMES");
        menuBar.add(informes);
        JMenuItem primerInforme = new JMenuItem("Informe 1");
        JMenuItem segundoInforme = new JMenuItem("Informe 2");
        JMenuItem tercerInforme = new JMenuItem("Informe 3");
        informes.add(primerInforme);
        informes.add(segundoInforme);
        informes.add(tercerInforme);
        // Agregar componentes al marco
        frame.getContentPane().add(BorderLayout.NORTH, menuBar);
        //Creo el panel con barra y lo ubico en el frame principal
        miBarra = new JScrollPane();
        miBarra.setBounds(20, 20, 400, 200);
        //Crear tabla y agregarla al panel con barra (Scroll)
        JTable tabla = tablaVacia(" ", 40, 5);
        miBarra.setViewportView(tabla);
        // Agregar panel con barra al frame principal
        frame.getContentPane().add(miBarra, BorderLayout.CENTER);
        //Panel inferior
        JPanel panel = new JPanel();
        JButton limpiar = new JButton("Limpiar tabla");
        panel.add(limpiar);
        //Posicionar panel inferior
        frame.getContentPane().add(panel, BorderLayout.SOUTH);
        //Manejadores de eventos
        primerInforme.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //Crear tabla de primer informe
                tablaInforme = new ModeloDatos();
                //Agregar al panel con barra la tabla del primer informe
                miBarra.setViewportView(tablaInforme.crearTablaPrimerInforme());
            }
        });

        segundoInforme.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //Crear tabla de segundo informe
                tablaInforme = new ModeloDatos();
                //Agregar al panel con barra la tabla del primer informe
                miBarra.setViewportView(tablaInforme.crearTablaSegundoInforme());
            }
        });

        tercerInforme.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                //Crear tabla de tercer informe
                tablaInforme = new ModeloDatos();
                //Agregar al panel con barra la tabla del primer informe
                miBarra.setViewportView(tablaInforme.crearTablaTercerInforme());
            }
        });

        limpiar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                miBarra.setViewportView(tablaVacia(" ", 40, 5));
            }
        });
    }

    public JTable tablaVacia(String caracter, int numFila, int numColumna) {
        JTable tabla = new JTable();
        String[][] matriz = new String[numFila][numColumna];
        String[] columnas = new String[numColumna];
                
        for (int x = 0; x < columnas.length; x++) {
            columnas[x] = "COLUMNA " + (x+1);
        }

        for (int i = 0; i < numFila; i++) {
            for (int j = 0; j < numColumna; j++) {
                matriz[i][j] = caracter;
            }
        }
        tabla = new JTable(matriz, columnas);
        return tabla;
    }
}