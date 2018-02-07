package Pages;

import Tests.Driver;
import org.junit.rules.ExpectedException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class HomePage extends BasePage {

    private By langMenu = By.xpath(".//div[@class='col headline__bar-item b-langs']//span[@class='link__inner']");
    private By more = By.xpath(".//li[@class='b-menu__item b-menu__layout-vert-cell_position_last b-menu__item_pos_last']");
    private By lungButton = By.xpath("//*[@class='button select__button button_theme_normal button_arrow_down button_size_m i-bem button_js_inited']");
    private By chooseLung = By.xpath("//*[@class='select__option'] [@value='en']");


    public HomePage(WebDriver Instance) {
        super(Driver.Instance);
    }

    //All menu links
    public void menuLinks() {
        List<WebElement> linksToClick = Instance.findElements(By.xpath(".//*[@class='home-arrow__tabs']//a"));
        String a[] = new String[linksToClick.size()];
        for (int i = 0; i < linksToClick.size(); i++) {
            a[i] = linksToClick.get(i).getAttribute("href");
        }
        for (int i = 0; i < a.length - 1; i++) {
            Driver.Instance.navigate().to(a[i]);
            boolean urlLink = Driver.Instance.getCurrentUrl().contains(a[i]);
            if (urlLink == true) {
                System.out.println("The link and the page the same");
            } else System.out.println("The link and the page different");
            Driver.Instance.navigate().back();
        }
    }

    public void langSwip(String lang) {
        click(langMenu);
        click(more);
        click(lungButton);
        WebDriverWait wait = new WebDriverWait(Driver.Instance, 500);
        wait.until(ExpectedConditions.elementToBeClickable(chooseLung));
        Driver.Instance.findElement(chooseLung).click();
    }

}
