package com.templateJavaAppium.tests.InputControls;

import com.templateJavaAppium.bases.TestBase;
import com.templateJavaAppium.pages.HomeScreen;
import com.templateJavaAppium.pages.InputControlsScreen;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class TimePickerTest extends TestBase {
    HomeScreen homeScreen;
    InputControlsScreen inputControlsScreen;


    @Test
    public void validaTimePicker()throws IOException,InterruptedException{
        homeScreen = new HomeScreen();
        inputControlsScreen = new InputControlsScreen();
        String TimepickerDisplay = "Select a time";
        homeScreen.ClicarMenu();
        inputControlsScreen.ClicarMenuInput();
        inputControlsScreen.ClicarMenuCheckBox();
        inputControlsScreen.ClicarMenuRadioButton();
        inputControlsScreen.ClicarMenuToggleButton();
        inputControlsScreen.ClicarMenuSpinner();
        inputControlsScreen.ClicarMenuPullToRefresh();
        inputControlsScreen.ClicarMenuTimePicker();
        Assert.assertEquals(TimepickerDisplay,(inputControlsScreen.validaTimepickerDisplay()));
    }

}
