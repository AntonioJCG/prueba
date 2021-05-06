package Calculadora;

public class Main {

    public static void main(String[] args) {
        Funciones calculadora1 = new Funciones("CASIO", "DPD68", "NS9475");
        Funciones calculadora2 = new Funciones("HP", "HGH58", "LG6819");
        
        calculadora1.suma(2, 3);
        calculadora1.modulo(3, 2);
        System.out.println("La marca de calculadora1 es "+ calculadora1.getMarca());
        calculadora1.setMarca("Fryas");
        System.out.println("La nueva marca de calculadora1 es "+ calculadora1.getMarca());
    }
    
}
