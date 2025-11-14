public class Produit {
    private String nom;
    private float prix;
    private  float quantite;
    Produit(String nom,float prix,float quantite ){
        this.nom=nom;
        this.prix=prix;
        this.quantite=quantite;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    public float getQuantite() {
        return quantite;
    }

    public void setQuantite(float quantite) {
        this.quantite = quantite;
    }

}
