package mortgageTest;

import base.CommonAPI;
import calculateMortgage.Calculate;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import utility.ApplicationLog;

/**
 * Created by Ankita Singh on 5/28/2017.
 */
public class MortgageTest extends CommonAPI {

    @Test
    public void callCalculate() throws InterruptedException {
    ApplicationLog.epicLogger("Epic: Amazon2Test AC:1,2 <a https://peoplentch.atlassian.net/browse/GREEN-7> GREEN-7 </a>");
    Calculate cal = PageFactory.initElements(driver, Calculate.class);
    cal.calculate();
}

}
