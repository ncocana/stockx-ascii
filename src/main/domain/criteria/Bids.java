package src.main.domain.criteria;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import src.main.domain.item.Offer;
import src.main.domain.item.Item;
import src.main.domain.item.Bid;

public class Bids implements Criteria{
    
    @Override
    public List<Offer> checkCriteria(Item sneaker) {
        return sneaker.offers()
                        .stream()
                        .filter(o -> o instanceof Bid)
                        .sorted(Comparator.reverseOrder())
                        .collect(Collectors.toList());

    }
}
