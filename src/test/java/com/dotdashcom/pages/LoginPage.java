package com.dotdashcom.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class LoginPage extends BasePage{


    @FindBy(id = "username")
    public WebElement txt_username;

    @FindBy(id = "password")
    public WebElement txt_password;


    @FindBy(css = ".radius")
    public WebElement btn_login;



}
