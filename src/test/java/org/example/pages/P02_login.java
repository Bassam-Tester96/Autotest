package org.example.pages;

import org.example.stepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P02_login {

    public WebElement loginlink()
    {
        return Hooks.driver.findElement(By.cssSelector("a[href=\"/login?returnUrl=%2F\"]"));
    }

    public WebElement emailtxt(String email)
    {

        return  Hooks.driver.findElement(By.id("Email"));
    }

    public WebElement passwordTxt(String pass)
    {
        return  Hooks.driver.findElement(By.id("Password"));
    }

    public WebElement loginBtn()
    {
        return  Hooks.driver.findElement(By.cssSelector("div[class=\"button-1 login-button\"]"));
    }

    public WebElement result()
    {
        // Note : m7tag a3rf l color 3shan a3mmlo assert fl step definition
        //Hooks.driver.findElement(By.cssSelector("div[class=\"result\"]")).getCssValue(Color,76, 177, 124, 1);
        return  Hooks.driver.findElement(By.cssSelector("div[class=\"result\"]"));

    }
    public WebElement wrongresult()
    {
       return Hooks.driver.findElement(By.cssSelector("div[class=\"message-error validation-summary-errors\""));
    }
}
