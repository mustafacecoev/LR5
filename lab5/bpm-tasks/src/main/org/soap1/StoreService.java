
package org.soap1;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "StoreService", targetNamespace = "http://asu.dgtu.donetsk.ua/ex/passexam")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface StoreService {


    /**
     * 
     * @return
     *     returns org.soap1.StoreAssortment
     */
    @WebMethod(operationName = "GetStoreAssortment")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "GetStoreAssortment", targetNamespace = "http://asu.dgtu.donetsk.ua/ex/passexam", className = "org.soap1.GetStoreAssortment")
    @ResponseWrapper(localName = "GetStoreAssortmentResponse", targetNamespace = "http://asu.dgtu.donetsk.ua/ex/passexam", className = "org.soap1.GetStoreAssortmentResponse")
    @Action(input = "http://asu.dgtu.donetsk.ua/ex/passexam/StoreService/GetStoreAssortmentRequest", output = "http://asu.dgtu.donetsk.ua/ex/passexam/StoreService/GetStoreAssortmentResponse")
    public StoreAssortment getStoreAssortment();

}
