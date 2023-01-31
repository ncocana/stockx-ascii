package src.main.domain.item;

public class Ask implements Offer{
    
    public final String size;
    public final int bid;

    public Ask(String size, int bid) {
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
