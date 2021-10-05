package libary;
import javax.swing.JOptionPane;
public class Ejemplo {
    public static void main(String[] args) {
        int cont = 10;
        while (cont==10){
            int opcion=Integer.parseInt(JOptionPane.showInputDialog(null,"Menu\n1) For\n2) While" +
                    "\n3) Do While\n0) Salir\n Seleccione una opcion"));
            switch (opcion){
                case 1:
                    int numero=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese" +
                            "el número al cual quiere que llegue la lista"));
                    int suma =0;
                    for(int i=1;i<=numero;i++){
                        suma = suma+i;
                        if(i%5==0){
                            if(i==numero){
                                System.out.println(i);
                            }else{
                                System.out.println(i+",");
                            }
                        }else{
                            if(i==numero){
                                System.out.println(i);
                            }else{
                                System.out.print(i+",");
                            }
                        }
                    }
                    System.out.println(suma);
                    break;
                case 2:
                    int numero2=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese" +
                            "el número al cual quiere que llegue la lista"));
                    int suma2=0;
                    int cont2 =1;
                    while (cont2<=numero2){
                        suma2 = suma2+cont2;
                        if(cont2%5==0){
                            if(cont2==numero2){
                                System.out.println(cont2);
                            }else{
                                System.out.println(cont2+",");
                            }
                        }else{
                            if(cont2==numero2){
                                System.out.println(cont2);
                            }else{
                                System.out.print(cont2+",");
                            }
                        }
                        cont2++;
                    }
                    System.out.println(suma2);
                    break;
                case 3:
                    int numero3=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese" +
                            "el número al cual quiere que llegue la lista"));
                    int suma3=0;
                    int cont3 =1;
                    do{
                        suma3 = suma3+cont3;
                        if(cont3%5==0){
                            if(cont3==numero3){
                                System.out.println(cont3);
                            }else{
                                System.out.println(cont3+",");
                            }
                        }else{
                            if(cont3==numero3){
                                System.out.println(cont3);
                            }else{
                                System.out.print(cont3+",");
                            }
                        }
                        cont3++;

                    }while (cont3<=numero3);
                    System.out.println(suma3);
                    break;
                case 0:
                    System.out.println("¡Gracias por usar el programa!");
                    cont=5;
                    break;
                default:
                    System.out.println("Opcion no valida ");

            }
        }
    }
}
