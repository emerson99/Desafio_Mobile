package com.templateJavaAppium.tests.Nested;

import com.templateJavaAppium.bases.TestBase;
import com.templateJavaAppium.pages.HomeScreen;
import com.templateJavaAppium.pages.NestedScreen;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class TituloNestedTest extends TestBase {

    HomeScreen homeScreen;
    NestedScreen nestedScreen;

    @Test
    public void validaTituloNested()throws IOException,InterruptedException{
        homeScreen = new HomeScreen();
        nestedScreen = new NestedScreen();
        String Titulo = "Nested Views";
        homeScreen.ClicarMenu();
        nestedScreen.ClicarMenuNested();
        Assert.assertEquals(Titulo,(nestedScreen.validaTituloMenuNested()));
    }
}
