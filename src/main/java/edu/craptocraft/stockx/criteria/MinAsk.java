package src.main.java.edu.craptocraft.stockx.criteria;

import java.util.List;
import java.util.Optional;

import src.main.java.edu.craptocraft.stockx.item.Offer;
import src.main.java.edu.craptocraft.stockx.item.Ask;
import src.main.java.edu.craptocraft.stockx.item.Item;

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