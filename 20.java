import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Numero?:");
        long numero = scanner.nextLong();

        long numeroOriginal = numero;
        long sumaDigitosPares = 0;
        long digitosPares = 0;
        long factor = 1;

        while (numero > 0) {
            long digito = numero % 10;
            if (digito % 2 == 0) {
                sumaDigitosPares += digito;
                digitosPares = digitosPares + digito * factor;
                factor *= 10;
            }
            numero /= 10;
        }

        if (digitosPares == 0) {
            System.out.println("No hay dígitos pares en el número.");
        } else {
            System.out.println("Dígitos pares: " + digitosPares);
            System.out.println("Suma de los dígitos pares: " + sumaDigitosPares);
        }

        
    }
}
