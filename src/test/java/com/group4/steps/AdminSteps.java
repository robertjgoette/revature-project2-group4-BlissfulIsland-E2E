package com.group4.steps;

import com.group4.pages.LoginPage;
import com.group4.runners.BasicRunner;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.By;

public class AdminSteps {

    @Given("The Admin has logged in and is on the admin portal")
    public void the_Admin_has_logged_in_and_is_on_the_admin_portal() {
        String loginPagePath = "";
        // element that is on the admin portal page that can be used in the explicit wait
        String elementID = "sampleid";

        BasicRunner.driver.get(loginPagePath);
        BasicRunner.loginPage.email.sendKeys("admin@blissfulisland.com");
        BasicRunner.loginPage.password.sendKeys("password");
        BasicRunner.loginPage.loginButton.click();
        WebDriverWait wait = new WebDriverWait(BasicRunner.driver,2);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(elementID)));
        Assert.assertEquals(BasicRunner.driver.getTitle(), "Admin Portal");
    }

    @Then("The Admin sees the accounts table")
    public void the_Admin_sees_the_accounts_table() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("The Admin clicks on the Make Manager button")
    public void the_Admin_clicks_on_the_Make_Manager_button(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("The Admin is taken to the Tenant Account Management page")
    public void the_Admin_is_taken_to_the_Tenant_Account_Management_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("The Admin clicks on the Create Manager Account button")
    public void the_Admin_clicks_on_the_Create_Manager_Account_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("The Admin gets a pop-up with the form for creating manager accounts")
    public void the_Admin_gets_a_pop_up_with_the_form_for_creating_manager_accounts() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("The Admin inputs the manager's first and last name")
    public void the_Admin_inputs_the_manager_s_first_and_last_name() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("The Admin inputs the manager's email address")
    public void the_Admin_inputs_the_manager_s_email_address() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("The Admin inputs the manager's unit number")
    public void the_Admin_inputs_the_manager_s_unit_number() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("The Admin inputs a password for the manager's account")
    public void the_Admin_inputs_a_password_for_the_manager_s_account() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("The Admin clicks the Submit button")
    public void the_Admin_clicks_the_Submit_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("The Admin gets a pop-up with a success message")
    public void the_Admin_gets_a_pop_up_with_a_success_message() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("The Admin is taken back to the Tenant Account Management page")
    public void the_Admin_is_taken_back_to_the_Tenant_Account_Management_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("The Admin clicks on the Promote to Manager button")
    public void the_Admin_clicks_on_the_Promote_to_Manager_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("A pop up asking for confirmation appears")
    public void a_pop_up_asking_for_confirmation_appears() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("The Admin clicks the Yes button")
    public void the_Admin_clicks_the_Yes_button(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("The connected account is promoted to a manager account")
    public void the_connected_account_is_promoted_to_a_manager_account() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
