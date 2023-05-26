package com.dotdashcom.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class DropdownPage extends BasePage{


    @FindBy(id = "dropdown")
    public WebElement dropdown;



    public void selectAnOption(String option){
        Select select = new Select(dropdown);
        select.selectByVisibleText(option);

    }

    public String getFirstSelectedOption_AsString(){
        Select select = new Select(dropdown);
       return select.getFirstSelectedOption().getText();

    }



}
