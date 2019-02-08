/**
 * FilterCriterion.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.lry.qa.alm.webservices.scm.filters;

public class FilterCriterion  implements java.io.Serializable {
    private java.lang.String criterionName;

    private java.lang.Integer id;

    private boolean isNestedFilter;

    private java.lang.Integer nestedFilterId;

    private java.lang.String operator;

    private java.lang.String property;

    private java.lang.String value;

    public FilterCriterion() {
    }

    public FilterCriterion(
           java.lang.String criterionName,
           java.lang.Integer id,
           boolean isNestedFilter,
           java.lang.Integer nestedFilterId,
           java.lang.String operator,
           java.lang.String property,
           java.lang.String value) {
           this.criterionName = criterionName;
           this.id = id;
           this.isNestedFilter = isNestedFilter;
           this.nestedFilterId = nestedFilterId;
           this.operator = operator;
           this.property = property;
           this.value = value;
    }


    /**
     * Gets the criterionName value for this FilterCriterion.
     * 
     * @return criterionName
     */
    public java.lang.String getCriterionName() {
        return criterionName;
    }


    /**
     * Sets the criterionName value for this FilterCriterion.
     * 
     * @param criterionName
     */
    public void setCriterionName(java.lang.String criterionName) {
        this.criterionName = criterionName;
    }


    /**
     * Gets the id value for this FilterCriterion.
     * 
     * @return id
     */
    public java.lang.Integer getId() {
        return id;
    }


    /**
     * Sets the id value for this FilterCriterion.
     * 
     * @param id
     */
    public void setId(java.lang.Integer id) {
        this.id = id;
    }


    /**
     * Gets the isNestedFilter value for this FilterCriterion.
     * 
     * @return isNestedFilter
     */
    public boolean isIsNestedFilter() {
        return isNestedFilter;
    }


    /**
     * Sets the isNestedFilter value for this FilterCriterion.
     * 
     * @param isNestedFilter
     */
    public void setIsNestedFilter(boolean isNestedFilter) {
        this.isNestedFilter = isNestedFilter;
    }


    /**
     * Gets the nestedFilterId value for this FilterCriterion.
     * 
     * @return nestedFilterId
     */
    public java.lang.Integer getNestedFilterId() {
        return nestedFilterId;
    }


    /**
     * Sets the nestedFilterId value for this FilterCriterion.
     * 
     * @param nestedFilterId
     */
    public void setNestedFilterId(java.lang.Integer nestedFilterId) {
        this.nestedFilterId = nestedFilterId;
    }


    /**
     * Gets the operator value for this FilterCriterion.
     * 
     * @return operator
     */
    public java.lang.String getOperator() {
        return operator;
    }


    /**
     * Sets the operator value for this FilterCriterion.
     * 
     * @param operator
     */
    public void setOperator(java.lang.String operator) {
        this.operator = operator;
    }


    /**
     * Gets the property value for this FilterCriterion.
     * 
     * @return property
     */
    public java.lang.String getProperty() {
        return property;
    }


    /**
     * Sets the property value for this FilterCriterion.
     * 
     * @param property
     */
    public void setProperty(java.lang.String property) {
        this.property = property;
    }


    /**
     * Gets the value value for this FilterCriterion.
     * 
     * @return value
     */
    public java.lang.String getValue() {
        return value;
    }


    /**
     * Sets the value value for this FilterCriterion.
     * 
     * @param value
     */
    public void setValue(java.lang.String value) {
        this.value = value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FilterCriterion)) return false;
        FilterCriterion other = (FilterCriterion) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.criterionName==null && other.getCriterionName()==null) || 
             (this.criterionName!=null &&
              this.criterionName.equals(other.getCriterionName()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            this.isNestedFilter == other.isIsNestedFilter() &&
            ((this.nestedFilterId==null && other.getNestedFilterId()==null) || 
             (this.nestedFilterId!=null &&
              this.nestedFilterId.equals(other.getNestedFilterId()))) &&
            ((this.operator==null && other.getOperator()==null) || 
             (this.operator!=null &&
              this.operator.equals(other.getOperator()))) &&
            ((this.property==null && other.getProperty()==null) || 
             (this.property!=null &&
              this.property.equals(other.getProperty()))) &&
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
        if (getCriterionName() != null) {
            _hashCode += getCriterionName().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        _hashCode += (isIsNestedFilter() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getNestedFilterId() != null) {
            _hashCode += getNestedFilterId().hashCode();
        }
        if (getOperator() != null) {
            _hashCode += getOperator().hashCode();
        }
        if (getProperty() != null) {
            _hashCode += getProperty().hashCode();
        }
        if (getValue() != null) {
            _hashCode += getValue().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FilterCriterion.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.microfocus.com/silkcentral/webservices/filter", "filterCriterion"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("criterionName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "criterionName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isNestedFilter");
        elemField.setXmlName(new javax.xml.namespace.QName("", "isNestedFilter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nestedFilterId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nestedFilterId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operator");
        elemField.setXmlName(new javax.xml.namespace.QName("", "operator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("property");
        elemField.setXmlName(new javax.xml.namespace.QName("", "property"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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