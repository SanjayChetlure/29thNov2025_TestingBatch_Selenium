package S2_CaptureScreenshot;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;

public class Ex2_CaptureScreenshotOfSpecificElement
{
    public static void main(String[] args) throws InterruptedException, IOException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.flipkart.com/");
        Thread.sleep(3000);

        driver.findElement(By.xpath("//span[@class='b3wTlE']")).click();

        Thread.sleep(3000);

        WebElement logo = driver.findElement(By.xpath("(//div[@class='grid-formation grid-column-6'])[1]"));

        File src = logo.getScreenshotAs(OutputType.FILE);
        File dest=new File("D:\\29th Nov 2025\\Selenium\\Screenshots\\logo1.png");
        FileHandler.copy(src,dest);
    }
}
