public class App {
    public static void main(String[] args) throws Exception {
        //Ejercicio if
        int numeroIf = 85;
        if(numeroIf < 0) {

            System.out.println("El número " + numeroIf + " es negativo");
        } else if(numeroIf > 0) {
            System.out.println("El número " + numeroIf + " es positivo");
        } else {
            System.out.println("El número " + numeroIf + " es cero");
        }
        // Ejercicio While       
        int numeroWhile = -5;

        while (numeroWhile < 3) {
            numeroWhile++;
            System.out.println("Ejercicio While es " + numeroWhile);
        }
        // Ejercicio DoWhile
        int numeroDowhile = 3;

        do {
            System.out.println("Ejercicio DoWhile es " + numeroDowhile);
            numeroDowhile++;
        } while (numeroDowhile == 3);
    }
}
