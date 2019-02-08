/**
 * RequirementsServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.lry.qa.alm.webservices.scm.requirements;

public class RequirementsServiceServiceLocator extends org.apache.axis.client.Service implements br.lry.qa.alm.webservices.scm.requirements.RequirementsServiceService {

    public RequirementsServiceServiceLocator() {
    }


    public RequirementsServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public RequirementsServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for RequirementsServicePort
    private java.lang.String RequirementsServicePort_address = "http://192.168.0.101:19120/Services1.0/jaxws/requirements";

    public java.lang.String getRequirementsServicePortAddress() {
        return RequirementsServicePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String RequirementsServicePortWSDDServiceName = "RequirementsServicePort";

    public java.lang.String getRequirementsServicePortWSDDServiceName() {
        return RequirementsServicePortWSDDServiceName;
    }

    public void setRequirementsServicePortWSDDServiceName(java.lang.String name) {
        RequirementsServicePortWSDDServiceName = name;
    }

    public br.lry.qa.alm.webservices.scm.requirements.RequirementsService getRequirementsServicePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(RequirementsServicePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getRequirementsServicePort(endpoint);
    }

    public br.lry.qa.alm.webservices.scm.requirements.RequirementsService getRequirementsServicePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            br.lry.qa.alm.webservices.scm.requirements.RequirementsServicePortBindingStub _stub = new br.lry.qa.alm.webservices.scm.requirements.RequirementsServicePortBindingStub(portAddress, this);
            _stub.setPortName(getRequirementsServicePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setRequirementsServicePortEndpointAddress(java.lang.String address) {
        RequirementsServicePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (br.lry.qa.alm.webservices.scm.requirements.RequirementsService.class.isAssignableFrom(serviceEndpointInterface)) {
                br.lry.qa.alm.webservices.scm.requirements.RequirementsServicePortBindingStub _stub = new br.lry.qa.alm.webservices.scm.requirements.RequirementsServicePortBindingStub(new java.net.URL(RequirementsServicePort_address), this);
                _stub.setPortName(getRequirementsServicePortWSDDServiceName());
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
        if ("RequirementsServicePort".equals(inputPortName)) {
            return getRequirementsServicePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://www.microfocus.com/silkcentral/webservices/requirements", "RequirementsServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://www.microfocus.com/silkcentral/webservices/requirements", "RequirementsServicePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("RequirementsServicePort".equals(portName)) {
            setRequirementsServicePortEndpointAddress(address);
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
