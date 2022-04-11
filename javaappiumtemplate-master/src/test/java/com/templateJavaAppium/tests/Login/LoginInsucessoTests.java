package com.templateJavaAppium.tests.Login;
import com.templateJavaAppium.bases.DataDriveUtil;
import com.templateJavaAppium.bases.TestBase;
import com.templateJavaAppium.pages.HomeScreen;
import com.templateJavaAppium.pages.LoginScreen;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;

public class LoginInsucessoTests extends TestBase {

    HomeScreen homeScreen;
    LoginScreen loginScreen;

    private String sTestCaseName;
    private int iTestCaseRow;

    //Deixei apenas o teste de Insucesso,porque não a uma fazer de fazer o de Sucesso no app conforme ate me disseram no E-mail
    @Test(dataProvider = "search")
    public void realizaLoginInsucesso(String login, String password) throws IOException,InterruptedException {
        homeScreen = new HomeScreen();
        loginScreen = new LoginScreen();
        String msg = "You gave me the wrong username and password";
        homeScreen.ClicarMenu();
        loginScreen.ClicarMenuLoginPage();
        loginScreen.DigitarUser(login);
        loginScreen.DigitarPass(password);
        loginScreen.ClicarLogin();
       // loginScreen.ClicarNothanks(); Deixei comentado porque as vezes o app pede pra salvar a senha depois ele para
        Assert.assertEquals(msg,(loginScreen.validaMSGLoginInsucesso()));


    }
    @DataProvider
    public Object[][] search() throws Exception{

        // Setting up the Test Data Excel file

        DataDriveUtil.setExcelFile(System.getProperty("user.dir")+"\\src\\test\\java\\com\\templateJavaAppium\\utils\\DadosExcel.xlsx","Planilha1");

        sTestCaseName = this.toString();

        // From above method we get long test case name including package and class name etc.

        // The below method will refine your test case name, exactly the name use have used

        sTestCaseName = DataDriveUtil.getTestCaseName(this.toString());

        // Fetching the Test Case row number from the Test Data Sheet

        // Getting the Test Case name to get the TestCase row from the Test Data Excel sheet

        iTestCaseRow = DataDriveUtil.getRowContains(sTestCaseName,0);


        Object[][] testObjArray = DataDriveUtil.getTableArray(System.getProperty("user.dir")+"\\src\\test\\java\\com\\templateJavaAppium\\utils\\DadosExcel.xlsx","Planilha1",iTestCaseRow);

        return (testObjArray);

    }



}
