package com.templateJavaAppium.tests.LocalWeb;

import com.templateJavaAppium.bases.TestBase;
import com.templateJavaAppium.pages.HomeScreen;
import com.templateJavaAppium.pages.LocalWebScreen;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TituloLocalWebTest extends TestBase {
    HomeScreen homeScreen;
    LocalWebScreen localWebScreen;

    @Test
    public void validaTituloLocalWeb() {
        homeScreen = new HomeScreen();
        localWebScreen = new LocalWebScreen();
        String Titulo = "Local Web View";
        homeScreen.ClicarMenu();
        localWebScreen.ClicarMenuLocalWeb();
       Assert.assertEquals(Titulo,(localWebScreen.validaTituloLocalWeb()));
    }

}
