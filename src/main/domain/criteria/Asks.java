package src.main.domain.criteria;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import src.main.domain.item.Offer;
import src.main.domain.item.Ask;
import src.main.domain.item.Item;

public class Asks implements Criteria{
    
    @Override
    public List<Offer> checkCriteria(Item sneaker) {
        return sneaker.offers()
                        .stream()
                        .filter(o -> o instanceof Ask)
                        .sorted(Comparator.reverseOrder())
                        .collect(Collectors.toList());
    }

}