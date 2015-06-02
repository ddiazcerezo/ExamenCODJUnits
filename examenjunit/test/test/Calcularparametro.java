/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import examenjunit.Calcular;
import java.util.Arrays;
import java.util.Collection;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runners.Parameterized;

/**
 *
 * @author Lenovo
 */
public class Calcularparametro {
    
    public Calcularparametro() {
    }
    
     private int num1;
    private int num2;
    private Calcular instance;
    private int expResult;

    @Before
    public void initialize() {
        instance = new Calcular();
    }

    public Calcularparametro(int num1, int num2, int mcd) {
        this.num1 = num1;
        this.num2 = num2;
        this.expResult = mcd;
    }

    @Parameterized.Parameters
    public static Collection calculando() {
        return Arrays.asList(new Object[][]{
            {10, 4, 2},
            {2, 2, 2},
            {12, 4, 4},
            {12, 3, 3}
        });
    }

    /**
     * Test of obtenerMCD method, of class Calculo.
     */
    @Test
    public void testObtenerMCD() {
        System.out.println("obtenerMCD" + " primer operando "+num1 + " segundo operando "+num2 + " resultado "+expResult);
        int result = instance.obtenerMCD(num1, num2);
        assertEquals(expResult, result,0);
    }
}
