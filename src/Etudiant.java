import java.util.ArrayList;
import java.util.List;

public class Etudiant {
    private int id_etudiant;
    private  String nom;
    private List<CCours> coursuivis;
    Etudiant(int id_etudiant,String nom){
        this.id_etudiant=id_etudiant;
        this.nom=nom;
        this.coursuivis=new ArrayList<>();}

    public List<CCours> getCoursuivis() {
        return coursuivis;
    }

    public void setCoursuivis(List<CCours> coursuivis) {
        this.coursuivis = coursuivis;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getId_etudiant() {
        return id_etudiant;
    }

    public void setId_etudiant(int id_etudiant) {
        this.id_etudiant = id_etudiant;
    }
    public void inscrire(CCours c){
        coursuivis.add(c);
        System.out.println("etudiant:"+nom+" inscrit au cour :"+c.getTitre());
    }
    public void affichercours(){
        System.out.println("liste des cours :");
        if (coursuivis.isEmpty()){
            System.out.println("aucun cour pour le moment");
        }
        else {
            for(CCours c :coursuivis){
                System.out.println("cour :"+c.getTitre());
            }
        }
    }
    @Override
    public String toString() {
        return "Etudiant{" +
                "coursuivis=" + coursuivis +
                ", id_etudiant=" + id_etudiant +
                ", nom='" + nom + '\'' +
                '}';
    }

}
