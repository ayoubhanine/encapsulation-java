import java.util.ArrayList;
import java.util.List;

public class CCours {
    private int id_cour;
    private  String titre ;
    private List<Etudiant> etudiantsinscris ;
    CCours(int id_cour,String titre){
        this.id_cour=id_cour;
        this.titre=titre;
        this.etudiantsinscris=new ArrayList<>();}
    public List<Etudiant> getEtudiantsinscris() {
        return etudiantsinscris;
    }

    public void setEtudiantsinscris(List<Etudiant> etudiantsinscris) {
        this.etudiantsinscris = etudiantsinscris;
    }

    public int getId_cour() {
        return id_cour;
    }

    public void setId_cour(int id_cour) {
        this.id_cour = id_cour;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }
    public  void ajouterEtudiant(Etudiant e){
        etudiantsinscris.add(e);
        }
    public void afficheretudiants(){
        System.out.println("liste des etudiants inscrits au cour :"+titre);
        if(etudiantsinscris.isEmpty()){

            System.out.println("aucune etudiant inscrit");
        }
        else{
            for(Etudiant e:etudiantsinscris){
                System.out.println("nom :"+e.getNom());
            }}
    }
    @Override
    public String toString() {
        return "CCours{" +
                "etudiants inscris=" + etudiantsinscris +
                ", id_cour=" + id_cour +
                ", titre='" + titre + '\'' +
                '}';
    }
}
