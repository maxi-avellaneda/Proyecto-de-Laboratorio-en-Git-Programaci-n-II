
package laboratorio2018;

public class Administrativo extends Empleado {

    public Administrativo(String profesion, Integer legajo, int edad, String nombre, String apellido, String sexo, String dni, String direccion, String telefono) {
        super(profesion, legajo, edad, nombre, apellido, sexo, dni, direccion, telefono);
    }

    
     @Override
    public String toString(){
        String administrativo = "Administrativo: "+getNombre() +" " +getApellido() +"\nSexo: "+getSexo()+"\nDNI N° :"+getDni()+"\nDireccion: "+getDireccion()+"\nTelefono: "+getTelefono()/*+"\nFecha de Nacimiento: "+getFechaDeNaciemiento()+"\nEdad: "+calcularEdad()*/;
        return administrativo;
    }
    
}
