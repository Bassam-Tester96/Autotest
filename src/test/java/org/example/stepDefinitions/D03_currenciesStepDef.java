package org.example.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.eo.Se;
import io.cucumber.messages.types.Hook;
import org.example.pages.P03_homePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class D03_currenciesStepDef {

    P03_homePage p03Curr= new P03_homePage();
    
    @Given("User open Currency dropdown menu")
    public void openCurrencyMenu()
    {
        p03Curr.openCurncyDropmenu().click();
    }

    @When("User click Euro currency")
    public void userClickEuroCurrency()
    {
        Select drp = new Select(p03Curr.Search());
        drp.selectByVisibleText("Euro");
    }

    @Then("All page currencies should changed to Euro")
    public void allPageCurrenciesShouldChangedToEuro()
    {
        int count = p03Curr.productCurrency().size();
        for (int i=0 ; i<count ; i++)
        {
            String text = p03Curr.productCurrency().get(i).getText();
            Assert.assertTrue(text.contains("€"));
        }
    }
}
