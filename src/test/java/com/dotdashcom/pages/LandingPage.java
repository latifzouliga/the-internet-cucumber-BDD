package com.dotdashcom.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class LandingPage extends BasePage {


    @FindBy(css = "#flash")
    public WebElement loginMessage;

}
