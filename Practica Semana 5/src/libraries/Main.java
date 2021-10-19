package libraries;

public class Main {

    public static void main(String[] args) {

        Fabrica miFabrica = new Fabrica("Tornillos", 1000, "LV8-5");
        System.out.println(miFabrica.horario);
        System.out.println(miFabrica.volumen);
        System.out.println(miFabrica.producto);

        Fabrica deHerramientas = new Fabrica("Herramienta", 200, "DD9-3");
        System.out.println("La fabrica mi fabrica produce " + miFabrica.producto + " La fabrica de herramientas produce "+ deHerramientas.producto);
        // Encargado de inicializar los atributos

        Fabrica nuevaFabrica = new Fabrica();
        System.out.println(nuevaFabrica.producto);


        Fabrica laTercera = new Fabrica("Puertas", 50);
        System.out.println(laTercera.producto);

        // Encapsulation

        // Ejercicio

        Venta ventaCarros = new Venta("Toyota", "Blanco", 1000);
        System.out.println(ventaCarros.Marca);
        System.out.println(ventaCarros.Color);
        System.out.println(ventaCarros.precio);

        Venta ventaMedicinas = new Venta("Panadol", 20, 500);
        System.out.println(ventaMedicinas.medicamento);
        System.out.println(ventaMedicinas.cantidad);
        System.out.println(ventaCarros.costo);

        Taller tallerCarros = new Taller("pequeñas", "4", "caucho");

        Taller tallerCamiones = new Taller("grandes", "8");
    }
}
