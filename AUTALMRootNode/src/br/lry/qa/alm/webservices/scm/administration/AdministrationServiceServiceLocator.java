/**
 * AdministrationServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.lry.qa.alm.webservices.scm.administration;

public class AdministrationServiceServiceLocator extends org.apache.axis.client.Service implements br.lry.qa.alm.webservices.scm.administration.AdministrationServiceService {

    public AdministrationServiceServiceLocator() {
    }


    public AdministrationServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public AdministrationServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for AdministrationServicePort
    private java.lang.String AdministrationServicePort_address = "http://192.168.0.101:19120/Services1.0/jaxws/administration";

    public java.lang.String getAdministrationServicePortAddress() {
        return AdministrationServicePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String AdministrationServicePortWSDDServiceName = "AdministrationServicePort";

    public java.lang.String getAdministrationServicePortWSDDServiceName() {
        return AdministrationServicePortWSDDServiceName;
    }

    public void setAdministrationServicePortWSDDServiceName(java.lang.String name) {
        AdministrationServicePortWSDDServiceName = name;
    }

    public br.lry.qa.alm.webservices.scm.administration.AdministrationService getAdministrationServicePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(AdministrationServicePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getAdministrationServicePort(endpoint);
    }

    public br.lry.qa.alm.webservices.scm.administration.AdministrationService getAdministrationServicePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            br.lry.qa.alm.webservices.scm.administration.AdministrationServicePortBindingStub _stub = new br.lry.qa.alm.webservices.scm.administration.AdministrationServicePortBindingStub(portAddress, this);
            _stub.setPortName(getAdministrationServicePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setAdministrationServicePortEndpointAddress(java.lang.String address) {
        AdministrationServicePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (br.lry.qa.alm.webservices.scm.administration.AdministrationService.class.isAssignableFrom(serviceEndpointInterface)) {
                br.lry.qa.alm.webservices.scm.administration.AdministrationServicePortBindingStub _stub = new br.lry.qa.alm.webservices.scm.administration.AdministrationServicePortBindingStub(new java.net.URL(AdministrationServicePort_address), this);
                _stub.setPortName(getAdministrationServicePortWSDDServiceName());
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
        if ("AdministrationServicePort".equals(inputPortName)) {
            return getAdministrationServicePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://www.microfocus.com/silkcentral/webservices/administration", "AdministrationServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://www.microfocus.com/silkcentral/webservices/administration", "AdministrationServicePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("AdministrationServicePort".equals(portName)) {
            setAdministrationServicePortEndpointAddress(address);
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