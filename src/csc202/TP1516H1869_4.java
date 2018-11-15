package csc202;

public class TP1516H1869_4 {
    public static void main (String [] args) {
        String tempNumber;
        String tempName;
        Double tempPrice;

        System.out.println ("Enter the stock number: ");
        tempNumber = "123-90";
        System.out.print ("Enter the name of the item");
        tempName = "Bulb";
        System.out.println ("Enter the price of the item");
        tempPrice = 50.0;

        // First Comment
        StockItem newStock = new StockItem(tempNumber, tempName, tempPrice);

        // Second Comment
        newStock.increaseTotalStock(5);

        // Third Comment
        newStock.getStockNumber();

        // Fourth Comment
        newStock.calculateTotalPrice();


    }
}
