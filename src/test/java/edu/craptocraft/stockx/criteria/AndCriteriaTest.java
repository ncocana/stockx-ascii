package edu.craptocraft.stockx.criteria;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import edu.craptocraft.stockx.item.Ask;
import edu.craptocraft.stockx.item.Bid;
import edu.craptocraft.stockx.item.Sneaker;

public class AndCriteriaTest {

    @Test
    public void andSizeBidCriteriaTest() {
        
        Sneaker sneaker = new Sneaker("555088-105", "Jordan 1");
        sneaker.add(new Bid("9.5", 550));
        sneaker.add(new Bid("4.5", 480));
        sneaker.add(new Bid("9.5", 900));
        sneaker.add(new Bid("6", 472));
        sneaker.add(new Ask("15", 288));
        sneaker.add(new Ask("13", 333));
        sneaker.add(new Ask("9.5", 1000));
        sneaker.add(new Ask("13", 341));
        assertEquals(8, sneaker.offers().size());

        Criteria size = new Size("9.5");
        Criteria bids = new Bids();

        assertEquals(4, bids.checkCriteria(sneaker).size());
        assertEquals(3, size.checkCriteria(sneaker).size());

        Criteria andSizeBids = new AndCriteria(size, bids);
        assertEquals(2, andSizeBids.checkCriteria(sneaker).size());
        
        assertTrue(andSizeBids.checkCriteria(sneaker).stream().allMatch(o -> o.size().equals("9.5")));
        assertTrue(andSizeBids.checkCriteria(sneaker).stream().allMatch(o -> o instanceof Bid));


        // intercambiando filtros de posicion
        Criteria andBidsSize = new AndCriteria(bids, size);
        assertEquals(2, andBidsSize.checkCriteria(sneaker).size());        
    }    
}