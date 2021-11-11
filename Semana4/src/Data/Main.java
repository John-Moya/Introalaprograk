package Data;

public class Main {

    public static void main(String[] args) {
	// Acciones Sonar Pito Encender Acelerar Metodos
        // Color Marca Motor Modelo Ano
        // Paquete Main Automovil // Nombre de la Clase Objeto = new Nombre de la clase();
        Automovil Suzuki = new Automovil();
        // Instancia de la clase Automovil Copia
        Suzuki.ano = 1983;
        Suzuki.cilindrada = 2394.00;
        Suzuki.color = "Gris";
        Suzuki.marca = "Toyota";
        Suzuki.modelo = "Celica";
        Suzuki.motor = "22R";
        System.out.println(Suzuki.motor);
    }
}
