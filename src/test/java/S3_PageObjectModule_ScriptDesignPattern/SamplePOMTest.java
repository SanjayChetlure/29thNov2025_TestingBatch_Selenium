package S3_PageObjectModule_ScriptDesignPattern;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SamplePOMTest
{
    public static void main(String[] args) {

        WebDriver driver=new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/inventory.html");

        SwagLabLoginPage1 login=new SwagLabLoginPage1(driver);      //
        login.enterUN("standard_user");
        login.enterPWD("secret_sauce");
        login.clickOnLoginBtn();
        login.getErrorMsg();




    }
}
