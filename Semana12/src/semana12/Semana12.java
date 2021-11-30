package semana12;

import javax.swing.JOptionPane;

public class Semana12 {

    public static void main(String[] args) {
        Libros[] libro = new Libros[0];

        libro[0] = new Libros("", "", "","","");
        libro[0].setNombre(JOptionPane.showInputDialog(null, "Ingrese el nombre del libro: "));
        libro[0].setGenero(JOptionPane.showInputDialog(null, "Ingrese el genero del libro: "));
        libro[0].setAnno(JOptionPane.showInputDialog(null, "Ingrese el año de publicacion del libro: "));
        libro[0].losclientes.setIdentificacion(JOptionPane.showInputDialog(null, "Ingrese el numero de identificacion: "));
        libro[0].losclientes.setNombres(JOptionPane.showInputDialog(null, "Ingrese su nombre: "));
        libro[0].losclientes.setTelefono(JOptionPane.showInputDialog(null, "Ingrese el telefono: "));
        
        

        for (int i = 0; i < libro.length; i++) {
            System.out.println("Nombre: " + libro[i].getNombre() + " Genero del libro: " + libro[i].getGenero() + " Año: " + libro[i].getAnno());
            System.out.println("Identificacion :" + libro[i].losclientes.getIdentificacion()+ ", nombre: " + libro[i].losclientes.getNombres()+ ", telefono: " + libro[i].losclientes.getTelefono());

        }
    }

}
