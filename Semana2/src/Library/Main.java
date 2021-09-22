package Library;

import javax.swing.JOptionPane;
import java.util.Optional;

public class Main {

    public static void main(String[] args) {
        //if
        /*String nombre;
        nombre = "Fidelitas";
        if (nombre =="Fidelitas") {
            System.out.println("La universidad es Fidelitas");
        }else{
            System.out.println(nombre);
        }

        //nombre provincia if //Direccion // no estoy viviendo ahi?
        String provincia;
        String direccion;

        provincia = JOptionPane.showInputDialog("Ingrese su provincia");

        if (provincia =="Alajuela") {
            direccion = JOptionPane.showInputDialog("Ingrese su direccion");
            System.out.println("Su Direccion en Alajuela es: " + direccion);
        }else{
            System.out.println("no estoy viviendo ahi");
        }


        // SI la nota es mayor que 80 aprobrado y el nombre
        // nota menor que 80 reprobado y el nombre
        //entrada: Nombre Nota
        //JOptionPane
        //salida: nombre y la nota*/

        /*String nombre;
        double nota;

        nombre = JOptionPane.showInputDialog(null, "Ingrese su nombre");
        nota = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la nota"));
        if (nota >= 80) {
            JOptionPane.showMessageDialog(null, "El estudiante ha aprobado y su nombre es " + nombre);
            JOptionPane.showMessageDialog(null, "Su nota es " + nota);
        } else {
            JOptionPane.showMessageDialog(null, "El estudiante ha reprobado y su nombre es " + nombre);
            JOptionPane.showMessageDialog(null, "Su nota es " + nota);
        }*/


        //>= <= == > < != // and:&& or:||
        //and:
        /*int numero = 21;
        int numero2 = 22;
        if (numero == 21 && numero2 == 22) {
            System.out.println("El and se cumplio");
        }
        //or:
        int numero = 21;
        int numero2 = 23;
        if (numero == 21 || numero2 == 22) {
            System.out.println("El or se cumplio");
        }
        //diferente:
        if (numero != 27) {
            System.out.println("el numero no es 27");
        }

        //Problema 1
        //Escriba un nuevo programa en JAVA que le solicite
        //al usuario su edad y le indique si puede o no votar
        Integer edad = 18;
        edad= Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese su edad"));
        if ( edad >= 18){
            JOptionPane.showMessageDialog(null, "SI puede votar");
        }else{
            JOptionPane.showMessageDialog(null, "NO puede votar");
        }



        //Problema 2
        //Escriba un nuevo programa en JAVA que le solicite
        //al usuario la nota final del curso anterior y
        // le indique si aprobo o no

        double laNota;
        laNota = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la nota del curso anterior"));
        if (laNota >= 80) {
            JOptionPane.showMessageDialog(null, "esta Aprobado  ");
        } else {
            JOptionPane.showMessageDialog(null, "esta Reprobado ");
        }

        //if Anidado
        int numero = 30;
        int numeroSecundario = 40;

        if (numero == 30){
            if (numeroSecundario ==40){
                System.out.println("if Anidado");
            }
        }

        //if Compuesto:

        int numero = 30;
        int numeroSecundario = 40;

        if (numero ==30 || numeroSecundario ==40){
            System.out.println("if Combinado");
        }

        //Ejercicio 1
        //Escriba un programa que le solite al usuario el num de dia
        //y le indique el nombre del dia
        Integer dia = 0;

        dia= Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero de dia"));

        if ( dia == 1) {
            JOptionPane.showMessageDialog(null, "Domingo");
        }else if ( dia == 2) {
            JOptionPane.showMessageDialog(null, "Lunes");
        }else if ( dia == 3) {
            JOptionPane.showMessageDialog(null, "Martes");
        }else if ( dia == 4) {
            JOptionPane.showMessageDialog(null, "Miercoles");
        }else if ( dia == 5) {
            JOptionPane.showMessageDialog(null, "Jueves");
        }else if ( dia == 6) {
            JOptionPane.showMessageDialog(null, "Viernes");
        }else if ( dia == 7){
            JOptionPane.showMessageDialog(null, "Sabado");
        }else if ( dia == 8){
            JOptionPane.showMessageDialog(null, "Domingo");
        }
        //Ejercicio 2
        //Modificque el programa para que muestre cuales dias son
        // laborales y cuales son libres
        if (dia ==7 || dia ==8) {
            JOptionPane.showMessageDialog(null, "este dia es libre");
        }else if (dia ==1 || dia ==2 || dia ==3 || dia ==4 || dia ==5 || dia ==6) {
            JOptionPane.showMessageDialog(null, "este dia es laborado");

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
        }

        // num 1/10 *25 imprimir el resultado
        Integer numero;
        numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un numero"));
        switch (numero) {
            case 1:
                System.out.println(numero * 25);
                break;
            case 2:
                System.out.println(numero * 25);
                break;
            case 3:
                System.out.println(numero * 25);
                break;
            case 4:
                System.out.println(numero * 25);
                break;
            case 5:
                System.out.println(numero * 25);
                break;
            case 6:
                System.out.println(numero * 25);
                break;
            case 7:
                System.out.println(numero * 25);
                break;
            case 8:
                System.out.println(numero * 25);
                break;
            case 9:
                System.out.println(numero * 25);
            case 10:
                System.out.println(numero * 25);
            default:
                System.out.println("0");
                break;

        }*/

        //La Clase String
        //Funcion es un procedimiento
        //Metodos: es un contenedor donde se guarda un codigo para un proposito predeterminado

        String prueba = "Hola como estan todos hoy";
        String saludo = " hola ";
        System.out.println(prueba.length());  //mide la longitud, es decir la cant de caracteres
        System.out.println(prueba.indexOf('a')); //indica la posicion de la letra, index comienza en 0
        System.out.println(prueba.charAt(5)); //buscar la letra
        System.out.println(prueba.substring(22)); // busca las letras q estan iniciando en esa posicion
        System.out.println(saludo.trim()); // quita los espacios en blanco

        //Investigacion toLowerCase, toUpperCase, equals y compareTo
        int edad1 = 10;
        int edad2 = 12;
        System.out.println(prueba.toLowerCase()); //minuscula
        System.out.println(prueba.toUpperCase()); //mayuscula
        //
        // compareTo= compara si es igual, mayor o menor
        // es decir si las 2 cadenas son iguales da 0 y mayor que 0 si son diferentes


    }




}