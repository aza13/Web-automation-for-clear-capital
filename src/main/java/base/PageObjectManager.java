package base;


import pageActions.*;

public class PageObjectManager {

    private static CouponCodePageActions couponCodePageActions;
    private PageObjectManager(){

    }

    public static CouponCodePageActions getCouponCodePageActions() {
        return (couponCodePageActions == null) ? couponCodePageActions = new CouponCodePageActions() : couponCodePageActions;
    }


}
