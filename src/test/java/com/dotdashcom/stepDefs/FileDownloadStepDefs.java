package com.dotdashcom.stepDefs;

import com.dotdashcom.pages.FileDownloadPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.io.File;

public class FileDownloadStepDefs {

    FileDownloadPage fileDownload = new FileDownloadPage();
    @When("user clicks on the file")
    public void user_clicks_on_the_file() throws InterruptedException {
        fileDownload.fileDownload.click();
        Thread.sleep(3000);
    }
    @Then("file should be downloaded")
    public void file_should_be_downloaded() throws InterruptedException {
        //File file = new File(System.getProperty("user.home"),"/Downlands/some-file.txt");
        File file = new File("/Users/zouliga/Downloads/some-file.txt");
        System.out.println(file.getPath());
        Assert.assertTrue(file.exists());
        Thread.sleep(3000);
    }
}
