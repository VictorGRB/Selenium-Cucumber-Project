package org.example.webviews;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class Header {

    @FindBy(xpath = "/html/body/div/div[2]/div[2]/div/div[2]/div[2]/form/div[2]/button")
    private WebElement saveinfoButton;

    @FindBy(xpath = "/html/body/div/div[2]/div[2]/div/div[1]/div/div[2]/ul/li[10]/a")
    private WebElement newsletterInfo;

    @FindBy(id = "subscription")
    private WebElement newsletterCheckbox;

    @FindBy(css = "button.button:nth-child(2)")
    private WebElement saveInfoButton;

    @FindBy(id="current_password")
    private WebElement currentPassword;

    @FindBy(id="middlename")
    private WebElement middleNameField;

    @FindBy(xpath = "/html/body/div/div[2]/div[2]/div/div[1]/div/div[2]/ul/li[2]/a")
    private WebElement accountInfo;

    @FindBy(linkText = "Log Out")
    private WebElement logoutButton;

    @FindBy(id="send2")
    private WebElement loginButton;

    @FindBy(xpath = "/html/body/div/div[2]/div[3]/div/div[1]/form/div/div[3]/button")
    private WebElement subscribeButton;

    public WebElement getSubscribeButton() {
        return subscribeButton;
    }

    @FindBy(id="newsletter")
    private WebElement newsletterField;

    public WebElement getNewsletterField() {
        return newsletterField;
    }

    @FindBy(linkText = "FRAUEN")
    private WebElement womenTag;

    public WebElement getWomenTag() {
        return womenTag;
    }

    @FindBy(xpath = "//select[@title='Your Language']")
    private WebElement selectLanguage;

    @FindBy(id="search")
    private WebElement searchField;

    @FindBy(className = "skip-account")
    private WebElement accountLink;

    @FindBy(linkText = "Register")
    private WebElement registerLink;

    @FindBy(linkText = "Log In")
    private WebElement loginLink;

    @FindBy(id="email")
    private WebElement emailField;

    @FindBy(id="pass")
    private WebElement passField;

    public WebElement getEmailField() {
        return emailField;
    }

    public WebElement getPassField() {
        return passField;
    }

    public WebElement getLoginButton() {
        return loginButton;
    }

    public WebElement getLogoutButton() {
        return logoutButton;
    }

    public WebElement getSaveInfoButton() {
        return saveInfoButton;
    }

    public WebElement getAccountInfo() {
        return accountInfo;
    }

    public WebElement getCurrentPassword() {
        return currentPassword;
    }

    public WebElement getMiddleNameField() {
        return middleNameField;
    }

    public WebElement getNewsletterCheckbox() {
        return newsletterCheckbox;
    }

    public WebElement getNewsletterInfo() {
        return newsletterInfo;
    }

    public WebElement getSearchField() {
        return searchField;
    }

    public WebElement getLoginLink() {
        return loginLink;
    }

    public WebElement getAccountLink() {
        return accountLink;
    }

    public WebElement getRegisterLink() {
        return registerLink;
    }
    public void search(String keyword){
        searchField.clear();
        searchField.sendKeys(keyword+ Keys.ENTER);
    }

    public Select getSelectLanguage(){
        return new Select(selectLanguage);
    }
}
