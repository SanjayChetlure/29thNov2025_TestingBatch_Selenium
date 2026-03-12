package S2_Popups;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

public class Ex3_SwitchToChildWindow
{
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://skpatro.github.io/demo/links/");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //click on NewTab from main page
        driver.findElement(By.xpath("//input[@name='NewTab']")).click();

        //get child window address
        Set<String> allAddress = driver.getWindowHandles();        //[mainPageAddress, childWindowAddress]
        ArrayList<String> al=new ArrayList<String>(allAddress);    //[mainPageAddress(0), childWindowAddress(1)]

        String mainPageiD = al.get(0);
        String childWindowId = al.get(1);

        System.out.println(mainPageiD);
        System.out.println(childWindowId);

        //switch to child window
        driver.switchTo().window(childWindowId);           //String childWindowIDOrAddress

        //click on Selenium link from child window
        driver.findElement(By.xpath("(//span[text()='Selenium'])[1]")).click();

    }
}
