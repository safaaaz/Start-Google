package week2.LamdasStreams;

public class Client {
    public static void main(String[] args) {
        Stock stock = new Stock();
        stock.addItemToStock();
        stock.addItemToStock();
        stock.addItemToStock();

        System.out.println("List of expired items: "+stock.expiredItems());
        System.out.println("closest expiry date item: "+stock.closestExpiryDateItem());
        System.out.println("Items sorted alphabetically: "+ stock.itemsSortedAlphabetically());
        System.out.println("Item has name hp : "+stock.itemByName("hp").orElse(null));
        System.out.println("Item's names that have weight above 2.0 : "+stock.namesAboveCertainWeight(20.0));
        System.out.println(stock.countItemsByType());
    }
}
