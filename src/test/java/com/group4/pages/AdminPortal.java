package com.group4.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AdminPortal {

    private WebDriver driver;

    public AdminPortal(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(className = "plusBox")
    public WebElement plusBox;

    @FindBy(id = "makeManager")
    public WebElement makeManager;

    @FindBy(id= "tenantListTable")
    public WebElement tenantListTable;

    public WebElement promoteManager(){
        WebElement makeManager1 = this.driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr[1]/td[4]"));

        return makeManager1;

    }

    @FindBy(id = "popUpContentHeader")
    public WebElement popUpContentHeader;

}
