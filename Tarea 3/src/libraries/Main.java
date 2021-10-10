package libraries;

import libraries.Celular;
import libraries.Doctor;
import libraries.Audifonos;

public class Main {

    public static void main(String[] args) {

        Celular Iphone = new Celular();

        Iphone.Color = "Gris";
        Iphone.Modelo = "Iphone13";
        Iphone.Tamaño = "146.7mm";

        Iphone.realizarLlamada();
        Iphone.tomarCaptura();
        Iphone.grabarVideo();

        Doctor Medico = new Doctor();

        Medico.GradoAcademico = "Doctorado";
        Medico.AnosExperiencia = 35;
        Medico.Especialidad = "Cardiologo";

        Medico.realizarCirugia();
        Medico.antenderPacientes();
        Medico.recetarMedicamento();

        Audifonos Beats = new Audifonos();

        Beats.Conectividad = "Bluetooth";
        Beats.Tipo = "Headset";
        Beats.Marca = "Beats";

        Beats.reproducirCancion();
        Beats.ajustarVolumen();
        Beats.pararCancion();

    }
}
