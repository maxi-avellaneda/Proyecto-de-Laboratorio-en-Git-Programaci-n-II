/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio2018;


public class Enfermero extends Persona {
    private String sector;


    public Enfermero(String sector) {
        this.sector = sector;
    }

    public Enfermero(String nombre, String apellido, String sexo, String dni, String direccion,long telefono,String sector) {
        super(nombre, apellido, sexo, dni, direccion,telefono);
        this.sector = sector;
    }

    public String getSector() {
        return sector;
    }


    public void setSector(String sector) {
        this.sector = sector;
    }

    
}
