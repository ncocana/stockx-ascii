package edu.craptocraft.stockx.criteria;

import java.util.List;
import java.util.stream.Collectors;

import edu.craptocraft.stockx.item.Offer;
import edu.craptocraft.stockx.item.Item;

public class Size implements Criteria{
    
    private String size = "";

    public Size(String size) {
        this.size = size;
    }

    @Override
    public List<Offer> checkCriteria(Item sneaker) {
        return sneaker.offers()
                        .stream()
                        .filter(o -> o.size().equals(size))
                        .collect(Collectors.toList());

    }
}
