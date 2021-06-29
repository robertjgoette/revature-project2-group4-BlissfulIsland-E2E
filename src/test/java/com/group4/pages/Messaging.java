package com.group4.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Messaging {

    private WebDriver driver;

    public Messaging(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
}
