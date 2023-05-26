package com.dotdashcom.pages;

import com.dotdashcom.utility.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class HoversPage extends BasePage{


    public void hoverOverImage(int number){
        String imageElement = "(//h5/../..)[" + number + "]";
        WebElement element = Driver.getDriver().findElement(By.xpath(imageElement));

        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(element).pause(3).perform();

    }

    public String getImageInfo(int number){
        String textElement = "(//h5/../h5)["+number+"]";
        return Driver.getDriver().findElement(By.xpath(textElement)).getText();
    }
}
