package data;

public class Main {

    public static void main(String[] args) {
	Fabrica miFabrica = new Fabrica("Tornilos", 1000, "LV8-5");
        System.out.println(miFabrica.horario);
        System.out.println(miFabrica.volumen);
        System.out.println(miFabrica.producto);
    //Constructor= Encargado de inicializar los atributos

    Fabrica deHerramientas = new Fabrica("Herramientas", 200, "DD9-3");
        System.out.println("Mi fabrica produce " + miFabrica.producto);

    Fabrica nuevaFabrica = new Fabrica("Carros", 20);
    System.out.println(nuevaFabrica.producto);

    Fabrica laTercera = new Fabrica("Puertas", 50);
        System.out.println(laTercera.producto);

    //VENTA
    Venta miVenta = new Venta("Electrodomesticos", "Samsung y Atlas", "LV8-5");
        System.out.println(miVenta.producto);
        System.out.println(miVenta.marcas);
        System.out.println(miVenta.horario);

    Venta segVenta = new Venta("Maquillaje, cremas, lipstiks, perfumes", "LS12-7");
        System.out.println("Se venten productos de belleza como "+ segVenta.producto);
        System.out.println("Nuestro horario es "+segVenta.horario);

    Venta terVenta = new Venta("Galletas", "Caseras", "viernes y sábados");
        System.out.println("Vendemos "+terVenta.producto+" "+terVenta.marcas+" y realizamos entregas los "+terVenta.horario);

    //TALLER
    Taller priTaller = new Taller("Reparación de motos Honda", "Cambio de respuestos de motos", 2);
        System.out.println(priTaller.reparación+", "+priTaller.repuestos+", Cantidad de motos a resivir por cliente: "+priTaller.cantidad);

    Taller segTaller = new Taller("Reparacion de motos livianas", "Repuestos economicos");
        System.out.println(segTaller.reparación);
        System.out.println(segTaller.repuestos);
    }
}
