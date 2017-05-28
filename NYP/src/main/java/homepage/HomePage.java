package homepage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import utility.TestLogger;

/**
 * Created by PIIT_NYA on 5/13/2017.
 */
public class HomePage extends CommonAPI {

    @FindBy(how = How.CSS, using = "#nav-wrapper .container #page-nav .nav-links .nav-links-wrapper .nav-left #sections .menu-icon svg:only-child")
    public static WebElement sectionsMenu;

    @FindBy(how = How.CSS, using = "#menu-main-menu li:nth-child(1)")
    public static WebElement sectionsMenuNews;

    @FindBy(how = How.CSS, using = "#menu-main-menu li:nth-child(2)")
    public static WebElement sectionsMenuMetro;

    @FindBy(how = How.CSS, using = "#menu-main-menu li:nth-child(3)")
    public static WebElement sectionsMenuPageSix;

    @FindBy(how = How.CSS, using = "#menu-main-menu li:nth-child(4)")
    public static WebElement sectionsMenuSports;

    public WebElement getSectionsMenuWebElement() {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        return sectionsMenu;
    }
    public WebElement getSectionsMenuNewsWebElement() {
        return sectionsMenuNews;
    }
    public WebElement getSectionsMenu() {
        return sectionsMenu;
    }

    public WebElement getSectionsMenuNews() {
        return sectionsMenuNews;
    }

    public WebElement getSectionsMenuMetro() {
        return sectionsMenuMetro;
    }

    public WebElement getSectionsMenuPageSix() {
        return sectionsMenuPageSix;
    }

    public WebElement getSectionsMenuSports() {
        return sectionsMenuSports;
    }
    public void clickOnSectionsMenu() {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getSectionsMenuWebElement().click();
    }
    public void clickOnNewsSection(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getSectionsMenuNewsWebElement().click();
    }
    public void clickOnMetroSection(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getSectionsMenuMetro().click();
    }

    public void clickOnSportsSection(){

        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));getSectionsMenuSports().click();
    }
    public void goToNewsSection(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnSectionsMenu();
        clickOnNewsSection();
    }
    public void goToMetroSections(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        clickOnSectionsMenu();
        clickOnMetroSection();
    }
}
