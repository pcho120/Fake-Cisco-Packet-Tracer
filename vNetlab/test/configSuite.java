/**
 *
 * @author Hyunkun Cho
 */
package config;
import org.junit.*;

@RunWith(Suite.class)
@Suite.suiteClasses({config.applicationWindowTest.class, config.configFileTest.class, config.hubsTest.class, config.TestHubEdits.class, config.VMsTest.class})

public class configSuite {
    @BeforeClass
    public void setUpClass() throws Exception{

    }
    @AfterClass
    public void tearDownClass() throws Exception{
        
    }
}
