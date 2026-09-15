package com.demoblaze.pageobjectmodel;

import com.demoblaze.base.BaseClass;
import com.demoblaze.interfaceelements.CheckoutPageInterfaceElements;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class CheckoutPage extends BaseClass implements CheckoutPageInterfaceElements
{
    @FindBy(xpath = cart_xpath)
    public static WebElement cart;

    @FindBy(xpath = placeOrder_xpath)
    public static WebElement placeorder;

    public CheckoutPage()
    {
        PageFactory.initElements(driver,this);
    }

    public static void CheckoutPage() throws IOException, InterruptedException {
        clickOnElement(cart);
        Thread.sleep(3000);
        takeScreenshot();
        clickOnElement(placeorder);
    }

}
