package edu.craptocraft.stockx.criteria;

import java.util.List;
import java.util.stream.Collectors;

import edu.craptocraft.stockx.item.Offer;
import edu.craptocraft.stockx.item.Item;
import edu.craptocraft.stockx.item.Sale;

public class Sales implements Criteria{
    
    @Override
    public List<Offer> checkCriteria(Item sneaker) {
        return sneaker.offers()
                        .stream()
                        .filter(o -> o instanceof Sale)
                        .collect(Collectors.toList());

    }
}
