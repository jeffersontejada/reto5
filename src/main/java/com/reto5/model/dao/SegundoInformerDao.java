package com.reto5.model.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.reto5.model.vo.SegundoInformeVo;
import com.reto5.util.JDBCUtilities;

public class SegundoInformerDao extends SegundoInformeVo {
    //ATRIBUTOS

    //CONSTRUCTOR
    public SegundoInformerDao() {

    }

    //CONSULTAS   
    public ResultSet consultaSegundoInforme() {
        ResultSet result =null;
        try {
            String query = "SELECT ID_Proyecto, Constructora, Numero_Habitaciones, Ciudad FROM Proyecto ";
            query += "WHERE Clasificacion = ? AND (Ciudad = ? OR Ciudad = ? OR Ciudad = ?)";
            PreparedStatement pst = JDBCUtilities.getConnetion().prepareStatement(query);
            pst.setString(1, "Casa Campestre");
            pst.setString(2, "Santa Marta");
            pst.setString(3, "Cartagena");
            pst.setString(4, "Barranquilla");
            result = pst.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }  
}