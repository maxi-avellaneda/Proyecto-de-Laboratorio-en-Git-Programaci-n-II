/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio2018;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author Rodrigo
 */
public class Empleado extends Persona{
    
    private String profesion;
    private Integer legajo;
    private Calendar fechaDeNaciemiento = Calendar.getInstance();
    private int edad;

    
    public Empleado(String profesion,Integer legajo,String nombre,String apellido,String sexo,String dni,String direccion,String telefono,int dia, int mes,int ano){
        super(nombre,apellido,sexo,dni,direccion,telefono);
        fechaDeNaciemiento.set(ano,mes-1,dia);
        edad = this.calcularEdad();
    }
    public Empleado(String profesion, Integer legajo, int edad, String nombre, String apellido, String sexo, String dni, String direccion, String telefono) {
        super(nombre, apellido, sexo, dni, direccion, telefono);
        this.profesion = profesion;
        this.legajo = legajo;
        this.edad = edad;
    }

    
    public int calcularEdad(){
        int edad=0;
        Calendar fechaActual = Calendar.getInstance();
        int anioAc = fechaActual.get(Calendar.YEAR);
        int mesAc = fechaActual.get(Calendar.MONTH);
        int diaAc = fechaActual.get(Calendar.DAY_OF_MONTH);
        int anioNac = fechaDeNaciemiento.get(Calendar.YEAR);
        int mesNac = fechaDeNaciemiento.get(Calendar.MONTH);
        int diaNac = fechaDeNaciemiento.get(Calendar.DAY_OF_MONTH);
        if(mesAc>mesNac){
            edad = anioAc - anioNac;
        }
        if(mesAc<mesNac){
            edad = anioAc - anioNac-1;
        }
        if(mesAc==mesNac){
            if(diaAc>=diaNac){
                edad = anioAc - anioNac;
            }
            else{
                edad = anioAc - anioNac-1;
            }
        }
        if(edad==0){
            if(mesAc>mesNac){
                edad = mesAc - mesNac;
            }
            if(mesAc<mesNac){
                edad = 12 - mesNac + mesAc;
            }
            if(mesAc==mesNac){
                if(diaAc>=diaNac){
                    edad = mesAc - mesNac;
                }
                else{
                    edad = mesAc - mesNac-1;
                }
            }
        }
        if(anioNac>anioAc){System.out.println("FECHA DE NACIMIENTO MAL INGRESADA");}
        return edad;
    }
    
     public String getFechaDeNaciemiento() {
        DateFormat formato1 = new SimpleDateFormat("dd/MM/yyyy");
        String fecha = formato1.format(fechaDeNaciemiento.getTime());
        return fecha;
    }
    
    public void setFechaDeNaciemiento(int dia, int mes, int ano){
        fechaDeNaciemiento.set(ano,mes-1,dia);
    }
    
    public String toString(){
        String empleado =getProfesion()+": "+getNombre() +" " +getApellido() +"\nSexo: "+getSexo()+"\nDNI N° :"+getDni()+"\nDireccion: "+getDireccion()+"\nFecha de Nacimiento: "+getFechaDeNaciemiento()+"\nEdad: "+calcularEdad()+"\nLegajo: "+getLegajo();
        return empleado;
    }
    /**
     * @return the profesion
     */
    public String getProfesion() {
        return profesion;
    }

    /**
     * @param profesion the profesion to set
     */
    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    /**
     * @return the legajo
     */
    public Integer getLegajo() {
        return legajo;
    }

    /**
     * @param legajo the legajo to set
     */
    public void setLegajo(Integer legajo) {
        this.legajo = legajo;
    }
    
}
