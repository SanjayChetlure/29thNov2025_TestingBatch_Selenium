package S1_WebDriver_Methods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex4_getTitle
{
    public static void main(String[] args)
    {
        WebDriver d=new ChromeDriver();
        d.get("https://www.google.com/");

       String title=d.getTitle();
       System.out.println(title);
    }
}
