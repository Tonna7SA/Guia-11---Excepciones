
package animal;

import entidad.Caballo;
import entidad.Gato;
import entidad.Perro;

/**
 *
* @author Tonna/SA FR34K
**/

/*Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato, Caballo.
La clase Animal tendrá como atributos el nombre, alimento, edad y raza del Animal.
Crear un método en la clase Animal a través del cual cada clase hija deberá mostrar luego un
mensaje por pantalla informando de que se alimenta. Generar una clase Main que realice lo
siguiente:*/
public class Animal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        
        Perro p1 = new Perro("Fernando", "Dogui", 5, "Caniche");
        p1.alimentar();
        
        Gato g1 = new Gato("Deku", "Gati", 3, "Siames");
        g1.alimentar();
        
        Caballo c1 = new Caballo("Toscano", "Fardo de Pasto", 7, "Tobiano");
        c1.alimentar();
    }

}
