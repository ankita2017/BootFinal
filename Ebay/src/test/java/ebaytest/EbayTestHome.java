package ebaytest;

import SearchLipStick.Lipstick;
import base.CommonAPI;
import ebayLogin.EbayLogin;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import utility.ApplicationLog;


/**
 * Created by Ankita Singh on 5/17/2017.
 */
public class EbayTestHome extends CommonAPI{

    @Test
    public void signin(){
        ApplicationLog.epicLogger("Epic: EbayTestHome AC:1,2 <a https://peoplentch.atlassian.net/browse/GREEN-7> GREEN-7 </a>");
        EbayLogin elogin = PageFactory.initElements(driver, EbayLogin.class);
        elogin.signinprocess();
    }
    @Test
    public void searchLipstick(){
        ApplicationLog.epicLogger("Epic: EbayTestHome AC:1,2 <a https://peoplentch.atlassian.net/browse/GREEN-7> GREEN-7 </a>");
        Lipstick lipstick = PageFactory.initElements(driver, Lipstick.class);
        lipstick.setLipstick();
    }

    }



