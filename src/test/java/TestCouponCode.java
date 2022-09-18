import base.BaseTest;
import base.DriverManager;
import base.PageObjectManager;
import org.apache.log4j.Logger;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageActions.CouponCodePageActions;
import utils.dataProvider.TestDataProvider;

import java.util.Map;

public class TestCouponCode extends BaseTest {
    private static final Logger logger = Logger.getLogger(TestCouponCode.class);
    private CouponCodePageActions couponCodePageActions;


    private TestCouponCode () {

    }
    @BeforeClass(alwaysRun = false)
    public void beforeClassSetUp() {
        classLogger = extentReport.createTest("TestCouponCode");
        couponCodePageActions = PageObjectManager.getCouponCodePageActions();

    }

    @Test(dataProvider = "ask-me", dataProviderClass = TestDataProvider.class, description = "IkeaShoppingData")
    public void TestInvalidCouponCode (Map<String, String> map) throws InterruptedException {

        logger.info("test");
        couponCodePageActions.enterTextToSearchBox(DriverManager.getDriver(), map.get("FirstItem"));
        couponCodePageActions.addFirstItemToCart(DriverManager.getDriver());
        couponCodePageActions.enterTextToSearchBox(DriverManager.getDriver(), map.get("SecondItem"));
        couponCodePageActions.addThirdItemToCart(DriverManager.getDriver());
        assert couponCodePageActions.shoppingCartData(DriverManager.getDriver()).isDisplayed();
        couponCodePageActions.addInvalidCouponCode(DriverManager.getDriver());
        couponCodePageActions.enterTextToDiscountSearchBox(DriverManager.getDriver(), map.get("discountCode"));
        assert couponCodePageActions.invalidCodeDisplayed(DriverManager.getDriver()).isDisplayed();

    }





}



