public class Passeport {
    private int numero;
    private String nationalite;
    private  double dateExpiration;
    Passeport(int num,String nat,Double dateEXP){
        numero=num;
        nationalite=nat;
        dateExpiration=dateEXP;
    }

    public double getDateExpiration() {
        return dateExpiration;
    }

    public void setDateExpiration(double dateExpiration) {
        this.dateExpiration = dateExpiration;
    }

    public String getNationalite() {
        return nationalite;
    }

    public void setNationalite(String nationalite) {
        this.nationalite = nationalite;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Passeport{" +
                "dateExpiration=" + dateExpiration +
                ", numero=" + numero +
                ", nationalite='" + nationalite + '\'' +
                '}';
    }
}
