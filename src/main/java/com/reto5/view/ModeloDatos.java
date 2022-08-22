package com.reto5.view;

import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.JTable;

public class ModeloDatos extends JPanel {
    // ATRIBUTOS
    private ReportesView informe;
    private ArrayList<ArrayList<String>> lista;
    private JTable tabla;

    //CONSTRUCTOR
    public ModeloDatos() {

    }

    public JTable crearTablaPrimerInforme() {
        informe = new ReportesView();
        lista = informe.ObtenerPrimerInforme();
        String[] titulos = { "ID LIDER", "NOMBRE", "APELLIDO", "CIUDAD RESIDENCIA" };
        String[][] informacion = obtenerMatriz(lista);
        tabla = new JTable(informacion, titulos);
        return tabla;
    }

    public JTable crearTablaSegundoInforme() {
        informe = new ReportesView();
        lista = informe.ObtenerSegundoInforme();
        String[] titulos = { "ID PROYECTO", "CONSTRUCTORA", "NUMERO HABITACIONES", "CIUDAD" };
        String[][] informacion = obtenerMatriz(lista);
        tabla = new JTable(informacion, titulos);
        return tabla;
    }

    public JTable crearTablaTercerInforme() {
        informe = new ReportesView();
        lista = informe.ObtenerTercerInforme();
        String[] titulos = { "ID COMPRA", "CONSTRUCTORA", "BANCO VINCULADO" };
        String[][] informacion = obtenerMatriz(lista);
        tabla = new JTable(informacion, titulos);
        return tabla;
    }

    public String[][] obtenerMatriz(ArrayList<ArrayList<String>> lista) {        
        int filas = lista.size();
        int columnas = lista.get(0).size();
        String matrizInfo[][] = new String[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matrizInfo[i][j] = lista.get(i).get(j);
            }
        }
        return matrizInfo;
    }
}