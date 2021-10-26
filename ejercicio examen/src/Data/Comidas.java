package Data;

public class Comidas {
    public static String clase1 = "Restaurante";
    String desayuno;
    String almuerzo;
    String cena;

    public Comidas(String desayuno, String almuerzo, String cena) {
        this.desayuno = desayuno;
        this.almuerzo = almuerzo;
        this.cena = cena;
    }
    public String getDesayuno(){
        return desayuno;
    }
    public void setDesayuno(String desayuno){
        this.desayuno = desayuno;
    }
    public String getAlmuerzo(){
        return almuerzo;
    }
    public void setAlmuerzo(String almuerzo){
        this.almuerzo = almuerzo;
    }
    public String getCena(){
        return cena;
    }
    public void setCena(String cena){
        this.cena = cena;
    }
}
