package Pages;

import Tests.Driver;
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
    private By links = By.cssSelector(".home-arrow__tabs a:last-child");


    public HomePage(WebDriver Instance) {
        super(Driver.Instance);
    }


    //go to city set page
    public void clickSetCity() {
        click(cityForm);
    }

    //go to set city page
    public void setPageCity(String strCity) throws InterruptedException {
        enterText(cityName, strCity);
        click(setCity);

        //  if (Driver.Instance.findElement(By.xpath("//button[@type='submit']")).getText() != strCity) {
        //    enterText(cityName, strCity);
        //      click(setCity);
         //    System.out.println();
         //   }
            click(submitButton);
        }

        //click to link Еще
        public void clickMore () {
            click(more);
        }

        //Количество элеметов в поп-апе и название
        public int amountLinks () {
            click(links);
            List<WebElement> linksToClick = Instance.findElements(By.className("home-tabs__more-item"));
            System.out.println("Элементов " + linksToClick.size());
            for (WebElement element : linksToClick) {
                System.out.println(element.getText());
            }
            return linksToClick.size();
        }

    }


