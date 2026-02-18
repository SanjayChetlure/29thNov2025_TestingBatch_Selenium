package S1_WebElementMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex4_getText
{
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");

        String text = driver.findElement(By.xpath("//button[@name='login']")).getText();
        System.out.println(text);


//        System.out.println(driver.findElement(By.xpath("//button[@name='login']")).getText());
    }
}
