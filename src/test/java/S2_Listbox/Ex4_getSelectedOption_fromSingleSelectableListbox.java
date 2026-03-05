package S2_Listbox;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ex4_getSelectedOption_fromSingleSelectableListbox
{
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        WebElement element = driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));

        Select s=new Select(element);

//        WebElement s1 = s.getFirstSelectedOption();
//        String text = s1.getText();
//        System.out.println(text);

        String text = s.getFirstSelectedOption().getText();
        System.out.println(text);

        System.out.println(s.getFirstSelectedOption().getText());
    }
}
