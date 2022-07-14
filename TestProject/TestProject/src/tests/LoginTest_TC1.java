package tests;

import pages.BasePage;
import pages.LoginPage;

public class LoginTest_TC1 extends BaseTest{

    public LoginPage loginPage;

    @Test
    public void loginTC1(){
        LoginPage loginPage = new LoginPage(driver);
        LoginPage.BasePage();

        try{
            
            Thread.sleep(millis: 5000);

        }catch(InterruptedException e){
            e.printStackTrace();

        }

    }
    
}
