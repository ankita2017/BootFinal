package ebayLogin;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import utility.TestLogger;

/**
 * Created by Ankita Singh on 5/27/2017.
 */
public class EbayLogin extends CommonAPI{

    @FindBy(how = How.LINK_TEXT, using = "Sign in")
    WebElement signin;

    @FindBy(how = How.CSS, using = "#\\32 79770041")
    WebElement username;


    //@FindBy(how = How.XPATH, using = "")

    @FindBy(how = How.XPATH, using = ".//*[@id='sgnBt']")
    WebElement clickonsignin;

    public void signinprocess(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        signin.click();
        username.sendKeys("suprakid95@gmail.com");
        clickonsignin.click();
    }



}
