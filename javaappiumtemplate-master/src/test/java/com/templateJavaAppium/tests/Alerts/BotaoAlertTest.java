package com.templateJavaAppium.tests.Alerts;

import com.templateJavaAppium.bases.TestBase;
import com.templateJavaAppium.pages.AlertsScreen;
import com.templateJavaAppium.pages.HomeScreen;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class BotaoAlertTest extends TestBase {

    HomeScreen homeScreen;
    AlertsScreen alertsScreen;

    @Test
    public void validaBotaoAlert()throws IOException,InterruptedException{
        homeScreen = new HomeScreen();
        alertsScreen = new AlertsScreen();
        String alert = "This is the alert message";
        homeScreen.ClicarMenu();
        alertsScreen.ClicarMenuAlert();
        alertsScreen.ClicarBotaoAlert();
        Assert.assertEquals(alert,(alertsScreen.validaTextoPopUpAlert()));
    }
}
