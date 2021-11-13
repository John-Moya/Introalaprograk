package proyecto;

public class Descuentos {

    
    public static double Descuento() {
        int total;
        Producto Pro = new Producto();
        {
            Pro.totalsin = Pro.total;
            total = Pro.total;
            if (total >= 30000 && total <= 41000) {
                Pro.Vdes = (total * 0.05);
                Pro.total = Pro.Vdes.intValue()-total;
            }
            if (total >= 41000 && total <= 55000) {
                Pro.Vdes = (total * 0.07);
                Pro.total = Pro.Vdes.intValue()-total;
            }
            if (total >= 55000 && total <= 70000) {
                Pro.Vdes = (total * 0.1);
                Pro.total = Pro.Vdes.intValue()-total;
            }
            if (total >= 70000) {
                Pro.Vdes = (total * 0.15);
                Pro.total = Pro.Vdes.intValue()-total;
            }
        }
        return 0;
    }

}
