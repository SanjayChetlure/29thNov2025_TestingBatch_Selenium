package S2_Popups;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex2_AlertPopup3_SendKeys
{
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://skpatro.github.io/demo/alerts/");

        Thread.sleep(2000);

        //enter customer id
        driver.findElement(By.xpath("//input[@id='prompt']")).click();


        //switch to alert popup
        Alert alt = driver.switchTo().alert();

        //1: gettext from alert popup
        String text = alt.getText();
        System.out.println(text);

        alt.accept();
//      alt.sendKeys("abcd");

    }
}
