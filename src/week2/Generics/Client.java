package week2.Generics;

import java.util.concurrent.*;

public class Client {
    public static void main(String[] args) throws Exception {
        Callable<String> stringCallable = new Callable<String>() {
            @Override
            public String call() throws Exception {
                return "Shalom";
            }
        };
        Callable<Double> doubleCallable = new Callable<Double>() {
            @Override
            public Double call() throws Exception {
                return ThreadLocalRandom.current().nextDouble(10);
            }
        };
        System.out.println(retry(doubleCallable,3.0,50,100).toString());
        System.out.println(retry(stringCallable,"safaa",50,100).toString());

    }

    public static <T> T retry(Callable<T> action, T expectedResult,int retries,int sleep) throws Exception {
        if (retries<=0)
            throw new IllegalArgumentException();
        T cuurent = action.call();
        try {

            for(int i=0; i< retries-1; i++){
                cuurent = action.call();
                Thread.sleep(sleep);
                if(cuurent.equals(expectedResult)) return expectedResult;
            }
            return (T) cuurent;
        } catch (Exception e){

        }
        return (T) cuurent;
    }
}
