
package laboratorio2018;

import java.util.*;


public class AbonoAfiliados {
    
    private Integer diapago,mespago,aniopago;
    private float abono;
    private String condicion;
    Calendar calendario = new GregorianCalendar();
    //private ArrayList<Afiliado> afiliados = new ArrayList<Afiliado>();
    private Afiliado afiliado;
    
    public AbonoAfiliados(Integer diapago,Integer mespago,Integer aniopago,float abono){
        this.aniopago=aniopago;
        this.diapago=diapago;
        this.mespago=mespago;
        this.abono=abono;
    }
    public AbonoAfiliados(){}
    
    public String fechaPagoAbono(){
        Integer diaPagar,mesPagar,anioPagar;
        anioPagar = (calendario.get(Calendar.YEAR))- aniopago;
        Math.abs(anioPagar);
        mesPagar = (calendario.get(Calendar.MONTH)+1)- mespago;
        Math.abs(mesPagar);
        diaPagar = (calendario.get(Calendar.DAY_OF_MONTH))- diapago;
        if(anioPagar==0 && mesPagar<=2 && diaPagar <= 0){
            condicion="SIN MORA";
            return condicion;
        }else{
            condicion="MOROSO";
        } 
        return condicion; 
    }
    /*public ArrayList<Afiliado> getAfiliados() {
        return afiliados;
    }

    public void setAfiliados(Afiliado a) {
        afiliados.add(a);
    }*/

    public Integer getDia() {
        return diapago;
    }

    public void setDia(Integer dia) {
        this.diapago = dia;
    }

    public Integer getMes() {
        return mespago;
    }

    public void setMes(Integer mes) {
        this.mespago = mes;
    }

    public Integer getAnio() {
        return aniopago;
    }

    public void setAnio(Integer anio) {
        this.aniopago = anio;
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

    public Afiliado getAfiliado() {
        return afiliado;
    }

    public void setAfiliado(Afiliado afiliado) {
        this.afiliado = afiliado;
    }
    
    
}
