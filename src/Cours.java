public class Cours {
    private int id_cour;
    private String titre;
    private String description;
    Instructeur instructeur;
    Cours(int id_cour,String titre,String description){
        this.id_cour=id_cour;
        this.titre=titre;
        this.description=description;
    }
    int getId_cour(){
        return id_cour;
    }
public void setId_cour(int id_cour){
        this.id_cour=id_cour;
}

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }
    public void assignerInstructeur(Instructeur i) {
        this.instructeur = i;
    }
//    public void afficherCours(){
//        System.out.println("liste des cours de linstructeur :");
//        System.out.println("id de cour "+id_cour);
//        System.out.println("titre de cour :"+titre);
//        System.out.println("description de  cour: "+description);
//        System.out.println("instructeur assigne: "+);
//    }
    @Override
    public String toString() {
        return "Cours{" +
                "description='" + description + '\'' +
                ", id_cour=" + id_cour +
                ", titre='" + titre + '\'' +
                '}';
    }
}
