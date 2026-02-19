package S1_WebElementMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex6_isSelected2
{
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/r.php?entry_point=login");

        WebElement femaleRadioBtn=driver.findElement(By.xpath("(//input[@class='_8esa'])[1]"));
        Thread.sleep(2000);

        femaleRadioBtn.click();

        boolean result = femaleRadioBtn.isSelected();
        System.out.println(result);

        if (result)
        {
            System.out.println("Radio btn is selected");
        }
        else
        {
            System.out.println("Radio btn is De-Selected");
        }
    }
}
