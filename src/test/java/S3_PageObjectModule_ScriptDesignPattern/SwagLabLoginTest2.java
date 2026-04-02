package S3_PageObjectModule_ScriptDesignPattern;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SwagLabLoginTest2
{
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/inventory.html");

        SwagLabLoginPage login=new SwagLabLoginPage(driver);     //basic or early initialization
        login.enterUN("standard_user");                // late/lazy/complete initialization
        Thread.sleep(1000);
        login.enterPWD("cnkfnjfnkjfnwe");
        Thread.sleep(1000);
        login.clickOnLoginBtn();
        Thread.sleep(2000);
        String actErrorMsg = login.getErrorMsg();
        String expErrorMsg="Username and password do not match";
        if (actErrorMsg.contains(expErrorMsg))
        {
            System.out.println("TC Pass");
        }
        else
        {
            System.out.println("TC Fail");
        }


    }
}
