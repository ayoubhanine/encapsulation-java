import java.util.ArrayList;
import java.util.List;

public class Instructeur {
    private int id;
    private String nom;
    private String specialisation;
    private List<Cours> coursensignes;
    Instructeur(int id,String nom,String specialisation){
        this.id=id;
        this.nom=nom;
        this.specialisation=specialisation;
        this.coursensignes=new ArrayList<>();
    }
    int getId(){
        return  id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Cours> getCoursensignes() {
        return coursensignes;
    }

    public void setCoursensignes(List<Cours> coursensignes) {
        this.coursensignes = coursensignes;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getSpecialisation() {
        return specialisation;
    }

    public void setSpecialisation(String specialisation) {
        this.specialisation = specialisation;
    }
public void ajouterCours(Cours c){
        coursensignes.add(c);
}
public void afficherCours(){
        System.out.println("liste des cours enseigne par :"+nom);
       if(coursensignes.isEmpty()){
           System.out.println("aucune cour assigne ");
       }
       else {
           for(Cours c :coursensignes){
               System.out.println("titre :"+c.getTitre());
           }
       }

}


}
