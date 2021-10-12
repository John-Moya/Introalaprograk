package data;

public class Main {

    public static void main(String[] args) {
    //COMPUTADORA
    Computadora HP= new Computadora();
        HP.marca= "HP";
        HP.módelo= "Envy";
        HP.año= 2019;
        HP.color= "Gris";
        System.out.println(HP.marca + ", " + HP.módelo + ", " + HP.año + ", " + HP.color);
        HP.crearProgramas();
        HP.escribirDocs();
        HP.jugar();
        System.out.println("\n");

    //PAPEL
        Cuaderno norma= new Cuaderno();
        norma.marca= "Norma";
        norma.color= "Negro";
        norma.tamaño= "Mediano";
        norma.hojas= 100;
        System.out.println("Cuarderno " + norma.marca + "\n" + norma.color + "\n" + norma.tamaño + "\n" + norma.hojas);
        norma.escribirMateria();
        norma.hacerDibujos();
        norma.organizarAsignaciones();
        System.out.println("\n");

    //SERIE
        Serie s19= new Serie();
        s19.nombre= "Station 19";
        s19.género= "Drama y Acción";
        s19.temporadas= "5 temporadas";
        System.out.println(s19.nombre + "\n" + s19.género + "\n" + s19.temporadas);
        s19.entretener();
        s19.mostrarRealidad();
        s19.reflexionar();
    }
}
