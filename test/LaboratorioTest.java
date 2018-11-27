/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Exceptions.AfiliadoNoEncontradoException;
import Exceptions.FamiliarNoEncontradoException;
import laboratorio2018.Afiliado;
import laboratorio2018.Doctor;
import laboratorio2018.Empleado;
import laboratorio2018.Familiar;
import laboratorio2018.Sistema;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Rodrigo
 */
public class LaboratorioTest {
    
    public LaboratorioTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

     @Test
     public void caculaEdad() {
         Afiliado afiliado = new Afiliado("Florencia","Andrada","Femenina","41028963","Belgrano","405060",25,10,1998);
         assertEquals(afiliado.calcularEdad(),20);
     }
     
     @Test
     public void verAfiliado(){
         Afiliado afi = new Afiliado("Florencia","Andrada","Femenina","41028963","Belgrano","405060",25,10,1998);
         assertEquals(afi.toString(), "Afiliado: Florencia Andrada\nSexo: Femenina\nDNI N° :41028963\nDireccion: Belgrano\nFecha de Nacimiento: 25/10/1998\nEdad: "+20);
     }
     
     @Test 
    public void verEmpleado(){
         Doctor doc = new Doctor("Paola","Jacobo","Femenina","20147158","Av Ocampos","777888",1,2,1980,"Doctor","1125","Libre");
         assertEquals(doc.toString(),"Doctor: Paola Jacobo\nSexo: Femenina\nDNI N° :20147158\nDireccion: Av Ocampos\nN° Legajo: 1125\nEstado: Libre");
         
     }
    
    @Test
    public void agregarEmpleado(){
        Sistema sis = new Sistema();
        sis.setEmpleados(new Empleado("Paola","Jacobo","Femenina","20147158","Av Ocampos","777888",1,2,1980,"Doctor","1125","Libre"));
        sis.setEmpleados(new Empleado("Nain","Maldonado","Masculino","20123456","Maipu","123456",2,3,1977,"Doctor","1138","Libre"));
        assertEquals(sis.getEmpleados().size(),2);
    }
    
    @Test
    public void agregarAfiliado(){
        Sistema sis = new Sistema();
        sis.setAfiliados(new Afiliado("Maximiliano","Avellaneda","Masculino","41015072","Sumalao","298222",8,5,1998));
        sis.setAfiliados(new Afiliado("Rodrigo","Cordoba","Masculino","20888999","Pozo el Mistol","102030",10,8,1997));
        assertEquals(sis.getAfiliados().size(),2);
    }
    
    @Test
    public void eliminarEmpleado(){
        Sistema sis = new Sistema();
        sis.setEmpleados(new Empleado("Paola","Jacobo","Femenina","20147158","Av Ocampos","777888",1,2,1980,"Doctor","1125","Libre"));
        sis.setEmpleados(new Empleado("Nain","Maldonado","Masculino","20123456","Maipu","123456",2,3,1977,"Doctor","1138","Libre"));
        sis.getEmpleados().remove(1);
        assertEquals(sis.getEmpleados().size(),1);
    }
    
    @Test
    public void eliminarAfiliado(){
        Sistema sis = new Sistema();
        sis.setAfiliados(new Afiliado("Maximiliano","Avellaneda","Masculino","41015072","Sumalao","298222",8,5,1998));
        sis.setAfiliados(new Afiliado("Rodrigo","Cordoba","Masculino","20888999","Pozo el Mistol","102030",10,8,1997));
        sis.getAfiliados().remove(1);
        assertEquals(sis.getAfiliados().size(),1);
    }
    
    @Test (expected=AfiliadoNoEncontradoException.class)
    public void buscarAfiNoExistente() throws AfiliadoNoEncontradoException{
        Sistema sis=new Sistema();
        sis.setAfiliados(new Afiliado("Maximiliano","Avellaneda","Masculino","41015072","Sumalao","298222",8,5,1998));
        sis.buscarAfiliado("40724574");
    }
    
    @Test  (expected=FamiliarNoEncontradoException.class)
    public void buscarFamiNoExist() throws FamiliarNoEncontradoException{
        Sistema sis = new Sistema();
        sis.setFamiliares(new Familiar("Enzo","Avellaneda","Masculino","31231755","Sumalao","382556",14,8,1981,"Hermano","41015072"));
        sis.buscarFamiliar("12345678");
    }
    }