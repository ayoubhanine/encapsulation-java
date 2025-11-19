public class Voiture {
   private int immatriculation;
   private String marque;
   private String model;
   CarteGrise cartegrise;
   Voiture(int immatriculation,String marque,String model,CarteGrise cartegrise){
       this.immatriculation=immatriculation;
       this.marque=marque;
       this.model=model;
       this.cartegrise=cartegrise;
   }
   public int getImmatriculation(){
       return immatriculation;
   }
   public void setImmatriculation(int immatriculation){
       this.immatriculation=immatriculation;
   }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
    public  void lierCarteGrise(CarteGrise c){
       this.cartegrise=cartegrise;
       System.out.println("voiture"+getMarque()+"lie a "+cartegrise.getProprietaire());
    }
    public void affichervoitures(){
       System.out.println("marque: "+marque);
        System.out.println("model: "+model);
        System.out.println("carte grise: "+cartegrise.getProprietaire());
    }

    @Override
    public String toString() {
        return "Voiture{" +
                "cartegrise=" + cartegrise +
                ", immatriculation=" + immatriculation +
                ", marque='" + marque + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
