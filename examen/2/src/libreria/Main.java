package libreria;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        Camion1 camionBac = new Camion1("8707","toyoya","2005",100);
        JOptionPane.showMessageDialog(null,"Hola, su camion tiene de placa "+camionBac.getPlaca());
        JOptionPane.showMessageDialog(null,"Hola, su camion tiene de marca "+camionBac.getMarca());
        JOptionPane.showMessageDialog(null,"Hola, su camion es de modelo "+camionBac.getModelo());
        JOptionPane.showMessageDialog(null,"Hola, su camion tiene de peso "+camionBac.getPeso());
        JOptionPane.showMessageDialog(null,"Hola, su camion tiene de placa "+camionBac.getPlaca());

        System.out.println(camionBac.getPlaca());
        System.out.println(camionBac.getMarca());
        System.out.println(camionBac.getModelo());
        System.out.println(camionBac.getPeso());




    }
}
