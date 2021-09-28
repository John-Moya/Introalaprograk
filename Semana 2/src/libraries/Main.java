package libraries;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
	    String nombre;
        nombre = "Fidelitas";

        if (nombre=="Fidelitas") {
            System.out.println("La universidad es Fidelitas");

        }else{
            System.out.println(nombre);

        }

        // nombre provincia if // Direccion // no estoy viviendo ahí

        String provincia;
        provincia = "San José";

        if (provincia=="San José") {
            System.out.println("La dirección es San José");

        }else{
            System.out.println("No estoy viviendo ahí");
        }

        String nombre;
        double nota;

        nombre = JOptionPane.showInputDialog(null, "Ingrese su nombre");
        nota = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la nota"));
        if (nota >= 79) {
            JOptionPane.showMessageDialog(null, "El estudiante ha aprobado y su nombre es " + nombre);
            JOptionPane.showMessageDialog(null, "Su nota es " + nota);
        }else{
            JOptionPane.showMessageDialog(null, "El estudiante ha reprobado y su nombre es " + nombre);
            JOptionPane.showMessageDialog(null, "Su nota es " + nota);

        }
        //SI la nota es mayor que 80 aprobado y el nombre
        // reprobado nombre
        // Nombre Nota
        // JOptionPane (String)(Integer)


        // >= <= == > < !=
        //and && or ||

        int numero = 21;
        int numero2 = 23;
        if (numero == 21 || numero2 == 22){
            System.out.println("El or se cumplió");

        }



        //Problema 1

        int edad;
        edad = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese su edad"));
        if (edad >= 18) {
            JOptionPane.showMessageDialog(null,"Usted puede votar");

        }else{
            JOptionPane.showMessageDialog(null, "Usted no puede votar");
        }

        //Problema 2

        double notaFinal;
        notaFinal = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese su nota"));
        if (notaFinal >= 70) {
            JOptionPane.showMessageDialog(null, "Usted aprobó");

        }else{
            JOptionPane.showMessageDialog(null, "Usted no aprobó");

        }



        int numero = 30;
        int numeroSecundario = 40;

        if (numero == 30){
            if (numeroSecundario == 40){
                System.out.println("If anidado");
            }
        }


        //Problema 1

        int numero;
        numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el número del día"));
        if (numero==1) {
            JOptionPane.showMessageDialog(null, "Domingo, Día libre");

        }else if (numero==2) {
            JOptionPane.showMessageDialog(null, "Lunes, Día Laboral");

        }else if (numero==3) {
            JOptionPane.showMessageDialog(null, "Martes, Día Laboral");

        }else if (numero==4) {
            JOptionPane.showMessageDialog(null, "Miercoles, Día Laboral");

        }else if (numero==5) {
            JOptionPane.showMessageDialog(null, "Jueves, Día Laboral");

        }else if (numero==6) {
            JOptionPane.showMessageDialog(null, "Viernes, Día Laboral");

        }else if (numero==7){
            JOptionPane.showMessageDialog(null,"Sábado, Día Laboral");

        }


        int dia = 1;
        switch (dia) {
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

        }


        // 1-10 * 25 impriman el resultado

        int numero;
        numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un número del 1-10"));
        switch (numero){
            case 1:
                int resultado1 = numero * 25;
                JOptionPane.showMessageDialog(null, "El resultado es: " + resultado1);
                break;
            case 2:
                int resultado2 = numero * 25;
                JOptionPane.showMessageDialog(null, "El resultado es: " + resultado2);
                break;
            case 3:
                int resultado3 = numero * 25;
                JOptionPane.showMessageDialog(null, "El resultado es: " + resultado3);
                break;
            case 4:
                int resultado4 = numero * 25;
                JOptionPane.showMessageDialog(null, "El resultado es: " + resultado4);
                break;
            case 5:
                int resultado5 = numero * 25;
                JOptionPane.showMessageDialog(null, "El resultado es: " + resultado5);
                break;
            case 6:
                int resultado6 = numero * 25;
                JOptionPane.showMessageDialog(null, "El resultado es: " + resultado6);
                break;
            case 7:
                int resultado7 = numero * 25;
                JOptionPane.showMessageDialog(null, "El resultado es: " + resultado7);
                break;
            case 8:
                int resultado8 = numero * 25;
                JOptionPane.showMessageDialog(null, "El resultado es: " + resultado8);
                break;
            case 9:
                int resultado9 = numero * 25;
                JOptionPane.showMessageDialog(null, "El resultado es: " + resultado9);
                break;
            case 10:
                int resultado10 = numero * 25;
                JOptionPane.showMessageDialog(null, "El resultado es: " + resultado10);
                break;
        }


        String prueba = "Hola como están todos hoy";
        String saludo = "Hola ";
        System.out.println(prueba.indexOf('a'));
        System.out.println(prueba.charAt(24));
        System.out.println(prueba.length());
        System.out.println(prueba.substring(o,4));
        System.out.println(prueba.trim());



        // Canada SA // Deposita en una caja el pasaje // retorna es un double
        // IF else case // 265 => Ingresar en el bus // 264 < Debe de dempstrar lo que falta
        // sout deposite
        // Entrada -> Procesamiento Tengo -> Validar -> Salida

        double pasaje;
        pasaje = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el dinero"));
        if (pasaje >= 265.00) {
            JOptionPane.showMessageDialog(null, "Pasaje Correcto");
            JOptionPane.showMessageDialog(null, "Sientese en el asiento C1, Buen Viaje");
        }else if(pasaje > 265.00){
            JOptionPane.showMessageDialog(null, "Pasaje no completo");
            double faltante = 265.00 - pasaje;
            JOptionPane.showMessageDialog(null, "Le falta el siguiente monto: " + faltante);
            JOptionPane.showMessageDialog(null, "No puede ingresar a la unidad");

        }

        // implementar el vuelto pasaje - 265
        // else if diferencia
        // no se puede ingresar a la unidad





    }
}
