
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
        if(anioP==0 && mesP<=2 && diaP<= 0){
            condicion="SIN MORA";
            return condicion;
        }else{
            condicion="MOROSO";
        } 
        return condicion; 
    }
    
    public void datos(Afiliado afiliado){
        System.out.println(afiliado);
        System.out.println("\nFECHA DE PAGO:\n");
        System.out.println(dia+"/"+mes+"/"+anio);
        System.out.println("Abono: "+abono);
        System.out.println("CONDICION DEL AFILIADO: "+condicion+" HASTA EL DIA DE LA FECHA");
    }
    
}
