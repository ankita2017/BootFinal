package ebayhomepage;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

/**
 * Created by Ankita Singh on 5/17/2017.
 */
public class Homepageclass extends CommonAPI{

    WebElement edriver;
    @Test
public void search() {
        typeByCss("#gh-ac", "iphone7");
        clickByCss("#gh-btn");
        clickByCss(".vip>strong");

        try {
            sleepFor(30);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
        public void shopbycategory(){

    clickByCss("#gh-shop-a"); //click on shop category
    clickByCss(".hl-cat-nav__js-tab>a");
    selectOptionByVisibleText(edriver, "fashion");

    }
    }



