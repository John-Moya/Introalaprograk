package Data;

public class Acompañantes {
    String numero;
    String genero;
    String mayoria;

    public Acompañantes(String numero, String genero, String mayoria) {
        this.numero = numero;
        this.genero = genero;
        this.mayoria = mayoria;
    }
    public String getNumero(){
        return numero;
    }
    public void setNumero(String numero){
        this.numero = numero;
    }
    public String getGenero(){
        return genero;
    }
    public void setGenero(String genero){
        this.genero = genero;
    }
    public String getMayoria(){
        return mayoria;
    }
    public void setMayoria(String mayoria){
        this.mayoria = mayoria;
    }
}
