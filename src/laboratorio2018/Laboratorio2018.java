
package laboratorio2018;

import Interfaz.MenuPrincipal;

public class Laboratorio2018 {

    public static void main(String[] args) {
        
        //GESTION DE DATOS DE AFILIADOS y SUS FAMILIARES
        Afiliado afi1 = new Afiliado("Maximiliano","Avellaneda","Masculino","41015072","Sumalao","298222",8,5,1998);
        Afiliado afi2 = new Afiliado("Marcos","Herrra","Masculino","20888999","Mota Botello","102030",10,8,1965);
        Afiliado afi3 = new Afiliado("Florencia","Andrada","Femenina","41028963","Belgrano","405060",25,10,1998);
        
        Familiar f1 = new Familiar("Enzo","Avellaneda","Masculino","31231755","Sumalao","382556",14,8,1981,"Hermano","41015072");
        Familiar f2 = new Familiar("Maria","Rodriguez","Femenino","10123456","Sumalao","123456",2,10,1993,"Prima","12345678");
        
        //Gestion de los moviles que cuenta la empresa (hacemos de cuenta que tiene 3 vehiculos a disposicion)
        Movil m1 = new Movil("2016","Mercedes-Benz","AB778UE","Ambulancia 1"); //TODAS SERIAN AMBULANCIAS
        Movil m2 = new Movil("2015","Volkswagen","AB669WE","Ambulancia 2");
        Movil m3 = new Movil("2016","Sterling","AB145RE","Ambulancia 3");
       //Movil m4 = new Movil("2014","Skoda","AB568TE","Ambulancia 4");
       //Movil m5 = new Movil("2013","Peugeot","AB113OE","Ambulancia 5");
       //Movil m6 = new Movil("2017","Toyota","AB998PE","Ambulancia 6");
        
        //GESTION DE EMPLEADOS DE LA EMPRESA (DOCTOR,ENFERMEROS,CHOFERES Y ADMINISTRATIVOS)
        Doctor doc1 = new Doctor(1125,"Doctor",1,25,"Paola","Jacobo","Femenina","20147158","Av Ocampos","777888");
        Doctor doc2 = new Doctor(1138,"Doctor",2,28,"Nain","Maldonado","Masculino","20123456","Maipu","123456");
        Doctor doc3 = new Doctor(1100,"Doctor",3,30,"Roberto","Maza","Masculino","31213546","Chacabuco","651475");
        
        Enfermero enf1 = new Enfermero("Enfermero",4,24,"Fabian","Moya","Masculino","30123456","Santa Rosa","854698");
        Enfermero enf2 = new Enfermero("Enfermero",5,25,"Silvio","Moya","Masculino","250123456","Sumalao","212425");
        Enfermero enf3 = new Enfermero("Enfermero",6,24,"Adriana","Romero","Femenino","14111774","Sumalao","121314");
        
        Chofer ch1 = new Chofer(m1,"Chofer",7,30,"Jeronimo","Rivas","Masculino","193456","San Isidro","854588");
        Chofer ch2 = new Chofer(m2,"Chofer",8,32,"Eduardo","Monje","Masculino","13222333","Fray Mamerto","147547");
        Chofer ch3 = new Chofer(m2,"Chofer",9,26,"Armando","Avellaneda","Masculino","9123456","Sumalao","969669");
        
        Administrativo ad1 = new Administrativo("Administrativo",10,30,"Natalia","Florez","Femenino","38123456","San Martin","654321");
        Administrativo ad2 = new Administrativo("Administrativo",11,28,"Mercedes","Castro","Femenino","37123456","Mate de Luna","222244");
        Administrativo ad3 = new Administrativo("Administrativo",12,28,"Elizabeth","Perna","Femenino","34555888","Rivadavia","363532");
        
        //Abono de Afiliados
        AbonoAfiliados abono1 = new AbonoAfiliados(afi1,2,9,2018,1000); abono1.fechaPagoAbono();
        AbonoAfiliados abono2 = new AbonoAfiliados(afi2,2,11,2018,1000);abono2.fechaPagoAbono();
        AbonoAfiliados abono3 = new AbonoAfiliados(afi3,10,10,2018,1000);abono3.fechaPagoAbono();
        
        Sistema sistema = new Sistema();
        
        sistema.setAfiliados(afi1);
        sistema.setAfiliados(afi2);
        sistema.setAfiliados(afi3);
        
        sistema.setDoctores(doc1);
        sistema.setDoctores(doc2);
        sistema.setDoctores(doc3);
        
        sistema.setEnfermeros(enf1);
        sistema.setEnfermeros(enf2);
        sistema.setEnfermeros(enf3);
        
        sistema.setChoferes(ch1);
        sistema.setChoferes(ch2);
        sistema.setChoferes(ch3);
        
        sistema.setMovil(m1);
        sistema.setMovil(m2);
        sistema.setMovil(m3);
        
        sistema.setAdminis(ad1);
        sistema.setAdminis(ad2);
        sistema.setAdminis(ad3);
        
        Afiliado afiliado = new Afiliado();
        
        //afiliado.setFamiliares(f1);
        afiliado.setFamiliares(f2);
        
        MenuPrincipal menu1 = new MenuPrincipal(sistema,afiliado);
        menu1.setVisible(true);
        
         
    }
    
}
