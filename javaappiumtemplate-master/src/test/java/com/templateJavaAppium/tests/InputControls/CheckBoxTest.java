package com.templateJavaAppium.tests.InputControls;

import com.templateJavaAppium.bases.TestBase;
import com.templateJavaAppium.pages.HomeScreen;
import com.templateJavaAppium.pages.InputControlsScreen;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class CheckBoxTest extends TestBase {
    HomeScreen homeScreen;
    InputControlsScreen inputControlsScreen;

    @Test
    public void validaCheckbox()throws IOException,InterruptedException{
        homeScreen = new HomeScreen();
        inputControlsScreen = new InputControlsScreen();
        String txtCheckedDisplay2 = "Checked";
        homeScreen.ClicarMenu();
        inputControlsScreen.ClicarMenuInput();
        inputControlsScreen.ClicarMenuCheckBox();
        inputControlsScreen.ClicarNoCheckBox();
        Assert.assertEquals(txtCheckedDisplay2,(inputControlsScreen.validaCheckedDisplay()));
    }
}
