package libreria;
//4 Clases, 3 Atributos, 3 metodos, constructor, getter y setter
//5 clase atributo de alguna 3 atributos y 3 metodos
//3 atributos estaticos 2 clases

public class Main {

    public static void main(String[] args) {
        //Persona
        Persona persona = new Persona("Max","18","Pizza");
        System.out.println(persona.getNombre());
        persona.setNombre("Gabriel");
        System.out.println(persona.getNombre());
        persona.caminar();
        System.out.println(persona.pelo);

        //Perro
        Perro perro = new Perro("Luna","10","Carne");
        System.out.println(perro.getNombre());
        perro.setNombre("Shagui");
        System.out.println(perro.getNombre());
        perro.ladrar();
        System.out.println(perro.ojos);

        //Gato
        Gato gato = new Gato("Hoshi","2","Leche");
        System.out.println(gato.getNombre());
        gato.setNombre("Mia");
        System.out.println(gato.getNombre());
        gato.mauyar();

        //Conejo
        Conejo conejo = new Conejo("Nube","4","Zanahoria");
        System.out.println(conejo.getNombre());
        conejo.setNombre("Sombra");
        System.out.println(conejo.getNombre());
        conejo.comer();
        System.out.println(conejo.vacunas.getFalta());
        conejo.vacunas.setFalta("Una");
        System.out.println(conejo.vacunas.getFalta());



    }
}
