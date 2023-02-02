package edu.craptocraft.stockx.item;

public class Sale implements Offer {
    
    private String size = "";
    private Integer sale = 0;

    public Sale(String size, int sale) {
        this.size = size;
        this.sale = sale;
    }

    @Override
    public String size() {
        return this.size;
    }

    @Override
    public int value() {
        return this.sale;
    }

    @Override
    public int compareTo(Offer offerSale) {
        // Must be Integer instead of int to work.
        // Compares sale's value to offerSale's value.
        return this.sale.compareTo(offerSale.value());
    }

    @Override
    public String toString() {
        return "\n\t\t" + size() + "\t" + value();
    }

}
