package S1_WebElementMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex2_clear
{
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");

        //Apr1
//        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("abc");
//        Thread.sleep(2000);
//        driver.findElement(By.xpath("//input[@name='email']")).clear();
//        Thread.sleep(2000);
//        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("xyz");

        //Apr2
        WebElement un = driver.findElement(By.xpath("//input[@name='email']"));
        un.sendKeys("abc");
        Thread.sleep(2000);
        un.clear();
        Thread.sleep(2000);
        un.sendKeys("xyz");
    }
}
