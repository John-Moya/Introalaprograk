package Data;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        Automovil mitsubishi = new Automovil("1200","2005","4","2000000");
        mitsubishi.elVendedor.setNombre("Carlos");
        mitsubishi.elVendedor.setSucursal("San Jose");
        mitsubishi.elVendedor.setHorario("7-5");
        System.out.println("El automovil tiene un valor de " +mitsubishi.getPrecio() + " Y lo vende" + mitsubishi.elVendedor.getNombre());
        mitsubishi.tienePito();
    }
}
