package org.example.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class D08_WishlistStepDef {

    P03_homePage p08wish = new P03_homePage();
    @When("user click at wihlist icon")
    public void add_Product_to_Wishlist() throws InterruptedException {
        p08wish.add_Wishlist().get(2).click();
        Thread.sleep(2000);
    }

    @Then("user should get success message with green background")
    public void get_Suceess()
    {
        SoftAssert sof = new SoftAssert();
        String actualResult = p08wish.success_Message().getText();
        String expectedResult = "The product has been added to your wishlist";
        // First Assert for success message
        sof.assertEquals(actualResult,expectedResult);
        // Second Assert for color
        String actualResult2 = p08wish.success_Message().getCssValue("background-color");
        String expectedResult2 = "(75, 176, 122, 1)";
        sof.assertEquals(actualResult2.contains(expectedResult2), true);
        sof.assertTrue(actualResult2.contains(expectedResult2));
    }

    @And("Wait success message to disappears")
    public void wiat()
    {
        WebElement successBar = p08wish.success_Message();
        //explicit wait
        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.invisibilityOf(successBar));

    }
    @When("Click at wishlist")
    public void open_Wish()
    {
        //Click at wishlist
        p08wish.open_Wishlist().click();
    }

    @Then("quantity of product should appears")
    public void check_Quantity()
    {
        // assert the qunaitity grater than 0
        String s = p08wish.get_quantity().getAttribute();
        int i = Integer.parseInt(s);
        SoftAssert sof = new SoftAssert();
        sof.assertEquals(i , i>0);

    }
}