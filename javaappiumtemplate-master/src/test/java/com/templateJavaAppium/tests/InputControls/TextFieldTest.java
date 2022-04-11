package com.templateJavaAppium.tests.InputControls;

import com.templateJavaAppium.bases.TestBase;
import com.templateJavaAppium.pages.HomeScreen;
import com.templateJavaAppium.pages.InputControlsScreen;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class TextFieldTest extends TestBase {
    HomeScreen homeScreen;
    InputControlsScreen inputControlsScreen;

    @Test
    public void validaTextField()throws IOException,InterruptedException{
        homeScreen = new HomeScreen();
        inputControlsScreen = new InputControlsScreen();
        String TextField = "Desafio";
        String Tiutlo = "Input Controls";
        homeScreen.ClicarMenu();
        inputControlsScreen.ClicarMenuInput();
        inputControlsScreen.DigitarTextField(TextField);
        Assert.assertEquals(TextField,(inputControlsScreen.validaTextoDigitadoTextField()));
    }

}
