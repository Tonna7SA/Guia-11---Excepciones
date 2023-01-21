
package entidad;

/**
 *
 * @author Tonna/SA FR34K
 */
/**/
public class Perro extends Animal{

    public Perro(String nombre, String alimento, Integer edad, String raza) {
        super(nombre, alimento, edad, raza);
    }

    
    @Override
    public void alimentar() {
        System.out.print("El Perro se alimenta de: ");
        super.alimentar(); //To change body of generated methods, choose Tools | Templates.
    }

    
}
