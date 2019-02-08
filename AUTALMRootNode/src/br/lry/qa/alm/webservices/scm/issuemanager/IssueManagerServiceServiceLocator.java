/**
 * IssueManagerServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.lry.qa.alm.webservices.scm.issuemanager;

public class IssueManagerServiceServiceLocator extends org.apache.axis.client.Service implements br.lry.qa.alm.webservices.scm.issuemanager.IssueManagerServiceService {

    public IssueManagerServiceServiceLocator() {
    }


    public IssueManagerServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public IssueManagerServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for IssueManagerServicePort
    private java.lang.String IssueManagerServicePort_address = "http://192.168.0.101:19120/Services1.0/jaxws/issuemanager";

    public java.lang.String getIssueManagerServicePortAddress() {
        return IssueManagerServicePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String IssueManagerServicePortWSDDServiceName = "IssueManagerServicePort";

    public java.lang.String getIssueManagerServicePortWSDDServiceName() {
        return IssueManagerServicePortWSDDServiceName;
    }

    public void setIssueManagerServicePortWSDDServiceName(java.lang.String name) {
        IssueManagerServicePortWSDDServiceName = name;
    }

    public br.lry.qa.alm.webservices.scm.issuemanager.IssueManagerService getIssueManagerServicePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(IssueManagerServicePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getIssueManagerServicePort(endpoint);
    }

    public br.lry.qa.alm.webservices.scm.issuemanager.IssueManagerService getIssueManagerServicePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            br.lry.qa.alm.webservices.scm.issuemanager.IssueManagerServicePortBindingStub _stub = new br.lry.qa.alm.webservices.scm.issuemanager.IssueManagerServicePortBindingStub(portAddress, this);
            _stub.setPortName(getIssueManagerServicePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setIssueManagerServicePortEndpointAddress(java.lang.String address) {
        IssueManagerServicePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (br.lry.qa.alm.webservices.scm.issuemanager.IssueManagerService.class.isAssignableFrom(serviceEndpointInterface)) {
                br.lry.qa.alm.webservices.scm.issuemanager.IssueManagerServicePortBindingStub _stub = new br.lry.qa.alm.webservices.scm.issuemanager.IssueManagerServicePortBindingStub(new java.net.URL(IssueManagerServicePort_address), this);
                _stub.setPortName(getIssueManagerServicePortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("IssueManagerServicePort".equals(inputPortName)) {
            return getIssueManagerServicePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://www.microfocus.com/silkcentral/webservices/issuemanager", "IssueManagerServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://www.microfocus.com/silkcentral/webservices/issuemanager", "IssueManagerServicePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("IssueManagerServicePort".equals(portName)) {
            setIssueManagerServicePortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
