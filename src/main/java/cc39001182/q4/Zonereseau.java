package cc39001182.q4;

import java.util.List;

public class Zonereseau implements Ireseaux{
    String id;
    List<Integer> abonnement;

    public Zonereseau(String id, List<Integer> res) {
        this.id = id;
        this.abonnement = res;
    }

    @Override
    public String id() {
        return this.id;
    }

    @Override
    public int abonnement() {
        int somme=0;
        int i;
        for(i = 0; i< abonnement.size(); i++)
        {
            somme = somme + abonnement.get(i);
        }
        return somme;
    }

    @Override
    public void addConsommation(int consso) {

    }

    @Override
    public int consommation() {
        return 0;
    }

    @Override
    public void reset() {

    }
}
