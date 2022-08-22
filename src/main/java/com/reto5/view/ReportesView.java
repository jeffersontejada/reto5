package com.reto5.view;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.reto5.controller.ReportesController;

public class ReportesView {
    private ArrayList<ArrayList<String>> lista;
    ArrayList<String> fila;

    public ArrayList<ArrayList<String>> ObtenerPrimerInforme() {
        lista = new ArrayList<ArrayList<String>>();
        ReportesController primerInforme = new ReportesController();
        ResultSet rs = primerInforme.ejecutarPrimerInforme();

        try {
            while (rs.next()) {
                fila = new ArrayList<String>();
                String idLider = rs.getString("ID_lider");
                fila.add(idLider);
                String nombre = rs.getString("Nombre");
                fila.add(nombre);
                String primerApellido = rs.getString("Primer_Apellido");
                fila.add(primerApellido);
                String ciudadResidencia = rs.getString("Ciudad_Residencia");
                fila.add(ciudadResidencia);
                lista.add(fila);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }

    public ArrayList<ArrayList<String>> ObtenerSegundoInforme() {
        ReportesController segundoInforme = new ReportesController();
        ResultSet rs = segundoInforme.ejecutarSegundoInforme();
        lista = new ArrayList<ArrayList<String>>();

        try {
            while (rs.next()) {
                fila = new ArrayList<String>();
                String idProyecto = rs.getString("ID_Proyecto");
                fila.add(idProyecto);
                String constructora = rs.getString("Constructora");
                fila.add(constructora);
                String habitaciones = rs.getString("Numero_Habitaciones");
                fila.add(habitaciones);
                String ciudad = rs.getString("Ciudad");
                fila.add(ciudad);
                lista.add(fila);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }

    public ArrayList<ArrayList<String>> ObtenerTercerInforme() {
        ReportesController tercerInforme = new ReportesController();
        ResultSet rs = tercerInforme.ejecutarTercerInforme();
        lista = new ArrayList<ArrayList<String>>();

        try {
            while (rs.next()) {
                fila = new ArrayList<String>();
                String idCompra = rs.getString("ID_Compra");
                fila.add(idCompra);
                String constructora = rs.getString("Constructora");
                fila.add(constructora);
                String banco = rs.getString("Banco_vinculado");
                fila.add(banco);
                lista.add(fila);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }
}
