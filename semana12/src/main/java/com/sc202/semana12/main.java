/*Libros y clientes*/
package com.sc202.semana12;

import javax.swing.JOptionPane;

public class main {

    public static void main(String[] args) {
        libros Libro[] = new libros[2];

        Libro[0] = new libros("0", "0");
        Libro[0].setGenero(JOptionPane.showInputDialog(null, " Ingrese el genero de su libro "));
        Libro[0].setNombre(JOptionPane.showInputDialog(null, " Ingrese el nombre del libro  "));
        Libro[0].losclientes.setCantidad(JOptionPane.showInputDialog(null, "Digite la cantidad de libros que retiro"));
        Libro[0].losclientes.setEdad(JOptionPane.showInputDialog(null, "Digite su edad "));
        Libro[0].losclientes.setNombre(JOptionPane.showInputDialog(null, "Ingrese su nombre "));
        Libro[0].Costos.setPrecios(JOptionPane.showInputDialog(null, "Ingrese el precio de los libros "));
    }

}
