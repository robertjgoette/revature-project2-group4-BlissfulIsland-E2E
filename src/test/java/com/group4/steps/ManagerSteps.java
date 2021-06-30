package com.group4.steps;

import com.group4.runners.BasicRunner;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ManagerSteps {

    @Given("The Manager has logged in and is on the Messaging page")
    public void the_Manager_has_logged_in_and_is_on_the_Messaging_page() {
        String loginPagePath = "";
        // element that is on the messaging page that can be used in the explicit wait
        String elementID = "sampleid";

        BasicRunner.driver.get(loginPagePath);
        BasicRunner.loginPage.email.sendKeys("manager@blissfulisland.com");
        BasicRunner.loginPage.password.sendKeys("password");
        BasicRunner.loginPage.loginButton.click();
        WebDriverWait wait = new WebDriverWait(BasicRunner.driver,2);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(elementID)));
        Assert.assertEquals(BasicRunner.driver.getTitle(), "Messaging");
    }

    @When("The Manager clicks on the Tenant Account Management button")
    public void the_Manager_clicks_on_the_Tenant_Account_Management_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("The Manager is taken to the Tenant Account Management page")
    public void the_Manager_is_taken_to_the_Tenant_Account_Management_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("The Manager clicks on the Create Tenant Account button")
    public void the_Manager_clicks_on_the_Create_Tenant_Account_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("The Manager gets a pop-up with the form for creating tenant accounts")
    public void the_Manager_gets_a_pop_up_with_the_form_for_creating_tenant_accounts() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("The Manager inputs the tenant's first and last name")
    public void the_Manager_inputs_the_tenant_s_first_and_last_name() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("The Manager inputs the tenant's email address")
    public void the_Manager_inputs_the_tenant_s_email_address() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("The Manager inputs the tenant's unit number")
    public void the_Manager_inputs_the_tenant_s_unit_number() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("The Manager inputs a password for the tenant's account")
    public void the_Manager_inputs_a_password_for_the_tenant_s_account() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("The Manager clicks the Submit button")
    public void the_Manager_clicks_the_Submit_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("The Manager gets a pop-up with a success message")
    public void the_Manager_gets_a_pop_up_with_a_success_message() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("The Manager is taken back to the Tenant Account Management page")
    public void the_Manager_is_taken_back_to_the_Tenant_Account_Management_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("The Manager clicks on View Unit List")
    public void the_Manager_clicks_on_View_Unit_List() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("The Manager is taken to the Unit List page")
    public void the_Manager_is_taken_to_the_Unit_List_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("The Manager clicks on the unit they want to update")
    public void the_Manager_clicks_on_the_unit_they_want_to_update() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("The Manager gets a pop-up with a form for updating the unit")
    public void the_Manager_gets_a_pop_up_with_a_form_for_updating_the_unit() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("The Manager changes the Occupation status to the desired value \\(Vacant or Occupied) using the drop-down")
    public void the_Manager_changes_the_Occupation_status_to_the_desired_value_Vacant_or_Occupied_using_the_drop_down() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("The Manager clicks the Save button")
    public void the_Manager_clicks_the_Save_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("The Manager is taken back to the Unit List page")
    public void the_Manager_is_taken_back_to_the_Unit_List_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("The Manager clicks on the Conversations button")
    public void the_Manager_clicks_on_the_Conversations_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("The Manager gets a pop-up with a list of recent conversations, grouped by the tenant that sent them and sorted chronologically")
    public void the_Manager_gets_a_pop_up_with_a_list_of_recent_conversations_grouped_by_the_tenant_that_sent_them_and_sorted_chronologically() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("The Manager chooses which conversation they want to view")
    public void the_Manager_chooses_which_conversation_they_want_to_view() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("The chat conversation appears inside of the pop-up, with past messages from the tenant")
    public void the_chat_conversation_appears_inside_of_the_pop_up_with_past_messages_from_the_tenant() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("The chat conversation appears inside of the pop-up")
    public void the_chat_conversation_appears_inside_of_the_pop_up() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("The Manager sees a text box at the bottom of the conversation")
    public void the_Manager_sees_a_text_box_at_the_bottom_of_the_conversation() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("The Manager types the message they want to send")
    public void the_Manager_types_the_message_they_want_to_send() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("The Manager clicks the Send button and the message is sent")
    public void the_Manager_clicks_the_Send_button_and_the_message_is_sent() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("The Manager should see a notification stating the message was sent")
    public void the_Manager_should_see_a_notification_stating_the_message_was_sent() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("The Manager clicks on the Delete Tenant Accounts button")
    public void the_Manager_clicks_on_the_Delete_Tenant_Accounts_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("The Manager selects the account that they want to delete")
    public void the_Manager_selects_the_account_that_they_want_to_delete() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("The Manager clicks Delete")
    public void the_Manager_clicks_Delete() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("A popup appears asking the Manager to confirm if they want to delete this account")
    public void a_popup_appears_asking_the_Manager_to_confirm_if_they_want_to_delete_this_account() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("The Manager click Ok on the Confirm Deletion popup")
    public void the_Manager_click_Ok_on_the_Confirm_Deletion_popup() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("A message pops up confirming the deletion was processed")
    public void a_message_pops_up_confirming_the_deletion_was_processed() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("The Manager can see the percentage of units occupied on the bottom of the page")
    public void the_Manager_can_see_the_percentage_of_units_occupied_on_the_bottom_of_the_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("The Manager can filter the list of units")
    public void the_Manager_can_filter_the_list_of_units() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
