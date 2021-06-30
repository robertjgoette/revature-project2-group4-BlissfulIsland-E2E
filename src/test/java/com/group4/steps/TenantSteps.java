package com.group4.steps;

import com.group4.runners.BasicRunner;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TenantSteps {

    @Given("The Tenant has logged in and is on the Messaging page")
    public void the_Tenant_has_logged_in_and_is_on_the_Messaging_page() {
        String loginPagePath = "C:\\Users\\bosto\\Documents\\GitHub\\revature-project2-group4-BlissfulIsland-frontend\\BlissfulIslandFrontend\\index.html";
        // element that is on the messaging page that can be used in the explicit wait
        String elementID = "sampleid";

        BasicRunner.driver.get(loginPagePath);
        BasicRunner.loginPage.email.sendKeys("tenant@gmail.com");
        BasicRunner.loginPage.password.sendKeys("password");
        BasicRunner.loginPage.loginButton.click();
        WebDriverWait wait = new WebDriverWait(BasicRunner.driver,2);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(elementID)));
        Assert.assertEquals(BasicRunner.driver.getTitle(), "Messaging");
    }

    @When("The Tenant clicks on the Conversations button")
    public void the_Tenant_clicks_on_the_Conversations_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("The Tenant gets a pop-up with a list of recent conversation, grouped by the tenant that sent them and sorted chronologically")
    public void the_Tenant_gets_a_pop_up_with_a_list_of_recent_conversation_grouped_by_the_tenant_that_sent_them_and_sorted_chronologically() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("The Tenant chooses which conversation they want to view")
    public void the_Tenant_chooses_which_conversation_they_want_to_view() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("The chat conversation appears inside of the pop-up, with past messages from the manager")
    public void the_chat_conversation_appears_inside_of_the_pop_up_with_past_messages_from_the_manager() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("The Tenant clicks on the create new Message")
    public void the_Tenant_clicks_on_the_create_new_Message() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("The Tenant sees a text box at the bottom of the conversation")
    public void the_Tenant_sees_a_text_box_at_the_bottom_of_the_conversation() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("The Tenant types the message they want to send")
    public void the_Tenant_types_the_message_they_want_to_send() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("The Tenant clicks the Send button and the message is sent")
    public void the_Tenant_clicks_the_Send_button_and_the_message_is_sent() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("The Tenant should see a notification stating the message was sent.")
    public void the_Tenant_should_see_a_notification_stating_the_message_was_sent() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
