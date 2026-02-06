package S1_WebDriver_Methods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex4_getTitle2
{
    public static void main(String[] args)
    {
        WebDriver d=new ChromeDriver();
        d.get("https://www.facebook.com/");

        String expTitle="Facebook – log in or sign up";
        String actTitle=d.getTitle();
        System.out.println(actTitle);

        if(actTitle.equals(expTitle))
        {
            System.out.println("facebook webpage opened");
        }
        else
        {
            System.out.println("facebook webpage not found");
        }
    }
}
