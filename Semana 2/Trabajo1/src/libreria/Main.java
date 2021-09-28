package libreria;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {


        String provincia;

        provincia = "San Jose";

        if (provincia == "San Jose") {

            System.out.println("Por Sansebastian");
        } else {
            System.out.println("Terrible");
        }

/////////////////////////////////////////////////////////////////////////////////////////

        int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad: "));
        if (edad >= 18) {
            JOptionPane.showMessageDialog(null, "Usted puede votar sin Problemas");
        } else {
            JOptionPane.showMessageDialog(null, "Usted es menor de edad, no esta permitido a votar");
        }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        int dia = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Numero de dia: "));
        if (dia <= 0) {
            JOptionPane.showMessageDialog(null, "Los numeros van del 1 al 7");
        } else if (dia == 1) {
            JOptionPane.showMessageDialog(null, "Dia Domingo");
        } else if (dia == 2) {
            JOptionPane.showMessageDialog(null, "Dia Lunes");
        } else if (dia == 3) {
            JOptionPane.showMessageDialog(null, "Dia Martes");
        } else if (dia == 4) {
            JOptionPane.showMessageDialog(null, "Dia Miercoles");
        } else if (dia == 5) {
            JOptionPane.showMessageDialog(null, "Dia Jueves");
        } else if (dia == 6) {
            JOptionPane.showMessageDialog(null, "Dia Viernes");
        } else if (dia == 7) {
            JOptionPane.showMessageDialog(null, "Dia Sabado");
        } else {
            JOptionPane.showMessageDialog(null, "Dia no valido");
        }

/////////////////////////////////////////////////////////////////////////////////////////////////////////
        int dias = 1;
        switch (dias) {

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
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////







        int num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Numero del 1 al 10: "));
        int res=num * 25;
        switch (num) {

            case 1:
                JOptionPane.showMessageDialog(null,num + " x " +"25 = "+ res);
                break;

            case 2:
                JOptionPane.showMessageDialog(null,num + " x " +"25 = "+ res);
                break;

            case 3:
                JOptionPane.showMessageDialog(null,num + " x " +"25 = "+ res);
                break;

            case 4:
                JOptionPane.showMessageDialog(null,num + " x " +"25 = "+ res);
                break;

            case 5:
                JOptionPane.showMessageDialog(null,num + " x " +"25 = "+ res);
                break;

            case 6:
                JOptionPane.showMessageDialog(null,num + " x " +"25 = "+ res);
                break;



            default:
                JOptionPane.showMessageDialog(null,num + " x " +"25 = "+ res);
                break;}



///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

String yutu = "Hola Como estan";
        System.out.println(yutu.length());













    }

    }

