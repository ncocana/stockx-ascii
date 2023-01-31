package src.main.domain.criteria;

import java.util.List;
import java.util.Optional;

import src.main.domain.item.Offer;
import src.main.domain.item.Ask;
import src.main.domain.item.Item;

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