package edu.craptocraft.stockx.criteria;

import java.util.List;
import java.util.stream.Collectors;

import edu.craptocraft.stockx.item.Offer;
import edu.craptocraft.stockx.item.Item;

public class AndCriteria implements Criteria{
    
    private Criteria criteria = null;
    private Criteria otherCriteria = null;

    public AndCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Offer> checkCriteria(Item sneaker) {
        List<Offer> firstCriteriaItems = criteria.checkCriteria(sneaker);
        List<Offer> otherCriteriaItems = otherCriteria.checkCriteria(sneaker);

        return firstCriteriaItems.stream()
                                    .filter(otherCriteriaItems::contains)
                                    .collect(Collectors.toList());
    }
}
