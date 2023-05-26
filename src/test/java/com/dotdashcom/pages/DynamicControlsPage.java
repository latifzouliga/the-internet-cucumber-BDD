package com.dotdashcom.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class DynamicControlsPage extends BasePage{


    @FindBy(id = "checkbox")
    public WebElement checkbox;

    @FindBy(xpath = "//button[.='Remove']")
    public WebElement btn_remove;

    @FindBy(xpath = "//button[.='Add']")
    public WebElement btn_add;

    @FindBy(xpath = "//button[.='Enable']")
    public WebElement btn_enable;

    @FindBy(xpath = "//button[.='Disable']")
    public WebElement btn_disable;

    @FindBy(id = "loading")
    public WebElement dynamicBar;

    @FindBy(id = "message")
    public WebElement message;

    @FindBy(css = "#input-example > input")
    public WebElement textBox;

}
