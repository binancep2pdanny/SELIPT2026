package com.demoblaze.pageobjectmodel;

import com.demoblaze.base.BaseClass;
import com.demoblaze.interfaceelements.SearchPageInterfaceElements;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class SearchPage extends BaseClass implements SearchPageInterfaceElements
{
    @FindBy(xpath = laptop_xpath)
    public static WebElement laptop;

    @FindBy(id = getText_id)
    public static WebElement gettext;

    @FindBy(xpath = searchProduct_xpath)
    public static WebElement searchProduct;

    @FindBy(xpath = addCartClick_xpath)
    public static WebElement addtocart;

    public SearchPage() {
        PageFactory.initElements(driver,this);
    }

    public static void SearchPage() throws InterruptedException, IOException
    {        Thread.sleep(3000);

        clickOnElement(laptop);
        Thread.sleep(3000);

        getText(gettext);
        Thread.sleep(3000);
        takeScreenshot();
        clickOnElement(searchProduct);
        Thread.sleep(6000);

        clickOnElement(addtocart);
        Thread.sleep(5000);
        alert();
    }

}
