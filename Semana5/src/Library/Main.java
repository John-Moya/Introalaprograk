package Library;

public class Main {

    public static void main(String[] args) {
	    /*Edificio torresLara = new Edificio();
        torresLara.funcionaEdificio();
        torresLara.tienePermisos();
        //torresLara.permisos.civil = "El edificio tiene Permisos";
        double metrosDeConstrucccion;
        metrosDeConstrucccion = torresLara.calculametros(25.899999000000,35.00000000067);
        System.out.println(metrosDeConstrucccion);
        int capacidad= torresLara.personas(10,25,8);
        System.out.println("La capacidad del edificio es de "+ capacidad);

        //hacer un metodo de logre dividir entre 2 la capacidad del edificio
        int aforo= torresLara.aforo(capacidad);
        System.out.println("La capacidad de la mitad es"+aforo);*/

        //hacer una clase q se llame acera con 3 atributos y 3 metodos
        Acera laAcera = new Acera();
        laAcera.sucia = "manchada";
        laAcera.dañada = "quebrada";
        laAcera.despintada = "sin pintura";

        laAcera.limpieza();
        laAcera.reparacion();
        laAcera.mantenimiento();


    }

}
