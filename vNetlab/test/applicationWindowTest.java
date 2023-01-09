/**
 *
 * @author Hyunkun Cho
 */
package config;
import java.util.HashMap;
import org.junit.*;

public class applicationWindowTest {
    public applicationWindowTest(){
        
    }
    @Test
    public void testCreateItem(){
        System.out.println("createItem");
        String type = "";
        String name = "";
        applicationWindow check = new applicatoinWindow();
        check.createItem(type, name);
        fail("this is test");
    }

    @Test 
    public void testSetVM() {
        System.out.println("setVM");
        VMs vm = null;
        applicationWindow check = new applciationWindow();
        check.setVM(vm);
        fail("this is test");
    }

    @Test
    public void testsetHub() {
        System.out.println("setHub");
        Hubs hub = null;
        applicationWindow check = new applicationWindow();
        check.setHub(hub);
        fail("this is test");
    }

    @Test
    public void testDelete(){
        System.out.println("delete");
        String name = "";
        applicationWindow check = new applicationWindow();
        boolean exp = false;
        boolean result = check.delete(name);
        assertEquals(exp, result);
        fail("this is test");
    }

    @Test
    public void testMain(){
        System.out.println("main");
        String[] a = null;
        applicationWindow.main(a);
        fail("this is test");
    }
}
