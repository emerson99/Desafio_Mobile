package com.templateJavaAppium.tests.Alerts;

import com.templateJavaAppium.bases.TestBase;
import com.templateJavaAppium.pages.AlertsScreen;
import com.templateJavaAppium.pages.HomeScreen;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class TituloAlertTest extends TestBase {

    HomeScreen homeScreen;
    AlertsScreen alertsScreen;

    @Test
    public void validaTituloAlert()throws IOException,InterruptedException{
        homeScreen = new HomeScreen();
        alertsScreen = new AlertsScreen();
        String alertTitulo= "Alerts and Dialogs";
        homeScreen.ClicarMenu();
        alertsScreen.ClicarMenuAlert();
        Assert.assertEquals(alertTitulo,(alertsScreen.retornaTextoTituloTelaAlert()));

    }

}
