package com.ws.tianque;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * This class was generated by Apache CXF 3.1.5
 * 2016-12-13T09:36:26.931+08:00
 * Generated source version: 3.1.5
 * 
 */
@WebServiceClient(name = "WbsIssueImplService", 
                  wsdlLocation = "http://60.191.18.40:9010/webService/wbsIssue?wsdl",
                  targetNamespace = "http://impl.service.webService.issue.plugin.tianque.com/") 
public class WbsIssueImplService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://impl.service.webService.issue.plugin.tianque.com/", "WbsIssueImplService");
    public final static QName WbsIssueImplPort = new QName("http://impl.service.webService.issue.plugin.tianque.com/", "WbsIssueImplPort");
    static {
        URL url = null;
        try {
            url = new URL("http://60.191.18.40:9010/webService/wbsIssue?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(WbsIssueImplService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "http://60.191.18.40:9010/webService/wbsIssue?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public WbsIssueImplService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public WbsIssueImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public WbsIssueImplService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public WbsIssueImplService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public WbsIssueImplService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public WbsIssueImplService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns WbsIssue
     */
    @WebEndpoint(name = "WbsIssueImplPort")
    public WbsIssue getWbsIssueImplPort() {
        return super.getPort(WbsIssueImplPort, WbsIssue.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WbsIssue
     */
    @WebEndpoint(name = "WbsIssueImplPort")
    public WbsIssue getWbsIssueImplPort(WebServiceFeature... features) {
        return super.getPort(WbsIssueImplPort, WbsIssue.class, features);
    }

}
