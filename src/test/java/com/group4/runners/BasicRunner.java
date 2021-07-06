package com.group4.runners;

import com.group4.pages.*;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.util.concurrent.TimeUnit;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:features", glue = "com.group4.steps")
public class BasicRunner {

    public static WebDriver driver = null;

    public static AccountMaker accountMaker = null;
    public static AdminPortal adminPortal = null;
    public static LoginPage loginPage = null;
    public static Messaging messaging = null;
    public static UnitList unitList = null;

    @BeforeClass
    public static void setup() {
        //File file = new File("src/test/resources/chromedriver.exe");
        File file = new File("src/test/resources/chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--allow-running-insecure-content");
        driver = new ChromeDriver(options);


        accountMaker = new AccountMaker(driver);
        adminPortal = new AdminPortal(driver);
        loginPage = new LoginPage(driver);
        messaging = new Messaging(driver);
        unitList = new UnitList(driver);
    }

    @AfterClass
    public static void teardown(){
        BasicRunner.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
        driver.quit();
    }


}
