package clasesem8;
public class Clasesem8 {
    public static void main(String[] args) throws Exception {
String[] losNumeros = new String[6];
   // Tipo de Primitivo Int
   // Indice 0
   // Posiciones 4
   // [ , , , ]
   losNumeros[0] = "hola";
   losNumeros[1] = "hola";
   losNumeros[2] = "hola";
   losNumeros[3] = "hola";
   losNumeros[4] = "hola";
   losNumeros[5] = "hola";

   // for
   for (int i = 0; i < losNumeros.length; i++){
       System.out.println(losNumeros[i]);
       //losNumeros[i] = 0
       //8
       // 0 + 1 = 1
       //losNumeros[i] = 1
       // indice -> Valor
       // [ losNumeros[i]  ]
       //
   }
   // Out Of Bounds
   // i < losNumeros.longitud 4    
}
}
