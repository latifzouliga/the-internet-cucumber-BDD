package com.dotdashcom.stepDefs;

import com.dotdashcom.pages.UploadPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class UploadStepDefs {

    UploadPage uploadPage = new UploadPage();

    String file = "some-file.txt";
    @When("user Upload Button or Drag and Drop to upload a file")
    public void user_upload_button_or_drag_and_drop_to_upload_a_file() {
        uploadPage.chooseFile.sendKeys("/Users/zouliga/Downloads/"+file);
        uploadPage.btn_upload.click();
    }
    @Then("file is uploaded")
    public void file_is_uploaded() {
        String uploadedFile = uploadPage.uploadedFile.getText();
        Assert.assertEquals(uploadedFile,file);
    }


}

















