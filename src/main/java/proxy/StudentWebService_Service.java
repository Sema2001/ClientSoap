
package proxy;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import jakarta.xml.ws.Service;
import jakarta.xml.ws.WebEndpoint;
import jakarta.xml.ws.WebServiceClient;
import jakarta.xml.ws.WebServiceException;
import jakarta.xml.ws.WebServiceFeature;


/**
 * This class was generated by the XML-WS Tools.
 * XML-WS Tools 4.0.3
 * Generated source version: 3.0
 * 
 */
@WebServiceClient(name = "StudentWebService", targetNamespace = "http://webService.sid.org/", wsdlLocation = "http://localhost:9090/?wsdl")
public class StudentWebService_Service
    extends Service
{

    private static final URL STUDENTWEBSERVICE_WSDL_LOCATION;
    private static final WebServiceException STUDENTWEBSERVICE_EXCEPTION;
    private static final QName STUDENTWEBSERVICE_QNAME = new QName("http://webService.sid.org/", "StudentWebService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:9090/?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        STUDENTWEBSERVICE_WSDL_LOCATION = url;
        STUDENTWEBSERVICE_EXCEPTION = e;
    }

    public StudentWebService_Service() {
        super(__getWsdlLocation(), STUDENTWEBSERVICE_QNAME);
    }

    public StudentWebService_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), STUDENTWEBSERVICE_QNAME, features);
    }

    public StudentWebService_Service(URL wsdlLocation) {
        super(wsdlLocation, STUDENTWEBSERVICE_QNAME);
    }

    public StudentWebService_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, STUDENTWEBSERVICE_QNAME, features);
    }

    public StudentWebService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public StudentWebService_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns StudentWebService
     */
    @WebEndpoint(name = "StudentWebServicePort")
    public StudentWebService getStudentWebServicePort() {
        return super.getPort(new QName("http://webService.sid.org/", "StudentWebServicePort"), StudentWebService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link jakarta.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns StudentWebService
     */
    @WebEndpoint(name = "StudentWebServicePort")
    public StudentWebService getStudentWebServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://webService.sid.org/", "StudentWebServicePort"), StudentWebService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (STUDENTWEBSERVICE_EXCEPTION!= null) {
            throw STUDENTWEBSERVICE_EXCEPTION;
        }
        return STUDENTWEBSERVICE_WSDL_LOCATION;
    }

}