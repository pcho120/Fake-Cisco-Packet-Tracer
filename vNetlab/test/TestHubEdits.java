/**
 *
 * @author Nicholas Cubberly
 */
package config;
import org.junit.*;
import static org.junit.Assert.*;

public class TestHubEdits {

    @Test
    public void Test() {
        System.out.println("Main Method");

        String[] args = null;
        HubInfoEdit.main(args);
        fail("This is a test on the Main method");
    }

    @Test
    public void HubNetTest() {
        System.out.println("HubNet Method");

        Hub hubNet = null;
        HubInfoEdit testing = null;
        testing.SetNet(hubNet);
        fail("This is a test on the HubNet method");
    }

    @Test
    public void ChangeSettingsTest() {
        System.out.println("ChangeSettings Method");

        String newInput = "";
        HubInfoEdit testing = null;
        testing.ChangeSetting(newInput);
        fail("This is a test on the ChangeSettings method");
    }

    @Test
    public void ChangeInfoTest() {
        System.out.println("ChangeInfo Method");

        String newInput = "";
        HubInfoEdit testing = null;
        testing.ChangeInfo(newInput);
        fail("This is a test on the ChangeInfo method");
    }

    @Test
    public void ChangeSubnetTest() {
        System.out.println("ChangeSubnet Method");

        String newInput = "";
        HubInfoEdit testing = null;
        testing.ChangeSubnet(newInput);
        fail("This is a test on the ChangeSubnet method");
    }

    @Test
    public void ChangeMaskTest() {
        System.out.println("ChangeMask Method");

        String newInput = "";
        HubInfoEdit testing = null;
        testing.ChangeMask(newInput);
        fail("This is a test on the ChangeMask method");
    } 

}