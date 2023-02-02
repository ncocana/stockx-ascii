package edu.craptocraft.stockx.criteria;

import java.util.ArrayList;
import java.util.List;

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
        
        // Creates a list for every criteria.
        List<Offer> firstCriteriaItems = criteria.checkCriteria(sneaker);
        List<Offer> otherCriteriaItems = otherCriteria.checkCriteria(sneaker);
        
        // Creates a new list to save the final values.
        List<Offer> items = new ArrayList<Offer>();
        
        // For every offer (object) in firstCriteriaItems...
        for (Offer offer : firstCriteriaItems) {
            // If otherCriteriaItems contains that offer...
            if (otherCriteriaItems.contains(offer)) {
                // Add the offer to the final list to be returned.
                items.add(offer);
            }
        }

        return items;

    }
}
