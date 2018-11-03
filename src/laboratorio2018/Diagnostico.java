
package laboratorio2018;

/**
 *
 * @author usuario
 */
public class Diagnostico {

    private String observacion;
    private String tipo;
    private String tratamiento;
  
    public Diagnostico(){}
    public Diagnostico(String observacion,String tipo,String tratamiento){
        this.observacion = observacion;
        this.tipo = tipo;
        this.tratamiento = tratamiento;        
    }
    @Override
    public String toString(){
        String diagnostico = "\nTipo: "+getTipo()+ "\nObservacion: "+getObservacion()+".\nTratamiento: "+getTratamiento();
        return diagnostico;
    }

    public String getObservacion() {
        return observacion;
    }

    
    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

   
    public String getTipo() {
        return tipo;
    }

   
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    
    public String getTratamiento() {
        return tratamiento;
    }


    public void setTratamiento(String tratamiento) {
        this.tratamiento = tratamiento;
    }
    
    
    


    
}
