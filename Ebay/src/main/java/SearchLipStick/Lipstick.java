package SearchLipStick;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import utility.TestLogger;

/**
 * Created by Ankita Singh on 5/26/2017.
 */
public class Lipstick extends CommonAPI {
    @FindBy(how = How.XPATH, using = ".//*[@id='gh-ac']")
    WebElement searchbar;

    @FindBy(how = How.XPATH, using = ".//*[@id='gh-btn']")
    WebElement clickonSearchBar;

    @FindBy(how = How.XPATH, using = ".//*[@id='item33a4278503']/h3/a ")
    WebElement lipstick;

    public void setLipstick() {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        searchbar.click();
        typeByXpath(".//*[@id='gh-ac']", "revlon lipstick");
        clickonSearchBar.click();
        lipstick.click();
       // clickByXpath(".//*[@id='item33a4278503']/h3/a");
        //selectOptionByVisibleText(lipstick,"Revlon Colorstay Ultimate Liquid Lipstick / Lip color New & Sealed");
    }


    }
