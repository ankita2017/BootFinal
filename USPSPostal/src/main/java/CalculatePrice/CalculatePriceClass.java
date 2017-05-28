package CalculatePrice;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by Ankita Singh on 5/27/2017.
 */
public class CalculatePriceClass extends CommonAPI {


   /* @FindBy(how = How.XPATH, using = ".//*[@id='CountryID']")
    WebElement countryId; */

    @FindBy(how = How.XPATH, using= ".//*[@id='Origin']")
    WebElement source;

    @FindBy(how = How.XPATH, using = ".//*[@id='Destination']")
    WebElement destination;

    @FindBy(how = How.XPATH, using = ".//*[@id='shippingDate']")
    WebElement shippingDate;

    @FindBy(how = How.XPATH, using = ".//*[@id='GroundTransportation']")
    WebElement checkgt;

    @FindBy(how = How.XPATH, using = ".//*[@id='options-section']/div/div[4]/label")
    WebElement price2;

    @FindBy(how = How.XPATH, using=".//*[@id='Pounds']")
    WebElement pounds;

    @FindBy(how = How.XPATH, using=".//*[@id='option_2']")
    WebElement largenvelope;


    public void calculatePrice() throws InterruptedException {
    source.sendKeys("22015");
    destination.sendKeys("10001");
    shippingDate.sendKeys("5/30/2017");
    checkgt.click();
    price2.click();
    pounds.sendKeys("1");
    largenvelope.click();
    Thread.sleep(3000);

    }
}



