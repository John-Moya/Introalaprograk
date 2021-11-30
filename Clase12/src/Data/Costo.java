package Data;

public class Costo {
    private String tipoCliente;

    public Costo(String tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public String getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(String tipoCliente) {
        this.tipoCliente = tipoCliente;
    }
    public double descuento(String tipoCliente, int precio){
        double monto = 0;
        if(tipoCliente.equals("Frecuente")){
            monto = precio-precio*0.10;
        }else {
            monto = precio;
        }
        return monto;
    }
}
