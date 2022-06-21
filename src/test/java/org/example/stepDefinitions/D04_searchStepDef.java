package org.example.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;

public class D04_searchStepDef {


    @Given("User navigate to Homepage")
    public void navigate()
    {
        Hooks.driver.navigate().to("https://demo.nopcommerce.com/");
    }

    @When("user click at search field")
    public void click_on_search()
    {
        Hooks.driver.findElement(By.id("small-searchterms")).click();
    }

    @And("User search with name of product {string}")
    public void userSearchWithNameOfProduct(String arg0)
    {
        Hooks.driver.findElement(By.id("small-searchterms")).sendKeys("book");
        Hooks.driver.findElement(By.cssSelector("button[class=\"button-1 search-box-button\"]")).click();
    }
    @And("User search with SKU of product {string}")
    public void search_for_product_sku(String sku) throws InterruptedException {
        Hooks.driver.findElement(By.id("small-searchterms")).sendKeys("book");
        Thread.sleep(2000);
        Hooks.driver.findElement(By.cssSelector("button[class=\"button-1 search-box-button\"]")).click();
        Thread.sleep(3000);
    }


    @Then("user could find relative products")
    public void get_data()
    {
        int count = Hooks.driver.findElements(By.cssSelector("h2[Class=\"product-title\"] a")).size();
        //ArrayList <String> productlist =new ArrayList <String> ();
        Assert.assertTrue(count>0);

        for (int i =0 ; i< count ; i++)
        {
            System.out.println(Hooks.driver.findElements(By.cssSelector("h2[Class=\"product-title\"] a")).get(i).getText());
            //productlist.add(driver.findElements(By.cssSelector("h2[Class=\"product-title\"] a")).get(i).getText());
            Assert.assertTrue(Hooks.driver.findElements(By.cssSelector("h2[Class=\"product-title\"] a")).get(i).getText().toLowerCase().contains("book"));
        }
    }



}
