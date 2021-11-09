package Data;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        Automovil carro1 = new Automovil();
        Automovil carro2 = new Automovil();
        Automovil carro3 = new Automovil();
        Automovil carro4 = new Automovil();

        String[][] datos = new String[4][3];
        int cont = 1;
        for(int i = 0;i<4;i++){
            for (int j = 0;j<3;j++){
                if(j==0){
                    datos[i][j] = JOptionPane.showInputDialog(null,"Ingrese la placa del auto número "+cont);
                }else if(j==1){
                    datos[i][j] = JOptionPane.showInputDialog(null,"Ingrese el modelo del auto número "+cont);
                }else if(j==2){
                    datos[i][j] = JOptionPane.showInputDialog(null,"Ingrese la cantidad de pasajeros del auto número "+cont);
                }
            }
            cont++;
        }
        for(int x = 0;x<4;x++){
            for(int z = 0; z<3;z++){
                if(x==0){
                   if(z==0){
                       carro1.setPlaca(datos[x][z]);
                       System.out.print(datos[x][z]+",");
                   }else if(z==1){
                       carro1.setModelo(datos[x][z]);
                       System.out.print(datos[x][z]+",");
                   }else {
                       carro1.setNumeroPasajeros(datos[x][z]);
                       System.out.println(datos[x][z]);
                   }
                }else if(x==1){
                    if(z==0){
                        carro2.setPlaca(datos[x][z]);
                        System.out.print(datos[x][z]+",");
                    }else if(z==1){
                        carro2.setModelo(datos[x][z]);
                        System.out.print(datos[x][z]+",");
                    }else {
                        carro2.setNumeroPasajeros(datos[x][z]);
                        System.out.println(datos[x][z]);
                    }
                }else if(x==2){
                    if(z==0){
                        carro3.setPlaca(datos[x][z]);
                        System.out.print(datos[x][z]+",");
                    }else if(z==1){
                        carro3.setModelo(datos[x][z]);
                        System.out.print(datos[x][z]+",");
                    }else {
                        carro3.setNumeroPasajeros(datos[x][z]);
                        System.out.println(datos[x][z]);
                    }
                }else if(x==3){
                    if(z==0){
                        carro4.setPlaca(datos[x][z]);
                        System.out.print(datos[x][z]+",");
                    }else if(z==1){
                        carro4.setModelo(datos[x][z]);
                        System.out.print(datos[x][z]+",");
                    }else {
                        carro4.setNumeroPasajeros(datos[x][z]);
                        System.out.println(datos[x][z]);
                    }
                }
            }
        }



    }
}
