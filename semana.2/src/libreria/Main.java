package libreria;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        /*String provincia = "";
        String direccion = "";

        provincia = JOptionPane.showInputDialog(null,"Ingrese su provoncia");
        System.out.println(provincia);
        if (provincia=="Alajuela"){
            System.out.println("Esa es mi direccion");
        }else{
            JOptionPane.showInputDialog(null, "Ingrese su direccion");
            System.out.println(provincia);
            JOptionPane.showMessageDialog(null, "Esa no es mi direccion y no estoy viviendo ahi");

        }*/

        /*String nombre;
        double nota;

        nombre = JOptionPane.showInputDialog(null, "Ingrese su nombre");
        nota =  Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la nota"));
        if (nota >= 80){
            JOptionPane.showMessageDialog(null,"El estudiante ha aprobado y su nombre es " + nombre);
            JOptionPane.showMessageDialog(null, "Su nota es "+ nota);
        }else{
            JOptionPane.showMessageDialog(null,"El estudiante ha reprobado y su nombre es " + nombre);
            JOptionPane.showMessageDialog(null, "Su nota es "+ nota);
        }*/

    //||
        /*int numero = 21;
        int numero2 = 23;
        if (numero == 21 || numero2 == 22){
            System.out.println("El or se cumplio");/*
        }*/
        /*String nombre;
        double edad;

        //PROBLEMAS


        nombre = JOptionPane.showInputDialog(null, "Ingrese su nombre");
        edad = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese su edad"));
        if (edad >= 18){
            JOptionPane.showMessageDialog(null,"Puede votar por su edad es "+ edad);
        }else{
            JOptionPane.showMessageDialog(null,"No puedes votar por su edad es "+ edad);

        }*/

        /*String nombre;
        double nota;

        nombre = JOptionPane.showInputDialog(null, "Ingrese su nombre");
        nota = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese su nota del curso anterior"));

        if (nota >= 70){
            JOptionPane.showMessageDialog(null, "Estas aprobado por que su nota es "+ nota);
        }else{
            JOptionPane.showMessageDialog(null,"Esta reprobado por que su nota es "+ nota);
        }*/

        /*int edad = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese su edad"));
        if (edad >= 18){
            JOptionPane.showMessageDialog(null,"Puede votar por su edad es "+ edad);
        }else{
            JOptionPane.showMessageDialog(null,"No puedes votar por su edad es "+ edad);

        }*/

        /*int numero = 30;
        int numeroSecundario = 40;
        if (numero == 30){
            if (numeroSecundario == 40){
                System.out.println("If anidado");
            }
        }*/

        /*int dia = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero del dia"));

        if (dia == 1){

            JOptionPane.showMessageDialog(null, "Su numero del dia es lunes");
        }else if(dia == 2){
            JOptionPane.showMessageDialog(null, "Su numero del dia es martes");

        }else if(dia == 3){
            JOptionPane.showMessageDialog(null, "Su numero del miercoles");

        }else if(dia == 4){
            JOptionPane.showMessageDialog(null, "Su numero del jueves");

        }else if(dia == 5){
            JOptionPane.showMessageDialog(null, "Su numero del viernes");

        }else if(dia == 6){
            JOptionPane.showMessageDialog(null, "Su numero del sabado");

        }else if(dia == 7){
            JOptionPane.showMessageDialog(null, "Su numero del domingo");

        }*/
        /*int dia = 1;
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
        }*/
        /*int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un numero del 1 al 10"));
        switch (numero){
            case 1:
            JOptionPane.showMessageDialog(null, "Su resultado es "+ numero*25);
            break;
            case 2:
                JOptionPane.showMessageDialog(null, "Su resultado es "+ numero*25);
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "Su resultado es "+ numero*25);
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "Su resultado es "+ numero*25);
                break;
            case 5:
                JOptionPane.showMessageDialog(null, "Su resultado es "+ numero*25);
                break;
            case 6:
                JOptionPane.showMessageDialog(null, "Su resultado es "+ numero*25);
                break;
            case 7:
                JOptionPane.showMessageDialog(null, "Su resultado es "+ numero*25);
                break;
            case 8:
                JOptionPane.showMessageDialog(null, "Su resultado es "+ numero*25);
                break;
            case 9:
                JOptionPane.showMessageDialog(null, "Su resultado es "+ numero*25);
                break;
            case 10:
                JOptionPane.showMessageDialog(null, "Su resultado es "+ numero*25);
                break;*/



        /*String prueba = "Hola como estan todos hoy";
        System.out.println(prueba.indexOf('a'));
        System.out.println(prueba.charAt(24));
        System.out.println(prueba.length());*/

        ///////////Problema de tarea 1
        int salario;

        int años = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese sus años de antiguedad"));
        int horas = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese sus horas por semana"));
        int precio = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el precio que se le paga por horas"));

        System.out.println(horas*precio);
        salario = Integer.parseInt(JOptionPane.showInputDialog(null,   "Ingrese su salario bruto"));

        if (años >= 10){
            JOptionPane.showMessageDialog(null, "Por ser mayor de 10 años su bono es "+ salario/20);

          }else if (salario >= 1000){
            JOptionPane.showMessageDialog(null, "Por ganar mas 1000 dolares se le rebaja un 10% "+ salario/10);

        }else if (salario >= 2000){
            JOptionPane.showMessageDialog(null, "Por ganar mas 1000 dolares se le rebaja un 15% "+ salario/15);
        }



        }

    }
