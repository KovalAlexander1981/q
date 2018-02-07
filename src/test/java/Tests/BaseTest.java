package Tests;

import Pages.LoginPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import  org.testng.Reporter;

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
