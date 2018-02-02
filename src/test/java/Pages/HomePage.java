package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

import static org.testng.Assert.assertEquals;

public class HomePage extends BasePage {

    private By cityName = By.xpath("//input[@name='name']");
    private By cityForm = By.xpath("//span[@class='geolink__reg']");
    private By submitButton = By.xpath("//button[@type='submit']");
    private By setCity = By.xpath("//li[1]");
    private By more = By.xpath("//div[5]/div[2]");
    private By links = By.xpath("//div[2]/div/div[1]/div/a[7]");


    public HomePage(WebDriver driver) {
        super(driver);
    }

    //go to city set page
    public void clickSetCity() {
        click(cityForm);
    }

    //go to set city page
    public void setPageCity(String strCity) throws InterruptedException {
        enterText(cityName, strCity);
        click(setCity);
        if (driver.findElement(By.xpath("//button[@type='submit']")).getAttribute("disabled") != "disabled") {
            enterText(cityName, strCity);
            click(setCity);
            System.out.println();

        }
        click(submitButton);
    }

    //click to link Еще
    public void clickMore() {
        click(more);
    }

    //Количество элеметов в поп-апе и название
    public int amountLinks() {
        click(links);
        List<WebElement> linksToClick = driver.findElements(By.className("home-tabs__more-item"));
        System.out.println("Элементов " + linksToClick.size());
        for (WebElement element : linksToClick) {
            System.out.println(element.getText()); }
        return linksToClick.size();
    }

}


