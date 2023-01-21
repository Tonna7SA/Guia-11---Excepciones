
package ej02guia11excepciones;

/**
 *
* @author Tonna/SA FR34K
**/

/*2. Definir una Clase que contenga algún tipo de dato de tipo array y agregue el código para 
generar y capturar una excepción ArrayIndexOutOfBoundsException (índice de arreglo fuera 
de rango)*/
public class Ej02Guia11Excepciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int vector [] = {1,2,3,4,5};
        try{
            for (int i = 0; i < vector.length; i++) {
                System.out.println(vector[5]);
            }
            vector[5]=3;
           
        }
        catch(ArrayIndexOutOfBoundsException ex){
            System.out.println("El vector se excede en su capacidad");
        }
    }

}
