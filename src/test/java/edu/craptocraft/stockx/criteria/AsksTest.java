package edu.craptocraft.stockx.criteria;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;

import edu.craptocraft.stockx.item.Ask;
import edu.craptocraft.stockx.item.Bid;
import edu.craptocraft.stockx.item.Offer;
import edu.craptocraft.stockx.item.Sneaker;

public class AsksTest {

    @Test
    public void checkCriteria_bids_asks_Test() {
        Sneaker sneaker = new Sneaker("555088-105", "Jordan 1");
        sneaker.add(new Bid("5.5", 550));
        sneaker.add(new Bid("4.5", 480));
        sneaker.add(new Bid("5.5", 900));
        sneaker.add(new Bid("6", 200));
        sneaker.add(new Ask("13", 333));
        sneaker.add(new Ask("14", 1000));
        sneaker.add(new Ask("15", 288));
        sneaker.add(new Ask("13", 341));

        Criteria asks = new Asks();
        List<Offer> filteredBids = asks.checkCriteria(sneaker);
        assertTrue(filteredBids.stream().allMatch(a -> a instanceof Ask));

        sneaker.setAsk(asks.checkCriteria(sneaker).get(0).value());
        assertEquals(333, sneaker.getAsk());
    }

    @Test
    public void checkCriteria_noBids_Test() {
        Sneaker sneaker = new Sneaker("555088-105", "Jordan 1");
        Criteria asks = new Asks();
        List<Offer> minimum = asks.checkCriteria(sneaker);
        sneaker.setBid(minimum.isEmpty()? 0 : minimum.get(0).value());
        assertEquals(0, sneaker.getAsk());
    }  
}