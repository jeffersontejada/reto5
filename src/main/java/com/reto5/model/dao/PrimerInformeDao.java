package com.reto5.model.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.reto5.model.vo.PrimerInformeVo;
import com.reto5.util.JDBCUtilities;

public class PrimerInformeDao extends PrimerInformeVo{
    //ATRIBUTOS

    //CONSTRUCTOR
    public PrimerInformeDao() {

    }

    //CONSULTAS
    public ResultSet consultaPrimerInforme() {
        ResultSet result = null;
        try {
            String query = "SELECT ID_Lider, Nombre,Primer_Apellido, Ciudad_Residencia FROM Lider ";
            query += "ORDER BY Ciudad_Residencia";
            result = JDBCUtilities.getConnetion().createStatement().executeQuery(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }
}
