package addToCart;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import utility.TestLogger;

/**
 * Created by Ankita Singh on 5/27/2017.
 */
public class AddToCartClass extends CommonAPI {

    @FindBy(how = How.XPATH,using = ".//*[@id='twotabsearchtextbox']")
    WebElement searchbox;

    @FindBy(how = How.XPATH, using = ".//*[@id='nav-search']/form/div[2]/div/input")
    WebElement clickonSearch;

    @FindBy(how = How.XPATH, using = ".//*[@id='result_4']/div/div/div/div[2]/div[1]/div[1]/a/h2")
    WebElement nikonCamera;

    @FindBy(how = How.XPATH, using = ".//*[@id='add-to-cart-button']")
    WebElement cart;

    @FindBy(how = How.XPATH, using = ".//*[@id='siNoCoverage-announce']")
    WebElement nopopup;

    @FindBy(how = How.XPATH, using = ".//*[@id='hlb-ptc-btn-native']")
    WebElement proceed;

    @FindBy (how = How.XPATH, using = ".//*[@id='ap_email']")
    WebElement username;

    @FindBy(how = How.XPATH, using = ".//*[@id='ap_password']")
    WebElement password;

    @FindBy(how = How.XPATH, using = ".//*[@id='signInSubmit']")
    WebElement submit;

    @FindBy(how = How.XPATH, using = ".//*[@id='address-book-entry-0']/div[2]/span/a")
    WebElement ship;

    @FindBy(how = How.XPATH, using = ".//*[@id='nav-cart']/span[2]")
    WebElement navtocart;

    public void searchItem() throws InterruptedException {
    TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object() {}.getClass().getEnclosingMethod().getName()));
    searchbox.sendKeys("cannon camera");
    clickonSearch.click();
    nikonCamera.click();
    cart.click();
    nopopup.click();
    proceed.click();
    submit.click();
    ship.click();
    driver.navigate().to("http://amazon.com");
    navtocart.click();
    }
}
