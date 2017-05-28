package UspsHome;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import utility.TestLogger;

/**
 * Created by Ankita Singh on 5/27/2017.
 */
public class UspsHomeClass extends CommonAPI {

    @FindBy (how = How.XPATH, using = ".//*[@id='global-menu']/div/nav/ol/li[3]/a/span[1]")
    WebElement mailship;

    @FindBy (how = How.XPATH, using = ".//*[@id='1408854642880']/section/section[2]/div/div[3]/a/p")
    WebElement calculatePrice;

    public void selectMailandShip() throws InterruptedException {
    TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object() {}.getClass().getEnclosingMethod().getName()));
    mailship.click();
    calculatePrice.click();
    Thread.sleep(3000);

    }
}
