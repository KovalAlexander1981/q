package Tests;


import org.testng.Assert;
import org.testng.annotations.Test;
import Pages.HomePage;

import java.security.Key;

public class CityTest extends BaseTest {

    private HomePage objHomePage;


    @Test(description = "Test Case 1 - Set city")
    public void setNewCity() throws InterruptedException {

        objHomePage = new HomePage(driver);
        objHomePage.clickSetCity();
        objHomePage.setPageCity("Киев");
        int FirstCity = objHomePage.amountLinks();
        objHomePage.clickSetCity();
        objHomePage.setPageCity("Харьков");
        int SecondCity = objHomePage.amountLinks();
        Assert.assertEquals(FirstCity, SecondCity);
    }

}
