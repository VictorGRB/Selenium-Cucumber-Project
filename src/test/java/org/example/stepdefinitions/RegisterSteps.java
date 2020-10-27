package org.example.stepdefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.TestBase;
import org.example.webviews.RegisterPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;

public class RegisterSteps extends TestBase {

    private RegisterPage registerPage = PageFactory.initElements(driver, RegisterPage.class);

    @And("^I fill in all mandatory fields with valid data on the Register page$")
    public void iFillInAllMandatoryFieldsWithValidDataOnTheRegisterPage() {
        registerPage.getFirstNameField().sendKeys("Victor");
        registerPage.getMiddleNameField().sendKeys("V");
        registerPage.getLastNameField().sendKeys("Garbo");
        registerPage.getEmailField().sendKeys("victorgar@yahoo.com");
        registerPage.getPasswordField().sendKeys("password123");
        registerPage.getConfirmPasswordField().sendKeys("password123");
    }

    @And("^I check the newsletter checkbox on the Register page$")
    public void iCheckTheNewsletterCheckboxOnTheRegisterPage() {
        registerPage.getNewsletterCheckbox().click();
    }

    @When("^I press the Register button$")
    public void iPressTheRegisterButton() {
        registerPage.getRegisterButton().click();
    }

    @And("^I set the value \"(.*)\" in the \"([^\"]*)\" field on the Register page$")
    public void iSetTheValueInTheFieldOnTheRegisterPage(String value, String fieldName) {
        // Removing surrounding quotes to enable this method to be used from a Scenario outline
        // with missing or blank values
        if (value.startsWith("\"") && value.endsWith("\"")) {
            System.out.println("Removing surrounding quotes from the required value.");

            value = value.replaceFirst("\"", "");
            if (value.length() > 1) {
                value = value.substring(0, value.length() - 2);
            } else {
                value = "";
            }

            System.out.println("Value without quotes: " + value);
        }

        String fieldNameAttribute = getFieldNameAttribute(fieldName);
        registerPage.getFieldByName(fieldNameAttribute).clear();
        registerPage.getFieldByName(fieldNameAttribute).sendKeys(value);
    }

    @Then("^I receive the following message under the \"([^\"]*)\" field on the Register page: \"([^\"]*)\"$")
    public void iReceiveTheFollowingMessageUnderTheFieldOnTheRegisterPage(String fieldName, String message) {
        String fieldNameAttribute = getFieldNameAttribute(fieldName);
        WebElement fieldErrorContainer = registerPage.getFieldRequiredErrorMessageContainer(fieldNameAttribute);
        assertFieldErrorDisplayed(message, fieldErrorContainer);
    }

    @Then("^I receive the following message under the email field on the Register page: \"([^\"]*)\"$")
    public void iReceiveTheFollowingMessageUnderTheEmailFieldOnTheRegisterPage(String message) {
        WebElement fieldErrorContainer = registerPage.getEmailValidationMessageContainer();
        assertFieldErrorDisplayed(message, fieldErrorContainer);
    }

    @Then("^I receive the following message under the password confirmation field on the Register page: \"([^\"]*)\"$")
    public void iReceiveTheFollowingMessageUnderThePasswordConfirmationFieldOnTheRegisterPage(String message) {
        WebElement fieldErrorContainer = registerPage.getConfirmPasswordValidationMessageContainer();
        assertFieldErrorDisplayed(message, fieldErrorContainer);
    }

    @Then("^I receive the following message under the password field on the Register page: \"([^\"]*)\"$")
    public void iReceiveTheFollowingMessageUnderThePasswordFieldOnTheRegisterPage(String message) {
        WebElement fieldErrorContainer = registerPage.getPasswordValidationMessageContainer();
        assertFieldErrorDisplayed(message, fieldErrorContainer);
    }

    private void assertFieldErrorDisplayed(String message, WebElement fieldErrorContainer) {
        assertThat("Field error message not displayed.", fieldErrorContainer, notNullValue());
        assertThat("Unexpected field error message.", fieldErrorContainer.getText(), is(message));
    }

    private String getFieldNameAttribute(String fieldName) {
        return fieldName.replace(" ", "").toLowerCase();
    }
}
