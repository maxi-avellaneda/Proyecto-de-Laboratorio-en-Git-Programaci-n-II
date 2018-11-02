
package laboratorio2018;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

public class Afiliado extends Persona {//es el paciente
    
    private Doctor doctor;
    private Especialidad especialidad;
    private Calendar fechaDeNaciemiento = Calendar.getInstance();
    private Diagnostico diagnostico;
    private int edad;
    private Integer mora;
    private ArrayList<Familiar> familiares =  new ArrayList<Familiar>();

    public Afiliado(Doctor doctor, Especialidad especialidad, Diagnostico diagnostico, int edad, Integer mora) {
        this.doctor = doctor;
        this.especialidad = especialidad;
        this.diagnostico = diagnostico;
        this.edad = edad;
        this.mora = mora;
    }

    public Afiliado(Doctor doctor, Especialidad especialidad, Diagnostico diagnostico, int edad, Integer mora, String nombre, String apellido, String sexo, String dni, String direccion) {
        super(nombre, apellido, sexo, dni, direccion);
        this.doctor = doctor;
        this.especialidad = especialidad;
        this.diagnostico = diagnostico;
        this.edad = edad;
        this.mora = mora;
    }
    
    
    public int calcularEdad(){
        int edad=0;
        Calendar fechaActual = Calendar.getInstance();
        int anoAc = fechaActual.get(Calendar.YEAR);
        int mesAc = fechaActual.get(Calendar.MONTH);
        int diaAc = fechaActual.get(Calendar.DAY_OF_MONTH);
        int anoNac = fechaDeNaciemiento.get(Calendar.YEAR);
        int mesNac = fechaDeNaciemiento.get(Calendar.MONTH);
        int diaNac = fechaDeNaciemiento.get(Calendar.DAY_OF_MONTH);
        if (anoNac <= anoAc){
            if (mesNac <= mesAc){
                if (diaNac <= diaAc)
                    edad = anoAc - anoNac;
                else 
                    edad = anoAc - anoNac -1;
            }else
                edad = anoAc - anoNac -1;
        }else
            System.out.println("Error de Fecha de nacimiento");
        
        
        //System.out.println("Fecha Actual:  " + fechaActual.getTime());
        //System.out.println("Fecha Nacimiento:  " + fechaDeNaciemiento.getTime());
        return edad;
    }
    @Override
    public String toString(){
        String afiliado = "Afiliado: "+getNombre() +" " +getApellido() +"\nSexo: "+getSexo()+"\nDNI N° :"+getDni()+"\nDireccion: "+getDireccion()+"\nFecha de Nacimiento: "+getFechaDeNaciemiento()+"\nEdad: "+calcularEdad();
        return afiliado;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

  
    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

 
   
    
    public String getFechaDeNaciemiento() {
        DateFormat formato1 = new SimpleDateFormat("dd/MM/yyyy");
        String fecha = formato1.format(fechaDeNaciemiento.getTime());
        return fecha;
    }
    
    public void setFechaDeNaciemiento(int dia, int mes, int ano){
        fechaDeNaciemiento.set(ano,mes-1,dia);
    }


    public Diagnostico getDiagnostico() {
        return diagnostico;
    }

  
    public void setDiagnostico(Diagnostico diagnostico) {
        this.diagnostico = diagnostico;
    }

    public Integer getMora() {
        return mora;
    }

    public void setMora(Integer mora) {
        this.mora = mora;
    }

  

    

    
  
    
            
}
