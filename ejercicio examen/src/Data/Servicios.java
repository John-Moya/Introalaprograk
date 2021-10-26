package Data;

public class Servicios {
    String piscina;
    String canchas;
    String gimnasio;

    public Servicios(String piscina, String canchas, String gimnasio) {
        this.piscina = piscina;
        this.canchas = canchas;
        this.gimnasio = gimnasio;
    }
    public String getPiscina(){
        return piscina;
    }
    public void setPiscina(String piscina){
        this.piscina = piscina;
    }
    public String getCanchas(){
        return canchas;
    }
    public void setCanchas(String canchas){
        this.canchas = canchas;
    }
    public String getGimnasio(){
        return gimnasio;
    }
    public void setGimnasio(){
        this.gimnasio = gimnasio;
    }
}
