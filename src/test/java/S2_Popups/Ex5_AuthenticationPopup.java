package S2_Popups;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex5_AuthenticationPopup
{
    public static void main(String[] args)
    {
        WebDriver driver=new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/basic_auth");

        //url=  https://UN:PWD@remianingURL

//        driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
    }
}
