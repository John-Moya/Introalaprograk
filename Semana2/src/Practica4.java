
import javax.swing.JOptionPane;

public class Practica4 {

    public static void main(String[] args) {
        int multi;
        int dia = Integer.parseInt(JOptionPane.showInputDialog(null, "Por favor ingrese un numero entre 1-10"));
        multi = dia * 25;
        switch (dia) {

            case 1:
                System.out.println(multi);
                break;
            case 2:
                System.out.println(multi);
                break;
            case 3:
                System.out.println(multi);
                break;
            case 4:
                System.out.println(multi);
                break;
            case 5:
                System.out.println(multi);
                break;
            case 6:
                System.out.println(multi);
                break;
            case 7:
                System.out.println(multi);
                break;
            case 8:
                System.out.println(multi);
                break;
            case 9:
                System.out.println(multi);
                break;
            default:
                System.out.println(multi);
                ;
                break;
        }
    }
}
