package Library;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //aplicar un formato de restricción vehicular en el país a partir del último número de la placa de nuestro vehículo
        //Lunes 1 y 2, Martes 3 y 4, Miércoles 5 y 6, Jueves 7 y 8, Viernes 9 y 0
        //solicitará al usuario el número con el que finaliza su placa y le indicará cuál día de la semana no puede circular

        int placa;
        placa = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ultimo digito de su placa"));

        if (placa == 1 || placa == 2) {
            JOptionPane.showMessageDialog(null, "No puede circular Lunes");
        } else if (placa == 3 || placa == 4) {
            JOptionPane.showMessageDialog(null, "No puede circular Martes");
        } else if (placa == 5 || placa == 6) {
            JOptionPane.showMessageDialog(null, "No puede circular Miercoles");
        } else if (placa == 7 || placa == 8) {
            JOptionPane.showMessageDialog(null, "No puede circular Jueves");
        } else if (placa == 9 || placa == 0) {
            JOptionPane.showMessageDialog(null, "No puede circular Viernes");
        } if (placa == 2 || placa == 4 || placa == 6 || placa == 8 || placa == 0) {
            JOptionPane.showMessageDialog(null, "Su placa es Par, No puede circular Sabados");
        } else {
            JOptionPane.showMessageDialog(null, "Su placa es Impar, No puede circular Domingos");
        }
    }
}
