package com.templateJavaAppium.tests.InputControls;

import com.templateJavaAppium.bases.TestBase;
import com.templateJavaAppium.pages.HomeScreen;
import com.templateJavaAppium.pages.InputControlsScreen;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class ToggleTest extends TestBase {
    HomeScreen homeScreen;
    InputControlsScreen inputControlsScreen;


    @Test
    public void validaToggleButtonOFF()throws IOException,InterruptedException{
        homeScreen = new HomeScreen();
        inputControlsScreen = new InputControlsScreen();
        String ToggleOFF = "OFF";
        homeScreen.ClicarMenu();
        inputControlsScreen.ClicarMenuInput();
        inputControlsScreen.ClicarMenuCheckBox();
        inputControlsScreen.ClicarMenuRadioButton();
        inputControlsScreen.ClicarMenuToggleButton();
        Assert.assertEquals(ToggleOFF,(inputControlsScreen.validaSwitchDisplay()));
    }
    @Test
    public void validaToggleButtonON()throws IOException,InterruptedException{
        homeScreen = new HomeScreen();
        inputControlsScreen = new InputControlsScreen();
        String ToggleON = "ON";
        homeScreen.ClicarMenu();
        inputControlsScreen.ClicarMenuInput();
        inputControlsScreen.ClicarMenuCheckBox();
        inputControlsScreen.ClicarMenuRadioButton();
        inputControlsScreen.ClicarMenuToggleButton();
        inputControlsScreen.ClicarEmToggleButton();
        Assert.assertEquals(ToggleON,(inputControlsScreen.validaSwitchDisplay()));
    }


}
