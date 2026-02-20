package S1_WebElementMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex8_getAttribute2
{
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();
        driver.get("https://www.saucedemo.com/");


        String lblUN=driver.findElement(By.xpath("(//input[@class='input_error form_input'])[1]")).getAttribute("placeholder");
        System.out.println(lblUN);


        String lblPWD=driver.findElement(By.xpath("//input[@id='password']")).getAttribute("placeholder");
        System.out.println(lblPWD);

    }
}
