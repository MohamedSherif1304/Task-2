package org.example.Step_Def;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.concurrent.TimeUnit;

public class Hooks {
    public static ChromeDriver driver;

    @Before
    public void openBrowser() {
        WebDriverManager.chromedriver().setup();
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Tarek.El-Shourbagy\\Downloads\\Sauce_Demo\\Automation\\Sauce_Demo\\src\\main\\resources\\chromedriver.exe");
        ChromeOptions ops = new ChromeOptions();
        ops.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(ops);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @After
    public void quit() {
        driver.quit();
    }
}