
package entidad;

/**
 *
 * @author Tonna/SA FR34K
 */
/*• Con respecto a los empleados, sean del tipo que sean, hay que saber su año de
incorporación a la facultad y qué número de despacho tienen asignado.*/
public class PersonaldeServicio extends GestionFacultad{
    
    private int ano;
    private int legajo;
    private String seccion;

    public PersonaldeServicio(int ano, int legajo, String seccion, String nombre, String apellido, int DNI, String estadocivil) {
        super(nombre, apellido, DNI, estadocivil);
        this.ano = ano;
        this.legajo = legajo;
        this.seccion = seccion;
    }

    public PersonaldeServicio() {
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    @Override
    public GestionFacultad Crearpersona() {
        super.Crearpersona(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Ingrese el año de ingreso: ");
        setAno(leer.nextInt());
        System.out.println("Ingrese el numero de Legajo: ");
        setLegajo(leer.nextInt());
        System.out.println("Ingrese el departamento de trabajo (Secretaria / Biblioteca / Decanato");
        setSeccion(leer.next());
        return new GestionFacultad();
    }
    
    

}
