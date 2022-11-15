package cc39001182.q2;

import java.util.HashMap;
import java.util.Map;

public class Cookingreference2 implements CookingReferenceRetriever{
    @Override
    public Map<String, CookingReference> retrieveFromIngredient(String ingredient) {
        Marmitor m = new Marmitor(); //création instance Marmitor
        System.out.println(m.rechercher(ingredient).toString()); //affichage de la liste des recettes
        GrossBouf gb = new GrossBouf(); //création instance GrossBouf
        System.out.println(gb.find(ingredient).toString()); //affichage de la liste des recettes
        return null;
    }
}
