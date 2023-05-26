package com.dotdashcom.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class DynamicLoadingPage extends BasePage {



    @FindBy(css = "#start > button")
    public WebElement btn_start;

    @FindBy(xpath = "//h4[.='Hello World!']")
    public WebElement helloWordHeader;

    @FindBy(css = ".example > #loading")
    public WebElement loadingBar;

}
