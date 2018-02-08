package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;

public class Driver {
    public static WebDriver Instance = null;
    public static String browser = "chrome";

    public static void Initialize() {
        if (Instance == null) {
            if (browser.equalsIgnoreCase("chrome")){
            Instance = new ChromeDriver();}

            else if (browser.equalsIgnoreCase("ff")) {
                Instance = new FirefoxDriver();
            }
        }

        Instance.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        Instance.manage().window().maximize();
    }
    public static void close(){
        Instance.close();
        Instance = null;
    }
    public static void quit(){
        Instance.quit();
        Instance = null;
    }
}
