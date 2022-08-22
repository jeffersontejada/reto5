package com.reto5.controller;

import java.sql.ResultSet;

import com.reto5.model.dao.PrimerInformeDao;
import com.reto5.model.dao.SegundoInformerDao;
import com.reto5.model.dao.TercerInformeDao;

public class ReportesController {
    //ATRIBUTOS
    PrimerInformeDao primerInformeDao;
    SegundoInformerDao segundoInformerDao;
    TercerInformeDao tercerInformeDao;

    //CONSTRUCTORES
    public ReportesController(){
        
    }

    //ACCIONES
    public ResultSet ejecutarPrimerInforme() {
        primerInformeDao = new PrimerInformeDao();
        return primerInformeDao.consultaPrimerInforme();
    }

    public ResultSet ejecutarSegundoInforme() {
        segundoInformerDao = new SegundoInformerDao();
        return segundoInformerDao.consultaSegundoInforme();
    }

    public ResultSet ejecutarTercerInforme() {
        tercerInformeDao = new TercerInformeDao();
        return tercerInformeDao.consultaTercerInforme();
    }
}