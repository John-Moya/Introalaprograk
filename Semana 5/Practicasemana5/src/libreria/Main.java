package libreria;

public class Main {

    public static void main(String[] args) {
	Fabrica miFabrica = new Fabrica("tornillos",10000,"Lunes a vierdes de 2pm-5pm");

    System.out.println(miFabrica.horario);
    System.out.println(miFabrica.volumen);
    System.out.println(miFabrica.producto);


    Fabrica deHerramientas = new Fabrica("Herramientas", 200, "DD9-3");
    System.out.println("La fabrica mi fabrica produce " + miFabrica.producto + ", La fabrica de herramientas produce " + deHerramientas.producto);

    //////////////////////////////////////
    System.out.println("\n");
    System.out.println("\n");
    ////////////////////////////////////

    Venta TechCo = new Venta("juegos de Nintendo Swich y play","Consola nintendo swich y ps4","Audifonos");
    System.out.println(TechCo.Consolas);
    System.out.println(TechCo.Juegos);
    System.out.println(TechCo.Perifericos);

    //////////////////////////////////////////
    System.out.println("\n");
    ////////////////////////////////////

    Venta Intelook = new Venta("juegos de xbox","Consola xbox","Teclados");
    System.out.println(Intelook.Perifericos);
    System.out.println(Intelook.Juegos);
    System.out.println(Intelook.Consolas);







    //////////////////////////////////////
    System.out.println("\n");
    System.out.println("\n");
    ////////////////////////////////////

    Taller Irazu = new Taller("Muflas", "Ruedas ","Contenedores");
    System.out.println(Irazu.Carros);
    System.out.println(Irazu.Motos);
    System.out.println(Irazu.Camiones);

    //////////////////////////////////////////
    System.out.println("\n");
    ////////////////////////////////////

    Taller Repuestos_Frederico = new Taller("Aromatisante ","Consola xbox","Teclados");
    System.out.println(Repuestos_Frederico.Carros);
    System.out.println(Repuestos_Frederico.Motos);
    System.out.println(Repuestos_Frederico.Camiones);





    }
}
