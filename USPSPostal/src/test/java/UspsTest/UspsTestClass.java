package UspsTest;

import CalculatePrice.CalculatePriceClass;
import UspsHome.UspsHomeClass;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import utility.ApplicationLog;

import java.util.concurrent.TimeUnit;

/**
 * Created by Ankita Singh on 5/27/2017.
 */
public class UspsTestClass extends CommonAPI {

    @Test(priority = 1)
    public void callHome() throws InterruptedException {
        ApplicationLog.epicLogger("Epic: EbayTestHome AC:1,2 <a https://peoplentch.atlassian.net/browse/GREEN-7> GREEN-7 </a>");
        UspsHomeClass usps = PageFactory.initElements(driver, UspsHomeClass.class);
        usps.selectMailandShip();
        Thread.sleep(3000);
    }

    public void callCalculate() throws InterruptedException {
        CalculatePriceClass cpc = PageFactory.initElements(driver, CalculatePriceClass.class);
        driver.navigate().to("https://postcalc.usps.com/");
        cpc.calculatePrice();
        Thread.sleep(2000);

    }

}





