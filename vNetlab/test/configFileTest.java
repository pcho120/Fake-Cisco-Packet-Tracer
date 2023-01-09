/**
 *
 * @author Hyunkun Cho
 */
package config;

import java.io.*;
import org.junit.*;

public class configFileTest {
    public configFileTest(){

    }   
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Test
    public void testAccept() {
        System.out.println("accept");
        File f = null;
        configFile check = new configFile();
        boolean exp = false;
        boolean result = check.accept(f);
        assertEquals(exp, result);
        fail("this is test");
    }

    @Test
    public void testGetDescription() {
        System.out.println("getDescription");
        configFile check = new configFile();
        String exp = "";
        String result = check.getDescription();
        assertEquals(exp, result);
        fail("this is test");
    }
}
