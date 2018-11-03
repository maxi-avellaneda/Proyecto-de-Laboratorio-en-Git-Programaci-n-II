
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
        Integer mesP,anioP;
        anioP = (calendario.get(Calendar.YEAR))- anio;
        Math.abs(anioP);
        mesP = (calendario.get(Calendar.MONTH)+1)- mes;
        Math.abs(mesP);
        if(anioP==0 && mesP<=2 && (calendario.get(Calendar.DAY_OF_MONTH))<= dia){
            condicion="Sin mora";
            return condicion;
        }else{
            condicion="mora";
        } 
        return condicion; 
    }
    
}
