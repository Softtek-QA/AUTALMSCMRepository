/**
 * PlanningNode.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.lry.qa.alm.webservices.scm.tests;

public class PlanningNode  implements java.io.Serializable {
    private java.lang.String description;

    private int id;

    private int kind;

    private java.lang.String name;

    private br.lry.qa.alm.webservices.scm.tests.PropertyValue[] propertyValues;

    public PlanningNode() {
    }

    public PlanningNode(
           java.lang.String description,
           int id,
           int kind,
           java.lang.String name,
           br.lry.qa.alm.webservices.scm.tests.PropertyValue[] propertyValues) {
           this.description = description;
           this.id = id;
           this.kind = kind;
           this.name = name;
           this.propertyValues = propertyValues;
    }


    /**
     * Gets the description value for this PlanningNode.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this PlanningNode.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the id value for this PlanningNode.
     * 
     * @return id
     */
    public int getId() {
        return id;
    }


    /**
     * Sets the id value for this PlanningNode.
     * 
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }


    /**
     * Gets the kind value for this PlanningNode.
     * 
     * @return kind
     */
    public int getKind() {
        return kind;
    }


    /**
     * Sets the kind value for this PlanningNode.
     * 
     * @param kind
     */
    public void setKind(int kind) {
        this.kind = kind;
    }


    /**
     * Gets the name value for this PlanningNode.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this PlanningNode.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the propertyValues value for this PlanningNode.
     * 
     * @return propertyValues
     */
    public br.lry.qa.alm.webservices.scm.tests.PropertyValue[] getPropertyValues() {
        return propertyValues;
    }


    /**
     * Sets the propertyValues value for this PlanningNode.
     * 
     * @param propertyValues
     */
    public void setPropertyValues(br.lry.qa.alm.webservices.scm.tests.PropertyValue[] propertyValues) {
        this.propertyValues = propertyValues;
    }

    public br.lry.qa.alm.webservices.scm.tests.PropertyValue getPropertyValues(int i) {
        return this.propertyValues[i];
    }

    public void setPropertyValues(int i, br.lry.qa.alm.webservices.scm.tests.PropertyValue _value) {
        this.propertyValues[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PlanningNode)) return false;
        PlanningNode other = (PlanningNode) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            this.id == other.getId() &&
            this.kind == other.getKind() &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.propertyValues==null && other.getPropertyValues()==null) || 
             (this.propertyValues!=null &&
              java.util.Arrays.equals(this.propertyValues, other.getPropertyValues())));
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
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        _hashCode += getId();
        _hashCode += getKind();
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getPropertyValues() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPropertyValues());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPropertyValues(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PlanningNode.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.microfocus.com/silkcentral/webservices/tests", "planningNode"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("", "description"));
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
        elemField.setFieldName("kind");
        elemField.setXmlName(new javax.xml.namespace.QName("", "kind"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
        elemField.setFieldName("propertyValues");
        elemField.setXmlName(new javax.xml.namespace.QName("", "propertyValues"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.microfocus.com/silkcentral/webservices/tests", "propertyValue"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
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