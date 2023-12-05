package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.BooksPage;
import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

/*
1. create class "TopMenuTest" into testsuite package
        1.1 create method with name "selectMenu" it has one parameter name "menu" of type
        string
        1.2 This method should click on the menu whatever name is passed as parameter.
 */
public class TopMenuTest extends BaseTest {

    HomePage homePage = new HomePage();
    BooksPage booksPage = new BooksPage();

    @Test
    public void verifyPageNavigation() {
        homePage.selectMenu("Books");
        Assert.assertEquals(homePage.getTitleOfPage(), "Books", "Page Navigated Successfully");
    }
}