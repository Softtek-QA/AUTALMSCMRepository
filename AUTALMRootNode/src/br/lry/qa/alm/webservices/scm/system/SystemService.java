/**
 * SystemService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.lry.qa.alm.webservices.scm.system;

public interface SystemService extends java.rmi.Remote {
    public boolean keepAlive(java.lang.String sessionId) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.system.WsFaultBean;
    public java.lang.String logonUser(java.lang.String username, java.lang.String plainPwd) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.system.WsFaultBean;
    public java.lang.String convertToReadableTime(long time) throws java.rmi.RemoteException;
    public long convertFromReadableTime(java.lang.String time) throws java.rmi.RemoteException;
    public java.lang.String getRepositoryInstanceID(java.lang.String sessionId) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.system.WsFaultBean;
}