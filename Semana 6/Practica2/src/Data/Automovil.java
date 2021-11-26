package Data;

public class Automovil {
    private String motor;
    private String ano;
    private String pasajeros;
    private String precio;
    public Vendedor elVendedor;

    public Automovil(String motor, String ano, String pasajeros, String precio) {
        this.motor = motor;
        this.ano = ano;
        this.pasajeros = pasajeros;
        this.precio = precio;
        this.elVendedor = new Vendedor("","","");
    }

    public void tienePito(){
        System.out.println("Honk");
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(String pasajeros) {
        this.pasajeros = pasajeros;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

}
