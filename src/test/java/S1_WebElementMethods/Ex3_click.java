package S1_WebElementMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex3_click
{
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");

        //click on create new acc link
        driver.findElement(By.xpath("//a[text()='Create new account']")).click();
        Thread.sleep(3000);


        //click on female radio btn
        driver.findElement(By.xpath("//input[@class='_8esa']")).click();


    }
}
