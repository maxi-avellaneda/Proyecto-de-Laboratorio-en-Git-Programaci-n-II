
package laboratorio2018;

public class Administrativo extends Empleado {

    
    public Administrativo(String nombre, String apellido, String sexo, String dni, String direccion, String telefono,int dia, int mes,int ano,String profesion,String legajo){
        super(nombre,apellido,sexo,dni,direccion,telefono,dia,mes,ano,profesion,legajo);
    }

    
     @Override
    public String toString(){
        String administrativo = "Administrativo: "+getNombre() +" " +getApellido() +"\nSexo: "+getSexo()+"\nDNI N° :"+getDni()+"\nDireccion: "+getDireccion()+"\nTelefono: "+getTelefono()+"\nN° Legajo: "+getLegajo();
        return administrativo;
    }
    
}
