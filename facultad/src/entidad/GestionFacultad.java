package entidad;

import java.util.Scanner;

/**
 *
 * @author Tonna/SA FR34K
 */
/*• Por cada persona, se debe conocer, al menos, su nombre y apellidos, su número de
identificación y su estado civil.*/
public class GestionFacultad {

    protected String nombre;
    protected String apellido;
    protected int DNI;
    protected String estadocivil;
    protected Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public GestionFacultad() {
    }

    public GestionFacultad(String nombre, String apellido, int DNI, String estadocivil) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
        this.estadocivil = estadocivil;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public String getEstadocivil() {
        return estadocivil;
    }

    public void setEstadocivil(String estadocivil) {
        this.estadocivil = estadocivil;
    }

    @Override
    public String toString() {
        return "GestionFacultad{" + "nombre=" + nombre + ", apellido=" + apellido + ", DNI=" + DNI + ", estadocivil=" + estadocivil + '}';
    }

    public GestionFacultad Crearpersona() {
        System.out.println("Ingrese el nombre: ");
        setNombre(leer.next());
        System.out.println("Ingrese el apellido: ");
        setApellido(leer.next());
        System.out.println("Ingrese el DNI: ");
        setDNI(leer.nextInt());
        System.out.println("Ingrese el Estado Civil: ");
        setEstadocivil(leer.next());
        return new GestionFacultad();
    }
    
    public void CambioestadoCivil(){
        System.out.println("Ingrese el nuevo estado civil: ");
        setEstadocivil(leer.next());
    }
}
