package S1_Locator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex9_LinkTextLocator
{
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("file:///D:/29th%20Nov%202025/Selenium/Html%20files/linkText_PartialLinkText.html");

        Thread.sleep(2000);

        //click on facebook link
        driver.findElement(By.linkText("facebook")).click();

    }
}
