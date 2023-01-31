package src.main.domain.criteria;

import java.util.List;
import java.util.Optional;

import src.main.domain.item.Offer;
import src.main.domain.item.Bid;
import src.main.domain.item.Item;

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