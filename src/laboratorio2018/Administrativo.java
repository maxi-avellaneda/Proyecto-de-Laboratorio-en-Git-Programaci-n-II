/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio2018;

public class Administrativo extends Persona {
    private String especialidad;
    private Integer sueldo;

    public Administrativo(String especialidad, Integer sueldo) {
        this.especialidad = especialidad;
        this.sueldo = sueldo;
    }

    public Administrativo(String especialidad, Integer sueldo, String nombre, String apellido, String sexo, String dni, String direccion) {
        super(nombre, apellido, sexo, dni, direccion);
        this.especialidad = especialidad;
        this.sueldo = sueldo;
    }

    
    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public Integer getSueldo() {
        return sueldo;
    }

    public void setSueldo(Integer sueldo) {
        this.sueldo = sueldo;
    }
    
}
