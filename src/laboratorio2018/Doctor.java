
package laboratorio2018;

import java.util.ArrayList;

public class Doctor extends Persona {
    private int matricula;
    private Especialidad especialidad;
    private ArrayList<Afiliado> afiliados =  new ArrayList<Afiliado>();
    
    public Doctor(){};
    public Doctor(String nombre,String apellido,String sexo,String dni,String direccion,int matricula, Especialidad especialidad){
        super(nombre,apellido,sexo,dni,direccion);
        this.especialidad = especialidad;
        this.matricula = matricula;  
        
}
    @Override
    public String toString(){
        String doctor = getNombre() +" " +getApellido() +"- MPN° "+getMatricula();
        return doctor;
    }
    public String afiliadosAsignados(){
        String lista = "";
        for (int i=0; i< afiliados.size();i++){
            Object hab = afiliados.get(i);
            lista = lista +"\n"+ hab;
        }
        String asignados = toString()+"\nPacientes asignados"+lista;
        return asignados;
    }
    
    /**
     * @return the matricula
     */
    public int getMatricula() {
        return matricula;
    }

    /**
     * @param matricula the matricula to set
     */
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    /**
     * @return the especialidad
     */
    public Especialidad getEspecialidad() {
        return especialidad;
    }

    /**
     * @param especialidad the especialidad to set
     */
    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

    /**
     * @return the paciente de acuerdo a su dni
     */
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
