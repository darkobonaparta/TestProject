package pages;

import org.openqa.selenium.WebDriver;

import io.opentelemetry.sdk.trace.export.BatchSpanProcessorBuilder;

public class LoginPage extends BasePage {

    public LoginPage (WebDriver driver){
        super(driver);
        
    }

    String baseURL = "http://www.saucedemo.com";

    public static LoginPage BasePage(){

        driver.get(baseURl);
        return this;

    }
    
}
