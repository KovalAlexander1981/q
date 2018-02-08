package Tests;

import Pages.HomePage;
import Pages.LoginPage;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import  org.testng.Reporter;
import org.testng.annotations.Test;

import static Tests.Driver.Instance;

public class yandexTest extends BaseTest {

    private LoginPage objLoginPage;
    private HomePage objHomePage;

    @Test
    public void logIn() {
        System.out.println("Test 1");
        Driver.Instance.navigate().to("https://yandex.ua");
        System.out.println("Open Yandex page");
        objLoginPage = new LoginPage(Instance);
        System.out.println("Enter Login,Password and Log in  ");
        objLoginPage.enterPasswordLogin("AutotestUser", "AutotestUser123");
        String userName = Driver.Instance.findElement(By.xpath(".//div[@class='mail-User-Name']")).getText();
        Assert.assertEquals("AutotestUser", userName);
        System.out.println("The user name is the same with user logo");
        objLoginPage.logOut();

    }

    @Test (description = "Test Case 2 - Log out")
    public void logOut() {
        System.out.println("Test 2");
        Driver.Instance.navigate().to("https://yandex.ua");
        System.out.println("Open Yandex page");
        objLoginPage = new LoginPage(Instance);
        System.out.println("Enter Login,Password and Log in  ");
        objLoginPage.enterPasswordLogin("AutotestUser", "AutotestUser123");
        objLoginPage.logOut();
        WebElement logField = Driver.Instance.findElement(By.xpath(".//*[@name='login']"));
        Boolean checkLogField = logField.isDisplayed();
        if (checkLogField == true) {
            System.out.println("The user made Log out");
        } else System.out.println("The user didn't make Log out");
    }

    @Test// "Test Case 3 - Wrong password")
    public void wrongPassword() {
        System.out.println("Test 3");
        Driver.Instance.navigate().to("https://yandex.ua");
        System.out.println("Open Yandex page");
        objLoginPage = new LoginPage(Instance);
        System.out.println("Enter Login, wrong Password and try Log in  ");
        objLoginPage.enterPasswordLogin("AutotestUser", "NoAutotestUser123");
        boolean logField = Driver.Instance.getPageSource().contains("Неверный пароль");
        if (logField == true) {
            System.out.println("The user enter wrong password");
        } else System.out.println("Something wrong");
    }

    @Test// "Test Case 4 - Wrong login")
    public void wrongLogin() {
        System.out.println("Test 4");
        Driver.Instance.navigate().to("https://yandex.ua");
        System.out.println("Open Yandex page");
        objLoginPage = new LoginPage(Instance);
        System.out.println("Enter Login, wrong Password and try Log in ");
        objLoginPage.enterPasswordLogin("NoAutotestUser", "AutotestUser123");
        boolean passField = Driver.Instance.getPageSource().contains("Такого аккаунта нет");
        if (passField == true) {
            System.out.println("The user enter wrong login");
        } else System.out.println("Something wrong");
        Reporter.log("RRRRR");
    }

    @Test//"Test Case 5 - Check some links at the user panel")
    public void checkLinks() {
        System.out.println("Test 5");
        Driver.Instance.navigate().to("https://yandex.ua");
        System.out.println("Open Yandex page");
        objHomePage = new HomePage(Instance);
        objHomePage.menuLinks();
    }

   /* @Test// "Test Case 6 - Language change")
   public void langChange() {
        System.out.println("Test 6");
        Driver.Instance.navigate().to("https://yandex.ua");
        System.out.println("Open Yandex page");
        objHomePage = new HomePage(Instance);
        objHomePage.langSwip("English"); */



    }

