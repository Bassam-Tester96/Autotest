package org.example.pages;

import org.example.stepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;


public class P01_register {
    public WebElement registerlink()
    {
        return  Hooks.driver.findElement(By.cssSelector("a[class=\"ico-register\"]"));

    }
    public WebElement genderType(String type)
    {
        WebElement element = null;

        if (type.contains("male")) {
            element = Hooks.driver.findElement(By.id("gender-male"));
        }
        else if(type.contains("female")) {
            element = Hooks.driver.findElement(By.id("gender-female"));
        }
        return element;

    }

    public WebElement firstNameTxt()
    {

        return  Hooks.driver.findElement(By.id("FirstName"));
    }

    public WebElement lastNameTxt()
    {
        return  Hooks.driver.findElement(By.id("LastName"));
    }

    public WebElement birthDay()
    {
        WebElement birthDay = Hooks.driver.findElement(By.name("DateOfBirthMonth"));
        Select select = new Select(birthDay);
        select.selectByIndex(10); // select by index: this is day 10
        return Hooks.driver.findElement(By.name("DateOfBirthDay"));

    }

    public WebElement birthMonth()
    {
        WebElement birthMonth = Hooks.driver.findElement(By.name("DateOfBirthMonth"));
        Select select = new Select(birthMonth);
        select.selectByValue("3"); // select by value and it should be String: this is March
        return Hooks.driver.findElement(By.name("DateOfBirthMonth"));
    }

    public WebElement birthYear()
    {
        WebElement birthYear = Hooks.driver.findElement(By.name("DateOfBirthYear"));
        Select select = new Select(Hooks.driver.findElement(By.name("DateOfBirthYear")));
        select.selectByVisibleText("1998"); // select by linkText and it should be String

        return Hooks.driver.findElement(By.name("DateOfBirthYear"));
    }


    public WebElement EmailTxt(String email)
    {
        return  Hooks.driver.findElement(By.id("Email"));
    }

    public WebElement passwordTxt(String pass)
    {
        return  Hooks.driver.findElement(By.id("Password"));
    }

    public WebElement confirmpassTxt(String confirmpass)
    {
        return  Hooks.driver.findElement(By.id("ConfirmPassword"));
    }


    public WebElement registerBtn()
    {
        return  Hooks.driver.findElement(By.id("register-button"));
    }


    public WebElement result()
    {
        // Note : m7tag a3rf l color 3shan a3mmlo assert fl step definition
        //Hooks.driver.findElement(By.cssSelector("div[class=\"result\"]")).getCssValue(Color,76, 177, 124, 1);
        return  Hooks.driver.findElement(By.cssSelector("div[class=\"result\"]"));

    }
}
