package edu.craptocraft.stockx.criteria;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import edu.craptocraft.stockx.item.Offer;
import edu.craptocraft.stockx.item.Ask;
import edu.craptocraft.stockx.item.Item;

public class Asks implements Criteria{
    
    /* (non-Javadoc)
     * @see edu.craptocraft.stockx.criteria.Criteria#checkCriteria(edu.craptocraft.stockx.item.Item)
     */
    @Override
    public List<Offer> checkCriteria(Item sneaker) {
        return sneaker.offers()
                        .stream()
                        .filter(o -> o instanceof Ask)
                        .sorted(Comparator.reverseOrder())
                        .collect(Collectors.toList());
    }

}