package com.templateJavaAppium.tests.InputControls;

import com.templateJavaAppium.bases.TestBase;
import com.templateJavaAppium.pages.HomeScreen;
import com.templateJavaAppium.pages.InputControlsScreen;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class SpinnerTest extends TestBase {
    HomeScreen homeScreen;
    InputControlsScreen inputControlsScreen;


    @Test
    public void validaSpinner()throws IOException,InterruptedException{
        homeScreen = new HomeScreen();
        inputControlsScreen = new InputControlsScreen();
        String Option1 = "Selected: option 1";
        homeScreen.ClicarMenu();
        inputControlsScreen.ClicarMenuInput();
        inputControlsScreen.ClicarMenuCheckBox();
        inputControlsScreen.ClicarMenuRadioButton();
        inputControlsScreen.ClicarMenuToggleButton();
        inputControlsScreen.ClicarMenuSpinner();
        inputControlsScreen.ClicarEmSpinnerControl();
        inputControlsScreen.ClicarEmOption1();
        Assert.assertEquals(Option1,(inputControlsScreen.validaSpinnerDisplay()));

    }

}
