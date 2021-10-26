package libreria;

public class Mouse {
    private String Dpi;
    private String Botones;
    private String Calidad;

    //METODOS


    public  void mueveElMouse(){System.out.println("El puntero se mueve");}

    public void haceClick(){System.out.println("Hace interaccion con la computadora");}

    public  void  conectaElMouse(){System.out.println("El mouse empieza a funcionar");}

    /////////////////////////////////////////////////////////////////////////////////////////

    public Mouse(String dpi, String botones, String calidad) {
        Dpi = dpi;
        Botones = botones;
        Calidad = calidad;
    }

    public String getDpi() {
        return Dpi;
    }

    public void setDpi(String dpi) {
        Dpi = dpi;
    }

    public String getBotones() {
        return Botones;
    }

    public void setBotones(String botones) {
        Botones = botones;
    }

    public String getCalidad() {
        return Calidad;
    }

    public void setCalidad(String calidad) {
        Calidad = calidad;
    }
}
