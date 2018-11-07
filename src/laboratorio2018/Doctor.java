
package laboratorio2018;

import java.util.ArrayList;

public class Doctor extends Persona {
    private int matricula;
    private ArrayList<Afiliado> afiliados =  new ArrayList<Afiliado>();
    
    public Doctor(){};
    public Doctor(String nombre,String apellido,String sexo,String dni,String direccion,long telefono,int matricula){
        super(nombre,apellido,sexo,dni,direccion,telefono);
        this.matricula = matricula;  
        
}
    @Override
    public String toString(){
        String doctor = "Doctor: "+getNombre() +" " +getApellido() +"- Matricula N°: "+getMatricula()+getSexo()+"\nDNI N° :"+getDni()+"\nDireccion: "+getDireccion();
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
