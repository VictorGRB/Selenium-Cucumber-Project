package org.example.stepdefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import org.example.TestBase;
import org.example.webviews.ProductDetailsPage;
import org.openqa.selenium.support.PageFactory;

public class ProductDetailsSteps extends TestBase {

    private ProductDetailsPage productDetailsPage = PageFactory.initElements(driver, ProductDetailsPage.class);


    @And("^I store the name of the product$")
    public void iStoreTheNameOfTheProduct() {
        storedProductName = productDetailsPage.getProductNameContainer().getText();
    }



    @When("^I press the Add to Cart button$")
    public void iPressTheAddToCartButton() {
        productDetailsPage.getAddToCartButton().click();
    }

    @And("^I select the color Red$")
    public void iSelectTheColorRed() { productDetailsPage.getRedColorSelector().click();

    }

    @And("^I select the size M$")
    public void iSelectTheSizeM() {productDetailsPage.getMediumSizeSelector().click();
    }
}
