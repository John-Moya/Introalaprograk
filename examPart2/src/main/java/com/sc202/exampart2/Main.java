package com.sc202.exampart2;
import javax.swing.JOptionPane;

public class Main {
    
    
    public static void main (String[] args){
    
   Camiones camion = new Camiones( placa: "8820",marca:"volvo",modelo: "FHL36", peso:"2 toneladas");
   JOptionPane.showMessageDialog("La placa es" + placa);
   
   JOptionPane.showMessageDialog("La marca es" + marca);
   
   JOptionPane.showMessageDialog("El modelo es" + modelo);
   
   JOptionPane.showMessageDialog("El peso es" + peso);
    
    }
}
