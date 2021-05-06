package Calculadora;

class Funciones {

    //Atributos
    private String marca;
    private String modelo;
    private String nserie;

    //Metodo constructor
    public Funciones(String marca, String modelo, String nserie) {
        this.marca = marca;
        this.modelo = modelo;
        this.nserie = nserie;
    }
    
    //Constructor sobrecargado
     public Funciones(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }
    
    //Metodos get y set (para acceder a atributos privados)
    public String getMarca(){
        return this.marca;
    }
    
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getNserie() {
        return nserie;
    }

    public void setNserie(String nserie) {
        this.nserie = nserie;
    }

    //Funcionalidades (metodos)
    public void suma(float n1, float n2) {
        System.out.println("La suma de " + n1 + " y " + n2 + " es " + (n1 + n2));
    }

    public void resta(float n1, float n2) {
        System.out.println("La resta de " + n1 + " y " + n2 + " es " + (n1 - n2));
    }

    public void multiplica(float n1, float n2) {
        System.out.println("La multiplicaci�n de " + n1 + " y " + n2 + " es " + (n1 * n2));
    }

    public void divide(float n1, float n2) {
        System.out.println("La divisi�n de " + n1 + " y " + n2 + " es " + (n1 / n2));
    }
}
