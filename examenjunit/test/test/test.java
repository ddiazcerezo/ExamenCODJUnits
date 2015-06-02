/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import examenjunit.Calcular;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Lenovo
 */
public class test {
    
    public test() {
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
     public void pruebaMCD() {
         System.out.print("Prueba");
   
         int num1 = 12;
         int num2 =18;
         Calcular calculo = new Calcular();
         int expResult = 6;
         int result = calculo.obtenerMCD(num1,num2);
         assertEquals(expResult,result);
         
     
       
        }
     
     }

