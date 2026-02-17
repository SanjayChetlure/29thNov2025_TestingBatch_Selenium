package S1_Locator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex8_ClassNameLocator
{
    public static void main(String[] args)
    {
        WebDriver driver=new ChromeDriver();
        driver.get("file:///D:/29th%20Nov%202025/Selenium/Html%20files/className.html");

        //Enter FN
        driver.findElement(By.className("8888")).sendKeys("abc");

        //Enter LN
        driver.findElement(By.className("8888")).sendKeys("xyz");

    }
}
