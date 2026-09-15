package com.demoblaze.pageobjectmodel;

import com.demoblaze.base.BaseClass;
import com.demoblaze.interfaceelements.loginPageInterfaceElements;
import com.demoblaze.pageobjectmanager.PageObjectManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

import static com.demoblaze.pageobjectmodel.SearchPage.gettext;

public class LoginPage extends BaseClass implements loginPageInterfaceElements
{
    @FindBy(id = login_id)
    public static WebElement login;
    @FindBy(css = userName_css)
    public static WebElement username;
    @FindBy(css = password_css)
    public static WebElement password;
    @FindBy(xpath = signin_xpath)
    public static WebElement signin;

    public LoginPage() {
        PageFactory.initElements(driver,this);
    }

    public static void validLogin() throws InterruptedException, IOException {
        clickOnElement(login);
        Thread.sleep(3000);
        passInput(username, PageObjectManager.getPageObjectManager().getFileReaderManager().getDataProperty("username"));
        passInput(password, PageObjectManager.getPageObjectManager().getFileReaderManager().getDataProperty("password"));
        clickOnElement(signin);


    }

}
