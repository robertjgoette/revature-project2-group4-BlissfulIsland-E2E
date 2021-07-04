package com.group4.steps;

import com.group4.runners.BasicRunner;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class ManagerSteps {
    @Given("The Manager has logged in and is on the Messaging page")
    public void the_Manager_has_logged_in_and_is_on_the_Messaging_page() {
        String loginPagePath = "file:///C:/Users/cahe1/OneDrive/Documents/revature_training/Projects/revature-project2-group4-BlissfulIsland-frontend/BlissfulIslandFrontend/index.html";
        // element that is on the messaging page that can be used in the explicit wait
        String elementID = "sampleid";

        BasicRunner.driver.get(loginPagePath);
        BasicRunner.loginPage.email.sendKeys("manager@blissfulisland.com");
        BasicRunner.loginPage.password.sendKeys("password");
        BasicRunner.loginPage.loginButton.click();
        WebDriverWait wait = new WebDriverWait(BasicRunner.driver,2);
        wait.until(ExpectedConditions.titleIs("Home Page"));
        Assert.assertEquals(BasicRunner.driver.getTitle(), "Home Page");
    }

    @When("The Manager clicks on the Account Maker button")
    public void the_Manager_clicks_on_the_Tenant_Account_Management_button() {
        BasicRunner.messagingCarlos.accountMakerButton.click();
    }

    @Then("The Manager should be redirected to the Create Account Page")
    public void the_Manager_should_be_redirected_to_the_Create_Account_Page() {
        WebDriverWait wait = new WebDriverWait(BasicRunner.driver,4);
        wait.until(ExpectedConditions.titleIs("Create Account"));
        Assert.assertEquals(BasicRunner.driver.getTitle(), "Create Account");
    }
    @When("The Manager inputs the tenant's first name")
    public void the_Manager_inputs_the_tenant_s_first_name() {
        BasicRunner.accountMakerCarlos.firstName.sendKeys("TestFirst");
    }
    @When("The Manager inputs the tenant's last name")
    public void the_Manager_inputs_the_tenant_s_last_name() {
        BasicRunner.accountMakerCarlos.lastName.sendKeys("TestLast");
    }
    @When("The Manager inputs the tenant's email address")
    public void the_Manager_inputs_the_tenant_s_email_address() {
        BasicRunner.accountMakerCarlos.email.sendKeys("abc@google.com");
    }
    @When("The Manager inputs the tenant's password")
    public void the_Manager_inputs_the_tenant_s_password() {

        BasicRunner.accountMakerCarlos.password.sendKeys("password");
    }
    @When("The Manager inputs the tenant's unit number")
    public void the_Manager_inputs_the_tenant_s_unit_number() {
        Select options = new Select(BasicRunner.accountMakerCarlos.selectUnits());
        options.selectByIndex(1);
    }

    @When("The Manager clicks the Submit button")
    public void the_Manager_clicks_the_Submit_button() {
        BasicRunner.accountMakerCarlos.createNewAccountBtn.click();
    }

    @Then("The Manager should see a success message")
    public void the_Manager_should_see_a_success_message() {
        Assert.assertTrue(BasicRunner.accountMakerCarlos.alertMessageActice().getAttribute("class").contains("bg-success"));
    }

    @Then("The Submit button should be disabled")
    public void the_Submit_button_should_be_disabled() {
        Assert.assertEquals(BasicRunner.accountMakerCarlos.createNewAccountBtn.getAttribute("disabled"), "true");
    }

    @Then("The Submit button should be enabled")
    public void the_Submit_button_should_be_enabled() {
        Assert.assertNull(BasicRunner.accountMakerCarlos.createNewAccountBtnReenabled().getAttribute("enabled"));
    }

    @Then("The success message should disappear")
    public void the_success_message_should_disappear() {
        Assert.assertTrue(BasicRunner.accountMakerCarlos.alertMessageInactive().getAttribute("class").contains("hidden"));
    }

    @When("The Manager clicks on View Unit List")
    public void the_Manager_clicks_on_View_Unit_List() {
        BasicRunner.messagingCarlos.unitListButton.click();
    }

    @Then("The Manager should be taken to the Unit List page")
    public void the_Manager_is_taken_to_the_Unit_List_page() {
        WebDriverWait wait = new WebDriverWait(BasicRunner.driver,2);
        wait.until(ExpectedConditions.titleIs("Unit List"));
        Assert.assertEquals(BasicRunner.driver.getTitle(), "Unit List");
    }

    @Given("The manager is on the Unit List page")
    public void the_Manager_is_on_the_unit_List_page() {
        WebDriverWait wait = new WebDriverWait(BasicRunner.driver,2);
        wait.until(ExpectedConditions.titleIs("Unit List"));
        Assert.assertEquals(BasicRunner.driver.getTitle(), "Unit List");
    }

    @When("The manager clicks on the plus sign of Type {int} apartments")
    public void the_manager_clicks_on_the_plus_sign_of_Type_apartments(Integer int1) {
         if (int1 == 2) {
            BasicRunner.unitListCarlos.normalPlus.click();
        }else if(int1 == 3){
            BasicRunner.unitListCarlos.deluxPlus.click();
        }
    }

    @Then("The manager should see the list of Type {int} apartments")
    public void the_manager_should_see_the_list_of_Type_apartments(Integer int1) throws InterruptedException {
        TimeUnit.SECONDS.sleep(2);
        if(int1 == 2){
           WebElement col =  BasicRunner.unitListCarlos.normalLastRowCol1;
           Assert.assertTrue(col.getAttribute("innerHTML").contains("306"));
        } else if (int1 == 3) {
            WebElement col =  BasicRunner.unitListCarlos.deluxeLastRowCol1;
            Assert.assertTrue(col.getAttribute("innerHTML").contains("310"));
        }
    }

    @Then("The list of Type {int} apartments should be hidden")
    public void the_list_of_Type_apartments_should_be_hidden(Integer int1) {
        if (int1 == 2) {
            WebElement table = BasicRunner.unitListCarlos.typeNormalTableClosed();
            Assert.assertTrue(table.getSize().getHeight() < 200);
        }else if(int1 == 3){
            WebElement table = BasicRunner.unitListCarlos.typeDeluxeTableClosed();
            Assert.assertTrue(table.getSize().getHeight() < 200);
        }
    }

    @Then("The manager should see a list of recent messages")
    public void the_manager_sees_recent_messages() throws InterruptedException{
        TimeUnit.SECONDS.sleep(2);
        WebElement el =  BasicRunner.messagingCarlos.recentMessageRow1Col1;
        Assert.assertNotNull(el.getAttribute("innerHTML"));
    }

    @When("The manager clicks on the plus sign")
    public void the_manager_clicks_on_the_plus_sign() throws InterruptedException{
            TimeUnit.SECONDS.sleep(2);
            BasicRunner.messagingCarlos.plusBtn.click();
    }

    @Then("The manager should see a list of past messages")
    public void the_manager_should_see_a_list_of_past_messages() throws InterruptedException {
        WebElement el =  BasicRunner.messagingCarlos.pastMessagesRow1Col1;
        Assert.assertNotNull(el.getAttribute("innerHTML"));
    }

    @When("The manager clicks on the respond button of a message")
    public void the_manager_clicks_on_the_respond_button_of_a_message() {
        BasicRunner.messagingCarlos.respondBtnRow1().click();
    }

    @Then("The manager should see a message popup")
    public void the_manager_should_see_a_message_popup() {
        WebElement el = BasicRunner.messagingCarlos.messagePopUp;
        Assert.assertTrue(el.getAttribute("style").contains("block"));
    }
    @When("The manager enters message into message input")
    public void the_manager_enters_message_into_message_input() {
        BasicRunner.messagingCarlos.messageText.sendKeys("Selenium Sample Message");
    }
    @When("The manager clicks the submit message button")
    public void the_manager_clicks_the_submit_message_button() {
        BasicRunner.messagingCarlos.responseSubmit.click();
    }
    @Then("The submit message button should be disabled")
    public void the_submit_message_button_should_be_disabled() {
        Assert.assertEquals(BasicRunner.messagingCarlos.responseSubmit.getAttribute("disabled"), "true");
    }
    @Then("The popup should close")
    public void the_popup_should_close() {
        WebElement popup = BasicRunner.messagingCarlos.messagePopUpHidden();
        Assert.assertTrue(popup.getAttribute("style").contains("none"));
    }

    @Then("The new message should be displayed at the top of recent messages")
    public void the_new_message_should_be_displayed_at_the_top_of_recent_messages() {
        String msg = BasicRunner.messagingCarlos.recentFirstRowMessage.getAttribute("innerHTML");
        Assert.assertTrue(msg.equals("Selenium Sample Message"));
    }

    @When("The manager clicks on popup close button")
    public void the_manager_clicks_on_the_close_popup_btn() {
        BasicRunner.messagingCarlos.closeBtn.click();
    }
}
