package calculateMortgage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import utility.TestLogger;

/**
 * Created by Ankita Singh on 5/28/2017.
 */
public class Calculate extends CommonAPI {

    @FindBy(how = How.XPATH, using = ".//*[@id='calc']/form/section/section[2]/div/div/div[1]/div/div/div[3]/div[1]/div[1]/div[1]/input")
    WebElement Homevalue;

    @FindBy(how = How.XPATH, using = ".//*[@id='loanamt']")
    WebElement loanamount;

    @FindBy(how = How.XPATH, using = ".//*[@id='intrstsrate']")
    WebElement interestrate;

    @FindBy(how = How.XPATH, using = ".//*[@id='loanterm']")
    WebElement loanterm;

    @FindBy(how = How.XPATH, using = ".//*[@id='calc']/form/section/section[2]/div/div/div[1]/div/div/div[3]/div[1]/div[1]/div[6]/select[1]")
    WebElement month;

    @FindBy(how = How.XPATH, using = ".//*[@id='calc']/form/section/section[2]/div/div/div[1]/div/div/div[3]/div[1]/div[1]/div[6]/select[2]")
    WebElement year;

    @FindBy(how = How.XPATH, using = ".//*[@id='pptytax']")
    WebElement ptax;

    @FindBy(how = How.XPATH, using = ".//*[@id='pmi']")
    WebElement pmi;

    @FindBy(how = How.XPATH, using = ".//*[@id='hoi']")
    WebElement hoi;

    @FindBy(how = How.XPATH, using = ".//*[@id='hoa']")
    WebElement hoa;

    @FindBy(how = How.XPATH, using = ".//*[@id='calc']/form/section/section[2]/div/div/div[1]/div/div/div[3]/div[1]/div[1]/div[11]/input")
    WebElement calculate;

    @FindBy(how = How.LINK_TEXT, using = "View Loan Breakdown")
    WebElement loanbreakdown;

    public void calculate() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        Homevalue.clear();
        Homevalue.sendKeys("300000");
        loanamount.clear();
        loanamount.sendKeys("250000");
        interestrate.clear();
        interestrate.sendKeys("4");
        loanterm.clear();
        loanterm.sendKeys("30");
        selectOptionByVisibleText(month, "Jun");
        selectOptionByVisibleText(year, "2017");
        ptax.clear();
        ptax.sendKeys("1.25");
        pmi.clear();
        pmi.sendKeys("0.5");
        hoi.clear();
        hoi.sendKeys("1000");
        hoa.clear();
        hoa.sendKeys("0");
        calculate.click();
        sleepFor(5);
        loanbreakdown.click();
        sleepFor(5);
    }
}
