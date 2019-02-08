/**
 * SystemServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.lry.qa.alm.webservices.scm.system;

public class SystemServiceServiceLocator extends org.apache.axis.client.Service implements br.lry.qa.alm.webservices.scm.system.SystemServiceService {

    public SystemServiceServiceLocator() {
    }


    public SystemServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public SystemServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for SystemServicePort
    private java.lang.String SystemServicePort_address = "http://192.168.0.101:19120/Services1.0/jaxws/system";

    public java.lang.String getSystemServicePortAddress() {
        return SystemServicePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String SystemServicePortWSDDServiceName = "SystemServicePort";

    public java.lang.String getSystemServicePortWSDDServiceName() {
        return SystemServicePortWSDDServiceName;
    }

    public void setSystemServicePortWSDDServiceName(java.lang.String name) {
        SystemServicePortWSDDServiceName = name;
    }

    public br.lry.qa.alm.webservices.scm.system.SystemService getSystemServicePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(SystemServicePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getSystemServicePort(endpoint);
    }

    public br.lry.qa.alm.webservices.scm.system.SystemService getSystemServicePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            br.lry.qa.alm.webservices.scm.system.SystemServicePortBindingStub _stub = new br.lry.qa.alm.webservices.scm.system.SystemServicePortBindingStub(portAddress, this);
            _stub.setPortName(getSystemServicePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setSystemServicePortEndpointAddress(java.lang.String address) {
        SystemServicePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (br.lry.qa.alm.webservices.scm.system.SystemService.class.isAssignableFrom(serviceEndpointInterface)) {
                br.lry.qa.alm.webservices.scm.system.SystemServicePortBindingStub _stub = new br.lry.qa.alm.webservices.scm.system.SystemServicePortBindingStub(new java.net.URL(SystemServicePort_address), this);
                _stub.setPortName(getSystemServicePortWSDDServiceName());
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
        if ("SystemServicePort".equals(inputPortName)) {
            return getSystemServicePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://www.microfocus.com/silkcentral/webservices/system", "SystemServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://www.microfocus.com/silkcentral/webservices/system", "SystemServicePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("SystemServicePort".equals(portName)) {
            setSystemServicePortEndpointAddress(address);
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
