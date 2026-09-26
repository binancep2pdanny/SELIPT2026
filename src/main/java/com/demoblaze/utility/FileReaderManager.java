package com.demoblaze.utility;

import org.junit.Assert;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class FileReaderManager
{
    public static FileInputStream fileInputStream;
    public static Properties properties;

    public static void setupProperty() {
        File file = new File("D:\\DANNY\\Intellij Proj Works\\DemoBlazeAutomation\\src\\main\\resources\\config.properties");
        try{
            fileInputStream = new FileInputStream(file);
            properties= new Properties();
            properties.load(fileInputStream);
        } catch (FileNotFoundException e) {
            Assert.fail("FAILED DURING FILE LOADING");
        } catch (IOException e) {
            Assert.fail("IO EXCETION : FAILED DURING FILE LOADING");
        }
    }

    public static String getDataProperty(String value)
    {
        setupProperty();
        String property = properties.getProperty(value);
        return property;
    }
}
