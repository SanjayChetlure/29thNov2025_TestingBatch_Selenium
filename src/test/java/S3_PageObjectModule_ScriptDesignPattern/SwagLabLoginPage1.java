package S3_PageObjectModule_ScriptDesignPattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//simple pom/regular class 1
public class SwagLabLoginPage1
{
    //Step1: variable declaration
    private WebElement UN ;
    private WebElement PWD;
    private WebElement loginBtn;
    private WebElement errorMsg;

    //Step2: initialization
    public SwagLabLoginPage1(WebDriver driver)
    {
        UN=driver.findElement(By.xpath("//input[@name='user-name']"));
        PWD=driver.findElement(By.xpath("//input[@name='password']"));
        loginBtn=driver.findElement(By.xpath("//input[@name='login-button']"));
        errorMsg=driver.findElement(By.xpath("//h3[@data-test='error']"));
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
        loginBtn.click();
    }

    public String getErrorMsg()
    {
        String errorMsgText = errorMsg.getText();
        return errorMsgText;
    }

}
