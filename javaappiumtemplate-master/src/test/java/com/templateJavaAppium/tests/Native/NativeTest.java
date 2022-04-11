package com.templateJavaAppium.tests.Native;

import com.templateJavaAppium.bases.TestBase;
import com.templateJavaAppium.pages.HomeScreen;
import com.templateJavaAppium.pages.LocalWebScreen;
import com.templateJavaAppium.pages.NativeScreen;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NativeTest extends TestBase {
    HomeScreen homeScreen;
    NativeScreen nativeScreen;


    @Test
    public void validaTituloNativeComponents() {
        homeScreen = new HomeScreen();
        nativeScreen = new NativeScreen();
        String Titulo = "Native Components";
        homeScreen.ClicarMenu();
        nativeScreen.ClicarMenuNativeComponents();
        Assert.assertEquals(Titulo,(nativeScreen.validaNativeComponent()));
    }

}
