import java.util.ArrayList;
import java.util.List;

public class Commande {
    private int id_commande;
    List<Produit> produits;
    Commande(int id_commande){
        this.id_commande=id_commande;
        this.produits=new ArrayList<>();}
    int getId_commande(){
        return id_commande;
    }
    public void setId_commande(int id_commande){
        this.id_commande=id_commande;
    }
    List<Produit> getProduits(){
        return produits;
    }
    public void setProduits(List<Produit> produits){
        this.produits=produits;
    }
    public void ajouterProduit(Produit p){
        produits.add(p);
    }
    public void calculerTotal(){
        System.out.println("le totale du produits est :");
        for (Produit p :produits){

        }
    }
}
