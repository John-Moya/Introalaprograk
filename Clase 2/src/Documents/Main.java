package Documents;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        //String nombre;
        //nombre = "Fidelitas";

        //if (nombre == "Fidelitas") {
        //  System.out.println("La universidad es Fidelitas");

        //}else{
        //  System.out.println(nombre);
        //}

        //String provincia = "";
        //String direccion = "";

        //provincia = JOptionPane.showInputDialog("Digite su provincia: ");
        //System.out.println(provincia);

        //if(provincia == "San Jose") {
        //  direccion = JOptionPane.showInputDialog(null, "Digite su direccion: ");

        //}else{
        //  JOptionPane.showMessageDialog(null, "No vivo ahi.");
        //}

        //String nombrea;
        //double nota;

        //nombrea =JOptionPane.showInputDialog(null, "Ingrese su nombre: ");
        //nota = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese su nota: "));
        //if (nota >= 79) {
        //JOptionPane.showMessageDialog(null, "El estudiante " + nombrea + " ha aprobado");
        //  JOptionPane.showMessageDialog(null, "Su nota es " + nota);
        //}else{
        //JOptionPane.showMessageDialog(null, "El estudiante " + nombrea + " ha reprobado");
        //  JOptionPane.showMessageDialog(null, "Su nota es " + nota);
        //}
        //int numero = 27;
        //int numero2 = 23;
        //if(numero == 21 && numero2 == 22) {
        //  System.out.println("El and se cumplio");
        //}
        //if(numero != 21){
        //  System.out.println("El numero es 21.");
        //}

        //int edad = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese su edad: "));
        //if (edad >= 18) {
        //JOptionPane.showMessageDialog(null, "Puede votar");
        //}else{
        //JOptionPane.showMessageDialog(null, "No puede votar");
        //}

        //String notafinal = "";
        //notafinal = JOptionPane.showInputDialog(null, "Ingrese su nota final: ");
        //if(notafinal >= 70) {
        //  JOptionPane.showMessageDialog(null, "Aprobado");
        //}else {
        //  JOptionPane.showMessageDialog(null, "No aprovado");
        //}

        //int numerob = 30;
        //int numerosecundario =40;

        //if(numerob == 30){
        // if(numerosecundario == 40){
        // System.out.println("If anidado");
        //}

        //int numeroc = 30;
        //int numerod = 40;
        //if(numeroc = 30 || numerod == 40){
        //System.out.println("If combinado");
        //}

        //int dia = 1;
        //switch (dia){
        //case 1:
        //System.out.println("Domingo");
        //break;
        //case 2:
        //System.out.println("Lunes");
        //break;
        //case 3:
        //System.out.println("Martes");
        //break;
        //case 4:
        //System.out.println("Miercoles");
        //break;
        //case 5:
        //System.out.println("Jueves");
        //break;
        //case 6:
        //System.out.println("Viernes");
        //break;
        //default:
        //System.out.println("Sabado");
        //break;
        //}

        //int numerof = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero del 1 a 10:"));
        //switch(numerof){
        //case 1 -> System.out.println("El total es: " + numerof * 25);
        //ase 2 -> System.out.println("El total es: " + numerof * 25);
        //case 3 -> System.out.println("El total es: " + numerof * 25);
        //case 4 -> System.out.println("El total es: " + numerof * 25);
        //case 5 -> System.out.println("El total es: " + numerof * 25);
        //case 6 -> System.out.println("El total es: " + numerof * 25);
        //case 7 -> System.out.println("El totale es: " + numerof * 25);
        //case 8 -> System.out.println("El total es: " + numerof * 25);
        //case 9 -> System.out.println("El total es: " + numerof * 25);
        //case 10 -> System.out.println("El total es: " + numerof * 25);
        //}

        //String prueba = "Hola como estan todos hoy";
        //System.out.println(prueba.length());
        //System.out.println(prueba.indexOf('a'));
        //System.out.println(prueba.charAt(5));
        //System.out.println(prueba.substring(4));
        //System.out.println(prueba.trim());
        //}

        // Canada SA // Deposita en una caja // retorna es un double
        // If else case // 265 > Ingresar en el bus //  264 <  Debe de depositar lo quje falta
        // sout deposite
        // Entrada >  Procesamiento tengo > validar > salida

        double pasaje;
        pasaje = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el dinero: "));
        if (pasaje >= 265.00) {
            JOptionPane.showMessageDialog(null, "Pasaje correcto");
            JOptionPane.showMessageDialog(null, "Sientese en el asiento C1, Buen viaje");
        } else {
            JOptionPane.showMessageDialog(null, "Pasaje incompleto");
            // implementar el vuelo pasaje -265
            // else if diferencia
            // no se puede ingresar a la unidad

        }

    }




}

