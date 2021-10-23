package data;

public class Main {

    public static void main(String[] args) {
	Automovil miCarro = new Automovil("4cyl", "1994", "1983");
        System.out.println(miCarro.getMotor());
        miCarro.setMotor("6cyl");
        System.out.println(miCarro.getMotor());
        System.out.println(miCarro.getCilindrada());
        miCarro.setCilindrada("2000");
        System.out.println(miCarro.getCilindrada());
        Automovil carro = new Automovil("Vg23", "2500");
        System.out.println(carro.riteve.getMes());
        System.out.println(carro.riteve.getFaltas());
        carro.riteve.setFaltas("Desbalance de freno");
        System.out.println(carro.riteve.getFaltas());
        System.out.println(carro.clase);
    }
}
