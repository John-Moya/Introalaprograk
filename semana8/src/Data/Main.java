package Data;
import javax.swing.JOptionPane;
public class Main {

    public static void main(String[] args) {
        String[] animales = new String[6];
        animales[0]="Perro";
        animales[1]="Gato";
        animales[2]="Chinchilla";
        animales[3]="Perico";
        animales[4]="Panda";
        animales[5]="Tiburon";

       /* for (int i = 0;i<animales.length;i++){
            System.out.println(animales[i]);
        }*/
        int tamano = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el tamaño del arreglo"));
        int[] arreglo = new int[tamano];
        for(int i =0;i<arreglo.length;i++){
            arreglo[i]=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese un valor:"));
        }
        for(int j=0;j<arreglo.length;j++){
            JOptionPane.showMessageDialog(null,arreglo[j]);
        }
        Casa[] lasCasas = new Casa[2];
        for (int i = 0; i < lasCasas.length; i++) {
            lasCasas[i] = new Casa(2500,300);
            System.out.println(lasCasas[i].getPrecio() + lasCasas[i].getMetros());
        }



    }
}
