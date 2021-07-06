package com.group4.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Messaging {

    private WebDriver driver;

    public Messaging(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "recentMessage")
    public WebElement recentMessages;

    @FindBy(id = "oldPlus")
    public WebElement plusButton;

    @FindBy(id = "sendMessageButton")
    public WebElement sendMessageButton;

    @FindBy(id = "typeOfIssue")
    public WebElement typeSelect;

    @FindBy(id = "messageSubmit")
    public WebElement messageSubmit;

    @FindBy(id = "accountMakerButton")
    public WebElement accountMakerButton;

    @FindBy(id = "unitListButton")
    public WebElement unitListButton;

    @FindBy(xpath = "//table[@id='recentMessageTable']/tbody/tr")
    public WebElement recentMessageRow1Col1;

    @FindBy(className = "plusBox")
    public WebElement plusBtn;

    @FindBy(xpath = "//table[@id='oldMessagesTable']/tbody/tr")
    public WebElement pastMessagesRow1Col1;

    public WebElement respondBtnRow1(){
        String id = "respond" + 14;
        return this.driver.findElement(By.id(id));
    }

    @FindBy(id = "popUp")
    public WebElement messagePopUp;

    public WebElement messagePopUpHidden(){
        WebDriverWait wait = new WebDriverWait(this.driver, 4);
        wait.until(ExpectedConditions.invisibilityOf(this.driver.findElement(By.id("popUp"))));
        return this.driver.findElement(By.id("popUp"));
    }

    @FindBy(id = "messageText")
    public WebElement messageText;

    @FindBy(id = "responseSubmit")
    public WebElement responseSubmit;

    @FindBy(xpath = "//table[@id='recentMessageTable']/tbody/tr/td[3]")
    public WebElement recentFirstRowMessage;

    @FindBy(id = "close")
    public WebElement closeBtn;

    @FindBy(id="accountMaker")
    public WebElement accountMaker;

}
