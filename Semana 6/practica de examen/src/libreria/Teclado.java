package libreria;

public class Teclado {
    private String tipo;
    private String Material;
    private String conectividad;

    //METODOS


    public  void mueveElMouse(){System.out.println("El puntero se mueve");}

    public void haceClick(){System.out.println("Hace interaccion con la computadora");}

    public  void  conectaElMouse(){System.out.println("El mouse empieza a funcionar");}

    /////////////////////////////////////////////////////////////////////////////////////////

    public Teclado(String tipo, String material, String conectividad) {
        this.tipo = tipo;
        Material = material;
        this.conectividad = conectividad;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMaterial() {
        return Material;
    }

    public void setMaterial(String material) {
        Material = material;
    }

    public String getConectividad() {
        return conectividad;
    }

    public void setConectividad(String conectividad) {
        this.conectividad = conectividad;
    }
}
