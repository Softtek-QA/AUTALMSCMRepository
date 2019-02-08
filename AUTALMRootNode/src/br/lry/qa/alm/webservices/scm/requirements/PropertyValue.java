/**
 * PropertyValue.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.lry.qa.alm.webservices.scm.requirements;

public class PropertyValue  implements java.io.Serializable {
    private int modifyCounter;

    private java.lang.String propertyId;

    private int requirementId;

    private int type;

    private java.lang.String value;

    public PropertyValue() {
    }

    public PropertyValue(
           int modifyCounter,
           java.lang.String propertyId,
           int requirementId,
           int type,
           java.lang.String value) {
           this.modifyCounter = modifyCounter;
           this.propertyId = propertyId;
           this.requirementId = requirementId;
           this.type = type;
           this.value = value;
    }


    /**
     * Gets the modifyCounter value for this PropertyValue.
     * 
     * @return modifyCounter
     */
    public int getModifyCounter() {
        return modifyCounter;
    }


    /**
     * Sets the modifyCounter value for this PropertyValue.
     * 
     * @param modifyCounter
     */
    public void setModifyCounter(int modifyCounter) {
        this.modifyCounter = modifyCounter;
    }


    /**
     * Gets the propertyId value for this PropertyValue.
     * 
     * @return propertyId
     */
    public java.lang.String getPropertyId() {
        return propertyId;
    }


    /**
     * Sets the propertyId value for this PropertyValue.
     * 
     * @param propertyId
     */
    public void setPropertyId(java.lang.String propertyId) {
        this.propertyId = propertyId;
    }


    /**
     * Gets the requirementId value for this PropertyValue.
     * 
     * @return requirementId
     */
    public int getRequirementId() {
        return requirementId;
    }


    /**
     * Sets the requirementId value for this PropertyValue.
     * 
     * @param requirementId
     */
    public void setRequirementId(int requirementId) {
        this.requirementId = requirementId;
    }


    /**
     * Gets the type value for this PropertyValue.
     * 
     * @return type
     */
    public int getType() {
        return type;
    }


    /**
     * Sets the type value for this PropertyValue.
     * 
     * @param type
     */
    public void setType(int type) {
        this.type = type;
    }


    /**
     * Gets the value value for this PropertyValue.
     * 
     * @return value
     */
    public java.lang.String getValue() {
        return value;
    }


    /**
     * Sets the value value for this PropertyValue.
     * 
     * @param value
     */
    public void setValue(java.lang.String value) {
        this.value = value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PropertyValue)) return false;
        PropertyValue other = (PropertyValue) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.modifyCounter == other.getModifyCounter() &&
            ((this.propertyId==null && other.getPropertyId()==null) || 
             (this.propertyId!=null &&
              this.propertyId.equals(other.getPropertyId()))) &&
            this.requirementId == other.getRequirementId() &&
            this.type == other.getType() &&
            ((this.value==null && other.getValue()==null) || 
             (this.value!=null &&
              this.value.equals(other.getValue())));
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
        _hashCode += getModifyCounter();
        if (getPropertyId() != null) {
            _hashCode += getPropertyId().hashCode();
        }
        _hashCode += getRequirementId();
        _hashCode += getType();
        if (getValue() != null) {
            _hashCode += getValue().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PropertyValue.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.microfocus.com/silkcentral/webservices/requirements", "propertyValue"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modifyCounter");
        elemField.setXmlName(new javax.xml.namespace.QName("", "modifyCounter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("propertyId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "propertyId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requirementId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "requirementId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("value");
        elemField.setXmlName(new javax.xml.namespace.QName("", "value"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
