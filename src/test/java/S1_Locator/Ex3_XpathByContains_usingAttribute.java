package S1_Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex3_XpathByContains_usingAttribute
{
    public static void main(String[] args)
    {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");

        //enter UN
        driver.findElement(By.xpath("//input[contains(@placeholder,'phone')]")).sendKeys("abc");

        //enter PWD
        driver.findElement(By.xpath("//input[contains(@class,'_6luy _9npi')]")).sendKeys("xyz");

    }
}
