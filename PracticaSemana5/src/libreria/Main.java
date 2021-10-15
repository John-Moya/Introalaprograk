package libreria;

public class Main {

    public static void main(String[] args) {
	/*Fabrica miFabrica = new Fabrica("Tornillos",10000,"Lunes a Viernes de 8-5");
    System.out.println(miFabrica.horario);
    System.out.println(miFabrica.volumen);
    System.out.println(miFabrica.producto);

    Fabrica deHerramientas = new Fabrica("Herramientas",288,"Martes a Sabado de 9-3");
    System.out.println("La fabrica miFabrica produce "+miFabrica.producto+"\nLa fabrica de herramientas produce "+deHerramientas.producto);*/

    Venta carros = new Venta("Carros",1000,40,"L/V,8am-6pm","Sabanilla");
    System.out.println("Primera venta");
    System.out.println(carros.producto);
    System.out.println(carros.cantidadProducto);
    System.out.println(carros.ventasSemanales);
    System.out.println(carros.horario);
    System.out.println(carros.localizacion);

    Venta motos = new Venta("Motos",800,20,"L/V,8am-6pm","Sabanilla");
    System.out.println("\nSegunda venta");
    System.out.println(motos.producto);
    System.out.println(motos.cantidadProducto);
    System.out.println(motos.ventasSemanales);
    System.out.println(motos.horario);
    System.out.println(motos.localizacion);

    System.out.println("\nLa venta de carros tiene una cantidad de carros de: "+carros.cantidadProducto+"\nLa venta de motos tiene una cantidad de motos de: "+motos.cantidadProducto);

    Venta camiones = new Venta("Camiones",500,10);
    System.out.println("\nTercera venta");
    System.out.println(camiones.producto);
    System.out.println(camiones.cantidadProducto);
    System.out.println(camiones.ventasSemanales);
    }
}
