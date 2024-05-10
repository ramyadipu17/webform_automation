package pages;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import utility.BrowserDriver;

import java.io.File;
import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class RegistrationPage extends BrowserDriver {
    public static String registration_page_xpath="/html/body/center/h1";
    public static String salutation_xpath="//*[@id=\"Salutation\"]/option[2]";
    public static String firstname_id="firstname";
    public static String lastname_id="lastname";
    public static String email_id="emailId";
    public static String contact_id="contactNumber";
    public static String username_xpath="//*[@id=\"usr\"]";
    public static String password_xpath="//*[@id=\"pwd\"]";
    public static String submit_btn_xpath="//*[@id=\"first_form\"]/div/div[2]/center/input";
    public static String registration_success_msg_xpath="/html/body/center[1]/h1";

    public static void visibility_of_registration_page(){
    String actualpage_text=driver.findElement(By.xpath(registration_page_xpath)).getText();
    assertEquals(actualpage_text,"User Registration Page");
}
    public static void enter_salutation() throws InterruptedException {
        driver.findElement(By.xpath(salutation_xpath)).click();
        Thread.sleep(1000);
    }

    public static void enter_firstname() throws InterruptedException {
        driver.findElement(By.id(firstname_id)).sendKeys("Ramya");
        Thread.sleep(1000);
    }

    public static void enter_lastname() throws InterruptedException {
        driver.findElement(By.id(lastname_id)).sendKeys("Joshi");
        Thread.sleep(1000);
    }

    public static void enter_email() throws InterruptedException {
        driver.findElement(By.id(email_id)).sendKeys("ramyajoshi@gmail.com");
        Thread.sleep(1000);
    }

    public static void enter_contact() throws InterruptedException {
        driver.findElement(By.id(contact_id)).sendKeys("8015252801");
        Thread.sleep(1000);
    }

    public static void enter_username() throws InterruptedException {
        driver.findElement(By.xpath(username_xpath)).sendKeys("ramyajoshi");
        Thread.sleep(1000);
    }

    public static void enter_password() throws InterruptedException {
        driver.findElement(By.xpath(password_xpath)).sendKeys("password1");
        Thread.sleep(1000);
    }

    public static void click_submit_btn(){
        driver.findElement(By.xpath(submit_btn_xpath)).click();
    }

    public static void visibility_of_success_msg(){
        String actual_msg=driver.findElement(By.xpath(registration_success_msg_xpath)).getText();
        assertEquals(actual_msg,"User Registered Successfully !!!");
    }

    public static void takeScreenshot(WebDriver driver, String fileName) throws IOException {
        File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshotFile, new File("screenshot_" + fileName + ".png"));
    }

}
