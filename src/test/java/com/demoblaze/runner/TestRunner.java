package com.demoblaze.runner;

import com.demoblaze.base.BaseClass;
import com.demoblaze.pageobjectmanager.PageObjectManager;

import java.io.IOException;

public class TestRunner extends BaseClass {

    public static void main(String[] args) throws InterruptedException, IOException {

        PageObjectManager pom = PageObjectManager.getPageObjectManager();

        String browser = pom.getFileReaderManager().getDataProperty("browser");
        String url = pom.getFileReaderManager().getDataProperty("url");

        launchBrowser(browser);
        launchUrl(url);

        pom.getLoginPage().validLogin();
        pom.getSearchPage().SearchPage();
        pom.getCheckoutPage().CheckoutPage();
        pom.getAddressPage().validateAddressPage();
    }
}
