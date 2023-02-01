package edu.craptocraft.stockx.item;

public class Bid implements Offer {
    
    public String size = "";
    public Integer bid = 0;

    public Bid(String size, int bid) {
        this.size = size;
        this.bid = bid;
    }

    @Override
    public String size() {
        return this.size;
    }

    @Override
    public int value() {
        return this.bid;
    }

    @Override
    public int compareTo(Offer offerBid) {
        // Must be Integer instead of int to work.
        // Compares bid's value to offerBid's value.
        return this.bid.compareTo(offerBid.value());
    }

    @Override
    public String toString() {
        return "\n\t\t" + size() + "\t" + value();
    }

}
