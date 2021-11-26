package libreria;



import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        String nombre = JOptionPane.showInputDialog("Porfavor ingrese su nombre:");
        String apellido = JOptionPane.showInputDialog("Porfavor ingrese sus apellidos:");
        int edad =0;
        edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad: "));

        Double sueldo = Double.parseDouble(JOptionPane.showInputDialog("Digite su salario"));

        JOptionPane.showMessageDialog(null,"El nombre es "+nombre+" "+ apellido+ " la edad es "+edad+" y su sueldo " +
                "es de "+sueldo+" colones.");



    }
}