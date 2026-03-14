package S2_ActionsClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ex6_mouse_Scroll_ByAmount_Action
{
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/test/drag_drop.html");
        Thread.sleep(1000);

        Actions act=new Actions(driver);

        //scroll down -> 1st=0,  2nd= +ve  pixel
        act.scrollByAmount(0,700).perform();
        Thread.sleep(3000);

        //scroll Up -> 1st=0,  2nd= -ve  pixel
        act.scrollByAmount(0,-400).perform();


        //scroll right -> 1st=+ve,  2nd= 0  pixel
        act.scrollByAmount(300,0).perform();

        //scroll left -> 1st=-ve,  2nd= 0  pixel
        act.scrollByAmount(-200,0).perform();
    }
}
