/**
 * ImComponent.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.lry.qa.alm.webservices.scm.issuemanager;

public class ImComponent  implements java.io.Serializable {
    private java.lang.String componentCode;

    private boolean isActive;

    private java.lang.String shortDesc;

    public ImComponent() {
    }

    public ImComponent(
           java.lang.String componentCode,
           boolean isActive,
           java.lang.String shortDesc) {
           this.componentCode = componentCode;
           this.isActive = isActive;
           this.shortDesc = shortDesc;
    }


    /**
     * Gets the componentCode value for this ImComponent.
     * 
     * @return componentCode
     */
    public java.lang.String getComponentCode() {
        return componentCode;
    }


    /**
     * Sets the componentCode value for this ImComponent.
     * 
     * @param componentCode
     */
    public void setComponentCode(java.lang.String componentCode) {
        this.componentCode = componentCode;
    }


    /**
     * Gets the isActive value for this ImComponent.
     * 
     * @return isActive
     */
    public boolean isIsActive() {
        return isActive;
    }


    /**
     * Sets the isActive value for this ImComponent.
     * 
     * @param isActive
     */
    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }


    /**
     * Gets the shortDesc value for this ImComponent.
     * 
     * @return shortDesc
     */
    public java.lang.String getShortDesc() {
        return shortDesc;
    }


    /**
     * Sets the shortDesc value for this ImComponent.
     * 
     * @param shortDesc
     */
    public void setShortDesc(java.lang.String shortDesc) {
        this.shortDesc = shortDesc;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ImComponent)) return false;
        ImComponent other = (ImComponent) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.componentCode==null && other.getComponentCode()==null) || 
             (this.componentCode!=null &&
              this.componentCode.equals(other.getComponentCode()))) &&
            this.isActive == other.isIsActive() &&
            ((this.shortDesc==null && other.getShortDesc()==null) || 
             (this.shortDesc!=null &&
              this.shortDesc.equals(other.getShortDesc())));
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
        if (getComponentCode() != null) {
            _hashCode += getComponentCode().hashCode();
        }
        _hashCode += (isIsActive() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getShortDesc() != null) {
            _hashCode += getShortDesc().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ImComponent.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.microfocus.com/silkcentral/webservices/issuemanager", "imComponent"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("componentCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "componentCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isActive");
        elemField.setXmlName(new javax.xml.namespace.QName("", "isActive"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shortDesc");
        elemField.setXmlName(new javax.xml.namespace.QName("", "shortDesc"));
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
