package src.main.domain.item;

import java.util.ArrayList;
import java.util.List;

public class Sneaker implements Item {
    
    public final String style;
    public final String name;
    public int sale;
    public int ask;
    public int bid;
    private List<Offer> offers = new ArrayList<Offer>();

    public Sneaker(String style, String name) {
        this.style = style;
        this.name = name;
    }

    public String getStyle() {
        return style;
    }

    public String getName() {
        return name;
    }

    @Override
    public int getBid() {
        return this.bid;
    }

    @Override
    public int getAsk() {
        return this.ask;
    }

    @Override
    public int getSale() {
        return this.sale;
    }

    @Override
    public List<Offer> offers() {
        return this.offers;
    }

    @Override
    public String toString() {
        return getName() + "\n\t\t" + getStyle();
    }

    @Override
    public void add(Offer offer) {
        this.offers.add(offer);
        
    }

    @Override
    public void setBid(int bid) {
        this.bid = bid;
        
    }

    @Override
    public void setAsk(int ask) {
        this.ask = ask;
        
    }

    @Override
    public void setSale(int sale) {
        this.sale = sale;
        
    }

}
