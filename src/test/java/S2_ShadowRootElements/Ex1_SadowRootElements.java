package S2_Popups;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex1_SadowRootElements
{
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");

        Thread.sleep(2000);


//        1-identify shadow root element using css locator type
//        2-switch into shadow root
//        3-identify shadow root element using css locator type
//        4-perform action

//        identify css using id atrribute -                  #idAttrValue
//        identify css using any atrribute name & value -    tag[attrName='attrValue']

        driver.findElement(By.cssSelector("#shadow_host")).getShadowRoot().findElement(By.cssSelector("input[type='text']")).sendKeys("abc");

    }
}
