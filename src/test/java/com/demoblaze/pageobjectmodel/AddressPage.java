package com.demoblaze.pageobjectmodel;

import com.demoblaze.base.BaseClass;
import com.demoblaze.interfaceelements.AddressPageInterfaceElements;
import com.demoblaze.pageobjectmanager.PageObjectManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class AddressPage extends BaseClass implements AddressPageInterfaceElements
{
    @FindBy(id = name)
    public static WebElement namefield;

    @FindBy(id = country)
    public static WebElement countryfield;

    @FindBy(id = city)
    public static WebElement cityfield;

    @FindBy(id = card)
    public static WebElement cardfield;

    @FindBy(id = month)
    public static WebElement monthfield;

    @FindBy(id = year)
    public static WebElement yearfield;

    @FindBy(xpath = purchasebutton)
    public static WebElement purchase;

    @FindBy(xpath = success)
    public static WebElement successmessage;

    @FindBy(xpath = order)
    public static WebElement ordermessage;

    @FindBy(xpath = ok)
    public static WebElement okbutton;



    public AddressPage()
    {
        PageFactory.initElements(driver,this);
    }

    public static void validateAddressPage() throws InterruptedException, IOException {

        Thread.sleep(3000);
        passInput(namefield, PageObjectManager.getPageObjectManager().getFileReaderManager().getDataProperty("name"));
        passInput(countryfield, PageObjectManager.getPageObjectManager().getFileReaderManager().getDataProperty("country"));
        passInput(monthfield, PageObjectManager.getPageObjectManager().getFileReaderManager().getDataProperty("month"));
        passInput(cityfield, PageObjectManager.getPageObjectManager().getFileReaderManager().getDataProperty("city"));
        passInput(yearfield, PageObjectManager.getPageObjectManager().getFileReaderManager().getDataProperty("year"));
        passInput(cardfield, PageObjectManager.getPageObjectManager().getFileReaderManager().getDataProperty("card"));
        clickOnElement(purchase);

        Thread.sleep(3000);
        getText(successmessage);
        getText(ordermessage);
        takeScreenshot();
        clickOnElement(okbutton);

    }
}
