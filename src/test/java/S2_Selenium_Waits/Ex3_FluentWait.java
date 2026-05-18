package S2_Selenium_Waits;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;

public class Ex3_FluentWait
{

    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.get("");

        //click on submit btn
        driver.findElement(By.xpath("")).click();


        FluentWait wait = new FluentWait(driver);

        wait.withTimeout(Duration.ofSeconds(5));           //Specify the timout of the wait
        wait.pollingEvery(Duration.ofSeconds(1/2));     //Specify polling time
        wait.ignoring(NoSuchElementException.class);   //Specify what exceptions to ignore
        wait.until(ExpectedConditions.alertIsPresent());         //This is how we specify the condition to wait on.



    }

}
