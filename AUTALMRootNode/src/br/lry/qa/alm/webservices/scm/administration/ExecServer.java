/**
 * ExecServer.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.lry.qa.alm.webservices.scm.administration;

public class ExecServer  implements java.io.Serializable {
    private boolean active;

    private int appModuleID;

    private java.lang.String description;

    private java.lang.String execServerHostName;

    private int id;

    private int locationId;

    private int maxBandwidth;

    private java.lang.Integer maxConcurrentExecutions;

    private java.lang.String name;

    private int problemAlertTimeout;

    private int rmiProxyPort;

    private int rmiProxyPortSSL;

    private int state;

    private boolean useSSL;

    public ExecServer() {
    }

    public ExecServer(
           boolean active,
           int appModuleID,
           java.lang.String description,
           java.lang.String execServerHostName,
           int id,
           int locationId,
           int maxBandwidth,
           java.lang.Integer maxConcurrentExecutions,
           java.lang.String name,
           int problemAlertTimeout,
           int rmiProxyPort,
           int rmiProxyPortSSL,
           int state,
           boolean useSSL) {
           this.active = active;
           this.appModuleID = appModuleID;
           this.description = description;
           this.execServerHostName = execServerHostName;
           this.id = id;
           this.locationId = locationId;
           this.maxBandwidth = maxBandwidth;
           this.maxConcurrentExecutions = maxConcurrentExecutions;
           this.name = name;
           this.problemAlertTimeout = problemAlertTimeout;
           this.rmiProxyPort = rmiProxyPort;
           this.rmiProxyPortSSL = rmiProxyPortSSL;
           this.state = state;
           this.useSSL = useSSL;
    }


    /**
     * Gets the active value for this ExecServer.
     * 
     * @return active
     */
    public boolean isActive() {
        return active;
    }


    /**
     * Sets the active value for this ExecServer.
     * 
     * @param active
     */
    public void setActive(boolean active) {
        this.active = active;
    }


    /**
     * Gets the appModuleID value for this ExecServer.
     * 
     * @return appModuleID
     */
    public int getAppModuleID() {
        return appModuleID;
    }


    /**
     * Sets the appModuleID value for this ExecServer.
     * 
     * @param appModuleID
     */
    public void setAppModuleID(int appModuleID) {
        this.appModuleID = appModuleID;
    }


    /**
     * Gets the description value for this ExecServer.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this ExecServer.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the execServerHostName value for this ExecServer.
     * 
     * @return execServerHostName
     */
    public java.lang.String getExecServerHostName() {
        return execServerHostName;
    }


    /**
     * Sets the execServerHostName value for this ExecServer.
     * 
     * @param execServerHostName
     */
    public void setExecServerHostName(java.lang.String execServerHostName) {
        this.execServerHostName = execServerHostName;
    }


    /**
     * Gets the id value for this ExecServer.
     * 
     * @return id
     */
    public int getId() {
        return id;
    }


    /**
     * Sets the id value for this ExecServer.
     * 
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }


    /**
     * Gets the locationId value for this ExecServer.
     * 
     * @return locationId
     */
    public int getLocationId() {
        return locationId;
    }


    /**
     * Sets the locationId value for this ExecServer.
     * 
     * @param locationId
     */
    public void setLocationId(int locationId) {
        this.locationId = locationId;
    }


    /**
     * Gets the maxBandwidth value for this ExecServer.
     * 
     * @return maxBandwidth
     */
    public int getMaxBandwidth() {
        return maxBandwidth;
    }


    /**
     * Sets the maxBandwidth value for this ExecServer.
     * 
     * @param maxBandwidth
     */
    public void setMaxBandwidth(int maxBandwidth) {
        this.maxBandwidth = maxBandwidth;
    }


    /**
     * Gets the maxConcurrentExecutions value for this ExecServer.
     * 
     * @return maxConcurrentExecutions
     */
    public java.lang.Integer getMaxConcurrentExecutions() {
        return maxConcurrentExecutions;
    }


    /**
     * Sets the maxConcurrentExecutions value for this ExecServer.
     * 
     * @param maxConcurrentExecutions
     */
    public void setMaxConcurrentExecutions(java.lang.Integer maxConcurrentExecutions) {
        this.maxConcurrentExecutions = maxConcurrentExecutions;
    }


    /**
     * Gets the name value for this ExecServer.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this ExecServer.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the problemAlertTimeout value for this ExecServer.
     * 
     * @return problemAlertTimeout
     */
    public int getProblemAlertTimeout() {
        return problemAlertTimeout;
    }


    /**
     * Sets the problemAlertTimeout value for this ExecServer.
     * 
     * @param problemAlertTimeout
     */
    public void setProblemAlertTimeout(int problemAlertTimeout) {
        this.problemAlertTimeout = problemAlertTimeout;
    }


    /**
     * Gets the rmiProxyPort value for this ExecServer.
     * 
     * @return rmiProxyPort
     */
    public int getRmiProxyPort() {
        return rmiProxyPort;
    }


    /**
     * Sets the rmiProxyPort value for this ExecServer.
     * 
     * @param rmiProxyPort
     */
    public void setRmiProxyPort(int rmiProxyPort) {
        this.rmiProxyPort = rmiProxyPort;
    }


    /**
     * Gets the rmiProxyPortSSL value for this ExecServer.
     * 
     * @return rmiProxyPortSSL
     */
    public int getRmiProxyPortSSL() {
        return rmiProxyPortSSL;
    }


    /**
     * Sets the rmiProxyPortSSL value for this ExecServer.
     * 
     * @param rmiProxyPortSSL
     */
    public void setRmiProxyPortSSL(int rmiProxyPortSSL) {
        this.rmiProxyPortSSL = rmiProxyPortSSL;
    }


    /**
     * Gets the state value for this ExecServer.
     * 
     * @return state
     */
    public int getState() {
        return state;
    }


    /**
     * Sets the state value for this ExecServer.
     * 
     * @param state
     */
    public void setState(int state) {
        this.state = state;
    }


    /**
     * Gets the useSSL value for this ExecServer.
     * 
     * @return useSSL
     */
    public boolean isUseSSL() {
        return useSSL;
    }


    /**
     * Sets the useSSL value for this ExecServer.
     * 
     * @param useSSL
     */
    public void setUseSSL(boolean useSSL) {
        this.useSSL = useSSL;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ExecServer)) return false;
        ExecServer other = (ExecServer) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.active == other.isActive() &&
            this.appModuleID == other.getAppModuleID() &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.execServerHostName==null && other.getExecServerHostName()==null) || 
             (this.execServerHostName!=null &&
              this.execServerHostName.equals(other.getExecServerHostName()))) &&
            this.id == other.getId() &&
            this.locationId == other.getLocationId() &&
            this.maxBandwidth == other.getMaxBandwidth() &&
            ((this.maxConcurrentExecutions==null && other.getMaxConcurrentExecutions()==null) || 
             (this.maxConcurrentExecutions!=null &&
              this.maxConcurrentExecutions.equals(other.getMaxConcurrentExecutions()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            this.problemAlertTimeout == other.getProblemAlertTimeout() &&
            this.rmiProxyPort == other.getRmiProxyPort() &&
            this.rmiProxyPortSSL == other.getRmiProxyPortSSL() &&
            this.state == other.getState() &&
            this.useSSL == other.isUseSSL();
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        _hashCode += (isActive() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += getAppModuleID();
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getExecServerHostName() != null) {
            _hashCode += getExecServerHostName().hashCode();
        }
        _hashCode += getId();
        _hashCode += getLocationId();
        _hashCode += getMaxBandwidth();
        if (getMaxConcurrentExecutions() != null) {
            _hashCode += getMaxConcurrentExecutions().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        _hashCode += getProblemAlertTimeout();
        _hashCode += getRmiProxyPort();
        _hashCode += getRmiProxyPortSSL();
        _hashCode += getState();
        _hashCode += (isUseSSL() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ExecServer.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.microfocus.com/silkcentral/webservices/administration", "execServer"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("active");
        elemField.setXmlName(new javax.xml.namespace.QName("", "active"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("appModuleID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "appModuleID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("execServerHostName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "execServerHostName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "locationId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxBandwidth");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maxBandwidth"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxConcurrentExecutions");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maxConcurrentExecutions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("problemAlertTimeout");
        elemField.setXmlName(new javax.xml.namespace.QName("", "problemAlertTimeout"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rmiProxyPort");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rmiProxyPort"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rmiProxyPortSSL");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rmiProxyPortSSL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("", "state"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("useSSL");
        elemField.setXmlName(new javax.xml.namespace.QName("", "useSSL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
