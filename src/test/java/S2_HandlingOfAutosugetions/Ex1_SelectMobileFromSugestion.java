package S2_HandlingOfAutosugetions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class Ex1_SelectMobileFromSugestion
{
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        Thread.sleep(2000);

        List<WebElement> allCheckboxes = driver.findElements(By.xpath("(//div[@class='form-group'])[4]//input"));

        driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("redmi");
        Thread.sleep(1000);
        String expMobile = "redmi note 14";

        List<WebElement> allOptions = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]/li//div[@class='wM6W7d']"));

        for(WebElement s1:allOptions)
        {
            System.out.println(s1.getText());
        }

        
    }
}
