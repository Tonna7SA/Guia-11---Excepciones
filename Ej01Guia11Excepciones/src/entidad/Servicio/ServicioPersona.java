package entidad.Servicio;

import entidad.Persona;
import java.util.Scanner;

/**
 *
 * @author Tonna/SA FR34K
 */
/**/
public class ServicioPersona {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Persona p1 = new Persona();

    public Persona CrearPersona() {
        System.out.println("Ingrese el Nombre de la persona:");
        p1.setNombre(leer.next());
        System.out.println("Ingrese la edad de " + p1.getNombre() + ":");
        p1.setEdad(leer.nextInt());
        System.out.println("Ingrese el genero de " + p1.getNombre() + ":");
        System.out.println("(H)- Hombre, (M)- Mujer, (O)- Otro");
        p1.setSexo(leer.next());
        while (!(p1.getSexo().equalsIgnoreCase("H") || p1.getSexo().equalsIgnoreCase("M") || p1.getSexo().equalsIgnoreCase("O"))) {
            System.out.println("Solo ingrese (H, M o O)");
            p1.setSexo(leer.next().toUpperCase());
        }
        System.out.println("Ingrese la Altura de " + p1.getNombre() + ":");
        p1.setAltura(leer.nextDouble());
        System.out.println("Ingrese el Peso de " + p1.getNombre() + ":");
        p1.setPeso(leer.nextDouble());
        return p1;
    }

    public int CalcularImc() {
        int indice = 0;
        if (p1.getPeso() / Math.pow(p1.getAltura(), 2) < 20) {
            indice = -1;
        }
        if (p1.getPeso() / Math.pow(p1.getAltura(), 2) > 25) {
            indice = 1;
        }
        if (p1.getPeso() / Math.pow(p1.getAltura(), 2) >= 20 && p1.getPeso() / Math.pow(p1.getAltura(), 2) <= 25) {
            indice = 0;
        }
        return indice;
    }

    public int EsMayorEdad() {
        int respuesta=0;
        System.out.println(p1.getEdad());
        try {
            if (p1.getEdad() != 0) {

                if (p1.getEdad() > 18) {
                    return respuesta = 1;
                } else {
                    return respuesta = 0;
                }
            }
        } catch (Exception e) {
            System.out.println("Edad no cargada");
        }
        return respuesta;
    }
    

}
