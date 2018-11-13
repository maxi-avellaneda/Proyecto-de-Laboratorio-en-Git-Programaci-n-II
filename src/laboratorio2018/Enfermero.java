
package laboratorio2018;


public class Enfermero extends Empleado {

    public Enfermero(String profesion, String legajo, int edad, String nombre, String apellido, String sexo, String dni, String direccion, String telefono) {
        super(profesion, legajo, edad, nombre, apellido, sexo, dni, direccion, telefono);
    }
    
    public Enfermero(String nombre, String apellido, String sexo, String dni, String direccion, String telefono,int dia, int mes,int ano,String profesion,String legajo){
        super(nombre,apellido,sexo,dni,direccion,telefono,dia,mes,ano,profesion,legajo);
    }

        
    @Override
    public String toString(){
        String enfermero = "Enfermero: "+getNombre() +" " +getApellido() +"\nSexo: "+getSexo()+"\nDNI N° :"+getDni()+"\nDireccion: "+getDireccion()+"\nLegajo: "+getLegajo();
        return enfermero;
    }

    
}
