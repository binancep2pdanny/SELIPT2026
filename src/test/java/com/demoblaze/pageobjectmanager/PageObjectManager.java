package com.demoblaze.pageobjectmanager;

import com.demoblaze.pageobjectmodel.AddressPage;
import com.demoblaze.pageobjectmodel.CheckoutPage;
import com.demoblaze.pageobjectmodel.LoginPage;
import com.demoblaze.pageobjectmodel.SearchPage;
import com.demoblaze.utility.FileReaderManager;

public class PageObjectManager
{
    public  FileReaderManager fileReaderManager;
    private static PageObjectManager pageObjectManager;
    private  LoginPage loginPage;
    private SearchPage searchPage;
    private CheckoutPage checkoutPage;
    private AddressPage addressPage;

    public FileReaderManager getFileReaderManager() {
        if (fileReaderManager == null)
        {
            fileReaderManager = new FileReaderManager();
        }
        return fileReaderManager;
    }

    public static PageObjectManager getPageObjectManager() {
        if(pageObjectManager==null)
        {
            pageObjectManager = new PageObjectManager();
        }
        return pageObjectManager;
    }

    public LoginPage getLoginPage() {
        if(loginPage == null)
        {
            loginPage =new LoginPage();
        }
        return loginPage;
    }

    public SearchPage getSearchPage() {
        if(searchPage == null)
        {
            searchPage =new SearchPage();
        }
        return searchPage;
    }

    public CheckoutPage getCheckoutPage()
    {
        if (checkoutPage == null)
        {
            checkoutPage = new CheckoutPage();
        }
        return checkoutPage;
    }

    public AddressPage getAddressPage() {

        if (addressPage == null)
        {
            addressPage = new AddressPage();
        }
        return addressPage;
    }
}
