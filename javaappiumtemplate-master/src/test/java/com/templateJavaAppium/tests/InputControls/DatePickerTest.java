package com.templateJavaAppium.tests.InputControls;

import com.templateJavaAppium.bases.TestBase;
import com.templateJavaAppium.pages.HomeScreen;
import com.templateJavaAppium.pages.InputControlsScreen;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class DatePickerTest extends TestBase {
    HomeScreen homeScreen;
    InputControlsScreen inputControlsScreen;


    @Test
    public void validaDatePicker()throws IOException,InterruptedException{
        homeScreen = new HomeScreen();
        inputControlsScreen = new InputControlsScreen();
        String DatePickerDisplay = "7/6/1994";
        homeScreen.ClicarMenu();
        inputControlsScreen.ClicarMenuInput();
        inputControlsScreen.ClicarMenuCheckBox();
        inputControlsScreen.ClicarMenuRadioButton();
        inputControlsScreen.ClicarMenuToggleButton();
        inputControlsScreen.ClicarMenuSpinner();
        inputControlsScreen.ClicarMenuPullToRefresh();
        inputControlsScreen.ClicarMenuTimePicker();
        inputControlsScreen.ClicarMenuDatePicker();
        inputControlsScreen.ClicarDataPicker();
        Assert.assertEquals(DatePickerDisplay,(inputControlsScreen.validaDatePickerDisplay()));
    }

}
