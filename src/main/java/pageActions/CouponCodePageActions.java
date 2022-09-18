package pageActions;

import base.BaseTest;
import helper.ClickHelper;
import helper.TextHelper;
import helper.WaitHelper;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static pageObjects.CouponCodePageObjects.*;

public class CouponCodePageActions extends BaseTest {

    private static final Logger logger = Logger.getLogger(CouponCodePageActions.class);


    public void enterTextToSearchBox(WebDriver driver, String textInput) throws InterruptedException {

        TextHelper.enterText(driver,searchBox , textInput);
        WaitHelper.pause(3000);
        ClickHelper.clickElement(driver, clickSearchButton);

    }
    public void addFirstItemToCart(WebDriver driver) throws InterruptedException {
        WaitHelper.waitForElementVisibility(driver,firstItem );
        ClickHelper.clickElement(driver, firstItem);
        WaitHelper.waitForElementVisibility( driver, addToBag);
        ClickHelper.clickElement(driver, addToBag);
        WaitHelper.waitForElementVisibility(driver, closeShoppingBagWindow);
        ClickHelper.clickElement(driver, closeShoppingBagWindow);
        WaitHelper.pause(1000);
    }

    public void addThirdItemToCart(WebDriver driver) throws InterruptedException {
        WaitHelper.waitForElementVisibility(driver, thirdItem);
        ClickHelper.clickElement(driver, thirdItem);
        WaitHelper.waitForElementVisibility( driver, addToBag);
        ClickHelper.clickElement(driver, addToBag);
        WaitHelper.waitForElementVisibility(driver, continueToBag);
        ClickHelper.clickElement(driver,continueToBag);
        WaitHelper.pause(3000);
    }

    public WebElement shoppingCartData (WebDriver driver) {
        return driver.findElement(dataCount);
    }

    public void addInvalidCouponCode (WebDriver driver) {
        WaitHelper.waitForElementVisibility(driver, discountCode);
        ClickHelper.clickElement(driver, discountCode);
        WaitHelper.waitForElementVisibility(driver, discountCodeInput);

    }

    public void enterTextToDiscountSearchBox (WebDriver driver, String textInput) {
       TextHelper.enterText(driver, discountCodeInput, textInput);
       WaitHelper.waitForElementVisibility(driver, applyButton);
       ClickHelper.clickElement(driver, applyButton);
       WaitHelper.waitForElementVisibility(driver, invalidCouponCode);
    }

    public WebElement invalidCodeDisplayed (WebDriver driver) {
        return driver.findElement(invalidCouponCode);

    }





}
