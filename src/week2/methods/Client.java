package week2.methods;

import java.util.ArrayList;

public class Client {
    public static void main(String[] args) {
        Store store=new Store();
        User user = new User("safaa");
        store.assignCouponToUser(user,100);
        store.assignCouponToUser(user,50);
        store.assignCouponToUser(user,400);
        store.assignCouponToUser(user,20);

        System.out.println(user);

        System.out.println(store.UserUseCouponById(user,user.getCoupons().get(0).getId()));
        System.out.println(store.UserUseCouponByHighestValue(user));
        System.out.println(store.UserUseRandomCoupon(user));
        System.out.println(store.UserUseCouponByClosestDate(user));

    }
}
