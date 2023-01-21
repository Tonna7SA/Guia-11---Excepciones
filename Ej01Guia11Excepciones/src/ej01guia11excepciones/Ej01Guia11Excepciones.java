
package ej01guia11excepciones;

import entidad.Persona;
import entidad.Servicio.ServicioPersona;

/**
 *
* @author Tonna/SA FR34K
**/

/*1. Inicializar un objeto de la clase Persona ejercicio 7 de la guía POO, a null y tratar de invocar el 
método esMayorDeEdad() a través de ese objeto. Luego, englobe el código con una cláusula 
try-catch para probar la nueva excepción que debe ser controlada.*/
public class Ej01Guia11Excepciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

    int peso[] = new int[4];
        int edad[] = new int [4];
        ServicioPersona Datos = new ServicioPersona();
//        Persona persona1 = Datos.CrearPersona();
//        peso[0] = Datos.CalcularImc();
//        if (Datos.CalcularImc() == 0) {
//            System.out.println("IMC Ideal");
//        }
//        if (Datos.CalcularImc() == 1) {
//            System.out.println("IMC Sobrepeso");
//        }
//        if (Datos.CalcularImc() == -1) {
//            System.out.println("IMC Desnutrido");
//        }
//        if (Datos.EsMayorEdad()==1) {
//            edad[0] = Datos.EsMayorEdad();
//            System.out.println("Es mayor de edad");
//        } else {
//            System.out.println("Es menor de edad");
//        }
//        System.out.println("");
//        Persona persona2 = Datos.CrearPersona();
//        peso[1] = Datos.CalcularImc();
//        if (Datos.CalcularImc() == 0) {
//            System.out.println("IMC Ideal");
//        }
//        if (Datos.CalcularImc() == 1) {
//            System.out.println("IMC Sobrepeso");
//        }
//        if (Datos.CalcularImc() == -1) {
//            System.out.println("IMC Desnutrido");
//        }
//        if (Datos.EsMayorEdad()==1) {
//            edad[1] = Datos.EsMayorEdad();
//            System.out.println("Es mayor de edad");
//        } else {
//            System.out.println("Es menor de edad");
//        }
//        System.out.println("");
//        Persona persona3 = Datos.CrearPersona();
//        peso[2] = Datos.CalcularImc();
//        if (Datos.CalcularImc() == 0) {
//            System.out.println("IMC Ideal");
//        }
//        if (Datos.CalcularImc() == 1) {
//            System.out.println("IMC Sobrepeso");
//        }
//        if (Datos.CalcularImc() == -1) {
//            System.out.println("IMC Desnutrido");
//        }
//        if (Datos.EsMayorEdad()==1) {
//            edad[2] = Datos.EsMayorEdad();
//            System.out.println("Es mayor de edad");
//        } else {
//            System.out.println("Es menor de edad");
//        }
        System.out.println("");
        Persona persona4 = Datos.CrearPersona();
        System.out.println(persona4); 
        persona4=null;
        System.out.println(persona4);
        peso[3] = Datos.CalcularImc();
        if (Datos.CalcularImc() == 0) {
            System.out.println("IMC Ideal");
        }
        if (Datos.CalcularImc() == 1) {
            System.out.println("IMC Sobrepeso");
        }
        if (Datos.CalcularImc() == -1) {
            System.out.println("IMC Desnutrido");
        }
        if (Datos.EsMayorEdad()==1) {
            edad[3] = Datos.EsMayorEdad();
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");
        } 
        int a = 0, b = 0, c = 0;
        for (int i = 0; i < 4; i++) {
            if (peso[i] == 0) {
                a++;
            }
            if (peso[i] == 1) {
                b++;
            }
            if (peso[i] == -1) {
                c++;
            }
        }
        System.out.println("");
        System.out.println("Personas con IMC Ideal: " + a);
        System.out.println("Personas con IMC Sobrepeso: " + b);
        System.out.println("Personas con IMC Desnutricion: " + c);

        int d;
        d = 0;
        int x;
        x = 0;
        for (int j = 0; j < 4; j++) {
            if (edad[j] == 1) {
                d++;
            } else {
                x++;
            }
        }
        System.out.println("");
        System.out.println("Personas Mayores de edad: " + d);
        System.out.println("Personas Menores de edad: " + x);
    }


        }
    

