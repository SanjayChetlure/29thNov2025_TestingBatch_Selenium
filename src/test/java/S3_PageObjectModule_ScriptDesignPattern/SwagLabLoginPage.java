package S3_PageObjectModule_ScriptDesignPattern;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

//pom/regular class 1
public class SwagLabLoginPage
{
    //Step1: variable declaration
    @FindBy(xpath = "//input[@name='user-name']") private WebElement UN ;     //private WebElement UN=driver.findElement(By.xpath(""))
    @FindBy(xpath = "//input[@name='password']") private WebElement PWD;       //private WebElement PWD=driver.findElement(By.xpath(""))
    @FindBy(xpath = "//input[@name='login-button']") private WebElement loginBtn; //private WebElement loginBtn=driver.findElement(By.xpath(""))
    @FindBy(xpath = "//h3[@data-test='error']") private WebElement errorMsg;
    WebDriver driver;

    //Step2: initialization
    public SwagLabLoginPage(WebDriver driver)
    {
        PageFactory.initElements(driver, this);          //className.methodName(webDriverObject, thisKeyword)
        this.driver=driver;
    }

    //Step3: perform action
    public void enterUN(String username)
    {
        UN.sendKeys(username);
    }

    public void enterPWD(String password)
    {
        PWD.sendKeys(password);
    }

    public void clickOnLoginBtn()
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        wait.until(ExpectedConditions.elementToBeClickable(loginBtn));

        loginBtn.click();
    }

    public String getErrorMsg()
    {
        String errorMsgText = errorMsg.getText();
        return errorMsgText;
    }

}
