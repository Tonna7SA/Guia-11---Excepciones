
package ej03guia11excepciones;

import entidad.DivisionNumero;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
* @author Tonna/SA FR34K
**/

/*3. Defina una clase llamada DivisionNumero. En el método main utilice un Scanner para leer dos 
números en forma de cadena. A continuación, utilice el método parseInt() de la clase Integer, 
para convertir las cadenas al tipo int y guardarlas en dos variables de tipo int. Por ultimo realizar 
una división con los dos numeros y mostrar el resultado.
4. Todas estas operaciones puede tirar excepciones a manejar, el ingreso por teclado puede 
causar una excepción de tipo InputMismatchException, el método Integer.parseInt() si la cadena 
no puede convertirse a entero, arroja una NumberFormatException y además, al dividir un 
número por cero surge una ArithmeticException. Manipule todas las posibles excepciones 
utilizando bloques try/catch para las distintas excepciones
*/


public class Ej03Guia11Excepciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        DivisionNumero d1 = new DivisionNumero();
        try{
        System.out.println("Ingrese numero 1");
        d1.setNumero1(leer.next());
        System.out.println("Ingrese numero 2");
        d1.setNumero2(leer.next());
        }catch(InputMismatchException ex){
            System.out.println("Ingreso un caracter invalido");
        }
        int n1 = 0;
        int n2 = 0;
        
        try{
        n1 = Integer.parseInt(d1.getNumero1());
        n2 = Integer.parseInt(d1.getNumero2());
        }
        catch(NumberFormatException e){
            System.out.println("Conversion no valida...");
        }
        
        try{
            int resultado = n1/n2;
            System.out.println("Resultado Division = "+resultado);
        }
        catch(ArithmeticException e){
            System.out.println("No se pude dividir por cero...");
        }
        
        

        
    }

}
