package S3_PageObjectModule_ScriptDesignPattern;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Ex1_Example_WithoutPOM
{
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/inventory.html");

        //enter UN
        driver.findElement(By.xpath("//input[@name='user-name']")).sendKeys("standard_user");
        Thread.sleep(1000);

        //enter pwd
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("secret_sauce");
        Thread.sleep(1000);

        //click on login btn
        driver.findElement(By.xpath("//input[@name='login-button']")).click();
        Thread.sleep(1000);

        //get logo text
        String actLogoText = driver.findElement(By.xpath("//div[@class='app_logo']")).getText();
        String expLogoText = "Swag Labs";

        if (actLogoText.equalsIgnoreCase(expLogoText))
        {
            System.out.println("TC Pass");
        }
        else
        {
            System.out.println("TC Fail");
        }

        Thread.sleep(5000);
        driver.quit();
    }
}
