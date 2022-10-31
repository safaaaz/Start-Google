package week2.LamdasStreams;

import week1.utility;

import java.time.LocalDate;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;

public class Stock {
    List <Item> stock;

    Stock(){
        stock = new ArrayList<>();
    }
    void addItemToStock(){
        stock.add(
                new Item(utility.RandomString(7),
                        PRODUCTTYPE.values()[ThreadLocalRandom.current().nextInt(PRODUCTTYPE.values().length-1)],
                        LocalDate.now().plusDays(ThreadLocalRandom.current().nextInt(365)),
                        ThreadLocalRandom.current().nextInt(200)));
    }
    List<Item> expiredItems(){
        return stock.stream().filter(item -> item.getExpirationDate().isAfter(LocalDate.now())).collect(Collectors.toList());
    }
    Item closestExpiryDateItem(){
        Collections.sort(stock);
        return stock.get(0);
    }
    List<Item> itemsSortedAlphabetically(){
        Collections.sort(stock, Comparator.comparing(Item::getName));
        return stock;
    }
    Optional<Item> itemByName(String name){
        return stock.stream().filter(item -> item.getName().equals(name)).findFirst();
    }
    List<String> namesAboveCertainWeight(double weight){
        if(weight<=0) throw new IllegalArgumentException();
        return stock.stream().filter(item -> item.getWeight()>weight).map(Item::getName).collect(Collectors.toList());

    }
    HashMap<PRODUCTTYPE,Long> countItemsByType(){
        return (HashMap<PRODUCTTYPE, Long>) stock.stream().collect(Collectors.groupingBy(Item::getType,Collectors.counting()));
    }


}
