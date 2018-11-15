/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio2018;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Iterator;

/**
 *
 * @author Rodrigo
 */
public class Asistencia {
    
    private int doctor;
    private int enfermero;
    private int chofer;
    private String movil;
    private int administrativo;
    private Calendar fecha = Calendar.getInstance();
    private int dia;
    private int mes;
    private int anio;
    private Afiliado afi;
    private Sistema sis;
    private String nomDoc;
    private String nomEnf;
    private String nomCho;
    private String nomAdm;
    
    public Asistencia(int doctor, int enfermero, int chofer, String movil, int administrativo, int dia, int mes, int anio){
        this.doctor = doctor;
        this.enfermero = enfermero;
        this.chofer = chofer;
        this.movil = movil;
        this.administrativo = administrativo;
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    public Asistencia(int doctor, int enfermero, int chofer, String movil, int administrativo, int dia, int mes, int anio, Afiliado afi) {
        this.doctor = doctor;
        this.enfermero = enfermero;
        this.chofer = chofer;
        this.movil = movil;
        this.administrativo = administrativo;
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
        this.afi = afi;
    }


    public int getAnio() {
        Calendar fechaActual = Calendar.getInstance();
        int anioAc = fechaActual.get(Calendar.YEAR);
        return anioAc;
    }

    public void setAnio(int anio) {
        this.anio=anio;
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

    

    public Afiliado getAfi() {
        return afi;
    }

    public void setAfi(Afiliado afi) {
        this.afi = afi;
    }

    public String getDoctor() {
        for (Doctor d : sis.getDoctores()){
            if(d.getLegajo().equals(doctor)){
                nomDoc=d.getNombre();
            }
        }
        return nomDoc;
    }

    public void setDoctor(int doctor) {
        this.doctor = doctor;
    }

    public String getEnfermero() {
        for (Enfermero e : sis.getEnfermeros()){
            if(e.getLegajo().equals(enfermero)){
                nomEnf=e.getNombre();
            }
        }
        return nomEnf;
    }

    public void setEnfermero(int enfermero) {
        this.enfermero = enfermero;
    }

    public String getChofer() {
        for (Chofer c : sis.getChoferes()){
            if(c.getLegajo().equals(chofer)){
                nomCho=c.getNombre();
            }
        }
        return nomCho;
    }

    public void setChofer(int chofer) {
        this.chofer = chofer;
    }

    public String getMovil() {
        return movil;
    }
    
    public void setMovil(String movil) {
        this.movil = movil;
    }

    public String getAdministrativo() {
        for (Administrativo a : sis.getAdminis()){
            if(a.getLegajo().equals(administrativo)){
                nomAdm=a.getNombre();
            }
        }
        return nomAdm;
    }

    public void setAdministrativo(int administrativo) {
        this.administrativo = administrativo;
    }

    public String getFecha(){
        
        DateFormat formato1 = new SimpleDateFormat("dd/MM/yyyy");
        String time = formato1.format(fecha.getTime());
        return time;
    }
    public void setFecha(int dia,int mes,int anio){
        fecha.set(dia,mes,anio);
    }
    }
