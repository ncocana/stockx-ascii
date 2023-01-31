package src.main.java.edu.craptocraft.stockx.criteria;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import src.main.java.edu.craptocraft.stockx.item.Offer;
import src.main.java.edu.craptocraft.stockx.item.Item;
import src.main.java.edu.craptocraft.stockx.item.Bid;

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
