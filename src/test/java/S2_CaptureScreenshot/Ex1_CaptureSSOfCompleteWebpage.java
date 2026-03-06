package S2_CaptureScreenshot;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;

public class Ex1_CaptureSSOfCompleteWebpage
{
    public static void main(String[] args) throws IOException {

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.flipkart.com/");

        File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        System.out.println(source);

        File dest=new File("D:\\29th Nov 2025\\Selenium\\Screenshots\\image2.png");

        FileHandler.copy(source,dest);      //className.methodName(pathOfSource,pathOfDest)

    }
}
