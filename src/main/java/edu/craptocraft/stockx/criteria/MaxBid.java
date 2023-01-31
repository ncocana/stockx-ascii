package edu.craptocraft.stockx.criteria;

import java.util.List;
import java.util.Optional;

import edu.craptocraft.stockx.item.Offer;
import edu.craptocraft.stockx.item.Bid;
import edu.craptocraft.stockx.item.Item;

public class MaxBid implements Criteria{
    
    @Override
    public List<Offer> checkCriteria(Item sneaker) {
        Optional<Offer> max = sneaker.offers()
                        .stream()
                        .filter(o -> o instanceof Bid)
                        .max(Offer::compareTo);
        return max.isPresent()? List.of(max.get()) : List.of();
    }

}