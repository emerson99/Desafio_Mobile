package com.templateJavaAppium.pages;
import com.templateJavaAppium.bases.PageBase;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;


public class LoginScreen extends PageBase
{


    @AndroidFindBy(xpath = "(//android.widget.TextView[@content-desc=\"Row Category Name\"])[8]")
    private MobileElement btnMenuLoginPage;

    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"toolbar title\"]")
    private MobileElement txtTituloLoginPage;

    @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc=\"Username Input Field\"]")
    private MobileElement lblUsername;

    @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc=\"Password Input Field\"]")
    private MobileElement lblPass;

    @AndroidFindBy(xpath = "//*[@class='android.widget.Button' and @text='LOGIN']")
    private MobileElement btnLogin;

    @AndroidFindBy(id = "login_alt_message_textView")
    private MobileElement lblInsucesso;


    @AndroidFindBy(xpath = "//*[@class='android.widget.Button' and @text='TRY AGAIN']")
    private MobileElement btnTRYAGAIN;

    @AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"Alt Message\"]")
    private MobileElement txtTryAgain;


    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.Button[1]")
    private MobileElement blnNoThanks;



    public void ClicarMenuLoginPage()
    {
        click(btnMenuLoginPage);
    }
    public void ClicarTryAgain()
    {
        click(btnTRYAGAIN);
    }
    public void ClicarLogin()
    {
        click(btnLogin);
    }
    public void ClicarNothanks()
    {
        click(blnNoThanks);
    }

    public String validaTituloLoginPage(){
        return getText(txtTituloLoginPage);
    }

    public String validaUser(){
        return getText1(lblUsername);
    }
    public String validaPass(){
        return getText2(lblPass);
    }

    public String validaMSGLoginInsucesso(){
        return getText(lblInsucesso);
    }


    public String validaTryAgain(){
        return getText(txtTryAgain);
    }
    public void DigitarUser(String user)
    {
        sendKeys(lblUsername,user);
    }
    public void DigitarPass(String pass)
    {
        sendKeys(lblPass,pass);
    }



}
