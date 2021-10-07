package Library;
import Ejercicios.Hotel;
import Ejercicios.Restaurante;
import Ejercicios.Tienda;
import Ejercicios.Universidad;
import Library.Automovil;
public class Main {

    public static void main(String[] args) {
	// Acciones: Sonar Pito, Encender y Acelerar Metodos
    //Atributos: Color, Marca, Motor, Modelo y Año
    // Paquete Library Automovil // nombre de la clase, Objeto= new Nombre de la clase():

        Automovil Toyota = new Automovil();   //Instancia(copia) de la clase Automovil
        //rellenar variables:
        Toyota.año = 1983;
        Toyota.cilindrada = 2394.00;
        Toyota.color = "Gris";
        Toyota.marca = "Toyota";
        Toyota.modelo = "Celica";
        Toyota.motor = "22R";
        System.out.println(Toyota.motor);
        //System.out.println(Toyota.sonarPitoConRetorno()); //o tambien se puede hacer con un String:
        //String elPito = Toyota.sonarPitoConRetorno();
        //System.out.println(elPito);
        Toyota.encender();
        Toyota.acelerar();
        Toyota.sonarPito();

        System.out.println();

        //Objeto carro de preferencia
        Automovil Kia = new Automovil();
        Kia.año = 2003;
        Kia.cilindrada = 2351.00;
        Kia.color = "Negro";
        Kia.marca = "Sorento";
        Kia.motor = "25R";
        //System.out.println(Kia.motor);

        //Ejercicios
        //1) Hotel:
        Hotel crownePlaza = new Hotel();
        crownePlaza.tipoHabitacion();
        crownePlaza.vistaHabitacion();
        crownePlaza.desayuno();

        //2) Universidad:
        Universidad fidelitas = new Universidad();
        fidelitas.matricula();
        fidelitas.modalidad();

        //3) Tienda:
        Tienda hM = new Tienda();
        hM.tipoPrenda();
        hM.tallas();
        hM.genero();

        //4) Restaurante:
        Restaurante shawarma = new Restaurante();
        shawarma.tipoOrden();
        shawarma.menu();
        shawarma.mesa();


    }
}

