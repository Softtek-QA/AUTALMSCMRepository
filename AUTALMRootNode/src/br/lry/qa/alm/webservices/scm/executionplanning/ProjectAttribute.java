/**
 * ProjectAttribute.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.lry.qa.alm.webservices.scm.executionplanning;

public class ProjectAttribute  implements java.io.Serializable {
    private boolean active;

    private java.lang.String description;

    private int id;

    private java.lang.Double maxVal;

    private java.lang.Double minVal;

    private java.lang.String name;

    private br.lry.qa.alm.webservices.scm.executionplanning.AttributeOption[] options;

    private int precision;

    private java.lang.String type;

    public ProjectAttribute() {
    }

    public ProjectAttribute(
           boolean active,
           java.lang.String description,
           int id,
           java.lang.Double maxVal,
           java.lang.Double minVal,
           java.lang.String name,
           br.lry.qa.alm.webservices.scm.executionplanning.AttributeOption[] options,
           int precision,
           java.lang.String type) {
           this.active = active;
           this.description = description;
           this.id = id;
           this.maxVal = maxVal;
           this.minVal = minVal;
           this.name = name;
           this.options = options;
           this.precision = precision;
           this.type = type;
    }


    /**
     * Gets the active value for this ProjectAttribute.
     * 
     * @return active
     */
    public boolean isActive() {
        return active;
    }


    /**
     * Sets the active value for this ProjectAttribute.
     * 
     * @param active
     */
    public void setActive(boolean active) {
        this.active = active;
    }


    /**
     * Gets the description value for this ProjectAttribute.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this ProjectAttribute.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the id value for this ProjectAttribute.
     * 
     * @return id
     */
    public int getId() {
        return id;
    }


    /**
     * Sets the id value for this ProjectAttribute.
     * 
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }


    /**
     * Gets the maxVal value for this ProjectAttribute.
     * 
     * @return maxVal
     */
    public java.lang.Double getMaxVal() {
        return maxVal;
    }


    /**
     * Sets the maxVal value for this ProjectAttribute.
     * 
     * @param maxVal
     */
    public void setMaxVal(java.lang.Double maxVal) {
        this.maxVal = maxVal;
    }


    /**
     * Gets the minVal value for this ProjectAttribute.
     * 
     * @return minVal
     */
    public java.lang.Double getMinVal() {
        return minVal;
    }


    /**
     * Sets the minVal value for this ProjectAttribute.
     * 
     * @param minVal
     */
    public void setMinVal(java.lang.Double minVal) {
        this.minVal = minVal;
    }


    /**
     * Gets the name value for this ProjectAttribute.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this ProjectAttribute.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the options value for this ProjectAttribute.
     * 
     * @return options
     */
    public br.lry.qa.alm.webservices.scm.executionplanning.AttributeOption[] getOptions() {
        return options;
    }


    /**
     * Sets the options value for this ProjectAttribute.
     * 
     * @param options
     */
    public void setOptions(br.lry.qa.alm.webservices.scm.executionplanning.AttributeOption[] options) {
        this.options = options;
    }

    public br.lry.qa.alm.webservices.scm.executionplanning.AttributeOption getOptions(int i) {
        return this.options[i];
    }

    public void setOptions(int i, br.lry.qa.alm.webservices.scm.executionplanning.AttributeOption _value) {
        this.options[i] = _value;
    }


    /**
     * Gets the precision value for this ProjectAttribute.
     * 
     * @return precision
     */
    public int getPrecision() {
        return precision;
    }


    /**
     * Sets the precision value for this ProjectAttribute.
     * 
     * @param precision
     */
    public void setPrecision(int precision) {
        this.precision = precision;
    }


    /**
     * Gets the type value for this ProjectAttribute.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this ProjectAttribute.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProjectAttribute)) return false;
        ProjectAttribute other = (ProjectAttribute) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.active == other.isActive() &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            this.id == other.getId() &&
            ((this.maxVal==null && other.getMaxVal()==null) || 
             (this.maxVal!=null &&
              this.maxVal.equals(other.getMaxVal()))) &&
            ((this.minVal==null && other.getMinVal()==null) || 
             (this.minVal!=null &&
              this.minVal.equals(other.getMinVal()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.options==null && other.getOptions()==null) || 
             (this.options!=null &&
              java.util.Arrays.equals(this.options, other.getOptions()))) &&
            this.precision == other.getPrecision() &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType())));
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
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        _hashCode += getId();
        if (getMaxVal() != null) {
            _hashCode += getMaxVal().hashCode();
        }
        if (getMinVal() != null) {
            _hashCode += getMinVal().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getOptions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOptions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOptions(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += getPrecision();
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProjectAttribute.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.microfocus.com/silkcentral/webservices/executionplanning", "projectAttribute"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("active");
        elemField.setXmlName(new javax.xml.namespace.QName("", "active"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxVal");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maxVal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minVal");
        elemField.setXmlName(new javax.xml.namespace.QName("", "minVal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
        elemField.setFieldName("options");
        elemField.setXmlName(new javax.xml.namespace.QName("", "options"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.microfocus.com/silkcentral/webservices/executionplanning", "attributeOption"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("precision");
        elemField.setXmlName(new javax.xml.namespace.QName("", "precision"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "type"));
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
