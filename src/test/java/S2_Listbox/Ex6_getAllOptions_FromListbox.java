package S2_Listbox;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Ex6_getAllOptions_FromListbox
{
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("file:///D:/29th%20Nov%202025/Selenium/Html%20files/Sample4_listbox.html");

        WebElement selectCountry = driver.findElement(By.xpath("//select[@id='1234']"));

        Select s=new Select(selectCountry);


        List<WebElement> allOptions = s.getOptions();
        for( WebElement singleOption:allOptions)
        {
            System.out.println(singleOption.getText());
        }

    }
}
