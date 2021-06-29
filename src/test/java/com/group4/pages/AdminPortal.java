package com.group4.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class AdminPortal {

    private WebDriver driver;

    public AdminPortal(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
}
