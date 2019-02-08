/**
 * ExecutionPlanningService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.lry.qa.alm.webservices.scm.executionplanning;

public interface ExecutionPlanningService extends java.rmi.Remote {
    public br.lry.qa.alm.webservices.scm.executionplanning.NodeParameter[] getParameters(java.lang.String sessionId, int execNodeId) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.executionplanning.WsFaultBean;
    public br.lry.qa.alm.webservices.scm.executionplanning.ProjectAttribute[] getAttributes(java.lang.String sessionId, int projectId) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.executionplanning.WsFaultBean;
    public br.lry.qa.alm.webservices.scm.executionplanning.ExecutionNode getNode(java.lang.String sessionId, int nodeId) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.executionplanning.WsFaultBean;
    public br.lry.qa.alm.webservices.scm.executionplanning.ProjectAttribute[] updateAttributes(java.lang.String sessionId, int projectId, br.lry.qa.alm.webservices.scm.executionplanning.ProjectAttribute[] attributes) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.executionplanning.WsFaultBean;
    public br.lry.qa.alm.webservices.scm.executionplanning.ExecutionNode[] getNodes(java.lang.String sessionId, int projectId, java.lang.String name) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.executionplanning.WsFaultBean;
    public void setParameter(java.lang.String sessionId, int execNodeId, java.lang.String parameterName, java.lang.String parameterValue) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.executionplanning.WsFaultBean;
    public java.lang.String[] getKeywords(java.lang.String sessionId, int execNodeId) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.executionplanning.WsFaultBean;
    public void setKeywords(java.lang.String sessionId, int execNodeId, java.lang.String[] keywords) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.executionplanning.WsFaultBean;
    public br.lry.qa.alm.webservices.scm.executionplanning.ExecutionNode[] getChildNodes(java.lang.String sessionId, int parentNodeId) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.executionplanning.WsFaultBean;
    public java.lang.String logonUser(java.lang.String username, java.lang.String plainPwd) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.executionplanning.WsFaultBean;
    public br.lry.qa.alm.webservices.scm.executionplanning.ManualTester[] getManualTesters(java.lang.String sessionId, int projectId) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.executionplanning.WsFaultBean;
    public void deleteNode(java.lang.String sessionId, int nodeId) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.executionplanning.WsFaultBean;
    public br.lry.qa.alm.webservices.scm.executionplanning.PropertyMetaInfo getPropertyInfo(java.lang.String sessionId, int kind, java.lang.String id) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.executionplanning.WsFaultBean;
    public br.lry.qa.alm.webservices.scm.executionplanning.ExecutionHandle[] startExecutionWithOptionsInternal(java.lang.String arg0, int arg1, java.lang.String arg2, int arg3, java.lang.String arg4, br.lry.qa.alm.webservices.scm.executionplanning.StartExecutionWithOptionsInternalArg5Entry[] arg5, java.lang.String arg6) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.executionplanning.WsFaultBean;
    public br.lry.qa.alm.webservices.scm.executionplanning.ExecutionNode getExecutionRootNode(java.lang.String sessionId, int projectId) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.executionplanning.WsFaultBean;
    public int getStateOfExecution(java.lang.String sessionId, br.lry.qa.alm.webservices.scm.executionplanning.ExecutionHandle handle) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.executionplanning.WsFaultBean;
    public br.lry.qa.alm.webservices.scm.executionplanning.ExecutionHandle[] startExecutionWithOptions(java.lang.String sessionId, int nodeId, java.lang.String build, int option, java.lang.String sinceBuild) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.executionplanning.WsFaultBean;
    public void setAssignedManualTesters(java.lang.String sessionId, int execDefId, java.lang.Integer[] manualTesterIds) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.executionplanning.WsFaultBean;
    public java.lang.String getExecutionResultURL(java.lang.String sessionId, int executionDefId, long executionTimestamp, java.lang.String execServerHostName, int execServerPort) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.executionplanning.WsFaultBean;
    public void deleteAttributes(java.lang.String sessionId, int projectId, br.lry.qa.alm.webservices.scm.executionplanning.ProjectAttribute[] attributes) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.executionplanning.WsFaultBean;
    public br.lry.qa.alm.webservices.scm.executionplanning.ProjectAttribute[] addAttributes(java.lang.String sessionId, int projectId, br.lry.qa.alm.webservices.scm.executionplanning.ProjectAttribute[] attributes) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.executionplanning.WsFaultBean;
    public void setSetupTestDefinition(java.lang.String sessionId, int execNodeId, int testDefId) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.executionplanning.WsFaultBean;
    public void setCleanupTestDefinition(java.lang.String sessionId, int execNodeId, int testDefId) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.executionplanning.WsFaultBean;
    public br.lry.qa.alm.webservices.scm.executionplanning.ManualTester[] getAssignedManualTesters(java.lang.String sessionId, int execDefId) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.executionplanning.WsFaultBean;
    public int getSetupTestDefinition(java.lang.String sessionId, int execNodeId) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.executionplanning.WsFaultBean;
    public int getCleanupTestDefinition(java.lang.String sessionId, int execNodeId) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.executionplanning.WsFaultBean;
    public void deleteAttributeOptions(java.lang.String sessionId, int projectId, java.lang.String attributeName, br.lry.qa.alm.webservices.scm.executionplanning.AttributeOption[] options) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.executionplanning.WsFaultBean;
    public void addAttributeOptions(java.lang.String sessionId, int projectId, java.lang.String attributeName, br.lry.qa.alm.webservices.scm.executionplanning.AttributeOption[] options) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.executionplanning.WsFaultBean;
    public br.lry.qa.alm.webservices.scm.executionplanning.ExecutionResult getExecutionResult(java.lang.String sessionId, br.lry.qa.alm.webservices.scm.executionplanning.ExecutionHandle handle) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.executionplanning.WsFaultBean;
    public java.lang.String[] getPropertyIds(java.lang.String sessionId, int kind) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.executionplanning.WsFaultBean;
    public br.lry.qa.alm.webservices.scm.executionplanning.ExecutionHandle[] startExecution(java.lang.String sessionId, int nodeId) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.executionplanning.WsFaultBean;
    public void updateNode(java.lang.String sessionId, br.lry.qa.alm.webservices.scm.executionplanning.ExecutionNode node) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.executionplanning.WsFaultBean;
    public int addNode(java.lang.String sessionId, int projectId, br.lry.qa.alm.webservices.scm.executionplanning.ExecutionNode node, int parentId) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.executionplanning.WsFaultBean;
}
