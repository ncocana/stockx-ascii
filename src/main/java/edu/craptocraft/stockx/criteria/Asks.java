package src.main.java.edu.craptocraft.stockx.criteria;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import src.main.java.edu.craptocraft.stockx.item.Offer;
import src.main.java.edu.craptocraft.stockx.item.Ask;
import src.main.java.edu.craptocraft.stockx.item.Item;

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