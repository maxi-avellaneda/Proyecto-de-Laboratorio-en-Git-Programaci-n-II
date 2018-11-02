/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio2018;


public class Enfermero extends Persona {
    private String sector;
    private Integer sueldo;


    public Enfermero(String sector, Integer sueldo) {
        this.sector = sector;
        this.sueldo = sueldo;
    }

    public Enfermero(String sector, Integer sueldo, String nombre, String apellido, String sexo, String dni, String direccion) {
        super(nombre, apellido, sexo, dni, direccion);
        this.sector = sector;
        this.sueldo = sueldo;
    }

    public String getSector() {
        return sector;
    }


    public void setSector(String sector) {
        this.sector = sector;
    }

    public Integer getSueldo() {
        return sueldo;
    }

    public void setSueldo(Integer sueldo) {
        this.sueldo = sueldo;
    }
    
    
}
