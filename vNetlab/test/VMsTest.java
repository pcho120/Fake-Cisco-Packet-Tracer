/**
 *
 * @author Hyunkun Cho
 */
package config;

import org.junit.*;

public class VMsTest {
    public VMsTest(){

    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    @Test 
    public void testConnectionAdd(){
        System.out.println("connectionAdd");
        String h = "";
        String c = "";
        VMs check = null;
        String exp = "";
        String result = check.connectionAdd(h, c);
        assertEquals(exp, result);
        fail("this is test");
    }

    @Test 
    public testConnectionRemove(){
        System.out.println("connectionRemove");
        String h = "";
        VMs check = null;
        String exp = "";
        String result = check.connectionRemove(h);
        assertEquals(exp, result);
        fail("this is test");
    }

    @Test 
    public testCheckToRemoveHub(){
        System.out.println("checkToRemoveHub");
        String h = "";
        VMs check = null;
        check.checkToRemoveHub(h);
        fail("this is test");
    }

    @Test
    public void testGetName(){
        System.out.println("getName");
        VMs check = null;
        String exp = "";
        String result = check.getName();
        assertEquals(exp, result);
        fail("this is test");
    }

    @Test 
    public void testSetName(){
        System.out.println("setName");
        String n = "";
        VMs check = null;
        check.setName(n);
        fail("this is test");
    }

    @Test
    public void testGetOs() {
        System.out.println("getOs");
        VMs check = null;
        String exp = "";
        String result = check.getOs();
        assertEquals(exp, result);
        fail("this is test");
    }

    @Test
    public void testSetOs() {
        System.out.println("setOs");
        String o = "";
        VMs check = null;
        check.setOs(o);
        fail("this is test");
    }

    @Test
    public void testGetVr() {
        System.out.println("getVr");
        VMs check = null;
        String exp = "";
        String result = check.getVr();
        assertEquals(exp, result);
        fail("this is test");
    }

    @Test
    public void testSetVr() {
        System.out.println("setVr");
        String v = "";
        VMs check = null;
        check.setVer(v);
        fail("this is test");
    }

    @Test
    public void testGetSrc() {
        System.out.println("getSrc");
        VMs check = null;
        String exp = "";
        String result = check.getSrc();
        assertEquals(exp, result);
        fail("this is test");
    }

    @Test
    public void testSetSrc() {
        System.out.println("setSrc");
        String s = "";
        VMs check = null;
        check.setSrc(s);
        fail("this is test");
    }

    @Test
    public void testGetEth0() {
        System.out.println("getEth0");
        VMs check = null;
        String exp = "";
        String result = check.getEth0();
        assertEquals(exp, result);
        fail("this is test");
    }

    @Test
    public void testSetEth0() {
        System.out.println("setEth0");
        String e = "";
        VMs check = null;
        check.setEth0(e);
        fail("this is test");
    }

    @Test
    public void testGetEth1() {
        System.out.println("getEth1");
        VMs check = null;
        String exp = "";
        String result = check.getEth1();
        assertEquals(exp, result);
        fail("this is test");
    }

    @Test
    public void testSetEth1() {
        System.out.println("setEth1");
        String e = "";
        VMs check = null;
        check.setEth1(e);
        fail("this is test");
    }

    @Test
    public void testGetEth2() {
        System.out.println("getEth2");
        VMs check = null;
        String exp = "";
        String result = check.getEth2();
        assertEquals(exp, result);
        fail("this is test");
    }

    @Test
    public void testSetEth2() {
        System.out.println("setEth2");
        String e = "";
        VMs check = null;
        check.setEth2(e);
        fail("this is test");
    }
}
