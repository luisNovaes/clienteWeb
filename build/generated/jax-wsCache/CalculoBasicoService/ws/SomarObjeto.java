
package ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de somarObjeto complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="somarObjeto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="obj" type="{http://ws.aplicacao.com/}resultado" minOccurs="0"/>
 *         &lt;element name="x" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "somarObjeto", propOrder = {
    "obj",
    "x"
})
public class SomarObjeto {

    protected Resultado obj;
    protected int x;

    /**
     * Obtém o valor da propriedade obj.
     * 
     * @return
     *     possible object is
     *     {@link Resultado }
     *     
     */
    public Resultado getObj() {
        return obj;
    }

    /**
     * Define o valor da propriedade obj.
     * 
     * @param value
     *     allowed object is
     *     {@link Resultado }
     *     
     */
    public void setObj(Resultado value) {
        this.obj = value;
    }

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

}
