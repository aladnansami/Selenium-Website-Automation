package controller;

import base.setup;
import org.testng.annotations.Test;
import pages.signupPage;

import java.io.IOException;

public class signupcontroller extends setup {

    @Test(priority = 1)
    public void dosignup () throws InterruptedException , IOException {

        driver.get("http://automationpractice.com/");
        signupPage signuppage = new signupPage(driver);
        signuppage.btnsignin.click();

    }
}
