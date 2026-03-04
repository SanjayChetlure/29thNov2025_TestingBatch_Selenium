package S2_Listbox;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ex2_DeSelectOptionFrom_MultiSelectableListbox1
{
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("file:///D:/29th%20Nov%202025/Selenium/Html%20files/Sample4_listbox.html");

        WebElement selectCountry = driver.findElement(By.xpath("//select[@id='1234']"));

        Select s=new Select(selectCountry);

        s.selectByIndex(1);
        s.selectByIndex(2);
        s.selectByIndex(3);

        Thread.sleep(3000);

        s.deselectByVisibleText("Sri");
//        s.deselectByVisibleText("SA");
//        s.deselectByIndex(3);
//        s.deselectByValue("");
    }
}
