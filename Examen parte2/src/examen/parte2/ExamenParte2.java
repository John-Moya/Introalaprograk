
package examen.parte2;

public class ExamenParte2 {

    public static void main(String[] args) {
        Automovil automovil = new Automovil();
        automovil.dueno = "Alfredo";
        automovil.placa= 142532;
        automovil.precio = 1000;
        
        Automovil automovil2 = new Automovil();
        automovil2.dueno = "Felipe";
        automovil2.placa = 159877;
        automovil2.precio = 1000;
        
        Automovil automovil3 = new Automovil();
        automovil3.dueno = "Manrique";
        automovil3.placa = 153651;
        automovil3.precio = 1000;
        
        System.out.println("El dueno del vehiculo es "+automovil.dueno+ " La placa del vehiculo es: "+automovil.placa+" El precio del parqueo es de "+automovil.precio + "colones la hora");
        System.out.println("El dueno del vehiculo es "+automovil2.dueno+ " La placa del vehiculo es: "+automovil2.placa+" El precio del parqueo es de "+automovil2.precio + "colones la hora");
        System.out.println("El dueno del vehiculo es "+automovil3.dueno+ " La placa del vehiculo es: "+automovil3.placa+" El precio del parqueo es de "+automovil3.precio + "colones la hora");
    }
    
}
