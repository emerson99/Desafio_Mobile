package com.templateJavaAppium.tests.InputControls;

import com.templateJavaAppium.bases.TestBase;
import com.templateJavaAppium.pages.HomeScreen;
import com.templateJavaAppium.pages.InputControlsScreen;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class PullToRefreshTest extends TestBase {
    HomeScreen homeScreen;
    InputControlsScreen inputControlsScreen;

    @Test
    public void validaPullToRefresh()throws IOException,InterruptedException{
        homeScreen = new HomeScreen();
        inputControlsScreen = new InputControlsScreen();
        String RefreshTime = "Pull to refresh time";
        homeScreen.ClicarMenu();
        inputControlsScreen.ClicarMenuInput();
        inputControlsScreen.ClicarMenuCheckBox();
        inputControlsScreen.ClicarMenuRadioButton();
        inputControlsScreen.ClicarMenuToggleButton();
        inputControlsScreen.ClicarMenuSpinner();
        inputControlsScreen.ClicarMenuPullToRefresh();
        Assert.assertEquals(RefreshTime,(inputControlsScreen.validaRefreshDisplayTime()));
    }

}
