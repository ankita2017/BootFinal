package addToCart;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import utility.TestLogger;

/**
 * Created by Ankita Singh on 5/28/2017.
 */
public class AddToCart  extends CommonAPI{

    @FindBy(how = How.XPATH,using = ".//*[@id='twotabsearchtextbox']")
    WebElement searchbox;

    @FindBy(how = How.XPATH, using = ".//*[@id='nav-search']/form/div[2]/div/input")
    WebElement clickonSearch;

    @FindBy(how = How.XPATH, using = ".//*[@id='result_4']/div/div/div/div[2]/div[1]/div[1]/a/h2")
    WebElement nikonCamera;

    @FindBy(how = How.XPATH, using = ".//*[@id='add-to-cart-button']")
    WebElement cart;

    @FindBy(how = How.XPATH, using = ".//*[@id='hlb-ptc-btn-native']")
    WebElement proceedtocheckout;

    @FindBy (how = How.XPATH, using = ".//*[@id='ap_email']")
    WebElement username;

    @FindBy(how = How.XPATH, using = ".//*[@id='ap_password']")
    WebElement password;

    @FindBy(how = How.XPATH, using = ".//*[@id='signInSubmit']")
    WebElement submit;


    public void searchItem() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        searchbox.sendKeys("cannon camera");
        clickonSearch.click();
        nikonCamera.click();
        cart.click();
        proceedtocheckout.click();
        Thread.sleep(2000);
        username.sendKeys("saini.ankita2012@gmail.com");
        password.sendKeys("abc123");
        submit.click();
    }

    }
