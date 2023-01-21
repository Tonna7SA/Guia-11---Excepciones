
package entidad;

/**
 *
 * @author Tonna/SA FR34K
 */
/**/
public class Gato extends Animal{

    public Gato(String nombre, String alimento, Integer edad, String raza) {
        super(nombre, alimento, edad, raza);
    }

    @Override
    public void alimentar() {
        System.out.print("El Gato se alimenta de: ");
        super.alimentar(); 
    }

    
}
