/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio2018;


public class Enfermero extends Empleado {

    public Enfermero(String profesion, Integer legajo, int edad, String nombre, String apellido, String sexo, String dni, String direccion, String telefono) {
        super(profesion, legajo, edad, nombre, apellido, sexo, dni, direccion, telefono);
    }

        
    @Override
    public String toString(){
        String enfermero = "Enfermero: "+getNombre() +" " +getApellido() +"\nSexo: "+getSexo()+"\nDNI N° :"+getDni()+"\nDireccion: "+getDireccion()/*+"\nFecha de Nacimiento: "+getFechaDeNaciemiento()+"\nEdad: "+calcularEdad()*/;
        return enfermero;
    }

    
}
