package amazonTest;

import addToCart.AddToCart;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import utility.ApplicationLog;

/**
 * Created by Ankita Singh on 5/28/2017.
 */
public class AmazonTestClass extends CommonAPI {

    @Test(priority = 1)
    public void addcart() throws InterruptedException {
        ApplicationLog.epicLogger("Epic: Amazon2Test AC:1,2 <a https://peoplentch.atlassian.net/browse/GREEN-7> GREEN-7 </a>");
        AddToCart addtocart = PageFactory.initElements(driver, AddToCart.class);
        addtocart.searchItem();
        Thread.sleep(3000);
    }



}
