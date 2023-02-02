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

    // Returns a list of Offer objects that meet both
    // the criteria stored in the 'criteria' and 'otherCriteria' objects.
    @Override
    public List<Offer> checkCriteria(Item sneaker) {
        List<Offer> firstCriteriaItems = criteria.checkCriteria(sneaker);
        List<Offer> otherCriteriaItems = otherCriteria.checkCriteria(sneaker);

        // Filters 'firstCriteriaItems' and retain only
        // the elements that are contained in 'otherCriteriaItems'.
        // This filtered list is collected into a new list using
        // the 'Collectors.toList' method and returned as the result
        // of the 'checkCriteria' method.
        return firstCriteriaItems.stream()
                                    .filter(otherCriteriaItems::contains)
                                    .collect(Collectors.toList());
    }
}
