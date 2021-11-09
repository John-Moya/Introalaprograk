package libreria;

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
        // get atributos set atributos

        Fabrica laTercera = new Fabrica("Puertas", 50);
        System.out.println(laTercera.producto);

        Venta Venta1 = new Venta("Toyota","suzuki",30000);
        System.out.println(Venta1.carros);
        System.out.println(Venta1.motos);
        System.out.println(Venta1.precio);

        Venta venta2 = new Venta("nissan","ninja",20000);
        System.out.println(venta2.carros);
        System.out.println(venta2.motos);
        System.out.println(venta2.precio);

        Taller tallers1 = new Taller("motor","toyota",50000);
        System.out.println(tallers1.repuesto);
        System.out.println(tallers1.marca);
        System.out.println(tallers1.precio);

        Taller tallers2 = new Taller("mufla","patito",2000);
        System.out.println(tallers2.repuesto);
        System.out.println(tallers2.marca);
        System.out.println(tallers2.precio);

    }
}
