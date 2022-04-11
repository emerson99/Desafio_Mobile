package com.templateJavaAppium.tests.CrashBug;

import com.templateJavaAppium.bases.TestBase;
import com.templateJavaAppium.pages.CrashBugScreen;
import com.templateJavaAppium.pages.HomeScreen;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class TituloCrashBugTest extends TestBase {
    HomeScreen homeScreen;
    CrashBugScreen crashBugScreen;

    @Test
    public void validaTituloCrashBug()throws IOException,InterruptedException{
        homeScreen = new HomeScreen();
        crashBugScreen = new CrashBugScreen();
        String Titulo = "Crash/Bug Simulator";
        homeScreen.ClicarMenu();
        crashBugScreen.ClicarMenuCrashBug();
        Assert.assertEquals(Titulo,(crashBugScreen.validaTituloCrashBug()));
    }

}
