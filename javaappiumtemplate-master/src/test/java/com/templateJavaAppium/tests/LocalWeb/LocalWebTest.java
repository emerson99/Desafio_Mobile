package com.templateJavaAppium.tests.LocalWeb;

import com.templateJavaAppium.bases.TestBase;
import com.templateJavaAppium.pages.HomeScreen;
import com.templateJavaAppium.pages.LocalWebScreen;
import com.templateJavaAppium.pages.LoginScreen;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LocalWebTest extends TestBase {
    HomeScreen homeScreen;
    LocalWebScreen localWebScreen;

    @Test
    public void validaLocalWeb() {
        homeScreen = new HomeScreen();
        localWebScreen = new LocalWebScreen();
        String user = "emerson";
        String pass = "rodrigues";
        String resul = "Hello! Seattle Washington";
        homeScreen.ClicarMenu();
        localWebScreen.ClicarMenuLocalWeb();
        localWebScreen.LimparUser();
        localWebScreen.DigitarUser(user);
        localWebScreen.LimparPass();
        localWebScreen.DigitarPass(pass);
        Assert.assertEquals(resul,(localWebScreen.validaLocalWeb()));
    }






}
