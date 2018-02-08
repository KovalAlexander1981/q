package Tests;

import Pages.LoginPage;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest  {
    private LoginPage objLoginPage;

    @BeforeClass
    public void setup(){
Driver.Initialize();
    }


    @AfterClass
    public void cleanup(){
        Driver.close();
    }
}
