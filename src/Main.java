public class Main {
    public static int sumar(int num1, int num2, int num3){
        int resultado = num1 + num2 + num3;
        return resultado;
    }

    public static void main(String[] args) {
        int resultadoFinal = sumar(5,2,8);
        System.out.println(resultadoFinal);

       Coche miCoche = new Coche();
       miCoche.incrementarNumeroDePuertas(5);
       int cantidadDePuertasDeMiCoche = miCoche.getCantidadDePuertas();
       System.out.println(cantidadDePuertasDeMiCoche);
    }
}
