package S1_Locator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex4_XpathByIndex
{

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/r.php?entry_point=login");
        Thread.sleep(3000);

        //enter FN
        driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("abc");


        //enter surname
        driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("xyz");
    }
}
