package cc39001182.q2;

import java.util.Map;

public class Cookingreference2 implements CookingReferenceRetriever{
    @Override
    public Map<String, CookingReference> retrieveFromIngredient(String ingredient) {
        Marmitor m = new Marmitor();
        System.out.println(m.rechercher(ingredient));
        GrossBouf gb = new GrossBouf();
        System.out.println(gb.find(ingredient));
        return null;
    }
}
