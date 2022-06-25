package org.example.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.pages.P03_homePage;
import org.testng.asserts.SoftAssert;

import javax.annotation.concurrent.ThreadSafe;

public class D06_homeSlidersStepDef {

    P03_homePage p06Slider = new P03_homePage();
    @Given("User Click at first slider")
    public void select_First_Slider()
    {
        p06Slider.select_First_Element().click();
    }

    @Then("User should redirect to url for first slider")
    public void verfiy_link1()
    {
        SoftAssert sof = new SoftAssert();
        String actualResult = "https://demo.nopcommerce.com/nokia-lumia-1020";
        String expectedResult = Hooks.driver.getCurrentUrl();
        sof.assertEquals(actualResult,expectedResult);
        sof.assertAll();
    }

    @Given("User Click at second slider")
    public void select_Second_Slider()
    {
        p06Slider.select_Second_Element().click();
    }

    @Then("User should redirect to url for second slider")
    public void verfiy_link2()
    {
        SoftAssert sof = new SoftAssert();
        String actualResult = "hhttps://demo.nopcommerce.com/iphone-6";
        String expectedResult = Hooks.driver.getCurrentUrl();
        sof.assertEquals(actualResult,expectedResult);
        sof.assertAll();
    }

}
