package Tests;

import org.junit.Before;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {

    @BeforeClass
    public void setup(){
Driver.Initialize();
    }

     @AfterClass
     public void cleanup(){
Driver.close();
    }
}
