package com.templateJavaAppium.tests.Login;
import com.templateJavaAppium.bases.DataDriveUtil;
import com.templateJavaAppium.bases.TestBase;
import com.templateJavaAppium.pages.HomeScreen;
import com.templateJavaAppium.pages.LoginScreen;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;

public class TituloLoginTests extends TestBase {

    HomeScreen homeScreen;
    LoginScreen loginScreen;

    private String sTestCaseName;
    private int iTestCaseRow;

    @Test
    public void validaTituloLoginPage() {
        homeScreen = new HomeScreen();
        loginScreen = new LoginScreen();
        String Titulo = "Login Page";
        homeScreen.ClicarMenu();
        loginScreen.ClicarMenuLoginPage();
        Assert.assertEquals(Titulo,(loginScreen.validaTituloLoginPage()));
    }

}
