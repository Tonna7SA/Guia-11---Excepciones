package entidad;

/**
 *
 * @author Tonna/SA FR34K
 */
/**/
public class Profesores extends GestionFacultad {

    private String departamento;

    public Profesores() {
    }

    public Profesores(String departamento) {
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return super.toString() + "Profesores{" + "departamento=" + departamento + '}';
    }
    

    @Override
    public GestionFacultad Crearpersona() {
        super.Crearpersona(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Ingresar el departamento de trabajo (Literatura / Matematicas / Ciencias)");
        setDepartamento(leer.next());
        return new GestionFacultad();
    }

}
