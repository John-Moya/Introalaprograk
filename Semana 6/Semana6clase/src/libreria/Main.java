package libreria;

public class Main {

    public static void main(String[] args) {

        Automovil miCarro= new Automovil("4 cilindros","1964 cc", 1990);

        System.out.println(miCarro.getMotor());
        miCarro.setMotor("6 cilindros");
        System.out.println(miCarro.getMotor());


    }
}
