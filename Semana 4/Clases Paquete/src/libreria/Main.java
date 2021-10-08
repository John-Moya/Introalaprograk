package libreria;
import  libreria.Doctor;
public class Main {

    public static void main(String[] args) {

        Doctor Cirujano = new Doctor();
        Cirujano.nombre = "Gerardo";
        System.out.println(Cirujano.nombre);


        Laptop Asus = new Laptop();
        Asus.marca = "Asus Tuf";
        System.out.println(Asus.marca);


        Celular Ram = new Celular();
        Ram.caracteristicas = "8GB de ram";
        System.out.println(Ram.caracteristicas);


        Pulperia Nombre = new Pulperia();
        Nombre.nombre = "Darling";
        System.out.println(Cirujano.nombre);
    }
}
