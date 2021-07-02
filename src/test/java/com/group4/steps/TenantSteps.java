package com.group4.steps;

import com.group4.runners.BasicRunner;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class TenantSteps {

    @Given("The Tenant has logged in and is on the Messaging page")
    public void the_Tenant_has_logged_in_and_is_on_the_Messaging_page() {
        String loginPagePath = "C:\\Users\\bosto\\Documents\\GitHub\\revature-project2-group4-BlissfulIsland-frontend\\BlissfulIslandFrontend\\index.html";
        // element that is on the messaging page that can be used in the explicit wait
        String elementID = "recentMessage";

        BasicRunner.driver.get(loginPagePath);
        BasicRunner.loginPage.email.sendKeys("tenant@gmail.com");
        BasicRunner.loginPage.password.sendKeys("password");
        BasicRunner.loginPage.loginButton.click();
        WebDriverWait wait = new WebDriverWait(BasicRunner.driver,2);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(elementID)));
        Assert.assertEquals(BasicRunner.driver.getTitle(), "Home Page");
    }

    @Then("A table is shown on the page with a list of recent messages")
    public void a_table_is_shown_on_the_page_with_a_list_of_recent_messages() {
        WebDriverWait wait = new WebDriverWait(BasicRunner.driver,1);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("recentMessageTable")));
    }

    @Then("Tenant can expand the Old Messages table to view older messages")
    public void tenant_can_expand_the_Old_Messages_table_to_view_older_messages() {
        BasicRunner.messaging.plusButton.click();
        WebDriverWait wait = new WebDriverWait(BasicRunner.driver,2);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("oldMessagesTable")));
    }

    @When("The Tenant clicks on the Send Message button")
    public void the_Tenant_clicks_on_the_Send_Message_button() {
        BasicRunner.messaging.sendMessageButton.click();
    }

    @Then("The Tenant sees a pop-up box where they can send their message")
    public void the_Tenant_sees_a_pop_up_box_where_they_can_send_their_message() {
        WebDriverWait wait = new WebDriverWait(BasicRunner.driver,2);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("messageText")));
    }
    @Then("The Tenant types in their message")
    public void the_Tenant_types_in_their_message() {
        BasicRunner.messaging.messageText.sendKeys("My Selenium microwave is broken");
    }
    @Then("The Tenant selects which type of issue this is")
    public void the_Tenant_selects_which_type_of_issue_this_is() {
        Select typeOfIssue = new Select(BasicRunner.messaging.typeSelect);
        typeOfIssue.selectByValue("0");
    }
    @Then("The Tenant clicks the Send button")
    public void the_Tenant_clicks_the_Send_button() {
        BasicRunner.messaging.messageSubmit.click();
    }
    @Then("The pop-up disappears and the Tenant is back on the Messaging page")
    public void the_pop_up_disappears_and_the_Tenant_is_back_on_the_Messaging_page() {
        WebDriverWait wait = new WebDriverWait(BasicRunner.driver,4);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("recentMessageTable")));
    }
}
