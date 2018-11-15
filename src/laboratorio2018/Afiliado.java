 
package laboratorio2018;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;

public class Afiliado extends Persona { //el afiliado es un paciente
    
    private Doctor doctor;
    private Diagnostico diagnostico;
    private ArrayList<Familiar> familiares =  new ArrayList<Familiar>();
    private AbonoAfiliados abono;
    private int edad;
    private String estado;//esto servirá en 0 para moroso, 1 para cuando no está en mora
    private Calendar fechaDeNaciemiento = Calendar.getInstance();
    private ArrayList<Asistencia> asistencias= new ArrayList<Asistencia>();
  
    public Afiliado(){}
    
    public Afiliado(String nombre,String apellido,String sexo,String dni,String direccion,String telefono,int dia, int mes,int ano){
        super(nombre,apellido,sexo,dni,direccion,telefono);
        fechaDeNaciemiento.set(ano,mes-1,dia);
        edad = this.calcularEdad();
    }
    
    public Afiliado(Doctor doctor, Diagnostico diagnostico, int edad, String nombre, String apellido, String sexo, String dni, String direccion,String telefono) {
        super(nombre, apellido, sexo, dni, direccion,telefono);
        this.doctor = doctor;
        this.diagnostico = diagnostico;
        this.edad = edad;
    }

    
    public int calcularEdad(){
        int edad=0;
        Calendar fechaActual = Calendar.getInstance();
        int anioAc = fechaActual.get(Calendar.YEAR);
        int mesAc = fechaActual.get(Calendar.MONTH);
        int diaAc = fechaActual.get(Calendar.DAY_OF_MONTH);
        int anioNac = fechaDeNaciemiento.get(Calendar.YEAR);
        int mesNac = fechaDeNaciemiento.get(Calendar.MONTH);
        int diaNac = fechaDeNaciemiento.get(Calendar.DAY_OF_MONTH);
        if(mesAc>mesNac){
            edad = anioAc - anioNac;
        }
        if(mesAc<mesNac){
            edad = anioAc - anioNac-1;
        }
        if(mesAc==mesNac){
            if(diaAc>=diaNac){
                edad = anioAc - anioNac;
            }
            else{
                edad = anioAc - anioNac-1;
            }
        }
        if(edad==0){
            if(mesAc>mesNac){
                edad = mesAc - mesNac;
            }
            if(mesAc<mesNac){
                edad = 12 - mesNac + mesAc;
            }
            if(mesAc==mesNac){
                if(diaAc>=diaNac){
                    edad = mesAc - mesNac;
                }
                else{
                    edad = mesAc - mesNac-1;
                }
            }
        }
        if(anioNac>anioAc){System.out.println("FECHA DE NACIMIENTO MAL INGRESADA");}
        return edad;
    }
    
     public String getFechaDeNaciemiento() {
        DateFormat formato1 = new SimpleDateFormat("dd/MM/yyyy");
        String fecha = formato1.format(fechaDeNaciemiento.getTime());
        return fecha;
    }
    
    public void setFechaDeNaciemiento(int dia, int mes, int ano){
        fechaDeNaciemiento.set(ano,mes-1,dia);
    }

    @Override
    public String toString(){
<<<<<<< HEAD
        String afiliado = "Afiliado: "+getNombre() +" " +getApellido() +"\nSexo: "+getSexo()+"\nDNI N° :"+getDni()+"\nDireccion: "+getDireccion()+"\nFecha de Nacimiento: "+getFechaDeNaciemiento()+"\nEdad: "+calcularEdad()+"\nCantidad de asistencias solicitadas:"+cantidadAsistencias()/*+"\nCondicion de su pago: "+comprobarAbono()*/;
=======
        String afiliado = "Afiliado: "+getNombre() +" " +getApellido() +"\nSexo: "+getSexo()+"\nDNI N° :"+getDni()+"\nDireccion: "+getDireccion()+"\nFecha de Nacimiento: "+getFechaDeNaciemiento()+"\nEdad: "+calcularEdad();
>>>>>>> 850cd290e44c0fc94ef4c89b726ed5f19444446e
        return afiliado;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

   
    public Diagnostico getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(Diagnostico diagnostico) {
        this.diagnostico = diagnostico;
    }

    public ArrayList<Familiar> getFamiliares() {
        return familiares;
    }

    public void setFamiliares(Familiar f) {
        familiares.add(f);
    }

    public ArrayList<Asistencia> getAsistencias() {
        return asistencias;
    }

    
    public void setAsistencias(Asistencia as) {
        asistencias.add(as);
    }

<<<<<<< HEAD
    public int cantidadAsistencias(){
        int i=0;
        if(!getAsistencias().isEmpty()) {
            Iterator iterador = getAsistencias().listIterator(); //el objeto iterador te ayuda a recorrer una coleccion.
            while (iterador.hasNext()) {
                i++; //para saber la cantidad de asistencias
            }
        }
        else{
            return i=0;
        }
        return i;
    }
    /*public String comprobarAbono(){
        if(abono.getCondicion().equals("Mora")){
            estado="Mora";
        }else{
            estado="Sin Mora";
        }
        return estado;
    }*/
=======
>>>>>>> 850cd290e44c0fc94ef4c89b726ed5f19444446e
    
    
}
