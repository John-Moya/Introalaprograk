package libraries;

public class Automovil {

    private String marca;
    private String modelo;
    public Mecanico elMecanico;
    Mecanico[] losMecanicos;

    public Automovil(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.elMecanico = new Mecanico("", "");
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
