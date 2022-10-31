package week2.methods;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.ThreadLocalRandom;

public class Store {

    public void assignCouponToUser(User user,double couponValue){
        Calendar c= Calendar.getInstance();
        c.setTime(new Date());
        c.add(Calendar.DATE, 10);
        user.insertNewCoupon(new Coupon(ThreadLocalRandom.current().nextInt(200), c.getTime(),couponValue));
    }

    public Coupon UserUseCouponById(User user,int couponId){
        Coupon coupon = user.getCouponById(couponId).orElseThrow(() -> new RuntimeException("Coupon not found") );
        return coupon;
    }
    public Coupon UserUseCouponByHighestValue(User user){
        Coupon coupon = user.getCouponByHighestValue().orElseThrow(() -> new RuntimeException("Coupon not found") );
        return coupon;
    }
    public Coupon UserUseCouponByClosestDate(User user){
        Coupon coupon = user.getCouponByClosestDate().orElseThrow(() -> new RuntimeException("Coupon not found") );
        return coupon;
    }
    public Coupon UserUseRandomCoupon(User user){
        return user.getRandomCoupon();
    }
}
