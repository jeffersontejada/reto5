package com.reto5.model.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.reto5.model.vo.TercerInformeVo;
import com.reto5.util.JDBCUtilities;

public class TercerInformeDao extends TercerInformeVo{
    //ATRIBUTOS

    //CONSTRUCTOR
    public TercerInformeDao() {

    }

    //CONSULTAS BASE DE DATOS
    public ResultSet consultaTercerInforme() {
        ResultSet result = null;
        try {
            String query = "SELECT c.ID_Compra, p.Constructora, p.Banco_Vinculado FROM ";
            query += "Proyecto p INNER JOIN Compra c ON p.ID_Proyecto = c.ID_Proyecto ";
            query += "WHERE p.Ciudad = ? AND c.Proveedor = ?";
            PreparedStatement pst = JDBCUtilities.getConnetion().prepareStatement(query);
            pst.setString(1, "Salento");
            pst.setString(2, "Homecenter");
            result = pst.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }
}
