
package laboratorio2018;


public class Chofer extends Empleado{
    
    private Movil movil;

    public Chofer(Movil movil, String profesion, Integer legajo, int edad, String nombre, String apellido, String sexo, String dni, String direccion, String telefono) {
        super(profesion, legajo, edad, nombre, apellido, sexo, dni, direccion, telefono);
        this.movil = movil;
    }

    public Movil getMovil() {
        return movil;
    }

    public void setMovil(Movil movil) {
        this.movil = movil;
    }

    @Override
    public String toString(){
        String chofer = "Chofer: "+getNombre() +" " +getApellido() +"\nSexo: "+getSexo()+"\nDNI N° :"+getDni()+"\nDireccion: "+getDireccion()/*+"\nFecha de Nacimiento: "+getFechaDeNaciemiento()+"\nEdad: "+calcularEdad()*/;
        return chofer;
    }
    
}
