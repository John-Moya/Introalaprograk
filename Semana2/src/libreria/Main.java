package libreria;
import javax.swing.JOptionPane;
public class Main {

    public static void main(String[] args) {
	// nombre provincia if // Direccion // no estoy viviendo ahi?

        //Ejercicio nota
       // String nombre;
       // Double nota;
       // nombre = JOptionPane.showInputDialog(null, "Ingrese su nombre");
      //  nota = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la nota"));
     //   if (nota >= 70){
          //  JOptionPane.showMessageDialog(null,"El estudiante ha aprobado y su nombre es " + nombre);
        //    JOptionPane.showMessageDialog(null, "Su nota es "+ nota);
      //  }else{
          //  JOptionPane.showMessageDialog(null,"El estudiante ha reprobado y su nombre es " + nombre);
          //  JOptionPane.showMessageDialog(null, "Su nota es "+ nota);
       // }

        //Ejercicio votar
       // Integer edad;
       // edad = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese su edad"));
       // if (edad >= 18) {
         //   JOptionPane.showMessageDialog(null, "Si tienes la edad para votar :)");
       // }else{
         //   JOptionPane.showMessageDialog(null,"No tienes la edad para votar ;(");
      //  }

        //Ejercicio semana

     //   Integer numero;
    //    numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero del dia"));
    //    if (numero==1) {
      //      JOptionPane.showMessageDialog(null, "Domingo(dia libre)");
    //    }else if (numero==2){
     //       JOptionPane.showMessageDialog(null, "Lunes(dia laboral)");
   //     }else if (numero==3){
         //   JOptionPane.showMessageDialog(null, "Martes(dia laboral)");
      //  }else if (numero==4){
     //       JOptionPane.showMessageDialog(null, "Miercoles(dia laboral)");
  //      }else if (numero==5){
       //     JOptionPane.showMessageDialog(null, "Jueves(dia laboral)");
    //    }else if (numero==6){
       //     JOptionPane.showMessageDialog(null, "Viernes(dia laboral)");
    //    }else if (numero==7) {
        //    JOptionPane.showMessageDialog(null, "Sabado(dia libre)");
      //  }else{
         //   JOptionPane.showMessageDialog(null, "Numero no valido");
     //   }

        // numero 1-10 *25 impriman el resultado
        Integer numero;
        numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un numero del 1-10"));
        switch (numero){
            case 1:
                System.out.println("25");
                break;
            case 2:
                System.out.println("50");
                break;
            case 3:
                System.out.println("75");
                break;
            case 4:
                System.out.println("100");
                break;
            case 5:
                System.out.println("125");
                break;
            case 6:
                System.out.println("150");
                break;
            case 7:
                System.out.println("200");
                break;
            case 8:
                System.out.println("225");
                break;
            case 9:
                System.out.println("250");
                break;
            case 10:
                System.out.println("300");
                break;
            default:
                System.out.println("Numero no valido");
                break;
        }





    }
}
