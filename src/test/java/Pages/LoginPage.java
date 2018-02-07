package Pages;

import Tests.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    private By password = By.xpath(".//*[@name='passwd']");
    private By login = By.xpath(".//*[@name='login']");
    private By submitButton = By.xpath("//*[@class='button auth__button domik3__auth-button button_theme_bordergray button_size_m i-bem button_js_inited auth__button_color_yellow']");
    private By logOutButton = By.xpath(".//*[@data-metric='Выход']");
    private By userAccount = By.xpath(".//div[@class='mail-User-Name']");

    public LoginPage(WebDriver Instance) {
        super(Driver.Instance);
    }

    //Login user
    public void enterPasswordLogin(String strLogin, String strPassword) {
        enterText(login, strLogin);
        enterText(password, strPassword);
        click(submitButton);
    }

    //log out user
    public void logOut() {
        click(userAccount);
        click(logOutButton);
    }


}
