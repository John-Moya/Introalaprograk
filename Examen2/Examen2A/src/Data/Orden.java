package Data;

public class Orden {
    public Tecnico elTecnico;
    public Dispositivo elDispositivo;

    public Orden(Tecnico elTecnico, Dispositivo elDispositivo) {
        this.elTecnico = new Tecnico("","",0000);
        this.elDispositivo = new Dispositivo("",00,"",000,"");
    }

    public Orden() {
    }
}
