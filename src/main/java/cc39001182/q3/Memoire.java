package cc39001182.q3;

public class Memoire implements Builder{
    private Memoire mem;
    private String titre;
    private String auteur;
    private String introduction;
    private String conclusion;

    private String resume;

    private String remerciements;

    private String chapitre;

    private String biblio;

    public Memoire(String titre, String auteur, String introduction, String conclusion, Boolean resume, Boolean remerciements, Boolean chapitres, Boolean bibliographie)
    {
        settitre(titre);
        setauteur(auteur);
        setintroduction(introduction);
        setconclusion(conclusion);
    }

    @Override
    public String settitre(String titre) {
        return this.titre=titre;
    }

    @Override
    public String setauteur(String auteur) {
        return this.auteur=auteur;
    }

    @Override
    public String setintroduction(String intro) {
        return this.introduction=intro;
    }

    @Override
    public String setconclusion(String conclu) {
        return this.conclusion=conclu;
    }

    @Override
    public String setresume(String resume) {
        return this.resume=resume;
    }

    @Override
    public String setremerciements(String remerciements) {
        return this.remerciements=remerciements;
    }

    @Override
    public String setchapitre(String chap) {
        return this.chapitre=chap;
    }

    @Override
    public String setbiblio(String biblio) {
        return this.biblio=biblio;
    }
}
