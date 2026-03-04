package S2_Listbox;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ex1_SelectOptionFrom_SingleSelectableListbox
{
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        //1: identify the listbox
        WebElement element = driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));

        //2: create an object of select class
        Select s=new Select(element);

        //3: call the select class methods
//        s.selectByVisibleText("Option3");        //String text
//        s.selectByValue("option1");              //String value
        s.selectByIndex(2);                         //int index
    }
}
