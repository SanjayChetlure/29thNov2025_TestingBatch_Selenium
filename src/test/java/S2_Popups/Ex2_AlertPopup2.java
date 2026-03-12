package S2_Popups;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex2_AlertPopup2
{
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/test/delete_customer.php");

        Thread.sleep(2000);

        //enter customer id
        driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("1234");
        Thread.sleep(2000);

        //click on submit btn
        driver.findElement(By.xpath("//input[@name='submit']")).click();

        //switch to alert popup
        Alert alt = driver.switchTo().alert();

        //1: gettext from alert popup
        String text = alt.getText();
        System.out.println(text);

        //2: click on cancel btn from alert popup
        // alt.dismiss();

        //3: click on OK btn from alert popup
        alt.accept();

        //click on OK btn from 2nd alert popup
        alt.accept();

        //enter value in alert popup
//        alt.sendKeys("abc");
    }
}
