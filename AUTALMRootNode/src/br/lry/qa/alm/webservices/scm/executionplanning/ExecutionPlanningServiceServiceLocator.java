/**
 * ExecutionPlanningServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.lry.qa.alm.webservices.scm.executionplanning;

public class ExecutionPlanningServiceServiceLocator extends org.apache.axis.client.Service implements br.lry.qa.alm.webservices.scm.executionplanning.ExecutionPlanningServiceService {

    public ExecutionPlanningServiceServiceLocator() {
    }


    public ExecutionPlanningServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ExecutionPlanningServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ExecutionPlanningServicePort
    private java.lang.String ExecutionPlanningServicePort_address = "http://192.168.0.101:19120/Services1.0/jaxws/executionplanning";

    public java.lang.String getExecutionPlanningServicePortAddress() {
        return ExecutionPlanningServicePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ExecutionPlanningServicePortWSDDServiceName = "ExecutionPlanningServicePort";

    public java.lang.String getExecutionPlanningServicePortWSDDServiceName() {
        return ExecutionPlanningServicePortWSDDServiceName;
    }

    public void setExecutionPlanningServicePortWSDDServiceName(java.lang.String name) {
        ExecutionPlanningServicePortWSDDServiceName = name;
    }

    public br.lry.qa.alm.webservices.scm.executionplanning.ExecutionPlanningService getExecutionPlanningServicePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ExecutionPlanningServicePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getExecutionPlanningServicePort(endpoint);
    }

    public br.lry.qa.alm.webservices.scm.executionplanning.ExecutionPlanningService getExecutionPlanningServicePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            br.lry.qa.alm.webservices.scm.executionplanning.ExecutionPlanningServicePortBindingStub _stub = new br.lry.qa.alm.webservices.scm.executionplanning.ExecutionPlanningServicePortBindingStub(portAddress, this);
            _stub.setPortName(getExecutionPlanningServicePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setExecutionPlanningServicePortEndpointAddress(java.lang.String address) {
        ExecutionPlanningServicePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (br.lry.qa.alm.webservices.scm.executionplanning.ExecutionPlanningService.class.isAssignableFrom(serviceEndpointInterface)) {
                br.lry.qa.alm.webservices.scm.executionplanning.ExecutionPlanningServicePortBindingStub _stub = new br.lry.qa.alm.webservices.scm.executionplanning.ExecutionPlanningServicePortBindingStub(new java.net.URL(ExecutionPlanningServicePort_address), this);
                _stub.setPortName(getExecutionPlanningServicePortWSDDServiceName());
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
        if ("ExecutionPlanningServicePort".equals(inputPortName)) {
            return getExecutionPlanningServicePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://www.microfocus.com/silkcentral/webservices/executionplanning", "ExecutionPlanningServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://www.microfocus.com/silkcentral/webservices/executionplanning", "ExecutionPlanningServicePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ExecutionPlanningServicePort".equals(portName)) {
            setExecutionPlanningServicePortEndpointAddress(address);
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
