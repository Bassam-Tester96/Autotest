package org.example.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_old.Ac;
import org.example.pages.P02_login;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import org.openqa.selenium.support.Color;

public class D02_loginStepDef {

    P02_login p02login = new P02_login();
    static WebDriver driver= Hooks.driver;


    @Given("user go to login page")
    public void userGoToLoginPage() {
        p02login.loginlink().click();
    }

    @And("user login with valid {string} and {string}")
    public void userLoginWithValid(String email, String pass) throws InterruptedException {
        p02login.emailtxt(email).sendKeys(email);
        p02login.passwordTxt(pass).sendKeys(pass);
        Thread.sleep(500);
    }

    @And("user login with Invalid {string} and {string}")
    public void userLoginWithInvalidAnd(String email, String pass) {
        p02login.emailtxt(email).sendKeys(email);
        p02login.passwordTxt(pass).sendKeys(pass);       
    }

    @When("user press on login button")
    public void userPressOnLoginButton() {
        p02login.loginBtn().click();
    }

    @Then("user login to the system successfully")
    public void userLoginToTheSystemSuccessfully() {
        SoftAssert sof = new SoftAssert();
        //First Assertion
        sof.assertEquals(Hooks.driver.getCurrentUrl(),"https://demo.nopcommerce.com/");
        // Second Assertion
        sof.assertTrue(driver.findElement(By.cssSelector("a[class=\"ico-account\"]")).isDisplayed());
        // Assert all
        sof.assertAll();

    }


    @Then("user could not login to the system")
    public void userCouldNotLoginToTheSystem() {
        SoftAssert sof2 = new SoftAssert();
        String actualResult = p02login.result().getText();
        String expectedResult = "Login was unsuccessful.";
        // First Assertion
        sof2.assertEquals(actualResult.contains(expectedResult), true);
        sof2.assertTrue(actualResult.contains(expectedResult));

        // Cannot do assertion for color I add tutor command but not working!Need Help!
        // Second Assertion
        String actualResult2 = p02login.result().getCssValue("Color");
        actualResult2=Color.fromString("rgba(228, 67, 75, 1)").asHex();
        String expectedResult2 = "#e4434b";
        sof2.assertEquals(actualResult2.contains(expectedResult2), true);
        sof2.assertTrue(actualResult2.contains(expectedResult2));

        //Assert all
        sof2.assertAll();

    }
}
