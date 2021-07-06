package com.group4.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AccountMakerM {

    private WebDriver driver;

    public AccountMakerM(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(id = "firstName")
    public WebElement firstName;

    @FindBy(id = "lastName")
    public WebElement lastName;

    @FindBy(id = "email")
    public WebElement email;

    @FindBy(id = "password")
    public WebElement password;

    public WebElement accountType() {
        WebDriverWait wait = new WebDriverWait(this.driver, 2);//10
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("accountType")));
    }

    @FindBy(id = "unitID")
    public WebElement unitID;

    @FindBy(id = "createNewAccountBtn")
    public WebElement createNewAccountBtn;

    public WebElement alertMessageActiveM(){
        WebDriverWait wait = new WebDriverWait(this.driver,2);//10
        WebElement alert = this.driver.findElement(By.id("alertMessage"));
        if(wait.until(ExpectedConditions.attributeContains(alert, "class", "bg-success"))){
            return alert;
        }
        return null;
    }
    public WebElement alertMessageInactiveM(){
        WebDriverWait wait = new WebDriverWait(this.driver,2);//10
        WebElement alert = this.driver.findElement(By.id("alertMessage"));
        if(wait.until(ExpectedConditions.attributeContains(alert, "class", "alertMessage hidden"))){
            return alert;
        }
        return null;
    }

    @FindBy(id = "adminPortalButton")
    public WebElement adminPortalButton;

}

