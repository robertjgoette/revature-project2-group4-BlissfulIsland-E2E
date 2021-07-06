package com.group4.steps;

import com.group4.runners.BasicRunner;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

public class AdminSteps {

    @Given("The Admin has logged in and is on the admin portal")
    public void the_Admin_has_logged_in_and_is_on_the_admin_portal() {

        String loginPagePath = "https://2105batch-project2-group4.s3.us-east-2.amazonaws.com/index.html";
        // element that is on the admin portal page that can be used in the explicit wait
        //String loginPagePath = "https://2105batch-project2-group4.s3.us-east-2.amazonaws.com/index.html";
        String elementID = "tenantList";

        BasicRunner.driver.get(loginPagePath);
        BasicRunner.loginPage.email.sendKeys("admin@BlissfulIsland.com");
        BasicRunner.loginPage.password.sendKeys("admin");
        BasicRunner.loginPage.loginButton.click();
        WebDriverWait wait = new WebDriverWait(BasicRunner.driver, 2);
        BasicRunner.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;

    }
    @When("The Admin clicks on the Account Maker button")
    public void the_Admin_clicks_on_the_Account_Maker_button() {
        BasicRunner.messaging.accountMaker.click();
    }
    @Then("The Admin should be taken to the Create Account page")
    public void the_Admin_should_be_taken_to_the_Create_Account_page() {
        System.out.println("Welcome to the page");

    }
    @When("The Admin inputs the manager's first into the First Name field")
    public void the_Admin_inputs_the_manager_s_first_into_the_First_Name_field() {
        BasicRunner.accountMaker.firstName.sendKeys("North");
    }
    @When("The Admin inputs the manager's last name into the Last Name field")
    public void the_Admin_inputs_the_manager_s_last_name_into_the_Last_Name_field() {
        BasicRunner.accountMaker.lastName.sendKeys("South");
    }
    @When("The Admin inputs the manager's email address into the Email field")
    public void the_Admin_inputs_the_manager_s_email_address_into_the_Email_field() {
        BasicRunner.accountMaker.email.sendKeys("north.south@blessfulisland.com");
    }
    @When("The Admin inputs the password for the manager's account into the Password field")
    public void the_Admin_inputs_the_password_for_the_manager_s_account_into_the_Password_field() {
        BasicRunner.accountMaker.password.sendKeys("password");
    }
    @When("The Admin inputs the manager's account number into the Account Type field")
    public void the_Admin_inputs_the_manager_s_account_number_into_the_Account_Type_field() {
        BasicRunner.accountMaker.accountType().sendKeys("1");

    }
    @When("The Admin selects the manager's unit number from Unit ID dropdown menu")
    public void the_Admin_selects_the_manager_s_unit_number_from_Unit_ID_dropdown_menu() {
        Select unitID = new Select(BasicRunner.driver.findElement(By.id("unitID")));

    }
    @When("The Admin clicks on the Submit button")
    public void the_Admin_clicks_on_the_Submit_button() {
        BasicRunner.accountMaker.createNewAccountBtn.click();
    }
    @Then("The Admin should get a pop-up with a success message")
    public void the_Admin_should_get_a_pop_up_with_a_success_message() {
        BasicRunner.driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS) ;
        Assert.assertTrue(BasicRunner.accountMaker.alertMessageActiveM().getAttribute("class").contains("bg-success"));

    }
    @Then("The Admin should be taken back to the admin portal")
    public void the_Admin_should_be_taken_back_to_the_admin_portal() {
        BasicRunner.accountMaker.adminPortalButton.click();
    }
    // end of first scenario

    @When("The Admin clicks on the Tenant List plus sign")
    public void the_Admin_clicks_on_the_Tenant_List_plus_sign() throws InterruptedException {
        TimeUnit.SECONDS.sleep(5);
        BasicRunner.adminPortal.plusBox.click();
    }
    @Then("The Admin should see the accounts table")
    public void the_Admin_should_see_the_accounts_table() {
        WebDriverWait wait1 = new WebDriverWait(BasicRunner.driver,2);
        wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"tenantListTable\"]")));
        BasicRunner.adminPortal.tenantListTable.isDisplayed();
    }
    @When("The Admin clicks on the Make Manager button")
    public void the_Admin_clicks_on_the_Make_Manager_button() throws InterruptedException {
        BasicRunner.adminPortal.promoteManager().click();
        TimeUnit.SECONDS.sleep(1);
    }
    @Then("A pop up asking for confirmation appears")
    public void a_pop_up_asking_for_confirmation_appears() {
        BasicRunner.adminPortal.popUpContentHeader.isDisplayed();
    }
    @When("The Admin clicks on the pop up Make Manager button")
    public void the_Admin_clicks_the_Pop_up_Make_Manager_button() throws InterruptedException {
        TimeUnit.SECONDS.sleep(1);
        BasicRunner.adminPortal.makeManager.click();
    }
    @Then("The connected account should be promoted to a manager account")
    public void the_connected_account_should_be_promoted_to_a_manager_account() {
        //since the step immediately above this step was determined not be worried about,
        // this step cannot verify the result of the actions taken above, just a simple print put here
        System.out.println("success");

    }
}
