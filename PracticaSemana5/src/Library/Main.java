package Library;

public class Main {

    public static void main(String[] args) {
        /*Fabrica miFabrica= new Fabrica("Tornillos",10000,"LV8-5"); //se llama al CONSTRUCTOR
        System.out.println(miFabrica.horario);
        System.out.println(miFabrica.volumen);
        System.out.println(miFabrica.producto);

         Fabrica deHerramientas = new Fabrica ("Herramientas", 200, "DD9-3");
        System.out.println("La fabrica mi fabrica produce" + miFabrica.producto+ ", la fabrica de herramientras produce"+ deHerramientas.producto);

        Fabrica nuevaFabrica = new Fabrica();
        nuevaFabrica.setProducto("Carros");
        System.out.println(nuevaFabrica.getProducto());
        // get atributos set atributos

        Fabrica laTercera = new Fabrica("Puertas", 50);
        System.out.println(laTercera.producto);*/

        //Venta medicamentos
        Venta fishel= new Venta("Jarabe", "contra la tos", "Vick", 1, 7000);
        System.out.println(fishel.producto);
        System.out.println(fishel.tipoMedicamento);
        System.out.println(fishel.marca);
        System.out.println(fishel.cantidad);
        System.out.println(fishel.precio);

        Venta santaLucia= new Venta("Pastillas", "reducir la inflamacion", "Cataflan", 6,4000);
        System.out.println(santaLucia.producto);
        System.out.println(santaLucia.tipoMedicamento);
        System.out.println(santaLucia.marca);
        System.out.println(santaLucia.cantidad);
        System.out.println(santaLucia.precio);

        System.out.println("La farmacia fishel tiene a la venta: " + fishel.producto + ", la farmacia santa lucia tiene a la venta: "+ santaLucia.producto);


        //Taller de computadoras
        Taller compuTaller= new Taller("Monitor", "Pantalla", 2005, "hp", 15000);
        System.out.println(compuTaller.tipoProducto);
        System.out.println(compuTaller.repuesto);
        System.out.println(compuTaller.año);
        System.out.println(compuTaller.marca);
        System.out.println(compuTaller.precio);

        Taller tecnoTaller= new Taller("CPU", "Ventilador", 2007, "Dell", 8000);
        System.out.println(tecnoTaller.tipoProducto);
        System.out.println(tecnoTaller.repuesto);
        System.out.println(tecnoTaller.año);
        System.out.println(tecnoTaller.marca);
        System.out.println(tecnoTaller.precio);

        System.out.println("CompuTaller tiene repuestos para: " + compuTaller.tipoProducto + ", TecnoTaller tiene repuestos para: "+ tecnoTaller.tipoProducto);

    }
}
