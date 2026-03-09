package S3_Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex1_SwitchToFrame
{
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");

        //switch to iframe
        driver.switchTo().frame("iframeResult");       //String frameNameOrId
       // driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='iframeResult']")));    //WebElement address
//        driver.switchTo().frame(0);         //int frameIndex

        //click on date & time btn
        driver.findElement(By.xpath("//button[contains(text(),'Click')]")).click();
    }
}
