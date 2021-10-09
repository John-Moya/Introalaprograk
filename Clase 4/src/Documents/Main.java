package Documents;
import Documents.Automovil;
import Documents.Veterinario;
import Documents.Restaurante;
import Documents.Laboratorio;

public class Main {


    public static void main(String[] args) {
        //Acciones sonar Pito Encender Acelerar Metodos
        //Color Marca Motor Modelo Año
        //Paquete Main Automovil // Nombre de la clase objeto = new nombre de la clase ();

        Automovil Toyota = new Automovil();
        //Instancia de la clase Automovil copia
        Toyota.año = 1983;
        Toyota.cilindrada = 2394.00F;
        Toyota.color = "Gris";
        Toyota.marca = "Toyota";
        Toyota.modelo = "Celica";
        Toyota.motor = "22R";
        System.out.println(Toyota.motor);

        //}


        //Instancia de la clase Automovil copia

        Automovil KIA = new Automovil();
        KIA.año = 2020;
        KIA.cilindrada = 1.4F;
        KIA.color = "Azul";
        KIA.marca = "KIA";
        KIA.modelo = "RIO";
        KIA.motor = "1.6 L MPI";
        System.out.println(KIA.motor);
        String elPito = KIA.sonarPitoConRetorno();
        System.out.println(elPito);
        KIA.encender();
        KIA.accelerar();
        KIA.sonarPito();
        //}

        Veterinario Fabiola = new Veterinario();
        Veterinario.añosestudio = 8;
        Veterinario.experiencia = "Doctorado";
        Veterinario.animales = "Todo tipo";
        Veterinario.arealaboral = "Veterinaria";

        Restaurante Gogh = new Restaurante();
        Restaurante.persona = "Chef";
        Restaurante.experiencia = "Especialista en carnes";
        Restaurante.funcion = "Cortes y asados";
        Restaurante.alaborados = 14;

        Hotel Venecia = new Hotel();
        Hotel.persona = "Recepcionista";
        Hotel.experiencia = "Trato al cliente";
        Hotel.funcion = "Servicio agradable e informacion de datos generales";
        Hotel.alaborados = 10;

        Laboratorio Fidelitas = new Laboratorio();
        Laboratorio.persona = "Laboratorista";
        Laboratorio.añosestudio = 8;
        Laboratorio.funcion = "Analisis de sangre";
















    }
}


