package com.group4.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class UnitList {

    private WebDriver driver;

    public UnitList(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
}
