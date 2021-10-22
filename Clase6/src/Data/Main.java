package Data;

public class Main {

    public static void main(String[] args) {
	Automovil miCarro = new Automovil("4cyl","1994cc",1968);
        System.out.println(miCarro.getMotor());
        miCarro.setMotor("6cyl");
        System.out.println(miCarro.getMotor());
        System.out.println(miCarro.getCilindrada());
        miCarro.setCilindrada("2593");
        System.out.println(miCarro.getCilindrada());
        Automovil carro1 = new Automovil();
        Automovil carro2 = new Automovil("VG30","2500cc");
        Automovil carro3 = new Automovil("3vz","2993cc",1997);
        carro1.setMotor("VWR32");
        carro1.setCilindrada("2600cc");
        carro1.setAno(2008);
        carro3.setAno(1998);
        System.out.println(carro3.riteve.getFaltas());
        carro3.riteve.setFaltas("Desbalance en el Freno");
        System.out.println(carro3.riteve.getFaltas());

    }
}
