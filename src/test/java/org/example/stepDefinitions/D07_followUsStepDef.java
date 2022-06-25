package org.example.stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.testng.Assert;

import java.util.ArrayList;

public class D07_followUsStepDef {

    P03_homePage po7Follow = new P03_homePage();
    //Facebook
    @When("user opens facebook link")
    public void user_open_FB()
    {
        po7Follow.open_Facebook().click();
    }

    @Then("^\"([^\"]*)\" is opened in new tab$")
    public void open_new_tab () throws InterruptedException {
        Thread.sleep(2000);
        ArrayList Tabs = new ArrayList<>(Hooks.driver.getWindowHandles());

        Hooks.driver.switchTo().window(Tabs.get(1));

        System.out.println(Hooks.driver.getCurrentUrl());
        System.out.println(Hooks.driver.getTitle());
        Assert.assertEquals(Hooks.driver.getCurrentUrl(),"https://www.facebook.com/nopCommerce");
        Hooks.driver.close();
        Hooks.driver.switchTo().window(Tabs.get(0));
        System.out.println(Hooks.driver.getCurrentUrl());
        System.out.println(Hooks.driver.getTitle());
    }

    //Twitter
    @When("user opens twitter link")
    public void user_open_Twitter()
    {
        po7Follow.open_Twitter().click();
    }

    @Then("^\"([^\"]*)\" is opened in new tab$")
    public void open_new_tab () throws InterruptedException {
        Thread.sleep(2000);
        ArrayList Tabs = new ArrayList<>(Hooks.driver.getWindowHandles());

        Hooks.driver.switchTo().window(Tabs.get(1));

        System.out.println(Hooks.driver.getCurrentUrl());
        System.out.println(Hooks.driver.getTitle());
        Assert.assertEquals(Hooks.driver.getCurrentUrl(),"https://twitter.com/nopCommerce");
        Hooks.driver.close();
        Hooks.driver.switchTo().window(Tabs.get(0));
        System.out.println(Hooks.driver.getCurrentUrl());
        System.out.println(Hooks.driver.getTitle());
    }

    //RSS
    @When("user opens rss link")
    public void user_open_rss()
    {
        po7Follow.open_rss().click();
    }

    @Then("^\"([^\"]*)\" is opened in new tab$")
    public void open_new_tab () throws InterruptedException {
        Thread.sleep(2000);
        ArrayList Tabs = new ArrayList<>(Hooks.driver.getWindowHandles());

        Hooks.driver.switchTo().window(Tabs.get(1));

        System.out.println(Hooks.driver.getCurrentUrl());
        System.out.println(Hooks.driver.getTitle());
        Assert.assertEquals(Hooks.driver.getCurrentUrl(),"https://demo.nopcommerce.com/new-online-store-is-open");
        Hooks.driver.close();
        Hooks.driver.switchTo().window(Tabs.get(0));
        System.out.println(Hooks.driver.getCurrentUrl());
        System.out.println(Hooks.driver.getTitle());
    }

    //Youtube
    @When("user opens youtube link")
    public void user_open_youtube()
    {
        po7Follow.open_Youtube().click();
    }

    @Then("^\"([^\"]*)\" is opened in new tab$")
    public void open_new_tab () throws InterruptedException {
        Thread.sleep(2000);
        ArrayList Tabs = new ArrayList<>(Hooks.driver.getWindowHandles());

        Hooks.driver.switchTo().window(Tabs.get(1));

        System.out.println(Hooks.driver.getCurrentUrl());
        System.out.println(Hooks.driver.getTitle());
        Assert.assertEquals(Hooks.driver.getCurrentUrl(),"https://www.youtube.com/user/nopCommerce");
        Hooks.driver.close();
        Hooks.driver.switchTo().window(Tabs.get(0));
        System.out.println(Hooks.driver.getCurrentUrl());
        System.out.println(Hooks.driver.getTitle());
    }


}
