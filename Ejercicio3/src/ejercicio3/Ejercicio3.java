package ejercicio3;

import javax.swing.JOptionPane;

public class Ejercicio3 {

        public static void main(String[] args) {
   // write your code here.
        Camiones camion1= new Camiones("252369","Mercedez","Una Cabina","3000kg");
        System.out.println("la placa del camion1 es: " +camion1.getPlaca());
        camion1.setMarca("Man");
        System.out.println("Marca: " + camion1.getMarca());
        System.out.println("Modelo: " + camion1.getModelo());
        System.out.println("Peso: " + camion1.getPeso());
        System.out.println();

        Camiones camion2= new Camiones("15798","Iveco","Cabina sensilla","4000kg");
        System.out.println("la placa del camion2 es: " + camion2.getPlaca());
        System.out.println("Marca: " + camion2.getMarca());
        System.out.println("Modelo: " + camion2.getModelo());
        camion2.setPeso("1800kg");
        System.out.println("Peso: " + camion2.getPeso());

        int placa;
        placa= Integer.parseInt(JOptionPane.showInputDialog("Ingrese el nuevo numero de placa para el camion 2: "));
        System.out.println("La placa con la modificacion realizada es de: " + placa);
        JOptionPane.showMessageDialog( null, "el nuevo numero de placa para el camion2 es: " + placa);



    }
}


