package S1_Locator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex1_XpathByAttribute
{
    public static void main(String[] args)
    {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");

        //Enter UN
//       driver.findElement("Locator Type")
//       driver.findElement(By.xpath("Xpath Expression"))
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abc");

        //Enter pwd
        driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("xyz");

        //click on login btn
        driver.findElement(By.xpath("//button[@name='login']")).click();

    }
}
