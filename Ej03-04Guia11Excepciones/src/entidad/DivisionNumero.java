
package entidad;

/**
 *
 * @author Tonna/SA FR34K
 */
/**/
public class DivisionNumero {
private String numero1;
private String numero2;

    public DivisionNumero() {
    }

    public DivisionNumero(String numero1, String numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public String getNumero1() {
        return numero1;
    }

    public void setNumero1(String numero1) {
        this.numero1 = numero1;
    }

    public String getNumero2() {
        return numero2;
    }

    public void setNumero2(String numero2) {
        this.numero2 = numero2;
    }

    @Override
    public String toString() {
        return "DivisionNumero{" + "numero1=" + numero1 + ", numero2=" + numero2 + '}';
    }


}
