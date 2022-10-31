package week1;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> strings=new ArrayList<>();
        int [] arr=new int[2];
        arr[0]= 4;
        arr[1]=5;
        Main obj=new Main();
        obj.devidenumbers(arr,1);

    }
    public void devidenumbers(int [] array,int num){
        System.out.println("--------------------------FOR---------------------");
        for (int i = 0; i < array.length; i++) {
            if(array[i]%num==0){System.out.println(array[i]);}
        }

        System.out.println("--------------------------FOR-each----------------------");
        for (int x: array
             ) {
            if(x%num==0){
                System.out.println(x);
            }
        }

        System.out.println("--------------------------while---------------------");
        int i=0;
        int size = array.length;
        while (i<size){
            if(array[i]%num==0){
                System.out.println(array[i]);
            }
            i++;
        }
    }
}
