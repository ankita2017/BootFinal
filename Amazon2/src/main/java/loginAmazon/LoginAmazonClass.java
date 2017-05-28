package loginAmazon;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import sun.awt.windows.ThemeReader;
import utility.TestLogger;

import java.util.concurrent.TimeUnit;

/**
 * Created by Ankita Singh on 5/27/2017.
 */
public class LoginAmazonClass  extends CommonAPI{

    @FindBy (how = How.XPATH, using = ".//*[@id='ap_email']")
    WebElement username;

    @FindBy(how = How.XPATH, using = ".//*[@id='ap_password']")
    WebElement password;

    @FindBy(how = How.XPATH, using = ".//*[@id='signInSubmit']")
    WebElement submit;

    @FindBy(how = How.XPATH, using = ".//*[@id='nav-link-accountList']/span[1]")
    WebElement signin;

    @FindBy(how = How.XPATH, using = ".//*[@id='nav-flyout-ya-signin']/a/span")
    WebElement signinClick;

    public void login() throws InterruptedException {
    TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object() {}.getClass().getEnclosingMethod().getName()));
    signin.click();
    signinClick.click();
    Thread.sleep(3000);
    username.sendKeys("saini.ankita2012@gmail.com");
    Thread.sleep(3000);
    password.sendKeys("Dolly@123");
    Thread.sleep(3000);
    submit.click();

    }
}
