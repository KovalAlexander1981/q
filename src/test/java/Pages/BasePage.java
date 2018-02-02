package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BasePage {

    public WebDriver Instance;

    public BasePage (WebDriver driver){
        this.Instance = driver;
    }


    public void enterText(By element, String text){
        new WebDriverWait(Instance, 100).until(ExpectedConditions.elementToBeClickable(element));
        Instance.findElement(element).clear();
        Instance.findElement(element).sendKeys(text);
        Instance.findElement(element).click();
    }

    public void click(By element){
        new WebDriverWait(Instance, 100).until(ExpectedConditions.elementToBeClickable(element));
        Instance.findElement(element).click();
    }
    public void clear(By element){
        new WebDriverWait(Instance, 100).until(ExpectedConditions.elementToBeClickable(element));
        Instance.findElement(element).clear();

    }



}
