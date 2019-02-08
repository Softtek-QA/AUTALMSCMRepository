/**
 * TestsService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.lry.qa.alm.webservices.scm.tests;

public interface TestsService extends java.rmi.Remote {
    public br.lry.qa.alm.webservices.scm.tests.PropertyValue getProperty(java.lang.String sessionId, int nodeId, java.lang.String propertyId) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.tests.WsFaultBean;
    public br.lry.qa.alm.webservices.scm.tests.ProjectAttribute[] getAttributes(java.lang.String sessionId, int projectId) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.tests.WsFaultBean;
    public br.lry.qa.alm.webservices.scm.tests.PlanningNode getNode(java.lang.String sessionId, int nodeId) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.tests.WsFaultBean;
    public br.lry.qa.alm.webservices.scm.tests.ProjectAttribute[] updateAttributes(java.lang.String sessionId, int projectId, br.lry.qa.alm.webservices.scm.tests.ProjectAttribute[] attributes) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.tests.WsFaultBean;
    public void convertToManualTest(java.lang.String sessionId, int testId) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.tests.WsFaultBean;
    public boolean updateProperties(java.lang.String sessionId, br.lry.qa.alm.webservices.scm.tests.PropertyValue[] properties) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.tests.WsFaultBean;
    public br.lry.qa.alm.webservices.scm.tests.NamedEntity[] getTestContainers(java.lang.String sessionId, int projectId) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.tests.WsFaultBean;
    public br.lry.qa.alm.webservices.scm.tests.PlanningNode[] getChildNodes(java.lang.String sessionId, int projectId, int parentNodeId, br.lry.qa.alm.webservices.scm.tests.NodeFilter filter) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.tests.WsFaultBean;
    public java.lang.String logonUser(java.lang.String username, java.lang.String plainPwd) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.tests.WsFaultBean;
    public br.lry.qa.alm.webservices.scm.tests.Project[] getProjects(java.lang.String sessionId) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.tests.WsFaultBean;
    public br.lry.qa.alm.webservices.scm.tests.Project getProject(java.lang.String sessionId, int projectId) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.tests.WsFaultBean;
    public boolean deleteNode(java.lang.String sessionId, int nodeId) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.tests.WsFaultBean;
    public br.lry.qa.alm.webservices.scm.tests.PropertyMetaInfo getPropertyInfo(java.lang.String sessionId, int projectId, java.lang.String nodeTypeId, java.lang.String propertyId) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.tests.WsFaultBean;
    public int getIntegrationDefaultFolderId(java.lang.String sessionId, int projectId) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.tests.WsFaultBean;
    public void setIntegrationDefaultFolder(java.lang.String sessionId, int projectId, int folderId) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.tests.WsFaultBean;
    public br.lry.qa.alm.webservices.scm.tests.ManualTestStep[] getManualTestSteps(java.lang.String sessionId, int testId) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.tests.WsFaultBean;
    public void deleteManualTestStep(java.lang.String sessionId, int testId, int stepPos) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.tests.WsFaultBean;
    public void addManualTestStep(java.lang.String sessionId, int testId, br.lry.qa.alm.webservices.scm.tests.ManualTestStep step) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.tests.WsFaultBean;
    public void updateManualTestStep(java.lang.String sessionId, int testId, br.lry.qa.alm.webservices.scm.tests.ManualTestStep step) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.tests.WsFaultBean;
    public br.lry.qa.alm.webservices.scm.tests.CustomStepProperty[] getCustomStepPropertyNames(java.lang.String sessionId, int projectId) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.tests.WsFaultBean;
    public int addCustomStepProperty(java.lang.String sessionId, int projectId, int sequence, java.lang.String propertyname) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.tests.WsFaultBean;
    public int deleteCustomStepProperty(java.lang.String sessionId, int projectId, int propertyId) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.tests.WsFaultBean;
    public java.lang.String[] getPropertyIdsByNodeType(java.lang.String sessionId, int projectId, java.lang.String nodeTypeId, java.lang.String propertyTypeId) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.tests.WsFaultBean;
    public java.lang.String[] getPropertyTypeIds(java.lang.String sessionId, int projectId, java.lang.String nodeTypeId) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.tests.WsFaultBean;
    public br.lry.qa.alm.webservices.scm.tests.DataSource[] getDataSourcesForProject(java.lang.String sessionId, int projectId) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.tests.WsFaultBean;
    public br.lry.qa.alm.webservices.scm.tests.DataSet[] getDataSetForDataSource(java.lang.String sessionId, int dataSourceId) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.tests.WsFaultBean;
    public java.lang.Integer[] getLibraryIdsForProject(java.lang.String sessionId, int projectId) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.tests.WsFaultBean;
    public java.lang.String[] getLibraryNamesForProject(java.lang.String sessionId, int projectId) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.tests.WsFaultBean;
    public void deleteAttributes(java.lang.String sessionId, int projectId, br.lry.qa.alm.webservices.scm.tests.ProjectAttribute[] attributes) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.tests.WsFaultBean;
    public br.lry.qa.alm.webservices.scm.tests.ProjectAttribute[] addAttributes(java.lang.String sessionId, int projectId, br.lry.qa.alm.webservices.scm.tests.ProjectAttribute[] attributes) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.tests.WsFaultBean;
    public boolean deleteProperty(java.lang.String sessionId, br.lry.qa.alm.webservices.scm.tests.PropertyValue property) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.tests.WsFaultBean;
    public void deleteAttributeOptions(java.lang.String sessionId, int projectId, java.lang.String attributeName, br.lry.qa.alm.webservices.scm.tests.AttributeOption[] options) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.tests.WsFaultBean;
    public void addAttributeOptions(java.lang.String sessionId, int projectId, java.lang.String attributeName, br.lry.qa.alm.webservices.scm.tests.AttributeOption[] options) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.tests.WsFaultBean;
    public int createTestPackage(java.lang.String sessionId, int packageParentNodeId, java.lang.String xmlPackage) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.tests.WsFaultBean;
    public void updateTestPackage(java.lang.String sessionId, int packageNodeId, java.lang.String xmlPackage) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.tests.WsFaultBean;
    public void uploadTestPackageResult(java.lang.String sessionId, int packageNodeId, java.lang.String xmlPackage) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.tests.WsFaultBean;
    public java.lang.String[] getPropertyIds(java.lang.String sessionId) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.tests.WsFaultBean;
    public boolean updateNode(java.lang.String sessionId, br.lry.qa.alm.webservices.scm.tests.PlanningNode node) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.tests.WsFaultBean;
    public boolean updateProperty(java.lang.String sessionId, br.lry.qa.alm.webservices.scm.tests.PropertyValue property) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.tests.WsFaultBean;
    public java.lang.Integer[] getNodeIds(java.lang.String sessionId, br.lry.qa.alm.webservices.scm.tests.PropertyValue property) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.tests.WsFaultBean;
    public void automateTest(java.lang.String sessionId, int testId, java.lang.String testType) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.tests.WsFaultBean;
    public int addNode(java.lang.String sessionId, int projectId, int parentNodeId, br.lry.qa.alm.webservices.scm.tests.PlanningNode node) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.tests.WsFaultBean;
    public int addManualTest(java.lang.String sessionId, int testContainerId, java.lang.String name, java.lang.String description, br.lry.qa.alm.webservices.scm.tests.ManualTestStep[] steps, br.lry.qa.alm.webservices.scm.tests.NodeParameter[] params) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.tests.WsFaultBean;
    public java.lang.String[] getNodeTypeIds(java.lang.String sessionId) throws java.rmi.RemoteException;
}