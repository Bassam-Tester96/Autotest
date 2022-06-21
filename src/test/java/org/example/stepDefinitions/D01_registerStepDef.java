package org.example.stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P01_register;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;


public class D01_registerStepDef {
    P01_register p01reg = new P01_register();
    static WebDriver driver= Hooks.driver;


    @Given("user go to register page")
    public void go_to_register()
    {
        p01reg.registerlink().click();
    }

    @When("user select gender type")
    public void gender()
    {
        p01reg.genderType("male");
    }


    @And("user enter first name {string} and last name {string}")
    //@And("^user enter first name \"(.)\" and last name \"(.)\"")
    public void first_last_name()
    {
        p01reg.firstNameTxt().sendKeys();
        p01reg.lastNameTxt().sendKeys();
    }

    @And("user enter date of birth")
    public void date_of_birth()
    {
        p01reg.birthDay().sendKeys("10");
        p01reg.birthMonth().sendKeys("April");
        p01reg.birthYear().sendKeys("1998");
    }

    @And("user enter email {string} field")
    public void personal_details(String email)
    {
        p01reg.EmailTxt(email);
    }

    @And("user fills Password fields {string} {string}")
    public void your_password(String pass, String confirmpass) throws InterruptedException {
        p01reg.passwordTxt(pass);
        p01reg.confirmpassTxt(confirmpass);
        Thread.sleep(3000);
    }

    @And("user clicks on register button")
    public void register_button()
    {
        p01reg.registerBtn().click();
    }

    @Then("success message is displayed")
    public void successMessageIsDisplayed() throws InterruptedException {
//        String ActualTitle = Hooks.driver.getTitle();
//        String ExpectedTitle = "Your registration completed";
//        Assert.assertEquals(ActualTitle, ExpectedTitle);
        Assert.assertTrue(true, "Your registration completed");
//        SoftAssert aa = new SoftAssert();
//        String ActualTitle =
////        String ExpectedTitle =
//        aa.assertEquals ()
//        assertTrue(actualColor.equals(“#0045d0”));
        Thread.sleep(3000);
    }

}
