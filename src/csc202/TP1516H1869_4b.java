package csc202;

public class TP1516H1869_4b {
    private String stockNumber;
    private String name;
    private double price;
    private int totalStock;
    // New salesTax attribute declared
    private double salesTax;
    // Line of code making salesTax constant
    private final int SALESTAX = 10;

    public TP1516H1869_4b (String stockNumber, String name, double price) {
        this.stockNumber = stockNumber;
        this.name = name;
        this.price = price;
    }

    public void setPrice(double newPrice) {
        this.price = newPrice;
    }

    public void increaseTotalStock (int offset) {
        this.totalStock += offset;
    }

    public String getStockNumber () {
        return this.stockNumber;
    }

    public String getName () {
        return this.name;
    }

    public int getTotalStock () {
        return this.totalStock;
    }

    public double getPrice () {
        return this.price;
    }

    public double calculateTotalPrice () {
        double totalPrice = this.price * this.totalStock;
        return totalPrice;
    }

    // New setSalesTax method
    public void setSalesTax(double newSalesTax) {
        this.salesTax = newSalesTax;
    }
}
