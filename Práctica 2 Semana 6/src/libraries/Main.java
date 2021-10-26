package libraries;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
	/* Desarrolle un programa para una venta de automoviles, en la cual se puedan guardar los atributos de los
	autromoviles, (Motor, Ano, Pasajeros Precio), a la vez este programa debe
	tener la habilidad de guardar los elementos del vendedor Nombre, Sucursal, y Horario

	 */
        Automoviles carro = new Automoviles();

        carro.setMotor(JOptionPane.showInputDialog("Ingrese el motor del carro:"));
        carro.setAno(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año del carro:")));
        carro.setPasajeros(Integer.parseInt(JOptionPane.showInputDialog("Ingrese los pasajeros del carro:")));
        carro.setPrecio(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el precio del carro:")));

        Vendedor cliente = new Vendedor();

        cliente.setNombre(JOptionPane.showInputDialog("Ingrese su nombre"));
        cliente.setSucursal(JOptionPane.showInputDialog("Ingrese su sucursal"));
        cliente.setHorario(JOptionPane.showInputDialog("Ingrese su horario"));

        System.out.println("Los atributos del carro son los siguientes:\n");
        System.out.println(carro.Motor);
        System.out.println(carro.ano);
        System.out.println(carro.pasajeros);
        System.out.println(carro.precio + "\n");

        System.out.println("Los datos del cliente son los siguientes:\n");
        System.out.println(cliente.Nombre);
        System.out.println(cliente.Sucursal);
        System.out.println(cliente.horario);
        
    /* 2 - Farmacias S.A desean desarrollar un programa en el cual puedan guardar medicamentos junto con la caza matriz
     de la que vienen, recuerde que los medicamentos vienen de un almacen con nombre direccion y Horario

     */

        Medicamentos medicina = new Medicamentos();

        medicina.setMedicamentos(JOptionPane.showInputDialog("Ingrese el medicamneto"));
        medicina.setCajaMatriz(JOptionPane.showInputDialog("Ingrese la caja matriz"));

        Almacen almacen = new Almacen();

        almacen.setNombre(JOptionPane.showInputDialog("Ingrese el nombre del almacen"));
        almacen.setDireccion(JOptionPane.showInputDialog("Ingrese la dirección del almacen"));
        almacen.setHorario(JOptionPane.showInputDialog("Ingrese el horario del almacen"));

        System.out.println("Los medicamentos son:\n");
        System.out.println(medicina.Medicamentos);
        System.out.println(medicina.CajaMatriz + "\n");

        System.out.println("Los datos del almacén son:\n");
        System.out.println(almacen.nombre);
        System.out.println(almacen.direccion);
        System.out.println(almacen.horario);

        /*3 - Securitas S.A desea desarrollar un programa con el cual puedan almacenar los datos de los camiones,
        placa chofer y peso, ademas de poder almacenar los datos del chofer
         */

        Camiones camion = new Camiones();

        camion.setPlaca(JOptionPane.showInputDialog("Ingrese la placa del camión"));
        camion.setChofer(JOptionPane.showInputDialog("Ingrese el chofer del camión"));
        camion.setPeso(JOptionPane.showInputDialog("Ingrese el peso del camión"));

        Chofer chofer = new Chofer();

        chofer.setNombre(JOptionPane.showInputDialog("Ingrese el nombre del chofer"));
        chofer.setEdad(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del chofer")));
        chofer.setAnosEmpresa(Integer.parseInt(JOptionPane.showInputDialog("Ingrese los años dentro de la empresa")));

        System.out.println("Los datos del camión son:\n");
        System.out.println(camion.placa);
        System.out.println(camion.chofer);
        System.out.println(camion.peso + "\n");

        System.out.println("Los datos del chofer son:\n");
        System.out.println(chofer.nombre);
        System.out.println(chofer.edad);
        System.out.println(chofer.AnosEmpresa);
    }
}
