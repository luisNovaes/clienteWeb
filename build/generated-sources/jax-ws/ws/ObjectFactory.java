
package ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _SomarResponse_QNAME = new QName("http://ws.aplicacao.com/", "somarResponse");
    private final static QName _SomarEx_QNAME = new QName("http://ws.aplicacao.com/", "somarEx");
    private final static QName _SomarObjetosResponse_QNAME = new QName("http://ws.aplicacao.com/", "somarObjetosResponse");
    private final static QName _SomarVarios_QNAME = new QName("http://ws.aplicacao.com/", "somarVarios");
    private final static QName _SomarObjetos_QNAME = new QName("http://ws.aplicacao.com/", "somarObjetos");
    private final static QName _SomarExResponse_QNAME = new QName("http://ws.aplicacao.com/", "somarExResponse");
    private final static QName _Somar_QNAME = new QName("http://ws.aplicacao.com/", "somar");
    private final static QName _SomarVariosResponse_QNAME = new QName("http://ws.aplicacao.com/", "somarVariosResponse");
    private final static QName _SomarObjeto_QNAME = new QName("http://ws.aplicacao.com/", "somarObjeto");
    private final static QName _SomarVariosEx_QNAME = new QName("http://ws.aplicacao.com/", "somarVariosEx");
    private final static QName _SomarVariosExResponse_QNAME = new QName("http://ws.aplicacao.com/", "somarVariosExResponse");
    private final static QName _SomarObjetoResponse_QNAME = new QName("http://ws.aplicacao.com/", "somarObjetoResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SomarEx }
     * 
     */
    public SomarEx createSomarEx() {
        return new SomarEx();
    }

    /**
     * Create an instance of {@link SomarResponse }
     * 
     */
    public SomarResponse createSomarResponse() {
        return new SomarResponse();
    }

    /**
     * Create an instance of {@link SomarObjetos }
     * 
     */
    public SomarObjetos createSomarObjetos() {
        return new SomarObjetos();
    }

    /**
     * Create an instance of {@link SomarVarios }
     * 
     */
    public SomarVarios createSomarVarios() {
        return new SomarVarios();
    }

    /**
     * Create an instance of {@link SomarObjetosResponse }
     * 
     */
    public SomarObjetosResponse createSomarObjetosResponse() {
        return new SomarObjetosResponse();
    }

    /**
     * Create an instance of {@link SomarVariosResponse }
     * 
     */
    public SomarVariosResponse createSomarVariosResponse() {
        return new SomarVariosResponse();
    }

    /**
     * Create an instance of {@link Somar }
     * 
     */
    public Somar createSomar() {
        return new Somar();
    }

    /**
     * Create an instance of {@link SomarExResponse }
     * 
     */
    public SomarExResponse createSomarExResponse() {
        return new SomarExResponse();
    }

    /**
     * Create an instance of {@link SomarObjetoResponse }
     * 
     */
    public SomarObjetoResponse createSomarObjetoResponse() {
        return new SomarObjetoResponse();
    }

    /**
     * Create an instance of {@link SomarObjeto }
     * 
     */
    public SomarObjeto createSomarObjeto() {
        return new SomarObjeto();
    }

    /**
     * Create an instance of {@link SomarVariosEx }
     * 
     */
    public SomarVariosEx createSomarVariosEx() {
        return new SomarVariosEx();
    }

    /**
     * Create an instance of {@link SomarVariosExResponse }
     * 
     */
    public SomarVariosExResponse createSomarVariosExResponse() {
        return new SomarVariosExResponse();
    }

    /**
     * Create an instance of {@link Resultado }
     * 
     */
    public Resultado createResultado() {
        return new Resultado();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SomarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.aplicacao.com/", name = "somarResponse")
    public JAXBElement<SomarResponse> createSomarResponse(SomarResponse value) {
        return new JAXBElement<SomarResponse>(_SomarResponse_QNAME, SomarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SomarEx }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.aplicacao.com/", name = "somarEx")
    public JAXBElement<SomarEx> createSomarEx(SomarEx value) {
        return new JAXBElement<SomarEx>(_SomarEx_QNAME, SomarEx.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SomarObjetosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.aplicacao.com/", name = "somarObjetosResponse")
    public JAXBElement<SomarObjetosResponse> createSomarObjetosResponse(SomarObjetosResponse value) {
        return new JAXBElement<SomarObjetosResponse>(_SomarObjetosResponse_QNAME, SomarObjetosResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SomarVarios }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.aplicacao.com/", name = "somarVarios")
    public JAXBElement<SomarVarios> createSomarVarios(SomarVarios value) {
        return new JAXBElement<SomarVarios>(_SomarVarios_QNAME, SomarVarios.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SomarObjetos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.aplicacao.com/", name = "somarObjetos")
    public JAXBElement<SomarObjetos> createSomarObjetos(SomarObjetos value) {
        return new JAXBElement<SomarObjetos>(_SomarObjetos_QNAME, SomarObjetos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SomarExResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.aplicacao.com/", name = "somarExResponse")
    public JAXBElement<SomarExResponse> createSomarExResponse(SomarExResponse value) {
        return new JAXBElement<SomarExResponse>(_SomarExResponse_QNAME, SomarExResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Somar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.aplicacao.com/", name = "somar")
    public JAXBElement<Somar> createSomar(Somar value) {
        return new JAXBElement<Somar>(_Somar_QNAME, Somar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SomarVariosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.aplicacao.com/", name = "somarVariosResponse")
    public JAXBElement<SomarVariosResponse> createSomarVariosResponse(SomarVariosResponse value) {
        return new JAXBElement<SomarVariosResponse>(_SomarVariosResponse_QNAME, SomarVariosResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SomarObjeto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.aplicacao.com/", name = "somarObjeto")
    public JAXBElement<SomarObjeto> createSomarObjeto(SomarObjeto value) {
        return new JAXBElement<SomarObjeto>(_SomarObjeto_QNAME, SomarObjeto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SomarVariosEx }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.aplicacao.com/", name = "somarVariosEx")
    public JAXBElement<SomarVariosEx> createSomarVariosEx(SomarVariosEx value) {
        return new JAXBElement<SomarVariosEx>(_SomarVariosEx_QNAME, SomarVariosEx.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SomarVariosExResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.aplicacao.com/", name = "somarVariosExResponse")
    public JAXBElement<SomarVariosExResponse> createSomarVariosExResponse(SomarVariosExResponse value) {
        return new JAXBElement<SomarVariosExResponse>(_SomarVariosExResponse_QNAME, SomarVariosExResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SomarObjetoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.aplicacao.com/", name = "somarObjetoResponse")
    public JAXBElement<SomarObjetoResponse> createSomarObjetoResponse(SomarObjetoResponse value) {
        return new JAXBElement<SomarObjetoResponse>(_SomarObjetoResponse_QNAME, SomarObjetoResponse.class, null, value);
    }

}
