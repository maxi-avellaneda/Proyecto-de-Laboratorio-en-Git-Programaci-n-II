
package laboratorio2018;


public abstract class Persona {
    private String nombre;
    private String apellido;
    private String sexo;
    private String dni;
    private String direccion;
    
    public Persona(){};
    
    public Persona(String nombre,String apellido,String sexo,String dni,String direccion){
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.dni = dni;
        this.direccion = direccion;
    }

 
    public String getNombre() {
        return nombre;
    }

    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

 
    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }


    public String getSexo() {
        return sexo;
    }


    public void setSexo(String sexo) {
        this.sexo = sexo;
    }


    public String getDni() {
        return dni;
    }


    public void setDni(String dni) {
        this.dni = dni;
    }


    public String getDireccion() {
        return direccion;
    }


    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    
    
    
}
