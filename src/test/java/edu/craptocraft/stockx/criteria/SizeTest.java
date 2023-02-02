package edu.craptocraft.stockx.criteria;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;

import edu.craptocraft.stockx.item.Ask;
import edu.craptocraft.stockx.item.Bid;
import edu.craptocraft.stockx.item.Offer;
import edu.craptocraft.stockx.item.Sneaker;

public class SizeTest {

    @Test
    public void checkCriteria_size_Test() {
        Sneaker sneaker = new Sneaker("555088-105", "Jordan 1");
        sneaker.add(new Bid("13", 550));
        sneaker.add(new Bid("4.5", 480));
        sneaker.add(new Bid("13", 900));
        sneaker.add(new Bid("6", 472));
        sneaker.add(new Ask("15", 288));
        sneaker.add(new Ask("13", 333));
        sneaker.add(new Ask("14", 1000));
        sneaker.add(new Ask("13", 341));

        Criteria size = new Size("13");
        List<Offer> filteredSize = size.checkCriteria(sneaker);
        assertTrue(filteredSize.stream().allMatch(o -> o.size().equals("13")));
    }

    @Test
    public void checkCriteria_noSize_Test() {
        Sneaker sneaker = new Sneaker("555088-105", "Jordan 1");
        Criteria size = new Size("5");
        List<Offer> filteredSize = size.checkCriteria(sneaker);
        assertTrue(filteredSize.isEmpty());
    }
}