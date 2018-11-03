/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio2018;
 import java.util.*;

public class Laboratorio2018 {

    public static void main(String[] args) {
        
        //GESTION DE DATOS DE AFILIADOS y SUS FAMILIARES
        Afiliado afi1 = new Afiliado("Roberto","Gomez","Masculino","10111236","av Mexico",22113,8,5,1950);
        Afiliado afi2 = new Afiliado("Marcos","Herrra","Masculino","20888999","Mota Botello",102030,10,8,1965);
        Afiliado afi3 = new Afiliado("Florencia","Andrada","Femenina","41028963","Belgrano",405060,25,10,1998);
        
        //Gestion de los moviles que cuenta la empresa (hacemos de cuenta que tiene 6 vehiculos a disposicion)
        Movil m1 = new Movil("2016","Mercedes-Benz","AB778UE"); //TODAS SERIAN AMBULANCIAS
        Movil m2 = new Movil("2015","Volkswagen","AB669WE");
        Movil m3 = new Movil("2016","Sterling","AB145RE");
        Movil m4 = new Movil("2014","Skoda","AB568TE");
        Movil m5 = new Movil("2013","Peugeot","AB113OE");
        Movil m6 = new Movil("2017","Toyota","AB998PE");
        
        //GESTION DE EMPLEADOS DE LA EMPRESA (DOCTOR,ENFERMEROS,CHOFERES Y ADMINISTRATIVOS)
        Doctor doc1 = new Doctor("Paola","Jacobo","Femenina","20147158","Av Ocampos",777888,1125);
        Doctor doc2 = new Doctor("Nain","Maldonado","Masculino","20123456","Maipu",123456,1138);
        
        Enfermero enf1 = new Enfermero("Fabian","Moya","Masculino","30123456","Sumalao",854698,"A");
        Enfermero enf2 = new Enfermero("Silvio","Moya","Masculino","250123456","Sumalao",212425,"B");
        
        Chofer ch1 = new Chofer(m1,"Jeronimo","Rivas","Masculino","193456","San Isidro",854588);
        Chofer ch2 = new Chofer(m2,"Eduardo","Monje","Masculino","996655","Fray Mamerto",147547);
        
        Administrativo ad1 = new Administrativo("Natalia","Florez","Femenino","38123456","San Martin",654321);
        Administrativo ad2 = new Administrativo("Mercedes","Castro","Femenino","37123456","Mate de Luna",222244);
        
        //Abono de Afiliados
        AbonoAfiliados abono1 = new AbonoAfiliados(afi1,15,9,2018,1000); abono1.fechaPagoAbono();
        System.out.println("condicion abono1: "+abono1.fechaPagoAbono());
        AbonoAfiliados abono2 = new AbonoAfiliados(afi1,2,11,2018,1000);
        AbonoAfiliados abono3 = new AbonoAfiliados(afi1,2,9,2018,1000);
        
        
        
        
        
        
    }
    
}
