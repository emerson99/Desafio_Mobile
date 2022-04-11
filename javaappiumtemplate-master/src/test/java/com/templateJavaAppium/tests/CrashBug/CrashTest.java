package com.templateJavaAppium.tests.CrashBug;

import com.templateJavaAppium.bases.TestBase;
import com.templateJavaAppium.pages.CrashBugScreen;
import com.templateJavaAppium.pages.HomeScreen;
import com.templateJavaAppium.pages.NestedScreen;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class CrashTest extends TestBase {
    HomeScreen homeScreen;
    CrashBugScreen crashBugScreen;


    @Test
    public void validaCrashBug()throws IOException,InterruptedException{
        homeScreen = new HomeScreen();
        crashBugScreen = new CrashBugScreen();
        String Pressing = "Pressing this button will crash the app";
        homeScreen.ClicarMenu();
        crashBugScreen.ClicarMenuCrashBug();
        Assert.assertEquals(Pressing,(crashBugScreen.validaDisplayCrashBug()));
    }

}
