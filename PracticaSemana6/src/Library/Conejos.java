package Library;

public class Conejos {
    private String especie; //comun o europeo
    private String pelaje;
    private String promedioVida;

    public void alimetacion(){
        System.out.println("lechuga y zanahoria");
    }
    public void movimientoNariz(){
        System.out.println("rapido");
    }
    public void tipoSalto(){
        System.out.println("saltos pequenos");
    }


    public Conejos(String especie, String pelaje, String promedioVida) {
        this.especie = especie;
        this.pelaje = pelaje;
        this.promedioVida = promedioVida;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getPelaje() {
        return pelaje;
    }

    public void setPelaje(String pelaje) {
        this.pelaje = pelaje;
    }

    public String getPromedioVida() {
        return promedioVida;
    }

    public void setPromedioVida(String promedioVida) {
        this.promedioVida = promedioVida;
    }
}
