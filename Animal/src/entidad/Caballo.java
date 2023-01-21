
package entidad;

/**
 *
 * @author Tonna/SA FR34K
 */
/**/
public class Caballo extends Animal{

    public Caballo(String nombre, String alimento, Integer edad, String raza) {
        super(nombre, alimento, edad, raza);
    }

    @Override
    public void alimentar() {
        System.out.print("El Caballo se alimenta de: ");
        super.alimentar(); //To change body of generated methods, choose Tools | Templates.
    }
    

}
