public class Coche {
    private int puertas = 0;

    public void incrementarNumeroDePuertas(int num){
        puertas = puertas + num;
    }

    public int getCantidadDePuertas(){
        return puertas;
    }
}
