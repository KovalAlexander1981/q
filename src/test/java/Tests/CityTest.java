package Tests;


import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import Pages.HomePage;
import static Tests.Driver.Instance;

public class CityTest extends BaseTest {

    private HomePage objHomePage;


    @Test(description = "Test Case 1 - Set city")
    public void setNewCity() throws InterruptedException {
        Driver.Instance.navigate().to("https://yandex.ua");
        objHomePage = new HomePage(Instance);
        objHomePage.clickSetCity();
        objHomePage.setPageCity("Харьков Украина ");
        int FirstCity = objHomePage.amountLinks();
        objHomePage.clickSetCity();
        objHomePage.setPageCity("Киев Украина");
        int SecondCity = objHomePage.amountLinks();
        Assert.assertEquals(FirstCity, SecondCity);
    }

}
