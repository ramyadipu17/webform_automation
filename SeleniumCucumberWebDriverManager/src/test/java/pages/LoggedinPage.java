package pages;

import org.openqa.selenium.By;
import utility.BrowserDriver;

import static org.junit.Assert.assertEquals;

public class LoggedinPage extends BrowserDriver {

    public static String prodcat_formalshoes="//*[text()='Formal Shoes']";
    public static String prodcat_sportshoes="//*[text()='Sports']";
    public static String prodcat_sneakershoes="//*[text()='Sneakers']";
    public static void visibility_of_cat_formal_shoes(){

        String actualprodcat_fs=driver.findElement(By.xpath(prodcat_formalshoes)).getText();
        assertEquals(actualprodcat_fs,"Formal Shoes");
    }

    public static void visibility_of_cat_sports_shoes(){
        String actualprodcat_ss=driver.findElement(By.xpath(prodcat_sportshoes)).getText();
        assertEquals(actualprodcat_ss,"Sports");
    }

    public static void visibility_of_cat_sneakers_shoes(){
        String actualprodcat_sneaker=driver.findElement(By.xpath(prodcat_sneakershoes)).getText();
        assertEquals(actualprodcat_sneaker,"Sneakers");
    }
}
