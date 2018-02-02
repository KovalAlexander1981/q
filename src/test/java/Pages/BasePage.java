package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BasePage {

    public WebDriver driver;

    public BasePage (WebDriver driver){
        this.driver = driver;
    }


    public void enterText(By element, String text){
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(element));
        driver.findElement(element).clear();
        driver.findElement(element).sendKeys(text);
    }

    public void click(By element){
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(element));
        driver.findElement(element).click();
    }
    public void clear(By element){
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(element));
        driver.findElement(element).clear();

    }



}
