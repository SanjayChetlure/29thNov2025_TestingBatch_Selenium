package S1_WebElementMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex5_isEnable1
{
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");

        boolean result = driver.findElement(By.xpath("//button[@name='login']")).isEnabled();
        System.out.println(result);

    }
}
