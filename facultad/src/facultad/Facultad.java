package facultad;

import entidad.Alumnos;
import entidad.GestionFacultad;
import entidad.PersonaldeServicio;
import entidad.Profesores;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Tonna/SA FR34K
 *
 */

/*4. Sistema Gestión Facultad. Se pretende realizar una aplicación para una facultad que gestione
la información sobre las personas vinculadas con la misma y que se pueden clasificar en tres
tipos: estudiantes, profesores y personal de servicio. A continuación, se detalla qué tipo de
información debe gestionar esta aplicación:
• Por cada persona, se debe conocer, al menos, su nombre y apellidos, su número de
identificación y su estado civil.
• Con respecto a los empleados, sean del tipo que sean, hay que saber su año de
incorporación a la facultad y qué número de despacho tienen asignado.
• En cuanto a los estudiantes, se requiere almacenar el curso en el que están
matriculados.
• Por lo que se refiere a los profesores, es necesario gestionar a qué departamento
pertenecen (lenguajes, matemáticas, arquitectura, ...).
• Sobre el personal de servicio, hay que conocer a qué sección están asignados
(biblioteca, decanato, secretaría, ...).
El ejercicio consiste, en primer lugar, en definir la jerarquía de clases de esta aplicación. A
continuación, debe programar las clases definidas en las que, además de los constructores,
hay que desarrollar los métodos correspondientes a las siguientes operaciones:
• Cambio del estado civil de una persona.
• Reasignación de despacho a un empleado.
• Matriculación de un estudiante en un nuevo curso.
• Cambio de departamento de un profesor.
• Traslado de sección de un empleado del personal de servicio.
• Imprimir toda la información de cada tipo de individuo. Incluya un programa de prueba
que instancie objetos de los distintos tipos y pruebe los métodos desarrollados.*/
public class Facultad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ArrayList<GestionFacultad> personas = new ArrayList();
        GestionFacultad g1 = new GestionFacultad();
        int opcion;
        

        do {
            Alumnos a1 = new Alumnos();
            Profesores p1 = new Profesores();
            PersonaldeServicio ps1 = new PersonaldeServicio();
            System.out.println("Ingrese una persona");
            System.out.println("1 - Alumno: ");
            System.out.println("2 - Profesor");
            System.out.println("3 - Personal de Servicio ");
            System.out.println("4 - Salir");
            System.out.println("Ingrese opcion: ");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    a1.Crearpersona();
                    personas.add(a1);
                    break;
                case 2:
                    p1.Crearpersona();
                    personas.add(p1);
                            ;
                    break;
                case 3:
                    ps1.Crearpersona();
                    personas.add(ps1);
                    break;
                case 4:
                    System.out.println("Si te he visto no me acuerdo...");
                    break;
                default:
                    System.out.println("Metiste mal el dedo");
            }

        } while (!(opcion==4));
           
        System.out.println(personas.toString());
    int DNI1;
        System.out.println("Modificacion");
        System.out.println("Ingrese el DNI");
        DNI1=leer.nextInt();
        for (GestionFacultad aux : personas) {
            if(DNI1==aux.getDNI()){
                g1.CambioestadoCivil();
            }
            
        }
        System.out.println(personas.toString());
    }

   
}
