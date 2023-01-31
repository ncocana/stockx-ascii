package src.main.java.edu.craptocraft.stockx.criteria;

import java.util.List;

import src.main.java.edu.craptocraft.stockx.item.Offer;
import src.main.java.edu.craptocraft.stockx.item.Item;

public interface Criteria {
    
    List<Offer> checkCriteria(Item sneaker);

}
