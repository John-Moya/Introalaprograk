package com.sc202.semana2;
import javax.swing.JOptionPane;
public class extraclase2 {
    public static void main (String [] args){
        
        
    int antiguedad = Integer.parseInt(JOptionPane.showInputDialog(null, "Por favor ingrese sus años de antiguedad"));

    int horas = Integer.parseInt(JOptionPane.showInputDialog(null, "Por favor ingrese las horas trabajadas"));
    
    int valorHora = Integer.parseInt(JOptionPane.showInputDialog(null, "Por favor ingrese el valor de las horas"));
    
    double salBruto;
    
    salBruto = (horas * valorHora) *4;
    
    if (antiguedad > 10)
    {
    salBruto = salBruto *1.20;
    }
     if (salBruto > 1000 && salBruto < 2000)
     {
         
      double deducciones = salBruto * 0.10;
     
      double salFin = salBruto - deducciones;
      
     JOptionPane.showMessageDialog(null, "El salario final es" + salFin);
         
     }
    
    
    if (salBruto > 2000)
    {
    double deducciones = salBruto * 0.15;
    
    double salFin = salBruto - deducciones;
    
    JOptionPane.showMessageDialog(null, "El salario final es" + salFin);
    }
  }
}
    
