package org.example.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class D04_searchStepDef {

    P03_homePage p04search = new P03_homePage();
    @Given("user click at search field")
    public void click_on_search()
    {
        p04search.Search().click();
    }

    @When("User search with name of product \"(.*)\"$")
    public void userSearchWithNameOfProduct(String pname)
    {
        p04search.Search().sendKeys(pname);
        p04search.SearchBtn().click();
    }
    @When("User search with SKU of product \"(.*)\"$")
    public void search_for_product_sku(String sku)  {
        p04search.Search().sendKeys(sku);
        p04search.SearchBtn().click();
    }


    @Then("user could find relative products")
    public void get_data()
    {
        SoftAssert sof = new SoftAssert();
        int count = p04search.checkProduct().size();
        // Assert Result as I don't know as it's true or no
        sof.assertTrue(count>0);
        for (int i =0 ; i< count ; i++)
        {
            System.out.println(p04search.checkProduct().get(i).getText());
            sof.assertTrue(p04search.checkProduct().get(i).getText().toLowerCase().contains("book"));
        }
        // I want to make other one for SKU assert en hya btgyeeb product wa7ed bs w ad5ol gwah ashoof l sku sa7 !!!
        // Assert url
        sof.assertTrue(Hooks.driver.getCurrentUrl().contains("nopCommerce demo store. Search"));
        sof.assertAll();
    }



}
