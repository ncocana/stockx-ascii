package src.main.java.edu.craptocraft.stockx.item;

public class Bid implements Offer {
    
    public String size;
    public int bid = 0;

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
    public int compareTo(Offer bid) {
        return this.value();
    }

    @Override
    public String toString() {
        return "\n" + size() + "\t" + value();
    }

}
