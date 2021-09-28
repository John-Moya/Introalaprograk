
package com.sc202.semana2;
import javax.swing.JOptionPane;
public class Primerapractica {
   
    
     public static void main (String [] args)
             
     {
         /*String provincia;
         String direccion;
         
         provincia = JOptionPane.showInputDialog("Digite su provincia donde vive actualmente");
         
          if (provincia == "san jose"){
           
           System.out.println("su provincia es San Jose");   
              
          }else{
              
              System.out.println("no esta viviendo ahi");
          }*/
         
         /*double edad;
         
         edad = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese su edad"));
         
         if (edad <= 17){
           JOptionPane.showMessageDialog(null, "Usted no tiene la edad para votar");
         }else{
             
             JOptionPane.showMessageDialog(null, "Usted tiene la edad para votar");
             
             } */
         
         /*double nota;
         
         nota = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la nota del curso"));
         
         
        if (nota <= 69){
           JOptionPane.showMessageDialog(null, "Usted ha REPROBADO el curso");
         }else{
             
             JOptionPane.showMessageDialog(null, "Usted ha APROBADO el curso");
             
             }*/
         
         
        /* double numero;
         
         numero = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese un numero del dia"));
         
         if (numero == 1){
          
            JOptionPane.showMessageDialog(null, "El numero corresponde a domingo Hoy es dia libre"); 
         } if (numero == 2){
          
            JOptionPane.showMessageDialog(null, "El numero corresponde a lunes \n Hoy es dia laboral"); 
         } if (numero == 3){
          
            JOptionPane.showMessageDialog(null, "El numero corresponde a martes \n Hoy es dia laboral"); 
         } if (numero == 4){
          
            JOptionPane.showMessageDialog(null, "El numero corresponde a miercoles \n Hoy es dia laboral"); 
         }if (numero == 5){
          
            JOptionPane.showMessageDialog(null, "El numero corresponde a jueves \n Hoy es dia laboral"); 
         }if (numero == 6){
          
            JOptionPane.showMessageDialog(null, "El numero corresponde a viernes \n Hoy es dia laboral"); 
         }if (numero == 7){
          
            JOptionPane.showMessageDialog(null, "El numero corresponde a sabado \n Hoy es dia libre"); 
         }*/
         
    int multiplicar;     
    int numero = 0;
    numero =  Integer.parseInt(JOptionPane.showInputDialog(null,"Por favor ingrese un numero del 1 al 10"));
    multiplicar = numero * 25;
    switch (numero ){
    case 1:
        System.out.println(multiplicar);
        break;
    case 2:
        System.out.println(multiplicar);
        break;
    case 3:
        System.out.println(multiplicar);
        break;
    case 4:
        System.out.println(multiplicar);
        break;
    case 5:
        System.out.println(multiplicar);
        break;
    case 6:
        System.out.println(multiplicar);
        break;
         case 7:
        System.out.println(multiplicar);
        break;
         case 8:
        System.out.println(multiplicar);
        break;
         case 9:
        System.out.println(multiplicar);
        break;
    default:
        System.out.println(multiplicar);
        break;
}
          }
     }

