package pages;

import org.openqa.selenium.By;
import utility.BrowserDriver;

import static org.junit.Assert.assertEquals;

public class OnlineProductsPage extends BrowserDriver {

        public static String formal_shoes_dropdown_class="formalshoedropdown";
        public static String formal_shoes_web_table_xpath="/html/body/div[2]/table";
    public static String formal_shoes_web_table_tr="/html/body/div[2]/table/tbody/tr[1]/td[1]";
        public static void formal_shoes_dropdown_click()
        {
            driver.findElement(By.className(formal_shoes_dropdown_class)).click();
        }

    public static void formal_shoes_first_text()
    {
        String actual_formal_shoe_name=driver.findElement(By.xpath(formal_shoes_web_table_tr)).getText();
        assertEquals(actual_formal_shoe_name,"   Classic Cheltenham");
    }
}
