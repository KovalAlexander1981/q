package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

public class BaseTest {

    @BeforeClass
    public void setup(){
Driver.Initialize();
    }

    // @AfterClass
     public void cleanup(){
Driver.close();
    }
}
