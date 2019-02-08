/**
 * UserDetails.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.lry.qa.alm.webservices.scm.administration;

public class UserDetails  extends br.lry.qa.alm.webservices.scm.administration.User  implements java.io.Serializable {
    private java.lang.Integer[] assignedProjects;

    private java.lang.String dateFormat;

    private java.lang.String EMail;

    private int firstDayOfWeek;

    private java.lang.String separatorString;

    private java.lang.String shortDateFormat;

    private java.lang.String timeZoneId;

    public UserDetails() {
    }

    public UserDetails(
           java.lang.String firstName,
           int id,
           java.lang.String lastName,
           boolean locked,
           java.lang.String login,
           java.lang.Integer[] assignedProjects,
           java.lang.String dateFormat,
           java.lang.String EMail,
           int firstDayOfWeek,
           java.lang.String separatorString,
           java.lang.String shortDateFormat,
           java.lang.String timeZoneId) {
        super(
            firstName,
            id,
            lastName,
            locked,
            login);
        this.assignedProjects = assignedProjects;
        this.dateFormat = dateFormat;
        this.EMail = EMail;
        this.firstDayOfWeek = firstDayOfWeek;
        this.separatorString = separatorString;
        this.shortDateFormat = shortDateFormat;
        this.timeZoneId = timeZoneId;
    }


    /**
     * Gets the assignedProjects value for this UserDetails.
     * 
     * @return assignedProjects
     */
    public java.lang.Integer[] getAssignedProjects() {
        return assignedProjects;
    }


    /**
     * Sets the assignedProjects value for this UserDetails.
     * 
     * @param assignedProjects
     */
    public void setAssignedProjects(java.lang.Integer[] assignedProjects) {
        this.assignedProjects = assignedProjects;
    }

    public java.lang.Integer getAssignedProjects(int i) {
        return this.assignedProjects[i];
    }

    public void setAssignedProjects(int i, java.lang.Integer _value) {
        this.assignedProjects[i] = _value;
    }


    /**
     * Gets the dateFormat value for this UserDetails.
     * 
     * @return dateFormat
     */
    public java.lang.String getDateFormat() {
        return dateFormat;
    }


    /**
     * Sets the dateFormat value for this UserDetails.
     * 
     * @param dateFormat
     */
    public void setDateFormat(java.lang.String dateFormat) {
        this.dateFormat = dateFormat;
    }


    /**
     * Gets the EMail value for this UserDetails.
     * 
     * @return EMail
     */
    public java.lang.String getEMail() {
        return EMail;
    }


    /**
     * Sets the EMail value for this UserDetails.
     * 
     * @param EMail
     */
    public void setEMail(java.lang.String EMail) {
        this.EMail = EMail;
    }


    /**
     * Gets the firstDayOfWeek value for this UserDetails.
     * 
     * @return firstDayOfWeek
     */
    public int getFirstDayOfWeek() {
        return firstDayOfWeek;
    }


    /**
     * Sets the firstDayOfWeek value for this UserDetails.
     * 
     * @param firstDayOfWeek
     */
    public void setFirstDayOfWeek(int firstDayOfWeek) {
        this.firstDayOfWeek = firstDayOfWeek;
    }


    /**
     * Gets the separatorString value for this UserDetails.
     * 
     * @return separatorString
     */
    public java.lang.String getSeparatorString() {
        return separatorString;
    }


    /**
     * Sets the separatorString value for this UserDetails.
     * 
     * @param separatorString
     */
    public void setSeparatorString(java.lang.String separatorString) {
        this.separatorString = separatorString;
    }


    /**
     * Gets the shortDateFormat value for this UserDetails.
     * 
     * @return shortDateFormat
     */
    public java.lang.String getShortDateFormat() {
        return shortDateFormat;
    }


    /**
     * Sets the shortDateFormat value for this UserDetails.
     * 
     * @param shortDateFormat
     */
    public void setShortDateFormat(java.lang.String shortDateFormat) {
        this.shortDateFormat = shortDateFormat;
    }


    /**
     * Gets the timeZoneId value for this UserDetails.
     * 
     * @return timeZoneId
     */
    public java.lang.String getTimeZoneId() {
        return timeZoneId;
    }


    /**
     * Sets the timeZoneId value for this UserDetails.
     * 
     * @param timeZoneId
     */
    public void setTimeZoneId(java.lang.String timeZoneId) {
        this.timeZoneId = timeZoneId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UserDetails)) return false;
        UserDetails other = (UserDetails) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.assignedProjects==null && other.getAssignedProjects()==null) || 
             (this.assignedProjects!=null &&
              java.util.Arrays.equals(this.assignedProjects, other.getAssignedProjects()))) &&
            ((this.dateFormat==null && other.getDateFormat()==null) || 
             (this.dateFormat!=null &&
              this.dateFormat.equals(other.getDateFormat()))) &&
            ((this.EMail==null && other.getEMail()==null) || 
             (this.EMail!=null &&
              this.EMail.equals(other.getEMail()))) &&
            this.firstDayOfWeek == other.getFirstDayOfWeek() &&
            ((this.separatorString==null && other.getSeparatorString()==null) || 
             (this.separatorString!=null &&
              this.separatorString.equals(other.getSeparatorString()))) &&
            ((this.shortDateFormat==null && other.getShortDateFormat()==null) || 
             (this.shortDateFormat!=null &&
              this.shortDateFormat.equals(other.getShortDateFormat()))) &&
            ((this.timeZoneId==null && other.getTimeZoneId()==null) || 
             (this.timeZoneId!=null &&
              this.timeZoneId.equals(other.getTimeZoneId())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getAssignedProjects() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAssignedProjects());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAssignedProjects(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDateFormat() != null) {
            _hashCode += getDateFormat().hashCode();
        }
        if (getEMail() != null) {
            _hashCode += getEMail().hashCode();
        }
        _hashCode += getFirstDayOfWeek();
        if (getSeparatorString() != null) {
            _hashCode += getSeparatorString().hashCode();
        }
        if (getShortDateFormat() != null) {
            _hashCode += getShortDateFormat().hashCode();
        }
        if (getTimeZoneId() != null) {
            _hashCode += getTimeZoneId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UserDetails.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.microfocus.com/silkcentral/webservices/administration", "userDetails"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assignedProjects");
        elemField.setXmlName(new javax.xml.namespace.QName("", "assignedProjects"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateFormat");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dateFormat"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("EMail");
        elemField.setXmlName(new javax.xml.namespace.QName("", "EMail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firstDayOfWeek");
        elemField.setXmlName(new javax.xml.namespace.QName("", "firstDayOfWeek"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("separatorString");
        elemField.setXmlName(new javax.xml.namespace.QName("", "separatorString"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shortDateFormat");
        elemField.setXmlName(new javax.xml.namespace.QName("", "shortDateFormat"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeZoneId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "timeZoneId"));
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