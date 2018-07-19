
package ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de somarVarios complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="somarVarios">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="x" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="y" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="z" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "somarVarios", propOrder = {
    "x",
    "y",
    "z"
})
public class SomarVarios {

    protected int x;
    protected int y;
    protected int z;

    /**
     * Obtém o valor da propriedade x.
     * 
     */
    public int getX() {
        return x;
    }

    /**
     * Define o valor da propriedade x.
     * 
     */
    public void setX(int value) {
        this.x = value;
    }

    /**
     * Obtém o valor da propriedade y.
     * 
     */
    public int getY() {
        return y;
    }

    /**
     * Define o valor da propriedade y.
     * 
     */
    public void setY(int value) {
        this.y = value;
    }

    /**
     * Obtém o valor da propriedade z.
     * 
     */
    public int getZ() {
        return z;
    }

    /**
     * Define o valor da propriedade z.
     * 
     */
    public void setZ(int value) {
        this.z = value;
    }

}
