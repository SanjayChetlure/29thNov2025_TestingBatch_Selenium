package S1_Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex3_XpathByContains_usingText2
{
    public static void main(String[] args)
    {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");

        //click on Create New Acc link
        driver.findElement(By.xpath("//a[contains(text(),'account')]")).click();

    }
}
