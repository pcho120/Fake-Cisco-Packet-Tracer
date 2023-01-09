/**
 *
 * @author Hyunkun Cho
 */
package config;

import org.junit.*;

public class hubsTest {
    public hubsTest(){

    }

    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    @Test
    public void testGetName(){
        System.out.println("getName");
        Hubs check = null;
        String exp = "";
        String result = check.getName();
        assertEquals(exp, result);
        fail("this is test");
    }

    @Test
    public void testSetName(){
        System.out.println("setName");
        String n = "";
        Hubs check = null;
        check.setName(n);
        fail("this is test");
    }

    @Test 
    public void testGetInfo(){
        System.out.println("getInfo");
        Hubs check = null;
        String exp = "";
        String result = check.getInfo();
        assertEquals(exp, result);
        fail("this is test");
    }

    @Test 
    public void testSetInfo(){
        System.out.println("setInfo");
        String s = "";
        Hubs check = null;
        check.setInfo(s);
        fail("this is test");
    }

    @Test
    public void testCreateInfo(){
        System.out.println("createInfo");
        Hubs check = null;
        check.createInfo();
        fail("this is test");
    }

    @Test 
    public void testMoreInfo(){
        System.out.println("moreInfo");
        String s = "";
        Hubs check = null;
        check.moreInfo(s);
        fail("this is test");
    }

    @Test 
    public void testDeleteInfo(){
        System.out.println("deleteInfo");
        String s = "";
        Hubs check = null;
        check.deleteInfo(s);
        fail("this is test");
    }
    
    @Test 
    public void testDeleteVM(){
        System.out.println("deleteVM");
        String s = "";
        Hubs check = null;
        check.deleteVM(n);
        fail("this is test");
    }

    @Test
    public void testGetSubnet() {
        System.out.println("getSubnet");
        Hubs check = null;
        String exp = "";
        String result = check.getSubnet();
        assertEquals(exp, result);
        fail("this is test");
    }

    @Test
    public void testSetSubnet() {
        System.out.println("setSubnet");
        String s = "";
        Hubs check = null;
        check.setSubnet(s);
        fail("this is test");
    }

    @Test
    public void testGetNetmask() {
        System.out.println("getNetmask");
        Hubs check = null;
        String exp = "";
        String result = check.getNetmask();
        assertEquals(exp, result);
        fail("this is test");
    }

    @Test 
    public void testSetNetmask() {
        System.out.println("setNetmask");
        String n = "";
        Hubs check = null;
        check.setNetmask(n);
        fail("this is test");
    }

    @Test 
    public void testGetName2() {
        System.out.println("getName2");
        Hubs check = null;
        String exp = "";
        String result = check.getName2();
        assertEquals(exp, result);
        fail("this is test");
    }
}
