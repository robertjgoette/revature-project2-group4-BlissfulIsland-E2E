package com.group4.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MessagingB {

    private WebDriver driver;

    public MessagingB(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "recentMessage")
    public WebElement recentMessages;

    @FindBy(id = "oldPlus")
    public WebElement plusButton;

    @FindBy(id = "sendMessageButton")
    public WebElement sendMessageButton;

    @FindBy(id = "messageText")
    public WebElement messageText;

    @FindBy(id = "typeOfIssue")
    public WebElement typeSelect;

    @FindBy(id = "messageSubmit")
    public WebElement messageSubmit;
}
