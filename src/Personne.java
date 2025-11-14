public class Personne {
    private String nom;
    private int age;
    Passeport passeport;
    Personne(String n,int a,Passeport passeport){
        nom=n;
        age=a;
//        this.passeport=passeport;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Passeport getPasseport() {
        return passeport;
    }

    public void setPasseport(Passeport passeport) {
        this.passeport = passeport;
    }

    public void assignerPasseport(Passeport p){
        this.passeport=p;
    }
    public  void aficherinfos(){
        System.out.println("details du personne :");
        System.out.println("nom:"+nom);
        System.out.println("age :"+age);
        System.out.println("passeport assigne :"+passeport);
    }
    @Override
    public String toString() {
        return "Personne{" +
                "age=" + age +
                ", nom='" + nom + '\'' +
                ", passeport=" + passeport +
                '}';
    }
}
