package libraries;

import javax.swing.JOptionPane;
import java.util.Objects;

public class Main {

    public static void main(String[] args) {
        /* nombre provincia if // Dirección // no estoyu viviendo ahí?
        String provincia = "San Jose";
        String provinciain = JOptionPane.showInputDialog("Ingrese su Provincia:");
        if (Objects.equals(provinciain, provincia))
            System.out.println("Esa es mi provincia");
        else{
            System.out.println("Esa no es mi provincia");}*/

//Si nota es mayor que 80, decir aprobado y Nombre, sino, reprobado, nombre

// ">=" mayor o igual que, "<=" menor o igual que, "==" igual que, ">" mayor que, "<" menor que, "||" or, "&&" and "!=" diferente que

//Escriba un nuevo programa en JAVA que le solicite al usuario su edad y le indique si puede o no puede votar.
//Considere que en nuestro país, solo las personas con 18 años o más pueden votar.
        /*String nombre = JOptionPane.showInputDialog("Por favor ingrese su nombre:");
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese su edad:"));
        if (edad>= 18)
            System.out.println("Usted "+nombre+" puede votar");
        else{
            System.out.println("Usted "+nombre+" no puede votar");}*/
//Escriba un nuevo programa en JAVA que le solicite al usuario la nota final del curso anterior y le indique si aprobó o no.
//Considere que para aprobar debe obtener una nota igual o superior a 70.
        /*String nombre = JOptionPane.showInputDialog("Por favor ingrese su nombre:");
        int nota = Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese su nota del curso anterior:"));
        int notamin = 70;
        if (nota>= notamin)
            System.out.println(nombre+", usted aprobó el curso anterior.");
        else{
            System.out.println(nombre+", usted reprobó el curso anterior.");}*/



//Escriba un programa que le solicite al usuario el número de día y le indique el nombre del día.
//Por ejemplo 1 = Domingo, 2 = Lunes, 3 = Martes, 4 = Miércoles, 5 = Jueves, 6 = Viernes, 7 = Sábado.
        /*System.out.println("1 = Domingo, 2 = Lunes, 3 = Martes, 4 = Miércoles, 5 = Jueves, 6 = Viernes, 7 = Sábado");
        int dia = Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese el día del 1 al 7:"));
        if (dia==1){System.out.println("Domingo");}
        else if (dia==2){System.out.println("Es Lunes");}
        else if (dia==3){System.out.println("Es Martes");}
        else if (dia==4){System.out.println("Es Miércoles");}
        else if (dia==5){System.out.println("Es Jueves");}
        else if (dia==6){System.out.println("Es Viernes");}
        else if (dia==7){System.out.println("Es Sábado");}*/



//Modifique el programa para que muestre cuáles días son laborales y cuales son libres.
//A pesar de que esto está en función de horarios muy variados, considere que de Lunes a Viernes es laborable y los sábados y domingos son libres.
        /*System.out.println("1 = Domingo, 2 = Lunes, 3 = Martes, 4 = Miércoles, 5 = Jueves, 6 = Viernes, 7 = Sábado");
        int dia = Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese el día del 1 al 7:"));
        if (dia==7 || dia==1){System.out.println("Fin de Semana: No es laborable.");}
        else {System.out.println("Es entre semana: Es laborable");}*/



//1-10*25
        /*int numero = Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese un numero del 1 al 10:"));
        switch (numero) {
            case 1 -> System.out.println("Su numero es: "+numero*25);
            case 2 -> System.out.println("Su numero es: "+numero*25);
            case 3 -> System.out.println("Su numero es: "+numero*25);
            case 4 -> System.out.println("Su numero es: "+numero*25);
            case 5 -> System.out.println("Su numero es: "+numero*25);
            case 6 -> System.out.println("Su numero es: "+numero*25);
            case 7 -> System.out.println("Su numero es: "+numero*25);
            case 8 -> System.out.println("Su numero es: "+numero*25);
            case 9 -> System.out.println("Su numero es: "+numero*25);
            case 10 -> System.out.println("Su numero es: "+numero*25);}*/
        String prueba = "Hola como están todos el día de hoy";
        System.out.println(prueba.length());//muestra la longitud de lo que esté en la variable
        System.out.println(prueba.indexOf("a"));//muestra la posición de lo que busquemos entre () de Index = (comienza en 0)
        System.out.println(prueba.charAt(1));//muestra el caracter de la posicion que busquemos entre () de Index = (comienza en 0)
        System.out.println(prueba.substring(10));//muestra el texto desde desde la posición que le demos
        System.out.println(prueba.substring(10,15));//muestra el texto desde desde la posición que le demos hasta otra
        System.out.println(prueba.trim());//quita espacios
    }
}
