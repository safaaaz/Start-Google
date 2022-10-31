package week2.methods;

import java.time.Duration;
import java.time.temporal.Temporal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

public class User {
    final private String name;
    private List<Coupon> coupons;

    public User(String name) {
        this.name = name;
        this.coupons = new ArrayList<>();
    }

    public void insertNewCoupon(Coupon coupon){
        coupons.add(coupon);
        System.out.println("Coupon added successfully");
    }
    public Optional<Coupon> getCouponById(int couponsId){
        if(coupons.isEmpty()) return Optional.empty();
        for (Coupon coupon:
             coupons) {
            if(coupon.getId() == couponsId)
                coupons.remove(coupon);
                return Optional.of(coupon);
        }
        return Optional.empty();
    }
    public Optional<Coupon> getCouponByHighestValue(){
        if(coupons.isEmpty()) return Optional.empty();
        double maxValue=0;
        Coupon maxCoupon=null;
        for (Coupon coupon:
                coupons) {
            if(coupon.getValue()>= maxValue)
            {   maxValue=coupon.getValue();
                maxCoupon=coupon; }
        }
        if(maxCoupon!=null){
            coupons.remove(maxCoupon);
            return Optional.of(maxCoupon);
        }
        return Optional.empty();
    }
    public Optional<Coupon> getCouponByClosestDate(){
        if(coupons.isEmpty()) return Optional.empty();
        long timeDiff = Math.abs(new Date().getTime() - coupons.get(0).getExpiryDate().getTime());
        long expirtyDays = TimeUnit.DAYS.convert(timeDiff, TimeUnit.MILLISECONDS);
        long lastDays;
        Coupon closeCoupon=coupons.get(0);
        for (Coupon coupon:
                coupons) {
            timeDiff = Math.abs(new Date().getTime() - coupon.getExpiryDate().getTime());
            lastDays = TimeUnit.DAYS.convert(timeDiff, TimeUnit.MILLISECONDS);
            if(lastDays<expirtyDays)
            {   expirtyDays=lastDays;
                closeCoupon=coupon; }
        }
        if(closeCoupon!=null){
            coupons.remove(closeCoupon);
            return Optional.of(closeCoupon);}
        return Optional.empty();
    }
    public Coupon getRandomCoupon(){
        if(coupons.isEmpty()) return null;
        Coupon c =coupons.get(ThreadLocalRandom.current().nextInt(coupons.size()-1));
        coupons.remove(c);
        return c;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", coupons=" + coupons +
                '}';
    }

    public String getName() {
        return name;
    }

    public List<Coupon> getCoupons() {
        return new ArrayList<>(coupons);
    }
}
