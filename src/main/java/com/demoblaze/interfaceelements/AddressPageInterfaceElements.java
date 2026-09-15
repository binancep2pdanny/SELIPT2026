package com.demoblaze.interfaceelements;

public interface AddressPageInterfaceElements
{
    String name = "name";
    String country = "country";
    String city = "city";
    String card ="card";
    String month = "month";
    String year = "year";

    String purchasebutton = "//button[normalize-space()='Purchase']";

    String success = "/html/body/div[10]/h2";
    String order = "/html/body/div[10]/p";

    String ok = "//button[@tabindex='1']";
}
