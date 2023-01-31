package edu.craptocraft.stockx.criteria;

import java.util.List;

import edu.craptocraft.stockx.item.Offer;
import edu.craptocraft.stockx.item.Item;

public interface Criteria {
    
    List<Offer> checkCriteria(Item sneaker);

}
