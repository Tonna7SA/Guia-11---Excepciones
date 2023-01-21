package ej05guia11excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Tonna/SA FR34K
 *
 */

/*5. Escribir un programa en Java que juegue con el usuario a adivinar un número. La computadora 
debe generar un número aleatorio entre 1 y 500, y el usuario tiene que intentar adivinarlo. Para 
ello, cada vez que el usuario introduce un valor, la computadora debe decirle al usuario si el 
número que tiene que adivinar es mayor o menor que el que ha introducido el usuario. Cuando 
consiga adivinarlo, debe indicárselo e imprimir en pantalla el número de veces que el usuario 
ha intentado adivinar el número. Si el usuario introduce algo que no es un número, se debe 
controlar esa excepción e indicarlo por pantalla. En este último caso también se debe contar el 
carácter fallido como un intento*/
public class Ej05Guia11Excepciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int numeroaleatorio = (int) (Math.random() * (499) + 1);
        System.out.println(numeroaleatorio);
        System.out.println("Adivine el numero que ha guardado la computadora: (1 - 500)");
        int numero = 0;
        int cont = 0;
        int cont1 = 0;
        do {
            try {
                numero = leer.nextInt();
                if (numeroaleatorio == numero) {
                    System.out.println("Muy bien es el: " + numeroaleatorio);
                    System.out.println("Has adivinado el numero en: " + (cont + cont1) + " intentos..");
                    if (cont1 != 0) {
                        System.out.println("De las " + (cont + cont1) + " veces que intentaste, " + cont1 + " veces no fueron numeros...");
                    }
                    break;
                }
                if (numero < numeroaleatorio) {
                    System.out.println("El numero es mas grande...");
                    cont++;
                }
                if (numero > numeroaleatorio) {
                    System.out.println("El numero es mas chico...");
                    cont++;
                }
                System.out.println("Pruebe otra vez...");
            } catch (InputMismatchException ex) {
                System.out.println("Solo numeros, porfavor...");
                cont1++;
                leer.nextLine();
            }
        } while (!(numeroaleatorio == numero));
    }

}
