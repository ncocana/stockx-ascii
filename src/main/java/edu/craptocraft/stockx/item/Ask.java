package edu.craptocraft.stockx.item;

public class Ask implements Offer{
    
    private String size = "";
    private Integer ask = 0;

    public Ask(String size, int ask) {
        this.size = size;
        this.ask = ask;
    }

    @Override
    public String size() {
        return this.size;
    }

    @Override
    public int value() {
        return this.ask;
    }

    @Override
    public int compareTo(Offer offerAsk) {
        // Must be Integer instead of int to work.
        // Compares ask's value to offerAsk's value.
        return this.ask.compareTo(offerAsk.value());
    }

    @Override
    public String toString() {
        return "\n\t\t" + this.size() + "\t" + this.value();
    }

}
