package com.dotdashcom.pages;

import com.dotdashcom.utility.ConfigurationReader;
import com.dotdashcom.utility.Driver;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    public BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public void navigateTo(String page){
        Driver.getDriver().get(ConfigurationReader.getProperty("url") + page);
    }

}
