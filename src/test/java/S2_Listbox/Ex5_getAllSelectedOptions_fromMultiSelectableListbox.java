package S2_Listbox;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Ex5_getAllSelectedOptions_fromMultiSelectableListbox
{
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("file:///D:/29th%20Nov%202025/Selenium/Html%20files/Sample4_listbox.html");

        WebElement selectCountry = driver.findElement(By.xpath("//select[@id='1234']"));

        Select s=new Select(selectCountry);

        s.selectByIndex(3);
        s.selectByIndex(1);
        s.selectByIndex(0);

        List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
        for(WebElement s1:allSelectedOptions)
        {
            System.out.println(s1.getText());
        }


        System.out.println(allSelectedOptions.size());

    }
}
