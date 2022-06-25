package org.example.pages;

import org.example.stepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class P03_homePage {

    public WebElement openCurncyDropmenu()
    {

        return Hooks.driver.findElement(By.id("customerCurrency"));
    }

    public List <WebElement> productCurrency () {
        return (List<WebElement>) Hooks.driver.findElement(By.cssSelector("span[class=\"price actual-price\"]"));
    }

    public WebElement Search()
    {
        return Hooks.driver.findElement(By.id("small-searchterms"));
    }

    public WebElement SearchBtn()
    {
        return Hooks.driver.findElement(By.cssSelector("button[class=\"button-1 search-box-button\"]"));
    }

    public List<WebElement> checkProduct()
    {
        return Hooks.driver.findElements(By.cssSelector("h2[Class=\"product-title\"] a"));
    }

    public WebElement hover_Category()
    {
        return Hooks.driver.findElement(By.cssSelector("ul[Class=\top-menu notmobile\"] a[herf=\"/Computers\"]"));
    }
    public WebElement hover_Sub_Category()
    {
        return Hooks.driver.findElement(By.cssSelector("a[herf=\"/Desktop\"]"));
    }
    public WebElement select_Sub_Category()
    {
        return Hooks.driver.findElement(By.cssSelector("ul[Class=\top-menu notmobile\"] a[herf=\"/Desktops\"]"));
    }

    public WebElement select_First_Element()
    {
        return Hooks.driver.findElement(By.cssSelector("a[rel=\"/0\"]"));
    }
    public WebElement select_Second_Element()
    {
        return Hooks.driver.findElement(By.cssSelector("a[rel=\"/1\"]"));
    }

    public WebElement open_Facebook()
    {
        return Hooks.driver.findElement(By.cssSelector("a[herf=\"/http://www.facebook.com/nopCommerce\"]"));
    }
    public WebElement open_Twitter()
    {
        return Hooks.driver.findElement(By.cssSelector("a[herf=\"/https://twitter.com/nopCommerce\"]"));
    }
    public WebElement open_rss()
    {
        return Hooks.driver.findElement(By.cssSelector("a[herf=\"/https://demo.nopcommerce.com/news/rss/1\"]"));
    }
    public WebElement open_Youtube()
    {
        return Hooks.driver.findElement(By.cssSelector("a[herf=\"/http://www.youtube.com/user/nopCommerce\"]"));
    }

    public List<WebElement> add_Wishlist()
    {
        return Hooks.driver.findElements(By.className("add-to-wishlist-button"));
    }

    public WebElement success_Message()
    {
        return Hooks.driver.findElement(By.cssSelector("div[Class=\"bar-notification success\"]"));
    }

    public WebElement open_Wishlist()
    {
        return Hooks.driver.findElement(By.cssSelector("span[Class=\"wishlist-label\"]"));
    }

    public WebElement get_quantity()
    {
        return Hooks.driver.findElement(By.name("itemquantity11219"));
    }
}
