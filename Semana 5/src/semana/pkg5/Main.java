package semana.pkg5;

public class Main {

    public static void main(String[] args) {
        Edificio edificio = new Edificio();
        Acera aceras = new Acera();
        edificio.funcionaEdificio();
        edificio.tienepermiso();
        double metroscuadrados;
        metroscuadrados = edificio.calcularmetros(25.35, 35.5);
        System.out.println("Metros cuadrados: " + metroscuadrados);
        int capacidad = edificio.persona(10, 25, 8);
        System.out.println("La capacidad del edificio es de " + capacidad);
        int cantida = edificio.cantmitad(1000);
        System.out.println("El aforo es de: "+ cantida);
        
        aceras.ancho = 5;
        aceras.estado = "danado";
        aceras.largo = 200;
        
        System.out.println(aceras.ancho);
        System.out.println(aceras.estado);
        System.out.println(aceras.largo);
        aceras.capacidad();
        aceras.distancia();
        aceras.material();

    }

}
