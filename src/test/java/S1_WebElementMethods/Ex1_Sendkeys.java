package S1_WebElementMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex1_Sendkeys
{
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");

        //Apr1
//        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("abc");

        //Apr2
        WebElement un = driver.findElement(By.xpath("//input[@name='email']"));
        un.sendKeys("abc");
    }
}
