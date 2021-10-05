package com.sc202.semana4;

public class Automovil {
  String color;
String marca;
String motor;
String modelo;
int ano;
double cilindrada;

public void sonarPito()        
{
System.out.println("Honk");
}

public String sonarPitoconRetorno()
{
return "honk";
}

public void encender ()
{
System.out.println("Encendido y esta en minimo");   
}

public void acelerar()
{
    System.out.println("El automovil acelera");
}
}
