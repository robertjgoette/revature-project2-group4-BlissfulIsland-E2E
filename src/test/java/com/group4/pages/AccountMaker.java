package com.group4.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class AccountMaker {

    private WebDriver driver;

    public AccountMaker(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
}
