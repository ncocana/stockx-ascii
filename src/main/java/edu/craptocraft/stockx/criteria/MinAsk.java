package edu.craptocraft.stockx.criteria;

import java.util.List;
import java.util.Optional;

import edu.craptocraft.stockx.item.Offer;
import edu.craptocraft.stockx.item.Ask;
import edu.craptocraft.stockx.item.Item;

public class MinAsk implements Criteria{
    
    @Override
    public List<Offer> checkCriteria(Item sneaker) {
        Optional<Offer> min = sneaker.offers()
                        .stream()
                        .filter(o -> o instanceof Ask)
                        .min(Offer::compareTo);
        return min.isPresent()? List.of(min.get()) : List.of();
    }

}