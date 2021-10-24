package data;

public class Main {

    public static void main(String[] args) {
	Galletas galleta1 = new Galletas("Oreo", 2500, 20);
    galleta1.dieta();
    Chocolates choco1 = new Chocolates("Pequeños", "Amargo", "50g");
    choco1.energia();
    System.out.println(choco1.galletas.getCantidad());
    Salsas salsa1 = new Salsas("Grande", "Chipotle", "800g");
    salsa1.acompañar();
    Refrescos refresco1 = new Refrescos("Mediano", "Kolita", "2l");
    refresco1.sabor();
    Paciente paciente1 = new Paciente("Melanie", "Picado", 85);
    paciente1.instrucciones();

    }
}
