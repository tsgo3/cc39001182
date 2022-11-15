package cc39001182.q2;

import java.util.Map;

public interface CookingReferenceRetriever {
    public Map<String, CookingReference> retrieveFromIngredient(String ingredient);
}
