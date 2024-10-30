
package proxy;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the proxy package. 
 * <p>An ObjectFactory allows you to programmatically 
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

    private static final QName _Etudiant_QNAME = new QName("http://webService.sid.org/", "Etudiant");
    private static final QName _IncrementAge_QNAME = new QName("http://webService.sid.org/", "IncrementAge");
    private static final QName _IncrementAgeResponse_QNAME = new QName("http://webService.sid.org/", "IncrementAgeResponse");
    private static final QName _ListStudents_QNAME = new QName("http://webService.sid.org/", "ListStudents");
    private static final QName _ListStudentsResponse_QNAME = new QName("http://webService.sid.org/", "ListStudentsResponse");
    private static final QName _GetName_QNAME = new QName("http://webService.sid.org/", "getName");
    private static final QName _GetNameResponse_QNAME = new QName("http://webService.sid.org/", "getNameResponse");
    private static final QName _GetStudent_QNAME = new QName("http://webService.sid.org/", "getStudent");
    private static final QName _GetStudentResponse_QNAME = new QName("http://webService.sid.org/", "getStudentResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: proxy
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Students }
     * 
     * @return
     *     the new instance of {@link Students }
     */
    public Students createStudents() {
        return new Students();
    }

    /**
     * Create an instance of {@link IncrementAge }
     * 
     * @return
     *     the new instance of {@link IncrementAge }
     */
    public IncrementAge createIncrementAge() {
        return new IncrementAge();
    }

    /**
     * Create an instance of {@link IncrementAgeResponse }
     * 
     * @return
     *     the new instance of {@link IncrementAgeResponse }
     */
    public IncrementAgeResponse createIncrementAgeResponse() {
        return new IncrementAgeResponse();
    }

    /**
     * Create an instance of {@link ListStudents }
     * 
     * @return
     *     the new instance of {@link ListStudents }
     */
    public ListStudents createListStudents() {
        return new ListStudents();
    }

    /**
     * Create an instance of {@link ListStudentsResponse }
     * 
     * @return
     *     the new instance of {@link ListStudentsResponse }
     */
    public ListStudentsResponse createListStudentsResponse() {
        return new ListStudentsResponse();
    }

    /**
     * Create an instance of {@link GetName }
     * 
     * @return
     *     the new instance of {@link GetName }
     */
    public GetName createGetName() {
        return new GetName();
    }

    /**
     * Create an instance of {@link GetNameResponse }
     * 
     * @return
     *     the new instance of {@link GetNameResponse }
     */
    public GetNameResponse createGetNameResponse() {
        return new GetNameResponse();
    }

    /**
     * Create an instance of {@link GetStudent }
     * 
     * @return
     *     the new instance of {@link GetStudent }
     */
    public GetStudent createGetStudent() {
        return new GetStudent();
    }

    /**
     * Create an instance of {@link GetStudentResponse }
     * 
     * @return
     *     the new instance of {@link GetStudentResponse }
     */
    public GetStudentResponse createGetStudentResponse() {
        return new GetStudentResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Students }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Students }{@code >}
     */
    @XmlElementDecl(namespace = "http://webService.sid.org/", name = "Etudiant")
    public JAXBElement<Students> createEtudiant(Students value) {
        return new JAXBElement<>(_Etudiant_QNAME, Students.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IncrementAge }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IncrementAge }{@code >}
     */
    @XmlElementDecl(namespace = "http://webService.sid.org/", name = "IncrementAge")
    public JAXBElement<IncrementAge> createIncrementAge(IncrementAge value) {
        return new JAXBElement<>(_IncrementAge_QNAME, IncrementAge.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IncrementAgeResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IncrementAgeResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://webService.sid.org/", name = "IncrementAgeResponse")
    public JAXBElement<IncrementAgeResponse> createIncrementAgeResponse(IncrementAgeResponse value) {
        return new JAXBElement<>(_IncrementAgeResponse_QNAME, IncrementAgeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListStudents }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListStudents }{@code >}
     */
    @XmlElementDecl(namespace = "http://webService.sid.org/", name = "ListStudents")
    public JAXBElement<ListStudents> createListStudents(ListStudents value) {
        return new JAXBElement<>(_ListStudents_QNAME, ListStudents.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListStudentsResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListStudentsResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://webService.sid.org/", name = "ListStudentsResponse")
    public JAXBElement<ListStudentsResponse> createListStudentsResponse(ListStudentsResponse value) {
        return new JAXBElement<>(_ListStudentsResponse_QNAME, ListStudentsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetName }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetName }{@code >}
     */
    @XmlElementDecl(namespace = "http://webService.sid.org/", name = "getName")
    public JAXBElement<GetName> createGetName(GetName value) {
        return new JAXBElement<>(_GetName_QNAME, GetName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNameResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetNameResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://webService.sid.org/", name = "getNameResponse")
    public JAXBElement<GetNameResponse> createGetNameResponse(GetNameResponse value) {
        return new JAXBElement<>(_GetNameResponse_QNAME, GetNameResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStudent }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetStudent }{@code >}
     */
    @XmlElementDecl(namespace = "http://webService.sid.org/", name = "getStudent")
    public JAXBElement<GetStudent> createGetStudent(GetStudent value) {
        return new JAXBElement<>(_GetStudent_QNAME, GetStudent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStudentResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetStudentResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://webService.sid.org/", name = "getStudentResponse")
    public JAXBElement<GetStudentResponse> createGetStudentResponse(GetStudentResponse value) {
        return new JAXBElement<>(_GetStudentResponse_QNAME, GetStudentResponse.class, null, value);
    }

}
