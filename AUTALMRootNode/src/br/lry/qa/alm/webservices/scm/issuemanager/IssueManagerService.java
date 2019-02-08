/**
 * IssueManagerService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.lry.qa.alm.webservices.scm.issuemanager;

public interface IssueManagerService extends java.rmi.Remote {
    public java.lang.String getStatus(java.lang.String sessionId, int projectId, int issueNumber) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.issuemanager.WsFaultBean;
    public java.lang.String logonUser(java.lang.String username, java.lang.String plainPwd) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.issuemanager.WsFaultBean;
    public br.lry.qa.alm.webservices.scm.issuemanager.ImComponent[] getComponents(java.lang.String sessionId, int projectId, java.lang.String product) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.issuemanager.WsFaultBean;
    public br.lry.qa.alm.webservices.scm.issuemanager.Project[] getProjects(java.lang.String sessionId) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.issuemanager.WsFaultBean;
    public java.lang.String[] getComponentNamesByProductIssueType(java.lang.String sessionId, int projectId, java.lang.String product, java.lang.String issueType) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.issuemanager.WsFaultBean;
    public java.lang.String[] getComponentNamesByProduct(java.lang.String sessionId, int projectId, java.lang.String product) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.issuemanager.WsFaultBean;
    public boolean editIssueDescription(java.lang.String sessionId, int projectId, int issueNumber, java.lang.String description, boolean append) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.issuemanager.WsFaultBean;
    public java.lang.String[] getProductNames(java.lang.String sessionId, int projectId) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.issuemanager.WsFaultBean;
    public br.lry.qa.alm.webservices.scm.issuemanager.Product[] getProducts(java.lang.String sessionId, int projectId) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.issuemanager.WsFaultBean;
    public java.lang.String[] getPossibleStates(java.lang.String sessionId, int projectId) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.issuemanager.WsFaultBean;
    public br.lry.qa.alm.webservices.scm.issuemanager.StatisticEntity[] getIssueStatistics(java.lang.String sessionId, int projectId) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.issuemanager.WsFaultBean;
    public java.lang.String[] getSeverities(java.lang.String sessionId, int projectId, java.lang.String product, java.lang.String issueType) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.issuemanager.WsFaultBean;
    public java.lang.String[] getReleases(java.lang.String sessionId, int projectId, java.lang.String product) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.issuemanager.WsFaultBean;
    public java.lang.String[] getLOV(java.lang.String sessionId, int projectId, int listId, java.lang.String groupCode) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.issuemanager.WsFaultBean;
    public java.lang.String[][] getLOVLists(java.lang.String sessionId, int projectId) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.issuemanager.WsFaultBean;
    public java.lang.String[] getInboxes(java.lang.String sessionId, int projectId) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.issuemanager.WsFaultBean;
    public br.lry.qa.alm.webservices.scm.issuemanager.IssueStatusInformation[] getStatusArray(java.lang.String sessionId, int projectId, java.lang.Integer[] issueNumbers) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.issuemanager.WsFaultBean;
    public br.lry.qa.alm.webservices.scm.issuemanager.IssueInformation getIssueInfo(java.lang.String sessionId, int projectId, int issueNumber, int depth) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.issuemanager.WsFaultBean;
    public java.lang.String[][] getGUIObjects(java.lang.String sessionId, int projectId) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.issuemanager.WsFaultBean;
    public java.lang.String[] getIssueTypes(java.lang.String sessionId, int projectId) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.issuemanager.WsFaultBean;
    public int createIssue(java.lang.String sessionId, int projectId, br.lry.qa.alm.webservices.scm.issuemanager.IssueInformation issue) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.issuemanager.WsFaultBean;
    public br.lry.qa.alm.webservices.scm.issuemanager.Platform[] getPlatforms(java.lang.String sessionId, int projectId) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.issuemanager.WsFaultBean;
    public java.lang.String[] getPlatformNames(java.lang.String sessionId, int projectId) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.issuemanager.WsFaultBean;
}
