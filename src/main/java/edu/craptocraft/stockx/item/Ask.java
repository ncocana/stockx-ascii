package edu.craptocraft.stockx.item;

public class Ask implements Offer{
    
    public final String size;
    public final int ask;

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
    public int compareTo(Offer ask) {
        return this.value();
    }

    @Override
    public String toString() {
        return "\n" + size() + "\t" + value();
    }

}
