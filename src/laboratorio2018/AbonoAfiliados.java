
package laboratorio2018;

import java.util.*;


public class AbonoAfiliados {
    
    private Integer dia,mes,anio;
    private float abono;
    private String condicion;
    
    Calendar calendario = new GregorianCalendar();
    
    public AbonoAfiliados(Afiliado afiliado,Integer dia,Integer mes,Integer anio,float abono){
        this.anio=anio;
        this.dia=dia;
        this.mes=mes;
        this.abono=abono;
    }
    public AbonoAfiliados(){}
    
    public String fechaPagoAbono(){
        Integer diaP,mesP,anioP;
        anioP = (calendario.get(Calendar.YEAR))- anio;
        Math.abs(anioP);
        mesP = (calendario.get(Calendar.MONTH)+1)- mes;
        Math.abs(mesP);
        diaP = (calendario.get(Calendar.DAY_OF_MONTH))- dia;
        if(anioP==0 && mesP<=2 && diaP <= 0){
            condicion="SIN MORA";
            return condicion;
        }else{
            condicion="MOROSO";
        } 
        return condicion; 
    }
    
    /*public void datos(Afiliado afiliado){
        System.out.println(afiliado);
        System.out.println("\nFECHA DE PAGO:\n");
        System.out.println(dia+"/"+mes+"/"+anio);
        System.out.println("Abono: "+abono);
        System.out.println("CONDICION DEL AFILIADO: "+condicion+" HASTA EL DIA DE LA FECHA");
    }*/

    public Integer getDia() {
        return dia;
    }

    public void setDia(Integer dia) {
        this.dia = dia;
    }

    public Integer getMes() {
        return mes;
    }

    public void setMes(Integer mes) {
        this.mes = mes;
    }

    public Integer getAnio() {
        return anio;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }

    public float getAbono() {
        return abono;
    }

    public void setAbono(float abono) {
        this.abono = abono;
    }

    public String getCondicion() {
        return condicion;
    }

    public void setCondicion(String condicion) {
        this.condicion = condicion;
    }
    
    
}
