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

        // Ejercicio For
        
        for (int numeroFor = 0; numeroFor <=3; numeroFor++) {
            System.out.println("Ejercicio For es " + numeroFor);
        }

        // Ejercicio Switch
        var estacion = "Primavera"; 
        switch (estacion) {
            case "Primavera":
            System.out.println("La estación actual es Primavera");
            break;

            case "Verano":
            System.out.println("La estación actual es Verano");
            break;

            case "Otoño":
            System.out.println("La estación actual es Otoño");
            break;

            case "Invierno":
            System.out.println("La estación actual es Invierno");
            break;

        default:
            System.out.println("No escogiste una estación listillo");
        }
    }
}
