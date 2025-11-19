import java.util.Date;

public class Main {
    public static void main(String[] args) {
        //    Passeport pas=new Passeport(1,"marocain",10.00);
//    Personne p=new Personne("ahmed",22,pas);
//    p.assignerPasseport(pas);
//    p.aficherinfos();
//    Cours c=new Cours(1,"math","analyse on math");
//    Cours c1=new Cours(2,"PC","mecanique");
//    Cours c2=new Cours(3,"SVT","BIOLOGIE");
//    Instructeur ins=new Instructeur(1,"ahmed","math");
//    ins.ajouterCours(c);
//    ins.ajouterCours(c1);
//    ins.ajouterCours(c2);
//    ins.afficherCours();
//        CCours c=new CCours(1,"math");
//        CCours c1=new CCours(2,"PC");
//        CCours c2=new CCours(3,"SVT");
//        Etudiant e=new Etudiant(1,"hamid");
//        Etudiant e1=new Etudiant(2,"AKRAM");
//        Etudiant e2=new Etudiant(3,"OTHMAN");
//        c.ajouterEtudiant(e);
//        c1.ajouterEtudiant(e1);
//        c.ajouterEtudiant(e1);
//        c.afficheretudiants();
//        c1.afficheretudiants();
//        e.inscrire(c1);
//        e.inscrire(c);
//        e.inscrire(c2);
//        e.affichercours();
//        Commande com=new Commande(1);
//        Produit prd=new Produit("iphone",300,2);
//        Produit prd1=new Produit("Samsung",3,3);
//        Produit prd2=new Produit("nokia",123,3);
//        com.ajouterProduit(prd1);
//        com.ajouterProduit(prd);
//        com.ajouterProduit(prd2);
//        com.afficherproduits();
//        double totale= com.calculerTotal();
//        System.out.println("totale de la commande :"+totale+" DH");

        CarteGrise crt=new CarteGrise(1,"merc",2025);
        Voiture v=new Voiture(12121,"mercedes","2019",crt);
        v.affichervoitures();
    }
}






