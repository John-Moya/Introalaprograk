package library;
import javax.swing.JOptionPane;
import library.SamrtTv;
import library.Libro;
import library.Motocicleta;

public class Main {

    public static void main(String[] args) {
        int cont = 0;
        while(cont==0){
            int opcion = Integer.parseInt(JOptionPane.showInputDialog(null,"Menu de clases\n" +
                    "1) Smart tv\n2) Libro\n3) Motocicletas\n0) Salir\nSeleccione una opcion"));
            switch (opcion){
                case 1:
                    SamrtTv tv = new SamrtTv();
                    tv.marca = "Samsung";
                    tv.modelo = "QN85A Neo QLED";
                    tv.pulgadas = 85;
                    int cont2 = 0;
                    while(cont2==0){
                        String opcion2 = JOptionPane.showInputDialog(null,"a) Atibutos\n" +
                                "b) Encender\nc) Cambiar canal\nd) Apagar\nf) Regresar");
                        if(opcion2.equals("a")){
                            JOptionPane.showMessageDialog(null,"Marca: "+tv.marca+"\nModelo: "+
                                    tv.modelo+"\nPulgadas: "+tv.pulgadas);
                        }else if(opcion2.equals("b")){
                            JOptionPane.showMessageDialog(null, tv.encender());
                        }else if(opcion2.equals("c")){
                            JOptionPane.showMessageDialog(null,tv.cambiarCanal());
                        }else if(opcion2.equals("d")){
                            JOptionPane.showMessageDialog(null,tv.apagar());
                        }else if(opcion2.equals("f")){
                            cont2 ++;
                        }
                    }
                    break;
                case 2:
                    Libro book = new Libro();
                    book.nombre = "Viajes al otro mundo";
                    book.genero = "Horro y Aventura";
                    book.escritor = "H.P Lovecraft";
                    int cont3 = 5;
                    while (cont3==5){
                        String opcion3 = JOptionPane.showInputDialog(null,"a) Atibutos\n" +
                                "b) Abrir\nc) Leer pagina\nd) Cerrar\nf) Regresar");
                        if(opcion3.equals("a")){
                            JOptionPane.showMessageDialog(null,"Nombre: "+book.nombre+
                                    "\nGenero: "+book.genero+"\nEscritor: "+book.escritor);
                        }else if(opcion3.equals("b")){
                            JOptionPane.showMessageDialog(null,book.abrir());
                        }else if (opcion3.equals("c")){
                            JOptionPane.showMessageDialog(null,book.leer());
                        }else if (opcion3.equals("d")){
                            JOptionPane.showMessageDialog(null,book.cerrar());
                        }else if(opcion3.equals("f")){
                            cont3 = 8;
                        }
                    }
                    break;
                case 3:
                    Motocicleta moto = new Motocicleta();
                    moto.marca = "Indian";
                    moto.modelo = "Scout Bobber";
                    moto.motor = "Liquid Cooled V-Twin";
                    int cont4 = 0;
                    while (cont4==0){
                        String opcion4 = JOptionPane.showInputDialog(null,"a) Atibutos\n" +
                                "b) Arrancar\nc) Acelerar\nd) Apagar\nf) Regresar");
                        if(opcion4.equals("a")){
                            JOptionPane.showMessageDialog(null,"Marca: "+moto.marca+
                                    "\nModelo: "+moto.modelo+"\nMotor: "+moto.motor);
                        }else if(opcion4.equals("b")){
                            JOptionPane.showMessageDialog(null,moto.arrancar());
                        } else if(opcion4.equals("c")){
                            JOptionPane.showMessageDialog(null,moto.acelerar());
                        }else if(opcion4.equals("d")){
                            JOptionPane.showMessageDialog(null,moto.apagar());
                        }else if(opcion4.equals("f")){
                            cont4 --;
                        }
                    }
                    break;
                case 0:
                    cont ++;

            }
        }

    }
}
