package libreria;

public class Main {

    public static void main(String[] args) {
	Automovil miCarro = new Automovil("4cyl","1994","1982");
        System.out.println(miCarro.getMotor());
        miCarro.setMotor("gt200");
        System.out.println(miCarro.getMotor());
        miCarro.setCilindrada("2593cc");
        System.out.println(miCarro.getCilindrada());

        Automovil carro1 = new Automovil();
        Automovil carro2 = new Automovil("VG30","2500cc");
        Automovil carro3 = new Automovil("3vz","2993cc","1997");
        carro1.setMotor("VWR32");
        carro1.setCilindrada("2600cc");
        carro1.setAno("2008");
        carro3.setAno("1998");
        System.out.println(carro3.riteve.getMes());
        System.out.println(carro3.riteve.getFaltas());
        carro3.riteve.setFaltas("Desbalance en el freno");
        System.out.println(carro3.riteve.getFaltas());
        System.out.println(carro3.clase);
        carro3.clase = "Carga Liviana";
        System.out.println(carro3.clase);
    }
}
