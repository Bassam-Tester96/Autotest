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
        p01reg.genderType("male").click();
    }


    //@And("user enter first name {string} and last name {string}")
    @And("^user enter first name \"(.*)\" and last name \"(.*)\"$")
    public void first_last_name(String FirstName , String LastName)
    {
        p01reg.firstNameTxt().sendKeys(FirstName);
        p01reg.lastNameTxt().sendKeys(LastName);
    }

    @And("user enter date of birth")
    public void date_of_birth()
    {
        p01reg.birthDay().sendKeys("10");
        p01reg.birthMonth().sendKeys("April");
        p01reg.birthYear().sendKeys("1998");
    }

    @And("^user enter email \"(.*)\" field$")
    public void personal_details(String email)
    {
        p01reg.EmailTxt(email).sendKeys(email);
    }

    @And("user fills Password fields {string} {string}")
    public void your_password(String pass, String confirmpass) throws InterruptedException {
        p01reg.passwordTxt(pass).sendKeys(pass);
        p01reg.confirmpassTxt(confirmpass).sendKeys(pass);
        Thread.sleep(3000);
    }

    @And("user clicks on register button")
    public void register_button()
    {
        p01reg.registerBtn().click();
    }

    @Then("success message is displayed")
    public void successMessageIsDisplayed() {
        SoftAssert sof = new SoftAssert();
        // First Assert Message
        String actualResult = p01reg.result().getText();
        String expectedResult = "Your registration completed";
        //sof.assertEquals(actualResult.contains(expectedResult), true);
        sof.assertTrue(actualResult.contains(expectedResult));

        // Second Assert for color !Need Help!
        String actualResult2 = p01reg.result().getCssValue("color");
        String expectedResult2 = "(76, 177, 124, 1)";
        sof.assertEquals(actualResult2.contains(expectedResult2), true);
        sof.assertTrue(actualResult2.contains(expectedResult2));

        //Assert All
        sof.assertAll();
    }

}
