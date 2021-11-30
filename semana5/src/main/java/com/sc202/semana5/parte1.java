
package com.sc202.semana5;

public class parte1 {
    String tamano;
    String metros;
    String oficinas;
    public Permisos permisos;
    
    
    
     public void funcionaEdificio (){
         
         System.out.println("El edificio esta funcionando");
         
     }
     public void tienePermisos()
     {
         System.out.println("El edificio tiene permisos");
     
     }
     
     public double calculametros (double anchura, double longitud){
         double resultado = anchura*longitud;
         return resultado;
     }
     public int persona(int pisos, int sillas, int salones)
     {
     return pisos*sillas*salones;
     
     }
     public int aforo(int cantidad)
     {
     return cantidad / 2;
     
     }
  
     }


