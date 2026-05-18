package S2_Selenium_Waits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Ex2_ExplicitWait
{
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.get("");

        //click on submit btn
        driver.findElement(By.xpath("")).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.alertIsPresent());



    }
}
