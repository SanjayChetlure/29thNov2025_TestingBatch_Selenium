package S1_WebElementMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex5_isEnable2
{
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();
        driver.get("https://www.instagram.com/");
        Thread.sleep(3000);

        boolean result = driver.findElement(By.xpath("//span[text()='Log in']")).isEnabled();
        System.out.println(result);
    }
}