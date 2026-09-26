package com.demoblaze.base;

import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BaseClass {
    public static WebDriver driver;
    protected static void clickOnElement(WebElement element)
    {
        try{
            element.click();
        } catch (Exception e) {
            Assert.fail("FAILED TO CLICK ELEMENT" +e);
        }
    }

    protected static void passInput(WebElement element, String value)
    {
        try
        {
            element.sendKeys(value);
        } catch (Exception e) {
            Assert.fail("FAILED: WHILE SENDING TEXT DATAS");
        }
    }




    protected static void launchBrowser(String browserName) {
        try {
            if (browserName.equalsIgnoreCase("Crome")) {
                driver = new ChromeDriver();
            } else if (browserName.equalsIgnoreCase("Firefox")) {
                driver = new FirefoxDriver();
            } else if (browserName.equalsIgnoreCase("edge")) {
                driver = new EdgeDriver();
            }
        } catch (Exception e) {
            Assert.fail("Error while launching browser");
        }
    }

    protected static void launchUrl(String url) {
        try {
            driver.get(url);
        } catch (Exception e) {
            Assert.fail("Error while opening URL");
        }
    }

    protected static void getText(WebElement element)
    {
        try
        {
            String text = element.getText();
            System.out.println(text);
        } catch (Exception e) {
            Assert.fail("ERROR: FAILED TO GET TEXT");
        }
    }




    protected static String takeScreenshot() throws IOException {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("EEE_MMM_dd_HH_mm_ss_z_yyyy");
        String strDate = sdf.format(date);
        TakesScreenshot ts = (TakesScreenshot) driver;
        File source = ts.getScreenshotAs(OutputType.FILE);
        try {
            File dest = new File("./SS/" + strDate + ".png");
            FileHandler.copy(source, dest);
        } catch (IOException e) {
            Assert.fail("ERROR : CANT TAKE SCREENSHOT OR ACCESS DIR");
        }
        return strDate;
    }

    protected static void alert()
    {
        Alert alert = driver.switchTo().alert();
        System.out.println("Alert Message: " + alert.getText());
        alert.accept();
    }
}
