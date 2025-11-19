public class CarteGrise {
private int numero;
private  String proprietaire;
private int dateEmission;

    public CarteGrise( int numero, String proprietaire,int dateEmission) {

        this.numero = numero;
        this.proprietaire = proprietaire;
        this.dateEmission = dateEmission;

    }

    public int getDateEmission() {
        return dateEmission;
    }

    public void setDateEmission(int dateEmission) {
        this.dateEmission = dateEmission;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getProprietaire() {
        return proprietaire;
    }

    public void setProprietaire(String proprietaire) {
        this.proprietaire = proprietaire;
    }

    @Override
    public String toString() {
        return "CarteGrise{" +
                "dateEmission=" + dateEmission +
                ", numero=" + numero +
                ", proprietaire='" + proprietaire + '\'' +
                '}';
    }
}
