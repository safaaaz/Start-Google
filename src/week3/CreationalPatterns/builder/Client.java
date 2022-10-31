package week3.CreationalPatterns.builder;

import java.time.LocalDate;

public class Client {
    public static void main(String[] args) {
        JobPosition job = new JobPosition.Builder(LocalDate.now(),"developer",true).salaryCap(10111.0).description("To think and write a code").build();
        System.out.println(job);
    }
}
