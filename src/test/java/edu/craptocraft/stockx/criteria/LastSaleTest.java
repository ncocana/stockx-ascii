package edu.craptocraft.stockx.criteria;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;

import edu.craptocraft.stockx.item.Offer;
import edu.craptocraft.stockx.item.Sale;
import edu.craptocraft.stockx.item.Sneaker;

public class LastSaleTest {

    @Test
    public void lastSale_test() {
        Sneaker sneaker = new Sneaker("555088-105", "Jordan 1");
        Sale sale = new Sale("10", 356);
        sneaker.add(sale);
        sneaker.add(new Sale("9", 352));
        sneaker.add(new Sale("10", 404));
        sneaker.add(new Sale("8", 372));

        Criteria lastSale = new LastSale();
        List<Offer> actualSale = lastSale.checkCriteria(sneaker);
        assertEquals(372, actualSale.get(0).value());
    }

    @Test
    public void lastSale_null_test() {
        Sneaker sneaker = new Sneaker("555088-105", "Jordan 1");

        Criteria lastSale = new LastSale();
        List<Offer> actualSale = lastSale.checkCriteria(sneaker);
        assertTrue(actualSale.isEmpty());
    }
}