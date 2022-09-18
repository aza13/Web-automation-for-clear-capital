package pageObjects;

import org.openqa.selenium.By;

public class CouponCodePageObjects {

    private CouponCodePageObjects(){}

    public static final By searchBox = By.xpath("//input[@placeholder='What are you looking for?']");
    public static final By firstItem = By.xpath("//div[@id='search-results']/div[1]/div/a");
    public static final By clickSearchButton = By.xpath("//button[@id='search-box__searchbutton']");
    public static final By addToBag = By.xpath("//button[@aria-label='Add to bag']//span//span[contains(text(),'Add to bag')]");
    public static final By closeShoppingBagWindow = By.xpath("//button[@aria-label='Close']//span");
    public static final By thirdItem = By.xpath("//div[@id='search-results']/div[3]/div/a");
    public static final By continueToBag = By.xpath("//a[normalize-space()='Continue to bag']");
    public static final By dataCount = By.xpath("//span[@data-count='2']");
    public static final By discountCode = By.xpath("//button[@aria-controls='SEC_cart-coupon']//*[name()='svg']");
    public static final By discountCodeInput = By.xpath("//input[@id='discountCode']");
    public static final By applyButton = By.xpath("//span[contains(text(),'Apply')]");
    public static final By invalidCouponCode = By.xpath("//span[@id='discount-code__error']//span[1]");
}
