package edu.craptocraft.stockx.criteria;

import java.util.List;
import java.util.Optional;

import edu.craptocraft.stockx.item.Offer;
import edu.craptocraft.stockx.item.Item;
import edu.craptocraft.stockx.item.Sale;

public class LastSale implements Criteria{
    
    @Override
    public List<Offer> checkCriteria(Item sneaker) {
        Optional<Offer> sales = sneaker.offers()
                        .stream()
                        .filter(o -> o instanceof Sale)
                        .reduce((first, second) -> second);
        return sales.isPresent()? List.of(sales.get()) : List.of();

    }
}
