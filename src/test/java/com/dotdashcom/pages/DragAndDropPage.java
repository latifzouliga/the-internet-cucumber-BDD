package com.dotdashcom.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DragAndDropPage extends BasePage{



    @FindBy(id = "column-a")

    public WebElement boxA;

    @FindBy(id = "column-b")
    public WebElement boxB;

}
