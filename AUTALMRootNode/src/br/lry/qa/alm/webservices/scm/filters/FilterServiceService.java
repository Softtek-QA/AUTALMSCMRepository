/**
 * FilterServiceService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.lry.qa.alm.webservices.scm.filters;

public interface FilterServiceService extends javax.xml.rpc.Service {
    public java.lang.String getFilterServicePortAddress();

    public br.lry.qa.alm.webservices.scm.filters.FilterService getFilterServicePort() throws javax.xml.rpc.ServiceException;

    public br.lry.qa.alm.webservices.scm.filters.FilterService getFilterServicePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}