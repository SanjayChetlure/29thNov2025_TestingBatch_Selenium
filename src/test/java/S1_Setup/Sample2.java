package S1_Setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sample2
{

    public static void main(String[] args) {

        //create object of subclass (ChromeDriver) with reference(dataType) of super interface(class)
        //this statement is example of upcasting in selenium

//        WebDriver driver=new ChromeDriver();
//        WebDriver driver=new EdgeDriver();
          WebDriver driver=new FirefoxDriver();

    }
}
