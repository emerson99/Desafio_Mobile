package com.templateJavaAppium.tests.Fixtures;

import com.templateJavaAppium.bases.TestBase;
import com.templateJavaAppium.pages.FixturesScreen;
import com.templateJavaAppium.pages.HomeScreen;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TituloFixturesTest extends TestBase {
    HomeScreen homeScreen;
    FixturesScreen fixturesScreen;

    @Test
    public void validaTituloFixtures() {
        homeScreen = new HomeScreen();
        fixturesScreen = new FixturesScreen();
        String Titulo = "Fixtures";
        homeScreen.ClicarMenu();
        fixturesScreen.ClicarMenuFixtures();
        Assert.assertEquals(Titulo,(fixturesScreen.validaTituloMenuFixtures()));
    }
}
