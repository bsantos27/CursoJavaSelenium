package Runners;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RunnerBase {

    static WebDriver driver;

    public enum Browser {CHROME, FIREFOX}

    public static WebDriver getDriver(){
        if(driver == null){
            getDriver(Browser.CHROME);
        }
        return driver;
    }

    public static WebDriver getDriver(Browser browser){
        switch (browser){
            case CHROME:
                ChromeOptions options = new ChromeOptions();
//                options.addArguments("-- headless");
                driver = new ChromeDriver(options);
                break;
            case FIREFOX:
                driver = new FirefoxDriver();
                break;
            default:
                throw new IllegalArgumentException("passe um navegador valido");
        }
        return driver;
    }
}
