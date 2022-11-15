package cc39001182.q2;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        CookingReferenceRetriever retriever= new Cookingreference2();// ici une instance de réalisation de l'interface
        Map<String, CookingReference> map = retriever.retrieveFromIngredient("tomate");
    }


}