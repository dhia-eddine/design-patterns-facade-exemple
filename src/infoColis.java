public class infoColis {
    String taille;
    String poids;

    public infoColis(String taille, String poids) {
        this.taille = taille;
        this.poids = poids;
    }

    public String getTaille() {
        return taille;
    }

    public void setTaille(String taille) {
        this.taille = taille;
    }

    public String getPoids() {
        return poids;
    }

    public void setPoids(String poids) {
        this.poids = poids;
    }
}