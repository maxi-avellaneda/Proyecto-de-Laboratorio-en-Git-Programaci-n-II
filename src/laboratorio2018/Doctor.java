
package laboratorio2018;

import java.util.ArrayList;

public class Doctor extends Empleado {
    private int matricula;
    private ArrayList<Afiliado> afiliados =  new ArrayList<Afiliado>();

    public Doctor(int matricula, String profesion, String legajo, int edad, String nombre, String apellido, String sexo, String dni, String direccion, String telefono) {
        super(profesion, legajo, edad, nombre, apellido, sexo, dni, direccion, telefono);
        this.matricula = matricula;
    }
    
    public Doctor(String nombre, String apellido, String sexo, String dni, String direccion, String telefono,int dia, int mes,int ano,String profesion,String legajo){
        super(nombre,apellido,sexo,dni,direccion,telefono,dia,mes,ano,profesion,legajo);
    }


    
    @Override
    public String toString(){
        String doctor = "Doctor: "+getNombre() +" " +getApellido() +"\nSexo: "+getSexo()+"\nDNI N° :"+getDni()+"\nDireccion: "+getDireccion()+"\nN° Legajo: "+getLegajo();
        return doctor;
    }
    /*public String afiliadosAsignados(){
        String lista = "";
        for (int i=0; i< afiliados.size();i++){
            Object hab = afiliados.get(i);
            lista = lista +"\n"+ hab;
        }
        String asignados = toString()+"\nPacientes asignados"+lista;
        return asignados;
    }*/
    
  
    public int getMatricula() {
        return matricula;
    }

    
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }


    public Afiliado getAfiliado(String dni) {
        
        Afiliado resultado = null;
        for (Afiliado afiliado : afiliados){
            if(afiliado.getDni().equals(dni)){
                resultado = afiliado;
            }
        }
        return resultado;
    }

    public void setAfiliado(Afiliado a) {
       afiliados.add(a);
    }

}
