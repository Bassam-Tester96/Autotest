package org.example.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.SoftAssert;

public class D05_hoverCategoriesStepDef {

    P03_homePage p05hover = new P03_homePage();
    @When("user hover at main category and click at sub-Category")
    public void hover_category() throws InterruptedException {
        Actions action = new Actions(Hooks.driver);
        WebElement computer = p05hover.hover_Category();
        action.moveToElement(computer).perform();
        Thread.sleep(3000);
        p05hover.hover_Sub_Category().click();
    }

    @Then("Product display as selected category")
    public void display_Product()
    {
        SoftAssert sof =new SoftAssert();
        //M7tag a3ml assert en l Title is the same like subcategory name
        WebElement desktops = p05hover.select_Sub_Category();
        String subCategoryName = desktops.getText().toLowerCase().trim();

        //Assert
        sof.assertEquals(Hooks.driver.getCurrentUrl(),"https://demo.nopcommerce.com/desktops");
    }

}
