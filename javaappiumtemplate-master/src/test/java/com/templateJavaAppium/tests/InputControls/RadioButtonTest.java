package com.templateJavaAppium.tests.InputControls;

import com.templateJavaAppium.bases.TestBase;
import com.templateJavaAppium.pages.HomeScreen;
import com.templateJavaAppium.pages.InputControlsScreen;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class RadioButtonTest extends TestBase {
    HomeScreen homeScreen;
    InputControlsScreen inputControlsScreen;


    @Test
    public void validaRadioButtonAmazonEWeb()throws IOException,InterruptedException{
        homeScreen = new HomeScreen();
        inputControlsScreen = new InputControlsScreen();
        String radio = "Amazon";
        homeScreen.ClicarMenu();
        inputControlsScreen.ClicarMenuInput();
        inputControlsScreen.ClicarMenuCheckBox();
        inputControlsScreen.ClicarMenuRadioButton();
        inputControlsScreen.ClicarRadioWeb();
        inputControlsScreen.ClicarRadioAmazon();
        Assert.assertEquals(radio,(inputControlsScreen.validaRadioDisplay()));
    }
    @Test
    public void validaRadioButtonServices()throws IOException,InterruptedException{
        homeScreen = new HomeScreen();
        inputControlsScreen = new InputControlsScreen();
        String radio3 = "Services";
        homeScreen.ClicarMenu();
        inputControlsScreen.ClicarMenuInput();
        inputControlsScreen.ClicarMenuCheckBox();
        inputControlsScreen.ClicarMenuRadioButton();
        inputControlsScreen.ClicarRadioServices();
        Assert.assertEquals(radio3,(inputControlsScreen.validaRadioDisplay()));
    }

}
