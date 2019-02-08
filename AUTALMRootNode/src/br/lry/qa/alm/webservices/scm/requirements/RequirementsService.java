/**
 * RequirementsService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.lry.qa.alm.webservices.scm.requirements;

public interface RequirementsService extends java.rmi.Remote {
    public br.lry.qa.alm.webservices.scm.requirements.PropertyValue getProperty(java.lang.String sessionId, int requirementId, java.lang.String propertyId) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.requirements.WsFaultBean;
    public void updateProperties(java.lang.String sessionId, int requirementId, br.lry.qa.alm.webservices.scm.requirements.PropertyValue[] properties) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.requirements.WsFaultBean;
    public br.lry.qa.alm.webservices.scm.requirements.Requirement getRequirement(java.lang.String sessionId, int requirementId) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.requirements.WsFaultBean;
    public java.lang.String logonUser(java.lang.String username, java.lang.String plainPwd) throws java.rmi.RemoteException;
    public br.lry.qa.alm.webservices.scm.requirements.Project[] getProjects(java.lang.String sessionId) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.requirements.WsFaultBean;
    public br.lry.qa.alm.webservices.scm.requirements.Project getProject(java.lang.String sessionId, int projectId) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.requirements.WsFaultBean;
    public br.lry.qa.alm.webservices.scm.requirements.Test[] getAssignedTests(java.lang.String sessionId, int requirementId) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.requirements.WsFaultBean;
    public void deleteRequirement(java.lang.String sessionId, int requirementId, boolean recursiv) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.requirements.WsFaultBean;
    public br.lry.qa.alm.webservices.scm.requirements.PropertyMetaInfo getPropertyInfo(java.lang.String sessionId, int projectId, java.lang.String propertyId) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.requirements.WsFaultBean;
    public br.lry.qa.alm.webservices.scm.requirements.Requirement[] getTopLevelRequirements(java.lang.String sessionId, int projectId) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.requirements.WsFaultBean;
    public br.lry.qa.alm.webservices.scm.requirements.Requirement[] getRequirementChildren(java.lang.String sessionId, int projectId, int requirementId) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.requirements.WsFaultBean;
    public void setRequirementFlagStatus(java.lang.String sessionId, int requirementId, int flagType, java.lang.Boolean includeChildren, java.lang.String comments) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.requirements.WsFaultBean;
    public br.lry.qa.alm.webservices.scm.requirements.CustomProperty getCustomProperty(java.lang.String sessionId, int propertyId) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.requirements.WsFaultBean;
    public void insertCustomProperty(java.lang.String sessionId, br.lry.qa.alm.webservices.scm.requirements.CustomProperty newProperty) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.requirements.WsFaultBean;
    public br.lry.qa.alm.webservices.scm.requirements.CustomProperty[] getCustomProperties(java.lang.String sessionId, int projectId) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.requirements.WsFaultBean;
    public int updateRequirement(java.lang.String sessionId, int projectId, br.lry.qa.alm.webservices.scm.requirements.Requirement requirement, int prevSiblingId) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.requirements.WsFaultBean;
    public java.lang.String[] getPropertyIds(java.lang.String sessionId, int projectId) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.requirements.WsFaultBean;
    public void assignTest(java.lang.String sessionId, int requirementId, int testId) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.requirements.WsFaultBean;
    public java.lang.String updateProperty(java.lang.String sessionId, int requirementId, br.lry.qa.alm.webservices.scm.requirements.PropertyValue property) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.requirements.WsFaultBean;
    public void unassignTest(java.lang.String sessionId, int requirementId, int testId) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.requirements.WsFaultBean;
    public void deleteCustomProperty(java.lang.String sessionId, int propertyId) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.requirements.WsFaultBean;
}
