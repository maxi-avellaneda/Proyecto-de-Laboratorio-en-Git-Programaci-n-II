
package laboratorio2018;


public class Chofer extends Persona {
    
    private Movil movil;
    private Integer sueldo;

    public Chofer(Movil movil, Integer sueldo) {
        this.movil = movil;
        this.sueldo = sueldo;
    }

    public Chofer(Movil movil, Integer sueldo, String nombre, String apellido, String sexo, String dni, String direccion) {
        super(nombre, apellido, sexo, dni, direccion);
        this.movil = movil;
        this.sueldo = sueldo;
    }

    public Movil getMovil() {
        return movil;
    }

    public void setMovil(Movil movil) {
        this.movil = movil;
    }

    public Integer getSueldo() {
        return sueldo;
    }

    public void setSueldo(Integer sueldo) {
        this.sueldo = sueldo;
    }
    
}
