package week2.reflections;

import week2.classInterfaces.Cat;
import week2.methods.Coupon;
import week2.methods.User;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

public class reflection {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException {
        System.out.println(newInstance(new Cat("cat1",23,65)));
        //System.out.println(newInstance(new User("user1", new ArrayList<Coupon>())));

    }
    public static Object newInstance(Object o) throws ClassNotFoundException, NoSuchMethodException {
        Object newObject=null;
        try {
            Constructor<?> constructor = o.getClass().getConstructor(String.class,int.class,double.class);
            newObject = constructor.newInstance("safaa",3,23);
        }
        catch (NoSuchMethodException e){
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        }
        return newObject;
    }
}
