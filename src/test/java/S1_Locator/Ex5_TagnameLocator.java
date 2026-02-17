package S1_Locator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex5_TagnameLocator
{
    public static void main(String[] args)
    {
        WebDriver driver=new ChromeDriver();
        driver.get("file:///D:/29th%20Nov%202025/Selenium/Html%20files/tagname.html");

        //Enter FN
        driver.findElement(By.tagName("input")).sendKeys("abc");

        //Enter LN
        driver.findElement(By.tagName("input")).sendKeys("xyz");


    }
}
