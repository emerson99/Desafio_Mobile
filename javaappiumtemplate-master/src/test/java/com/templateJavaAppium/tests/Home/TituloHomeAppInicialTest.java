package com.templateJavaAppium.tests.Home;

import com.templateJavaAppium.bases.TestBase;
import com.templateJavaAppium.pages.HomeScreen;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class TituloHomeAppInicialTest extends TestBase {
    HomeScreen homeScreen;

    @Test
    public void verificaTituloMenuHomeInicialAPP()throws IOException,InterruptedException{

        String textoTelaMenu = "AWS Device Farm Sample App for Android";
        HomeScreen homeScreen = new HomeScreen();
       Assert.assertEquals(textoTelaMenu,homeScreen.validaTextoTelaHome());
    }

}
