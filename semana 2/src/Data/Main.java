package Data;

import javax.swing.JOptionPane;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        // write your code here
        String provincia;
        provincia = "San Jose";
        if (provincia == "San jose") {
            System.out.println("San Juan de Tibas, San Jose, CR");
        } else {
            System.out.println(provincia);
        }
        String nombre;
        double nota;

        nombre = JOptionPane.showInputDialog(null, "ingrese su nombre");
        nota = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la nota"));

            JOptionPane.showMessageDialog(null, "el estudiante  ha a probado y su nombre es " + nombre);
            JOptionPane.showMessageDialog(null, "su nota es" + nota);
        } else {
            JOptionPane.showMessageDialog(null, "el estudiante  ha a reprobado y su nombre es " + nombre);
            JOptionPane.showMessageDialog(null, "su nota es " + nota);
        }
        // >= <= == > < != // and  && or ||
        int numero = 21;
        int numero2 = 23;
        if (numero == 21 && numero2 == 22) {
            System.out.println("el or se cumplio");
        }

        if (numero != 21) {
            System.out.println("ell numero es 21");
        }//
        //Desarrollemos lo siguiente, Actividad
        int edadvotar = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese su edad"));
        if (edadvotar >= 18) {
            JOptionPane.showMessageDialog(null, "el Usuario puede votar, su edad es permitida");
        } else {
            JOptionPane.showMessageDialog(null, "no tiene permitido votar.");
        }
        int numero3 = 30;
        int numeroS = 40;
        if (numero==30) {
            if (numeroS == 40) {
                System.out.println("anidado");
            }
        }
        int dia = Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese su numero de dia"));
        if (dia==1){
            JOptionPane.showMessageDialog(null, "El dia de hoy es domingo");
        }if (dia==2){
            JOptionPane.showMessageDialog(null, "El dia de hoy es Lunes");
        }if (dia==3){
            JOptionPane.showMessageDialog(null, "El dia de hoy es Martes");
        }if (dia==4){
            JOptionPane.showMessageDialog(null, "El dia de hoy es Miercoles");
        }if (dia==5){
            JOptionPane.showMessageDialog(null, "El dia de hoy es Jueves");
        }if (dia==6){
            JOptionPane.showMessageDialog(null, "El dia de hoy es Viernes");
        }if (dia==7){
            JOptionPane.showMessageDialog(null, "El dia de hoy es Sabado");
        }
        int dia = 1;
        switch (dia){
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Lunes");
                break;
            case 3:
                System.out.println("Martes");
                break;
            case 4:
                System.out.println("Miercoles");
                break;
            case 5:
                System.out.println("Jueves");
                break;
            case 6:
                System.out.println("Viernes");
                break;
            default:
                System.out.println("Sabado");
                break;


        }
        int numeroe;
        numeroe = Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese un numero del 1 al 10"));
        switch (numeroe) {
            case 1:
                System.out.println("su numero es:" + numeroe * 25);
            case 2:
                System.out.println("su numero es:" + numeroe * 25);
            case 3:
                System.out.println("su numero es:" + numeroe * 25);
            case 4:
                System.out.println("su numero es:" + numeroe * 25);
            case 5:
                System.out.println("su numero es:" + numeroe * 25);
            case 6:
                System.out.println("su numero es:" + numeroe * 25);
            case 7:
                System.out.println("su numero es:" + numeroe * 25);
            case 8:
                System.out.println("su numero es:" + numeroe * 25);
            case 9:
                System.out.println("su numero es:" + numeroe * 25);
            case 10:
                System.out.println("su numero es:" + numeroe * 25);
        }

    }
}