package com.reto5.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCUtilities {
    //Atributos de clase para gestión de conexión con la base de datos
    private static final String UBICACION_DB = "ProyectosConstruccion.db";

    //Metodo
    public static Connection getConnetion() throws SQLException {
        String url = "jdbc:sqlite:" + UBICACION_DB;
        return DriverManager.getConnection(url);
    }
}
