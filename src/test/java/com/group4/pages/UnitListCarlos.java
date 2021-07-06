package com.group4.pages;

import com.group4.runners.BasicRunner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class UnitListCarlos {

    private WebDriver driver;

    public UnitListCarlos(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "normalPlus")
    public WebElement normalPlus;

    @FindBy(id = "deluxPlus")
    public WebElement deluxPlus;

    @FindBy(xpath = "//div[@id='typeNormal']/table/tbody/tr[last()]/td[1]")
    public WebElement normalLastRowCol1;

    @FindBy(xpath = "//div[@id='typeDelux']/table/tbody/tr[last()]/td[1]")
    public WebElement deluxeLastRowCol1;

    public WebElement typeNormalTableClosed(){
        WebDriverWait wait = new WebDriverWait(this.driver, 4);
        if(wait.until(ExpectedConditions.attributeToBe(this.driver.findElement(By.id("typeNormal")), "style", "")))
            return this.driver.findElement(By.id("typeNormal"));
        return null;
    };

    public WebElement typeDeluxeTableClosed(){
        WebDriverWait wait = new WebDriverWait(this.driver, 4);
        if(wait.until(ExpectedConditions.attributeToBe(this.driver.findElement(By.id("typeDelux")), "style", "")))
            return this.driver.findElement(By.id("typeDelux"));
        return null;
    };

}
