package libreria;

public class Main {

    public static void main(String[] args) {
        Edificio torresLara = new Edificio();
        torresLara.funcionaEdificio();
        torresLara.tienePermisos();
        double metrosDeConstruccion;
        metrosDeConstruccion = torresLara.calculametros(25.54684151,35.0005161);
        System.out.println(metrosDeConstruccion);
        int capacidad = torresLara.personas(10,200,8);
        System.out.println("La capacidad del edificio es de "+ capacidad);
        int capacidadDeAforo = torresLara.capacidadDeAforo(16000);
        System.out.println(capacidadDeAforo);

        Acera aceraL = new Acera();
        aceraL.color = "Rojo";
        System.out.println("Es de color rojo");
        aceraL.material = "Pavimento";
        System.out.println("Es de pavimento");
        aceraL.tamaño = "";
        System.out.println("Mide 200 metros");

        aceraL.aceraLimpia();
        aceraL.aceraSucia();
    }
}
