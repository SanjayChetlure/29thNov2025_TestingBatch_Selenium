package S1_Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginToInsta
{
    public static void main(String[] args)
    {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.instagram.com/");

        //Enter UN
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("abc");

        //Enter pwd
        driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("xyz");

        //click on login
        driver.findElement(By.xpath("//span[text()='Log in']")).click();

    }
}
