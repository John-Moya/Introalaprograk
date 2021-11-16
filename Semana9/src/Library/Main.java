package Library;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
	/*//Arreglos de objetos

	    Accesorios[] extras= new Accesorios[3];
        extras[0].setNombre("Zacate Artificial");
        extras[1].setNombre("Marmol");
        extras[2].setNombre("Parrilla");

        }*/
        Muebles elMueble= new Muebles("","","");
        elMueble.limpio("sillon", "limpio");

        /*Casa[] resindecial= new Casa[2];
        for (int i = 0; i < resindecial.length; i++) {
            //inicializar la instancia
            resindecial[i]=new Casa("","", extras);
            resindecial[i].setMetros(JOptionPane.showInputDialog(null, "Ingrese los metros de la casa: "));
            resindecial[i].setHabitaciones(JOptionPane.showInputDialog(null, "Ingrese las habitaciones: "));
            resindecial[i].losMuebles.setTipo(JOptionPane.showInputDialog(null, "Ingrese el tipo de mueble: "));
            resindecial[i].losMuebles.setAsientos(JOptionPane.showInputDialog(null, "4"));
            resindecial[i].losMuebles.setLocacion(JOptionPane.showInputDialog(null, "Ingrese la locacion: "));

        }
        for (int i = 0; i < resindecial.length; i++) {
            System.out.println(resindecial[i].getMetros() + "" + resindecial[i].getHabitaciones()+"Los muebles son:"+resindecial[i].losMuebles.getTipo()+""+ resindecial[i].losMuebles.getLocacion());
            System.out.println(resindecial[i].getLosAccesorios());

        //Automoviles(3), motor puertas pasajeros, con FOR JOpcionPane e imprimir Sout
            //mecanico, especialidad, horario l a v 8-5 y codigo (4 digitos)

        Automoviles[] autos= new Automoviles[3];

        for (int i = 0; i < autos.length; i++) {
            autos[i]= new Automoviles("1600cc","4","5");
            autos[i].setMotor(JOptionPane.showInputDialog(null,"Ingrese el motor del automovil: "));
            autos[i].setPuertas(JOptionPane.showInputDialog(null,"Ingrese la cantidad de puertas: "));
            autos[i].setPasajeros(JOptionPane.showInputDialog(null,"Ingrese la cantidad de pasajeros: "));
            autos[i].elMecanico.setEspecialidad(JOptionPane.showInputDialog(null, "Ingrese la especialidad del Mecanico: "));
            autos[i].elMecanico.setHorario(JOptionPane.showInputDialog(null, "Ingrese el horario : "));
            autos[i].elMecanico.setCodigo(JOptionPane.showInputDialog(null, "Ingrese el codigo del Mecanico: "));

        }
        for (int i = 0; i < autos.length; i++) {
            System.out.println("motor: "+ autos[i].getMotor() +", cantidad de puertas: "+ autos[i].getPuertas() +" y cantidad de pasajeros: "+ autos[i].getPasajeros()+", mecanico: "+autos[i].elMecanico.getEspecialidad()+", horario: "+autos[i].elMecanico.getHorario()+", el codigo del mecanico es: "+autos[i].elMecanico.getCodigo());
        }*/



    }
}
