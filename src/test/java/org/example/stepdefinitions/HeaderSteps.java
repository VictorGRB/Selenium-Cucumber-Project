package org.example.stepdefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.TestBase;
import org.example.webviews.Header;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.Arrays;

public class HeaderSteps extends TestBase {

    private Header header= PageFactory.initElements(driver,Header.class);



    @And("^I search products by \"([^\"]*)\"$")
    public void iSearchProductsBy(String searchKeyword){
        header.search(searchKeyword);
    }
    @And("^I open the sub-category \"([^\"]*)\" from the \"([^\"]*)\" category$")
    public void iOpenTheSubCategoryFromTheCategory(String subCategory, String category) {
        By womenCategoryLocator = By.linkText(category);
        By newArrivalsSubCategoryLocator = By.linkText(subCategory);
        mouseOverAndClickLast(Arrays.asList(womenCategoryLocator, newArrivalsSubCategoryLocator));
    }

    @And("^I go to the Register page$")
    public void iGoToTheRegisterPage() {
        header.getAccountLink().click();
        header.getRegisterLink().click();
    }


    @When("^I select the option \"([^\"]*)\" in the Language List$")
    public void iSelectTheOptionInTheLanguageList(String sortLanguage) {
        header.getSelectLanguage().selectByVisibleText(sortLanguage);
    }

    @Then("^The word Women is replaced by Frauen$")
    public void theWordWomenIsReplacedByFrauen() {
        header.getWomenTag().click();
    }

    @And("^I fill in the newsletter field$")
    public void iFillInTheNewsletterField() {
        header.getNewsletterField().sendKeys("victorgbo@yahoo.com");
    }

    @When("^I press the Subscribe button$")
    public void iPressTheSubscribeButton() {
        header.getSubscribeButton().click();
    }

    @Then("^I receive the following message: \"([^\"]*)\"$")
    public void iReceiveTheFollowingMessage(String confirmationMessage) {
        WebElement successMessage= driver.findElement(By.cssSelector(".success-msg > ul:nth-child(1) > li:nth-child(1) > span:nth-child(1)"));


    }

    @And("^I open the login page$")
    public void iOpenTheLoginPage() {
        header.getAccountLink().click();
        header.getLoginLink().click();
    }

    @And("^i enter credentials$")
    public void iEnterCredentials() {
        header.getEmailField().sendKeys("victor@yahoo.com");
        header.getPassField().sendKeys("123456");

    }

    @When("^I press the login button$")
    public void iPressTheLoginButton() {
        header.getLoginButton().click();
    }

    @Then("^I get an error message:\"([^\"]*)\"$")
    public void iGetAnErrorMessage(String errorMsg) {
        WebElement failMsg = driver.findElement(By.cssSelector(".error-msg > ul:nth-child(1) > li:nth-child(1) > span:nth-child(1)"));

    }

    @And("^I enter only password credentials$")
    public void iEnterOnlyPasswordCredentials() {
        header.getPassField().sendKeys("123456");
    }

    @Then("^I get the error message \"([^\"]*)\"$")
    public void iGetTheErrorMessage(String emptyField) {
        WebElement emptyMailField=driver.findElement((By.id("advice-required-entry-email")));

    }

    @And("^I enter valid credentials$")
    public void iEnterValidCredentials() {
        header.getEmailField().sendKeys("victorgarbo@yahoo.com");
        header.getPassField().sendKeys("123456");

    }

    @Then("^I am redirected to \"([^\"]*)\" page$")
    public void iAmRedirectedToPage(String redirected) {
        WebElement myAccountPage= driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div/div[2]/div[2]/div/div[1]/h1"));


    }

    @When("^i press the logout button$")
    public void iPressTheLogoutButton() {
        header.getAccountLink().click();
        header.getLogoutButton().click();
    }

    @Then("^i receive the message \"([^\"]*)\"$")
    public void iReceiveTheMessage(String logout) {
        WebElement logoutPage=driver.findElement(By.cssSelector(".page-title > h1:nth-child(1)"));

    }

    @And("^I access account information$")
    public void iAccessAccountInformation() {
        header.getAccountInfo().click();

    }

    @And("^I fill in the middle name field with new information and password field$")
    public void iFillInTheMiddleNameFieldWithNewInformationAndPasswordField() {
        header.getMiddleNameField().clear();
        header.getMiddleNameField().sendKeys("Val");
        header.getCurrentPassword().sendKeys("123456");

    }

    @When("^I press the Save button$")
    public void iPressTheSaveButton() {
        header.getSaveInfoButton().click();
    }

    @Then("^i get the message \"([^\"]*)\"$")
    public void iGetTheMessage(String message) {
        WebElement successMsg=driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div/div[2]/div[2]/div/ul/li/ul/li/span"));
    }

    @And("^I access the newsletter information$")
    public void iAccessTheNewsletterInformation() {
        header.getNewsletterInfo().click();

    }

    @When("^I uncheck the newsletter box$")
    public void iUncheckTheNewsletterBox() {
        header.getNewsletterCheckbox().click();
    }

    @And("^I press the save information button$")
    public void iPressTheSaveInformationButton() {
        header.getSaveInfoButton().click();

    }

    @Then("^I get the following message \"([^\"]*)\"$")
    public void iGetTheFollowingMessage(String removed) {
        WebElement removedMsg=driver.findElement(By.cssSelector(".success-msg > ul:nth-child(1) > li:nth-child(1) > span:nth-child(1)"));
    }
}

