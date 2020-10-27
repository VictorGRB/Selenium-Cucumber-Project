package org.example.search;

import org.example.AppConfig;
import org.example.TestBase;
import org.example.webviews.Header;
import org.example.webviews.ProductsGrid;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;
@RunWith(Parameterized.class)
public class SimpleSearchTest extends TestBase {

    private String searchKeyword;

    public SimpleSearchTest(String searchKeyword) {
        this.searchKeyword = searchKeyword;
    }

    @Parameterized.Parameters
    public static List<String> data(){
        return Arrays.asList("vase");
    }

    @Test
    public void simpleSearchWithOneKeyword(){
        openHomepage();

        Header header= PageFactory.initElements(driver, Header.class);



        header.search(searchKeyword);

        ProductsGrid productsGrid= PageFactory.initElements(driver, ProductsGrid.class);

        System.out.println("Stored "+productsGrid.getProductNames().size()+" product names");

        for(WebElement productName: productsGrid.getProductNames()){

            assertThat("Some products' name did not contain the keyword", productName.getText(),
                    containsString(searchKeyword.toUpperCase()));
        }

    }
}
