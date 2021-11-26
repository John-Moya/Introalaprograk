package libreria;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        Estudiantes estudiante1 = new Estudiantes("Pedro",98,50,80);
        Estudiantes estudiante2 = new Estudiantes("Tamara",70,80,100);
        Estudiantes estudiante3 = new Estudiantes("Alejando",92,100,48);


        float suma1;
        float suma2;
        float suma3;

        suma1= estudiante1.getNota1() + estudiante1.getNota2() + estudiante1.getNota3() ;
        suma2= estudiante2.getNota1() + estudiante2.getNota2() + estudiante2.getNota3() ;
        suma3= estudiante3.getNota1() + estudiante3.getNota2() + estudiante3.getNota3() ;

        float promedio1 = suma1/3;
        float promedio2 = suma2/3;
        float promedio3 = suma3/3;

        JOptionPane.showMessageDialog(null,"-Promedio de los estudiantes-\n"+"Pedro: "+ promedio1+"\n" +"Tamara: "+ promedio2+"\n" +"Alejandro: "+ promedio3+"\n" );

    }
}
