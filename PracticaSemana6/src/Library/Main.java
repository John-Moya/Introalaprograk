package Library;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Perros miPerro= new Perros("pug", "beige", "5 kilos");
        System.out.println(miPerro.getPeso());
        miPerro.setPeso("6.5 kilos");
        System.out.println(miPerro.getPeso());
        Gatos miGato= new Gatos("Colico", "7 anos", "pequeno");
        Pajaros pajarito= new Pajaros("Perico", "verde", "pequeno");
        Conejos miConejo= new Conejos("europeo", "largo", "9 anos");
        Veterinaria Blas= new Veterinaria("Alajuela", "9-6", "12");

        System.out.println(miPerro.vete.getUbicacion());
        miPerro.vete.setUbicacion("Nueva Veterinaria");
        System.out.println(miPerro.vete.getUbicacion());

        System.out.println(miGato.color);


    }
}
