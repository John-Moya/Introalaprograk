package data;

import javax.swing.JOptionPane;

import static java.lang.System.*;

public class Main<dia> {

    public static void main(String[] args) {
        /*String nombre;
        nombre = "San Jose";
        if (nombre=="San Jose"){
            System.out.println("La universidad es Fidelitas");
        }else{
            System.out.println(nombre);
        }*/


        // nombre provincia if // Direccion // no estoy viviendo ahi?
        /*String provincia= "";
        provincia= JOptionPane.showInputDialog("Ingrese una provincia");
        if (provincia=="San Jose"){
            JOptionPane.showMessageDialog(null, "Aserri, Barrio Alfonso XIII");
        }else{
            JOptionPane.showMessageDialog(null, "No vivo en está provincia");
        }*/

        //Entrada: Si lanota es mayor que 80= aprobado y el nombre
        //menor a 80= reprobado y el nombre
        //Nombre y Nota
        //JOptionPane
        /*String nombre;
        double nota;
        nombre = JOptionPane.showInputDialog(null, "Ingrese su nombre");
        nota = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese su nota"));
        if (nota >= 79) {
            JOptionPane.showMessageDialog(null, "Aprobado y su nombre es " + nombre);
            JOptionPane.showMessageDialog(null; "Su nota es: " + nota);
        } else {
            JOptionPane.showMessageDialog(null, "Reprobado y su nombre es " + nombre);
            JOptionPane.showMessageDialog(null; "Su nota es: " + nota);
        }*/

        //>=, <=, ==, <, >, != // and= && or= || not= !//
        /*int numero;
        int numero2;
        if (numero == 21 && numero2 == 22) ;
            System.out.println("El and se cumplio");
        }*/

        //Problema 1
        /*int edad= Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese su edad"));
        if (edad == 18) {
            JOptionPane.showMessageDialog(null, "Puede votar");
        }else {
            JOptionPane.showMessageDialog(null, "No puede votar");
        }*/

        //Problema 2
        /*int notaF= Integer.parseInt(JOptionPane.showInputDialog("Ingrese su nota final del curso"));
        if (notaF>=70) {
            JOptionPane.showMessageDialog(null, "Abrobado");
        }else {
            JOptionPane.showMessageDialog(null, "Reprobado");
        }*/

        //if ANIDADO
        /*int numero = 30;
        int numeroSecundario = 40;
        if (numero == 30){
            if (numeroSecundario == 40){
                System.out.println("If anidado");
            }
        }/*

        //
        int numero = 30;
        int numeroSecundario = 40;
        if (numero==30 || numeroSecundario== 40);
        System.out.println();
        }*/

        //Problema 3
        /*int numeroD = Integer.parseInt(JOptionPane.showInputDialog("Ingrese número de semana"));
        if (numeroD == 1 || numeroD == 7) {
            System.out.println("Día libre");
        } else if (numeroD==2 || numeroD==3 || numeroD==4 || numeroD==5 || numeroD==6) {
            System.out.println("Día laboral");
        } else{
            System.out.println("Día no identificado");
        }
        if (numeroD == 1) {
            System.out.println("Es Domingo");
            if (numeroD == 2) {
                System.out.println("Es Lunes");
                if (numeroD == 3) {
                    System.out.println("Es Martes");
                    if (numeroD == 4) {
                        System.out.println( "Es Miercoles");
                        if (numeroD == 5) {
                            System.out.println( "Es Jueves");
                            if (numeroD == 6) {
                                System.out.println("Es Viernes");
                                if (numeroD == 7) {
                                    System.out.println("Es Sábado");

                                } else {
                                    System.out.println("Número no es correcto");
                                }

                            }
                        }
                    }
                }
            }
        }*/


        //Switch
        /*int dia = Integer.parseInt(JOptionPane.showInputDialog("Ingrese número de la semana"));
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
            case 7:
                System.out.println("Sabado");
                break;
            default:
                System.out.println("Día no identificado");

        }*/


        //Switch 2
        /*int dia = Integer.parseInt(JOptionPane.showInputDialog("Ingrese número de la semana"));
        switch(dia) {
            case 1 -> System.out.println("Domingo");
            case 2 -> System.out.println("Lunes");
            case 3 -> System.out.println("Martes");
            case 4 -> System.out.println("Miercoles");
            case 5 -> System.out.println("Jueves");
            case 6 -> System.out.println("Viernes");
            case 7 -> System.out.println("Sabado");
            default ->System.out.println("Día no identificado");
        }*/

        //Ejercicio de Switch
        /*int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número del 1 al 10"));
        switch (numero){
            case 1 ->System.out.println("Su número es: "+numero*25);
            case 2 ->System.out.println("Su número es: "+numero*25);
            case 3 ->System.out.println("Su número es: "+numero*25);
            case 4 ->System.out.println("Su número es: "+numero*25);
            case 5 ->System.out.println("Su número es: "+numero*25);
            case 6 ->System.out.println("Su número es: "+numero*25);
            case 7 ->System.out.println("Su número es: "+numero*25);
            case 8 ->System.out.println("Su número es: "+numero*25);
            case 9 ->System.out.println("Su número es: "+numero*25);
            case 10 ->System.out.println("Su número es: "+numero*25);
        }*/

        //Clase de StringString prueba = "Hola, cómo estan todos?";
        /*String saludo = "Hola, cómo estan todos?";
        System.out.println(saludo.indexOf('a'));
        System.out.println(saludo.charAt(22));
        System.out.println(saludo.length());*/


    }
}
