/**
 * CustomProperty.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.lry.qa.alm.webservices.scm.requirements;

public class CustomProperty  implements java.io.Serializable {
    private long changedAt;

    private java.lang.String changedBy;

    private long createdAt;

    private java.lang.String createdBy;

    private br.lry.qa.alm.webservices.scm.requirements.CustomPropertyListItem[] listItems;

    private java.lang.Double maxVal;

    private java.lang.Double minVal;

    private int precision;

    private int projectID;

    private int propertyId;

    private java.lang.String propertyName;

    private int type;

    public CustomProperty() {
    }

    public CustomProperty(
           long changedAt,
           java.lang.String changedBy,
           long createdAt,
           java.lang.String createdBy,
           br.lry.qa.alm.webservices.scm.requirements.CustomPropertyListItem[] listItems,
           java.lang.Double maxVal,
           java.lang.Double minVal,
           int precision,
           int projectID,
           int propertyId,
           java.lang.String propertyName,
           int type) {
           this.changedAt = changedAt;
           this.changedBy = changedBy;
           this.createdAt = createdAt;
           this.createdBy = createdBy;
           this.listItems = listItems;
           this.maxVal = maxVal;
           this.minVal = minVal;
           this.precision = precision;
           this.projectID = projectID;
           this.propertyId = propertyId;
           this.propertyName = propertyName;
           this.type = type;
    }


    /**
     * Gets the changedAt value for this CustomProperty.
     * 
     * @return changedAt
     */
    public long getChangedAt() {
        return changedAt;
    }


    /**
     * Sets the changedAt value for this CustomProperty.
     * 
     * @param changedAt
     */
    public void setChangedAt(long changedAt) {
        this.changedAt = changedAt;
    }


    /**
     * Gets the changedBy value for this CustomProperty.
     * 
     * @return changedBy
     */
    public java.lang.String getChangedBy() {
        return changedBy;
    }


    /**
     * Sets the changedBy value for this CustomProperty.
     * 
     * @param changedBy
     */
    public void setChangedBy(java.lang.String changedBy) {
        this.changedBy = changedBy;
    }


    /**
     * Gets the createdAt value for this CustomProperty.
     * 
     * @return createdAt
     */
    public long getCreatedAt() {
        return createdAt;
    }


    /**
     * Sets the createdAt value for this CustomProperty.
     * 
     * @param createdAt
     */
    public void setCreatedAt(long createdAt) {
        this.createdAt = createdAt;
    }


    /**
     * Gets the createdBy value for this CustomProperty.
     * 
     * @return createdBy
     */
    public java.lang.String getCreatedBy() {
        return createdBy;
    }


    /**
     * Sets the createdBy value for this CustomProperty.
     * 
     * @param createdBy
     */
    public void setCreatedBy(java.lang.String createdBy) {
        this.createdBy = createdBy;
    }


    /**
     * Gets the listItems value for this CustomProperty.
     * 
     * @return listItems
     */
    public br.lry.qa.alm.webservices.scm.requirements.CustomPropertyListItem[] getListItems() {
        return listItems;
    }


    /**
     * Sets the listItems value for this CustomProperty.
     * 
     * @param listItems
     */
    public void setListItems(br.lry.qa.alm.webservices.scm.requirements.CustomPropertyListItem[] listItems) {
        this.listItems = listItems;
    }

    public br.lry.qa.alm.webservices.scm.requirements.CustomPropertyListItem getListItems(int i) {
        return this.listItems[i];
    }

    public void setListItems(int i, br.lry.qa.alm.webservices.scm.requirements.CustomPropertyListItem _value) {
        this.listItems[i] = _value;
    }


    /**
     * Gets the maxVal value for this CustomProperty.
     * 
     * @return maxVal
     */
    public java.lang.Double getMaxVal() {
        return maxVal;
    }


    /**
     * Sets the maxVal value for this CustomProperty.
     * 
     * @param maxVal
     */
    public void setMaxVal(java.lang.Double maxVal) {
        this.maxVal = maxVal;
    }


    /**
     * Gets the minVal value for this CustomProperty.
     * 
     * @return minVal
     */
    public java.lang.Double getMinVal() {
        return minVal;
    }


    /**
     * Sets the minVal value for this CustomProperty.
     * 
     * @param minVal
     */
    public void setMinVal(java.lang.Double minVal) {
        this.minVal = minVal;
    }


    /**
     * Gets the precision value for this CustomProperty.
     * 
     * @return precision
     */
    public int getPrecision() {
        return precision;
    }


    /**
     * Sets the precision value for this CustomProperty.
     * 
     * @param precision
     */
    public void setPrecision(int precision) {
        this.precision = precision;
    }


    /**
     * Gets the projectID value for this CustomProperty.
     * 
     * @return projectID
     */
    public int getProjectID() {
        return projectID;
    }


    /**
     * Sets the projectID value for this CustomProperty.
     * 
     * @param projectID
     */
    public void setProjectID(int projectID) {
        this.projectID = projectID;
    }


    /**
     * Gets the propertyId value for this CustomProperty.
     * 
     * @return propertyId
     */
    public int getPropertyId() {
        return propertyId;
    }


    /**
     * Sets the propertyId value for this CustomProperty.
     * 
     * @param propertyId
     */
    public void setPropertyId(int propertyId) {
        this.propertyId = propertyId;
    }


    /**
     * Gets the propertyName value for this CustomProperty.
     * 
     * @return propertyName
     */
    public java.lang.String getPropertyName() {
        return propertyName;
    }


    /**
     * Sets the propertyName value for this CustomProperty.
     * 
     * @param propertyName
     */
    public void setPropertyName(java.lang.String propertyName) {
        this.propertyName = propertyName;
    }


    /**
     * Gets the type value for this CustomProperty.
     * 
     * @return type
     */
    public int getType() {
        return type;
    }


    /**
     * Sets the type value for this CustomProperty.
     * 
     * @param type
     */
    public void setType(int type) {
        this.type = type;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomProperty)) return false;
        CustomProperty other = (CustomProperty) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.changedAt == other.getChangedAt() &&
            ((this.changedBy==null && other.getChangedBy()==null) || 
             (this.changedBy!=null &&
              this.changedBy.equals(other.getChangedBy()))) &&
            this.createdAt == other.getCreatedAt() &&
            ((this.createdBy==null && other.getCreatedBy()==null) || 
             (this.createdBy!=null &&
              this.createdBy.equals(other.getCreatedBy()))) &&
            ((this.listItems==null && other.getListItems()==null) || 
             (this.listItems!=null &&
              java.util.Arrays.equals(this.listItems, other.getListItems()))) &&
            ((this.maxVal==null && other.getMaxVal()==null) || 
             (this.maxVal!=null &&
              this.maxVal.equals(other.getMaxVal()))) &&
            ((this.minVal==null && other.getMinVal()==null) || 
             (this.minVal!=null &&
              this.minVal.equals(other.getMinVal()))) &&
            this.precision == other.getPrecision() &&
            this.projectID == other.getProjectID() &&
            this.propertyId == other.getPropertyId() &&
            ((this.propertyName==null && other.getPropertyName()==null) || 
             (this.propertyName!=null &&
              this.propertyName.equals(other.getPropertyName()))) &&
            this.type == other.getType();
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
        _hashCode += new Long(getChangedAt()).hashCode();
        if (getChangedBy() != null) {
            _hashCode += getChangedBy().hashCode();
        }
        _hashCode += new Long(getCreatedAt()).hashCode();
        if (getCreatedBy() != null) {
            _hashCode += getCreatedBy().hashCode();
        }
        if (getListItems() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getListItems());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getListItems(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMaxVal() != null) {
            _hashCode += getMaxVal().hashCode();
        }
        if (getMinVal() != null) {
            _hashCode += getMinVal().hashCode();
        }
        _hashCode += getPrecision();
        _hashCode += getProjectID();
        _hashCode += getPropertyId();
        if (getPropertyName() != null) {
            _hashCode += getPropertyName().hashCode();
        }
        _hashCode += getType();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CustomProperty.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.microfocus.com/silkcentral/webservices/requirements", "customProperty"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("changedAt");
        elemField.setXmlName(new javax.xml.namespace.QName("", "changedAt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("changedBy");
        elemField.setXmlName(new javax.xml.namespace.QName("", "changedBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createdAt");
        elemField.setXmlName(new javax.xml.namespace.QName("", "createdAt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createdBy");
        elemField.setXmlName(new javax.xml.namespace.QName("", "createdBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listItems");
        elemField.setXmlName(new javax.xml.namespace.QName("", "listItems"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.microfocus.com/silkcentral/webservices/requirements", "customPropertyListItem"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
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
        elemField.setFieldName("precision");
        elemField.setXmlName(new javax.xml.namespace.QName("", "precision"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("projectID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "projectID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("propertyId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "propertyId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("propertyName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "propertyName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
