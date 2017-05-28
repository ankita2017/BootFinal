package amazon2test;

import addToCart.AddToCartClass;
import base.CommonAPI;
import javafx.scene.layout.Priority;
import loginAmazon.LoginAmazonClass;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import utility.ApplicationLog;


/**
 * Created by Ankita Singh on 5/27/2017.
 */
public class Amazon2Test extends CommonAPI {

   @Test(priority =0 )
    public void loginPage() throws InterruptedException {
        ApplicationLog.epicLogger("Epic: Amazon2Test AC:1,2 <a https://peoplentch.atlassian.net/browse/GREEN-7> GREEN-7 </a>");
        LoginAmazonClass login = PageFactory.initElements(driver, LoginAmazonClass.class);
        Thread.sleep(3000);
        login.login();
        Thread.sleep(3000);
    }

    @Test(priority = 1)
        public void addcart() throws InterruptedException {
        ApplicationLog.epicLogger("Epic: Amazon2Test AC:1,2 <a https://peoplentch.atlassian.net/browse/GREEN-7> GREEN-7 </a>");
        AddToCartClass addtocart = PageFactory.initElements(driver, AddToCartClass.class);
        addtocart.searchItem();
        Thread.sleep(3000);
    }


}
