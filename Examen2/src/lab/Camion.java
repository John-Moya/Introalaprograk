package lab;

public class Camion {
    private String numero;
    private String peso;
    private String pasajeros;
    public Conductor elcondu;
    public Ruta laruta;

    public Camion(String numero, String peso, String pasajeros) {
        this.numero = numero;
        this.peso = peso;
        this.pasajeros = pasajeros;
        this.elcondu = new Conductor("","");
        this.laruta = new Ruta("");
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(String pasajeros) {
        this.pasajeros = pasajeros;
    }
}
