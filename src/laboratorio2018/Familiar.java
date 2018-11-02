
package laboratorio2018;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;


class Familiar extends Persona{
    
    private String relacion;
    private Calendar fechaDeNaciemiento = Calendar.getInstance();
    
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
    public String toString(){
        String familiar = "Familiar: "+getNombre() +" " +getApellido() +"\nSexo: "+getSexo()+"\nDNI N° :"+getDni()+"\nDireccion: "+getDireccion()+"\nFecha de Nacimiento: "+getFechaDeNaciemiento()+"\nEdad: "+calcularEdad()+"\nRelacion:"+getRelacion();
        return familiar;
    }

    public Familiar(String relacion) {
        this.relacion = relacion;
    }

    public String getRelacion() {
        return relacion;
    }


    public String getFechaDeNaciemiento() {
        DateFormat formato1 = new SimpleDateFormat("dd/MM/yyyy");
        String fecha = formato1.format(fechaDeNaciemiento.getTime());
        return fecha;
    }
    
    public void setFechaDeNaciemiento(int dia, int mes, int ano){
        fechaDeNaciemiento.set(ano,mes-1,dia);
    }

    public void setRelacion(String relacion) {
        this.relacion = relacion;
    }

}
