package com.dotdashcom.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class IframePage extends BasePage {

    @FindBy(xpath = "//div[@aria-label='Close']")
    public WebElement closeIconButton;

    @FindBy(id = "mce_0_ifr")
    public WebElement iframeBox;

    @FindBy(tagName = "p")
    public WebElement txt_frame;

}
