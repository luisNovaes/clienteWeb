
package ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.10-b140803.1500
 * Generated source version: 2.2
 * 
 */
@WebService(name = "CalculoBasico", targetNamespace = "http://ws.aplicacao.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface CalculoBasico {


    /**
     * 
     * @param x
     * @param y
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "somar", targetNamespace = "http://ws.aplicacao.com/", className = "ws.Somar")
    @ResponseWrapper(localName = "somarResponse", targetNamespace = "http://ws.aplicacao.com/", className = "ws.SomarResponse")
    @Action(input = "http://ws.aplicacao.com/CalculoBasico/somarRequest", output = "http://ws.aplicacao.com/CalculoBasico/somarResponse")
    public int somar(
        @WebParam(name = "x", targetNamespace = "")
        int x,
        @WebParam(name = "y", targetNamespace = "")
        int y);

    /**
     * 
     * @param x
     * @param y
     * @return
     *     returns ws.Resultado
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "somarEx", targetNamespace = "http://ws.aplicacao.com/", className = "ws.SomarEx")
    @ResponseWrapper(localName = "somarExResponse", targetNamespace = "http://ws.aplicacao.com/", className = "ws.SomarExResponse")
    @Action(input = "http://ws.aplicacao.com/CalculoBasico/somarExRequest", output = "http://ws.aplicacao.com/CalculoBasico/somarExResponse")
    public Resultado somarEx(
        @WebParam(name = "x", targetNamespace = "")
        int x,
        @WebParam(name = "y", targetNamespace = "")
        int y);

}