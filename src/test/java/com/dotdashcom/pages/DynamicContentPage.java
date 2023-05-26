package com.dotdashcom.pages;

import com.dotdashcom.utility.Driver;
import org.openqa.selenium.By;


public class DynamicContentPage extends BasePage{



    public String getParagraphAsString(int number){

        String element = "(//div[@class='large-2 columns']/following-sibling::div)["+number+"]";
        return Driver.getDriver().findElement(By.xpath(element)).getText();
    }


}
