package com.dotdashcom.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UploadPage extends BasePage{

    @FindBy(id = "file-upload")
    public WebElement chooseFile;

    @FindBy(id = "file-submit")
    public WebElement btn_upload;

    @FindBy(id = "uploaded-files")
    public WebElement uploadedFile;



}



















