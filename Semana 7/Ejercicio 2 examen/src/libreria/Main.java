package libreria;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        Camion camion1 = new Camion("9689201","Toyota","Tanktop","Maximo 600 kilos");
        Camion camion2 = new Camion("9823501","Jaguar","Money","Maximo 600 kilos");
        Camion camion3 = new Camion("1816501","Volkswagen","Durok","Maximo 600 kilos");

        JOptionPane.showMessageDialog(null,"$ Camiones de Carga de Dinero $\n"+ "*Camion 1* \n"+ "Marca: "+ camion1.getMarca()+
                "\n"+"Placa: "+ camion1.getPlaca()+"\n"+"Modelo: "+ camion1.getModelo()+"\n"+"Peso maximo: "+camion1.getPesoquepuedellevar());

    }
}
