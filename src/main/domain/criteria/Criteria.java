package src.main.domain.criteria;

import java.util.List;

import src.main.domain.item.Offer;
import src.main.domain.item.Item;

public interface Criteria {
    
    List<Offer> checkCriteria(Item sneaker);

}
