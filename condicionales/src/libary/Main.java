package libary;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
	int ultimoDigito = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el ultimo digito de la placa"));
    if(ultimoDigito == 1 || ultimoDigito == 2){
        if(ultimoDigito%2==0){
            JOptionPane.showMessageDialog(null,"No puede circular los Lunes ni los Sábados");
        }else{
            JOptionPane.showMessageDialog(null,"No puede circular los Lunes ni los Domingos");
        }
    }else if(ultimoDigito == 3 || ultimoDigito == 4){
        if(ultimoDigito%2==0){
            JOptionPane.showMessageDialog(null,"No puede circular los Martes ni los Sábados");
        }else{
            JOptionPane.showMessageDialog(null,"No puede circular los Martes ni los Domingos");
        }
    }else if(ultimoDigito == 5 || ultimoDigito == 6){
        if(ultimoDigito%2==0){
            JOptionPane.showMessageDialog(null,"No puede circular los Miércoles ni los Sábados");
        }else{
            JOptionPane.showMessageDialog(null,"No puede circular los Miércoles ni los Domingos");
        }
    }else if(ultimoDigito == 7 || ultimoDigito == 8){
        if(ultimoDigito%2==0){
            JOptionPane.showMessageDialog(null,"No puede circular los Jueves ni los Sábados");
        }else{
            JOptionPane.showMessageDialog(null,"No puede circular los Jueves ni los Domingos");
        }
    }else{
        if(ultimoDigito%2==0){
            JOptionPane.showMessageDialog(null,"No puede circular los Viernes ni los Sábados");
        }else{
            JOptionPane.showMessageDialog(null,"No puede circular los Viernes ni los Domingos");
        }
    }
    }
}
