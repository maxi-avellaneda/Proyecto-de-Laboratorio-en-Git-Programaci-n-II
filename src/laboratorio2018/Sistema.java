
package laboratorio2018;

import java.util.ArrayList;


public class Sistema { // seria la asistencia medica
    private ArrayList<Afiliado> afiliados =  new ArrayList<Afiliado>();
    private ArrayList<Doctor> doctores =  new ArrayList<Doctor>();
    private ArrayList<Diagnostico> diagnosticos =  new ArrayList<Diagnostico>();
    private ArrayList<Enfermero> enfermeros =  new ArrayList<Enfermero>();
    private ArrayList<Chofer> choferes =  new ArrayList<Chofer>();
    private ArrayList<Administrativo> adminis =  new ArrayList<Administrativo>();


    public ArrayList<Afiliado> getAfiliados() {
        return afiliados;
    }

    public void setAfiliados(Afiliado a) {
        afiliados.add(a);         
    }
    
    public ArrayList<Enfermero> getEnfermeros(){
        return enfermeros;
    }
    
    public void setEnfermeros( Enfermero e){
        
        enfermeros.add(e);
    }
   
    public ArrayList<Doctor> getDoctores() {
        return doctores;
    }

   
    public void setDoctores(Doctor d) {
        doctores.add(d);
    }
   
    public void setChoferes(Chofer c){
        choferes.add(c);
    }
    public ArrayList<Chofer> getChoferes() {
        return choferes;
    }
    
    public void setAdminis(Administrativo ad){
        adminis.add(ad);
    }
    public ArrayList<Administrativo> getAdminis(){
        return adminis;
    }

    public ArrayList<Diagnostico> getDiagnosticos() {
        return diagnosticos;
    }

    public void setDiagnosticos(Diagnostico d) {
        diagnosticos.add(d);
    }
    
    
    public void verificarDatos(String dni, String nombre, String apellido,String domicilio,String telefono) throws VerificarDniException, VerficarCampoVacioException{
        
        if(dni.length() == 8 || dni.length() == 7){
            int numero = Integer.parseInt(dni);
            if(numero < 1000000)
                 throw new VerificarDniException();             
        }
        else 
            throw new VerificarDniException();
        
        if(nombre.equals("")||apellido.equals("")||domicilio.equals("")|| telefono.equals(""))
                    throw new VerficarCampoVacioException();
                
    }
    
    /*public void sincronisarInformacion(Afiliado afiliado, Object doctor, Object especialidad,Object habitacion, int numCama){
        
        for (Doctor doc : this.getDoctores()){
            if(doc.toString().equals(doctor.toString())){
                doc.setAfiliado(afiliado);
                afiliado.setDoctor(doc);
            }
        }
        
        for (Especialidad esp : this.getEspecialidades()){
            if(esp.toString().equals(especialidad.toString())){
                afiliado.setEspecialidad(esp);
            }
        }
    }*/
    
    public void verificarDni(String dni) throws VerificarDniException{
        
        if(dni.length() == 8 || dni.length() == 7){
            int numero = Integer.parseInt(dni);
            if(numero < 1000000)
                throw new VerificarDniException();                   
        }
        else 
            throw new VerificarDniException();             
    }
    
    public void buscarAfiliado(String dni) throws AfiliadoNoEncontradoException{
        int bandera =0;
        for(Afiliado afi : this.getAfiliados()){
                    if (afi.getDni().equals(dni)){
                        bandera =1;
                        break;
                }
                }
        if(bandera == 0)
            throw new AfiliadoNoEncontradoException();      
    }
    
    public void buscarRepetido(String dni) throws  VerificarRepetidosException{
    for(Afiliado afi : this.getAfiliados()){
        if (afi.getDni().equals(dni)){
            throw new VerificarRepetidosException();
        }
    }
    }
    
}

