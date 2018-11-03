
package laboratorio2018;


public class Chofer extends Persona{
    
    private Movil movil;

    public Chofer(Movil movil) {
        
        this.movil = movil;
    }

    public Chofer(Movil movil, String nombre, String apellido, String sexo, String dni, String direccion,long telefono) {
        super(nombre, apellido, sexo, dni, direccion,telefono);
        this.movil = movil;
    }

    public Movil getMovil() {
        return movil;
    }

    public void setMovil(Movil movil) {
        this.movil = movil;
    }

    
}
