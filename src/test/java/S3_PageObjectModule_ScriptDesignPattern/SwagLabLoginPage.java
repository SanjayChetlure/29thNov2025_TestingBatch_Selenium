package S3_PageObjectModule_ScriptDesignPattern;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

//pom/regular class 1
public class SwagLabLoginPage
{
    @FindBy(xpath = "//input[@name='user-name']") private WebElement UN ;
    @FindBy(xpath = "//input[@name='password']") private WebElement PWD;
    @FindBy(xpath = "//input[@name='login-button']") private WebElement loginBtn;
}
