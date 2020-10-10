package PrecioLibros;

public class Precio {

    private int Farenheith;
    private int Revival;
    private int ElAlquimista;
    private int ElPoder;
    private int Despertar;

    public Precio(){  //modifico los valores
        Farenheith = 7000;  //5000
        Revival = 22000;    //12000
        ElAlquimista = 45000; // se mantiene
        ElPoder = 88000;    //nuevo
        Despertar = 156000; //nuevo
    }

    public int getFarenheith() {
        return Farenheith;
    }

    public int getRevival() {
        return Revival;
    }

    public int getElAlquimista() {
        return ElAlquimista;
    }

    //agregue los dos libros
    public int getElPoder() {
        return ElPoder;
    }

    public int getDespertar() {
        return Despertar;
    }
}
