package tests;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest {

    public WebDriver driver;

    @Before

    public void setup (){

        System.setProperty("webdriver.gecko.driver", "//Users//darkostojicic//Desktop//TestProject//TestProject//lib//geckodriver");
        driver = new FirefoxDriver();
        driver.manage().window().maximize();


    }
    @After
    
    public void teardown(){
        driver.quit();
    }
    
}
