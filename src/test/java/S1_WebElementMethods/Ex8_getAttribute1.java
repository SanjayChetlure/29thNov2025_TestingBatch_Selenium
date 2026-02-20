package S1_WebElementMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex8_getAttribute1
{

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();
        driver.get("https://www.saucedemo.com/");

        driver.findElement(By.xpath("(//input[@class='input_error form_input'])[1]")).sendKeys("abcd");

        String text=driver.findElement(By.xpath("(//input[@class='input_error form_input'])[1]")).getAttribute("value");
        System.out.println(text);
    }
}
