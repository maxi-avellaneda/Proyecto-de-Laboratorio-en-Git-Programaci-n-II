/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio2018;

import java.util.Calendar;

/**
 *
 * @author Rodrigo
 */
public class Asistencia {
    
    private Calendar fecha = Calendar.getInstance();
    private int dia;
    private int mes;
    private int anio;
    private Afiliado afi;
    
    public Asistencia(){
        
    }

    public Asistencia(int dia, int mes, int anio, Afiliado afi) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
        this.afi = afi;
    }

    public int getFecha() {
        Calendar fechaActual = Calendar.getInstance();
        int anioAc = fechaActual.get(Calendar.YEAR);
        return anioAc;
    }

    public void setFecha(Calendar fecha) {
        this.fecha = fecha;
    }

    public int getDia() {
        Calendar fechaActual = Calendar.getInstance();
        int diaAc = fechaActual.get(Calendar.DAY_OF_MONTH);
        return diaAc;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        Calendar fechaActual = Calendar.getInstance();
        int mesAc = fechaActual.get(Calendar.MONTH);
        return mesAc;
    }
    
    public String toString(){
        String datos= "Fecha de la peticion:"+getDia()+"/"+getMes()+"/"+getFecha();
        return datos;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public Afiliado getAfi() {
        return afi;
    }

    public void setAfi(Afiliado afi) {
        this.afi = afi;
    }

    
    
}
