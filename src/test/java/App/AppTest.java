/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author marclo
 */
public class AppTest {
    
    public AppTest() {
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

    /**
     * Test of llenarSuma method, of class App.
     */
    @Test
    public void testSumar() {
        
        int matriz1[][] ={{0,1,2,3 },
                         {1,2,3,0 },
                         {2,3,0,1},
                         {3,0,1,2} };
        
      int[][] matriz2 = new int[4][4];
      
        App.llenarSuma();
        
        assertEquals(matriz1 , App.llenarSuma() );
        
    }
    
    @Test
    public void testMult() {
        
        int matriz1[][] ={{0,0,0,0 },
                         {0,1,2,3 },
                         {0,2,0,2},
                         {0,3,2,1} };
        
      int[][] matriz2 = new int[4][4];
      
        App.llenarSuma();
        
        assertEquals(matriz1 , App.llenarSuma() );
        
    }
}