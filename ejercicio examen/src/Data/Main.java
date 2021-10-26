package Data;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Huesped miHuesped = new Huesped("Javier Torres", "23", "4 dias");
        miHuesped.setNombre("Javier R");
        System.out.println(miHuesped.getNombre());
        miHuesped.setEdad("23");
        System.out.println(miHuesped.getEdad());
        miHuesped.setDias("4 días");
        System.out.println(miHuesped.getDias());
        Acompañantes misAcompañantes = new Acompañantes("1", "Femenino", "Sí");
        misAcompañantes.setNumero("1");
        System.out.println(misAcompañantes.getNumero());
        misAcompañantes.setGenero("Femenino");
        System.out.println(misAcompañantes.getGenero());
        misAcompañantes.setMayoria("Sí");
        System.out.println(misAcompañantes.getMayoria());
        Vehiculo miVehiculo = new Vehiculo("Toyota yaris", "2008", "KLK333");
        System.out.println(miVehiculo.clase);
        miVehiculo.setModelo("Toyota yaris");
        System.out.println(miVehiculo.getModelo());
        miVehiculo.setAno("2008");
        System.out.println(miVehiculo.getAno());
        miVehiculo.setPlaca("KLK333");
        System.out.println(miVehiculo.getPlaca());
        Comidas miComida = new Comidas("Gallo pinto", "Rice and beans", "Arroz San Juan");
        System.out.println(miComida.clase1);
        miComida.setDesayuno("Gallo pinto");
        System.out.println(miComida.getDesayuno());
        miComida.setAlmuerzo("Rice and beans");
        System.out.println(miComida.getAlmuerzo());
        miComida.setCena("Arroz San Juan");
        System.out.println(miComida.getCena());
    }
}
