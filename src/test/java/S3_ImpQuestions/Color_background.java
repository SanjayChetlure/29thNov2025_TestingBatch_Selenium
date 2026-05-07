package S3_ImpQuestions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class Color_background
{
    public static void main(String[] args) throws InterruptedException
    {
        String expYellowClrHexValue="#ffe51f";
;

        WebDriver driver=new ChromeDriver();
        driver.get("https://www.flipkart.com/");

        Thread.sleep(2000);

        WebElement logo = driver.findElement(By.xpath("(//div[@class='_1psv1zeb9 _1psv1ze0 _1psv1ze99 _1psv1ze7o _1psv1ze2o _1psv1ze53']//div)[3]"));
        String actRGBclr =logo.getCssValue("background-color");
        System.out.println(actRGBclr);


        String actHexClr = Color.fromString(actRGBclr).asHex();
        System.out.println(actHexClr);

        if (expYellowClrHexValue.equals(actHexClr))
        {
            System.out.println("Yellow color");
        }
        else
        {
            System.out.println("Other color");
        }

    }
}
