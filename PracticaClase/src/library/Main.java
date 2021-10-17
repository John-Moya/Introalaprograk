package library;

public class Main {

    public static void main(String[] args) {
        Fabrica miFabrica = new Fabrica("Tornillos",10000,"LV8-5");
        System.out.println(miFabrica.horario);
        System.out.println(miFabrica.volumen);
        System.out.println(miFabrica.producto);
        Fabrica deHerramientas = new Fabrica("Herramientas", 200, "DD9-3");
        System.out.println("La fabrica mi fabrica produce " + miFabrica.producto + ", La fabrica de herramientas produce " + deHerramientas.producto);
        // Encargado de Inicializar los atributos
        Fabrica nuevaFabrica = new Fabrica();
       // nuevaFabrica.setProducto("Carros");
      // System.out.println(nuevaFabrica.getProducto());
        // get atributos set atributos

        Fabrica laTercera = new Fabrica("Puertas", 50);
        System.out.println(laTercera.producto);

        Taller tallerSolis = new Taller("automotis","LV8-5",5,"50 mts sur de la catedral de Guadalupe",
                "Carlos Solis");
        System.out.println("Drieccion: "+tallerSolis.direccion);
        System.out.println("Cantidad de personal: "+tallerSolis.personal);

        Taller tijeritas = new Taller("Costura","LV9-6",3,"100 mts norte del igeron",
                "Maria Rojas");
        System.out.println("Dueña: "+tijeritas.dueno);
        System.out.println("Horario: "+tijeritas.horario);

        Venta siman = new Venta("Camisas",15635.15,2,"Jose Vargas","5/10/22");
        System.out.println("Producto: "+siman.producto);
        System.out.println("Se vendio el: "+siman.fechaVenta);

        Venta tiendaTrululu = new Venta("Paquete de gomitas",5433.12,6,"Maria Blanco",
                "9/10/22");
        System.out.println("Precio: "+tiendaTrululu.precio);
        System.out.println("Cantidad: "+tiendaTrululu.cantidad);
    }
}
