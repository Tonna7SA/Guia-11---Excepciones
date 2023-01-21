package entidad;

/**
 *
 * @author Tonna/SA FR34K
 */
/*• En cuanto a los estudiantes, se requiere almacenar el curso en el que están
matriculados.*/
public class Alumnos extends GestionFacultad {

    private String curso;

    public Alumnos() {
    }

    public Alumnos(String curso, String nombre, String apellido, int DNI, String estadocivil) {
        super(nombre, apellido, DNI, estadocivil);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public GestionFacultad Crearpersona() {
        super.Crearpersona(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Ingrese el curso del alumno: ");
        setCurso(leer.next());
        return new GestionFacultad();
    }

}
