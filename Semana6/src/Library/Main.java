package Library;

/*public enum estado{
    ACTIVA,
    INACTIVA,
    PENDIENTE
}*/

public class Main {

    public static void main(String[] args) {
	// write your code here
        Automovil miCarro= new Automovil("4cly", "1994", "1982");
        System.out.println(miCarro.getMotor());
        miCarro.setMotor("6cyl"); //set cambia el valor del atributo
        System.out.println(miCarro.getMotor());
        System.out.println(miCarro.getCilindrada());
        miCarro.setCilindrada("2593cc");
        System.out.println(miCarro.getCilindrada());
        Automovil carr01 = new Automovil();
        Automovil carro2= new Automovil("VG30", "2500cc");
        Automovil carro= new Automovil("3vz", "2993cc", "1997");
        carr01.setMotor("VWR32");
        carr01.setAno("2008");
        carro.setAno("1998");

        System.out.println(carro.riteve.getFaltas());
        carro.riteve.setFaltas("Desbalance en el freno");
        System.out.println(carro.riteve.getFaltas());
        System.out.println(carro.clase);



    }

}
