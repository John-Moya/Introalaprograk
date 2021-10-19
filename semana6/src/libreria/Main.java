package libreria;

public class Main {

    public static void main(String[] args) {
	Automovil miCarro = new Automovil("4cyl","1994cc","1982");
        System.out.println(miCarro.getMotor());
        miCarro.setMotor("6cyl");
        System.out.println(miCarro.getMotor());
        System.out.println(miCarro.getCilidrada());
        miCarro.setCilidrada("2593cc");
        System.out.println(miCarro.getCilidrada());

        Automovil carro1 = new Automovil();
        Automovil carro2 = new Automovil("VG30", "2500cc");
        Automovil carro = new Automovil("3vz","2993cc", "1997");
        carro1.setMotor("VWR32");
        carro1.setCilidrada("2600cc");
        carro1.setAno("2008");
        carro.setAno("1998");
        System.out.println(carro.riteve.getFaltas());
        carro.riteve.setFaltas("Desbalance en el Freno");
        System.out.println(carro.riteve.getFaltas());
        System.out.println(carro.clase);

    }
}
