/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Exceptions.AfiliadoNoEncontradoException;
import laboratorio2018.Afiliado;
import laboratorio2018.Doctor;
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
     public void verEdad() {
         Afiliado afiliado = new Afiliado("Florencia","Andrada","Femenina","41028963","Belgrano","405060",25,10,1998);
         assertEquals(afiliado.calcularEdad(),20);
     }
     
     @Test
     public void agregarAfiliado(){
         Afiliado afi = new Afiliado("Florencia","Andrada","Femenina","41028963","Belgrano","405060",25,10,1998);
         assertEquals(afi.toString(), "Afiliado: Florencia Andrada\nSexo: Femenina\nDNI N° :"+41028963+"\nDireccion: Belgrano\nFecha de Nacimiento: 25/10/1998\nEdad: "+20+"\nCantidad de asistencias solicitadas:"+0);
     }
     
     @Test 
    public void agregarEmpleado(){
         Doctor doc = new Doctor("Paola","Jacobo","Femenina","20147158","Av Ocampos","777888",1,2,1980,"Doctor","1125");
         assertEquals(doc.toString(),"Doctor: Paola Jacobo\nSexo: Femenina\nDNI N° :20147158\nDireccion: Av Ocampos\nN° Legajo: 1125");
         
     }
    
    }
