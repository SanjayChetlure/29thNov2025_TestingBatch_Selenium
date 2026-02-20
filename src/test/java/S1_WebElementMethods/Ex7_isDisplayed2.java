package S1_WebElementMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Ex7_isDisplayed2
{
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com");

        boolean result=false;

        try
        {
             result = driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img1']")).isDisplayed();
        }
        catch (NoSuchElementException e)
        {
            System.out.println("NoSuchElement Exception handled");
        }

        System.out.println(result);

        if(result)
        {
            System.out.println("Element present");
        }
        else
        {
            System.out.println("element not present");
        }
    }
}
