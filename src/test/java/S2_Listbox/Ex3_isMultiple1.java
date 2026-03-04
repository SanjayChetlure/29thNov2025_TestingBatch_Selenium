package S2_Listbox;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ex3_isMultiple1
{
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("file:///D:/29th%20Nov%202025/Selenium/Html%20files/Sample4_listbox.html");

        WebElement selectCountry = driver.findElement(By.xpath("//select[@id='1234']"));

        Select s=new Select(selectCountry);

        boolean result = s.isMultiple();
        System.out.println(result);

        if (result)
        {
            System.out.println("listbox is mult selectable");
        }
        else
        {
            System.out.println("listbox is single selectable");
        }

    }
}
