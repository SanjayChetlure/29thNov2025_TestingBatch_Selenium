package S2_WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Ex2_getColSizeInA_Row
{
    public static void main(String[] args)
    {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");


//        int colSize = driver.findElements(By.xpath("//table[@name='BookTable']//tr[1]/th")).size();
//        System.out.println(colSize);

        int colSize1 = driver.findElements(By.xpath("//table[@name='BookTable']//tr[5]/td")).size();
        System.out.println(colSize1);


    }
}
