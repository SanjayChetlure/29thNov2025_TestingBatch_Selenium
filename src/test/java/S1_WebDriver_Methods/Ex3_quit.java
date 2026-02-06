package S1_WebDriver_Methods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex3_quit
{
    public static void main(String[] args) throws InterruptedException
    {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/");

        Thread.sleep(3000);         //className.methodName(timeInMiliSec)

        driver.quit();
    }
}
