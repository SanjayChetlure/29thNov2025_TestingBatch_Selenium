package S3_PageObjectModule_ScriptDesignPattern;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SwagLabLoginTest
{
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/inventory.html");

        SwagLabLoginPage login=new SwagLabLoginPage(driver);
        login.enterUN("standard_user");
        Thread.sleep(1000);
        login.enterPWD("secret_sauce");
        Thread.sleep(1000);
        login.clickOnLoginBtn();
        Thread.sleep(2000);

        SwagLabHomePage home=new SwagLabHomePage(driver);
        String actLogoText = home.getLogoText();
        String expLOgoText = "Swag Labs";

        if(actLogoText.equalsIgnoreCase(expLOgoText))
        {
            System.out.println("TC Pass");
        }
        else
        {
            System.out.println("TC Fail");
        }


    }
}
