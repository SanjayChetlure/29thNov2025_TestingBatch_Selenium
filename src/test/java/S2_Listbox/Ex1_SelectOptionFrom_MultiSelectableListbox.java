package S2_Listbox;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ex1_SelectOptionFrom_MultiSelectableListbox
{
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("file:///D:/29th%20Nov%202025/Selenium/Html%20files/Sample4_listbox.html");

        //1: identify the listbox
        WebElement selectCountry = driver.findElement(By.xpath("//select[@id='1234']"));

        //2: create an object of select class
        Select s=new Select(selectCountry);

        //3: call the select class methods
        s.selectByVisibleText("Ind");
        s.selectByVisibleText("Aus");
        s.selectByIndex(2);
//        s.selectByValue("");
    }
}
