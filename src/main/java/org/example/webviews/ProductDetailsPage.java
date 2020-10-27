package org.example.webviews;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductDetailsPage {

    @FindBy(name = "red")
    private WebElement redColorSelector;

    @FindBy(name = "m")
    private WebElement mediumSizeSelector;

    @FindBy(css = ".add-to-cart-buttons .btn-cart")
    private WebElement addToCartButton;

    @FindBy(css = ".product-shop .product-name")
    private WebElement productNameContainer;

    public WebElement getRedColorSelector() {
        return redColorSelector;
    }

    public WebElement getMediumSizeSelector() {
        return mediumSizeSelector;
    }

    public WebElement getAddToCartButton() {
        return addToCartButton;
    }

    public WebElement getProductNameContainer() {
        return productNameContainer;
    }
}
