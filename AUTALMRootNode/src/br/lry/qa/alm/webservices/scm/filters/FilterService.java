/**
 * FilterService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.lry.qa.alm.webservices.scm.filters;

public interface FilterService extends java.rmi.Remote {
    public br.lry.qa.alm.webservices.scm.filters.Filter getFilter(java.lang.String sessionId, int filterId) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.filters.WsFaultBean;
    public int createFilter(java.lang.String sessionId, int projectId, br.lry.qa.alm.webservices.scm.filters.Filter filter) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.filters.WsFaultBean;
    public br.lry.qa.alm.webservices.scm.filters.Filter[] getFilters(java.lang.String sessionId, int projectId) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.filters.WsFaultBean;
    public java.lang.String[] getCriteria(java.lang.String sessionId, int projectId, java.lang.String category) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.filters.WsFaultBean;
    public java.lang.String[] getPropertyValues(java.lang.String sessionId, int projectId, java.lang.String criterion, java.lang.String property) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.filters.WsFaultBean;
    public java.lang.String logonUser(java.lang.String username, java.lang.String plainPwd) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.filters.WsFaultBean;
    public java.lang.String[] getCategories(java.lang.String sessionId) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.filters.WsFaultBean;
    public void updateFilter(java.lang.String sessionId, br.lry.qa.alm.webservices.scm.filters.Filter filter) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.filters.WsFaultBean;
    public java.lang.String[] getCriterionProperties(java.lang.String sessionId, int projectId, java.lang.String criterion) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.filters.WsFaultBean;
    public java.lang.String[] getPropertyOperators(java.lang.String sessionId, int projectId, java.lang.String criterion, java.lang.String property) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.filters.WsFaultBean;
    public void deleteFilter(java.lang.String sessionId, int filterId) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.filters.WsFaultBean;
    public java.lang.String[] getCombinations(java.lang.String sessionId) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.filters.WsFaultBean;
}
