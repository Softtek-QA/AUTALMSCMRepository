package br.lry.qa.alm.webservices.scm.executionplanning;

public class ExecutionPlanningServiceProxy implements br.lry.qa.alm.webservices.scm.executionplanning.ExecutionPlanningService {
  private String _endpoint = null;
  private br.lry.qa.alm.webservices.scm.executionplanning.ExecutionPlanningService executionPlanningService = null;
  
  public ExecutionPlanningServiceProxy() {
    _initExecutionPlanningServiceProxy();
  }
  
  public ExecutionPlanningServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initExecutionPlanningServiceProxy();
  }
  
  private void _initExecutionPlanningServiceProxy() {
    try {
      executionPlanningService = (new br.lry.qa.alm.webservices.scm.executionplanning.ExecutionPlanningServiceServiceLocator()).getExecutionPlanningServicePort();
      if (executionPlanningService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)executionPlanningService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)executionPlanningService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (executionPlanningService != null)
      ((javax.xml.rpc.Stub)executionPlanningService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public br.lry.qa.alm.webservices.scm.executionplanning.ExecutionPlanningService getExecutionPlanningService() {
    if (executionPlanningService == null)
      _initExecutionPlanningServiceProxy();
    return executionPlanningService;
  }
  
  public br.lry.qa.alm.webservices.scm.executionplanning.NodeParameter[] getParameters(java.lang.String sessionId, int execNodeId) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.executionplanning.WsFaultBean{
    if (executionPlanningService == null)
      _initExecutionPlanningServiceProxy();
    return executionPlanningService.getParameters(sessionId, execNodeId);
  }
  
  public br.lry.qa.alm.webservices.scm.executionplanning.ProjectAttribute[] getAttributes(java.lang.String sessionId, int projectId) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.executionplanning.WsFaultBean{
    if (executionPlanningService == null)
      _initExecutionPlanningServiceProxy();
    return executionPlanningService.getAttributes(sessionId, projectId);
  }
  
  public br.lry.qa.alm.webservices.scm.executionplanning.ExecutionNode getNode(java.lang.String sessionId, int nodeId) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.executionplanning.WsFaultBean{
    if (executionPlanningService == null)
      _initExecutionPlanningServiceProxy();
    return executionPlanningService.getNode(sessionId, nodeId);
  }
  
  public br.lry.qa.alm.webservices.scm.executionplanning.ProjectAttribute[] updateAttributes(java.lang.String sessionId, int projectId, br.lry.qa.alm.webservices.scm.executionplanning.ProjectAttribute[] attributes) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.executionplanning.WsFaultBean{
    if (executionPlanningService == null)
      _initExecutionPlanningServiceProxy();
    return executionPlanningService.updateAttributes(sessionId, projectId, attributes);
  }
  
  public br.lry.qa.alm.webservices.scm.executionplanning.ExecutionNode[] getNodes(java.lang.String sessionId, int projectId, java.lang.String name) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.executionplanning.WsFaultBean{
    if (executionPlanningService == null)
      _initExecutionPlanningServiceProxy();
    return executionPlanningService.getNodes(sessionId, projectId, name);
  }
  
  public void setParameter(java.lang.String sessionId, int execNodeId, java.lang.String parameterName, java.lang.String parameterValue) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.executionplanning.WsFaultBean{
    if (executionPlanningService == null)
      _initExecutionPlanningServiceProxy();
    executionPlanningService.setParameter(sessionId, execNodeId, parameterName, parameterValue);
  }
  
  public java.lang.String[] getKeywords(java.lang.String sessionId, int execNodeId) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.executionplanning.WsFaultBean{
    if (executionPlanningService == null)
      _initExecutionPlanningServiceProxy();
    return executionPlanningService.getKeywords(sessionId, execNodeId);
  }
  
  public void setKeywords(java.lang.String sessionId, int execNodeId, java.lang.String[] keywords) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.executionplanning.WsFaultBean{
    if (executionPlanningService == null)
      _initExecutionPlanningServiceProxy();
    executionPlanningService.setKeywords(sessionId, execNodeId, keywords);
  }
  
  public br.lry.qa.alm.webservices.scm.executionplanning.ExecutionNode[] getChildNodes(java.lang.String sessionId, int parentNodeId) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.executionplanning.WsFaultBean{
    if (executionPlanningService == null)
      _initExecutionPlanningServiceProxy();
    return executionPlanningService.getChildNodes(sessionId, parentNodeId);
  }
  
  public java.lang.String logonUser(java.lang.String username, java.lang.String plainPwd) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.executionplanning.WsFaultBean{
    if (executionPlanningService == null)
      _initExecutionPlanningServiceProxy();
    return executionPlanningService.logonUser(username, plainPwd);
  }
  
  public br.lry.qa.alm.webservices.scm.executionplanning.ManualTester[] getManualTesters(java.lang.String sessionId, int projectId) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.executionplanning.WsFaultBean{
    if (executionPlanningService == null)
      _initExecutionPlanningServiceProxy();
    return executionPlanningService.getManualTesters(sessionId, projectId);
  }
  
  public void deleteNode(java.lang.String sessionId, int nodeId) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.executionplanning.WsFaultBean{
    if (executionPlanningService == null)
      _initExecutionPlanningServiceProxy();
    executionPlanningService.deleteNode(sessionId, nodeId);
  }
  
  public br.lry.qa.alm.webservices.scm.executionplanning.PropertyMetaInfo getPropertyInfo(java.lang.String sessionId, int kind, java.lang.String id) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.executionplanning.WsFaultBean{
    if (executionPlanningService == null)
      _initExecutionPlanningServiceProxy();
    return executionPlanningService.getPropertyInfo(sessionId, kind, id);
  }
  
  public br.lry.qa.alm.webservices.scm.executionplanning.ExecutionHandle[] startExecutionWithOptionsInternal(java.lang.String arg0, int arg1, java.lang.String arg2, int arg3, java.lang.String arg4, br.lry.qa.alm.webservices.scm.executionplanning.StartExecutionWithOptionsInternalArg5Entry[] arg5, java.lang.String arg6) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.executionplanning.WsFaultBean{
    if (executionPlanningService == null)
      _initExecutionPlanningServiceProxy();
    return executionPlanningService.startExecutionWithOptionsInternal(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
  }
  
  public br.lry.qa.alm.webservices.scm.executionplanning.ExecutionNode getExecutionRootNode(java.lang.String sessionId, int projectId) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.executionplanning.WsFaultBean{
    if (executionPlanningService == null)
      _initExecutionPlanningServiceProxy();
    return executionPlanningService.getExecutionRootNode(sessionId, projectId);
  }
  
  public int getStateOfExecution(java.lang.String sessionId, br.lry.qa.alm.webservices.scm.executionplanning.ExecutionHandle handle) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.executionplanning.WsFaultBean{
    if (executionPlanningService == null)
      _initExecutionPlanningServiceProxy();
    return executionPlanningService.getStateOfExecution(sessionId, handle);
  }
  
  public br.lry.qa.alm.webservices.scm.executionplanning.ExecutionHandle[] startExecutionWithOptions(java.lang.String sessionId, int nodeId, java.lang.String build, int option, java.lang.String sinceBuild) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.executionplanning.WsFaultBean{
    if (executionPlanningService == null)
      _initExecutionPlanningServiceProxy();
    return executionPlanningService.startExecutionWithOptions(sessionId, nodeId, build, option, sinceBuild);
  }
  
  public void setAssignedManualTesters(java.lang.String sessionId, int execDefId, java.lang.Integer[] manualTesterIds) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.executionplanning.WsFaultBean{
    if (executionPlanningService == null)
      _initExecutionPlanningServiceProxy();
    executionPlanningService.setAssignedManualTesters(sessionId, execDefId, manualTesterIds);
  }
  
  public java.lang.String getExecutionResultURL(java.lang.String sessionId, int executionDefId, long executionTimestamp, java.lang.String execServerHostName, int execServerPort) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.executionplanning.WsFaultBean{
    if (executionPlanningService == null)
      _initExecutionPlanningServiceProxy();
    return executionPlanningService.getExecutionResultURL(sessionId, executionDefId, executionTimestamp, execServerHostName, execServerPort);
  }
  
  public void deleteAttributes(java.lang.String sessionId, int projectId, br.lry.qa.alm.webservices.scm.executionplanning.ProjectAttribute[] attributes) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.executionplanning.WsFaultBean{
    if (executionPlanningService == null)
      _initExecutionPlanningServiceProxy();
    executionPlanningService.deleteAttributes(sessionId, projectId, attributes);
  }
  
  public br.lry.qa.alm.webservices.scm.executionplanning.ProjectAttribute[] addAttributes(java.lang.String sessionId, int projectId, br.lry.qa.alm.webservices.scm.executionplanning.ProjectAttribute[] attributes) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.executionplanning.WsFaultBean{
    if (executionPlanningService == null)
      _initExecutionPlanningServiceProxy();
    return executionPlanningService.addAttributes(sessionId, projectId, attributes);
  }
  
  public void setSetupTestDefinition(java.lang.String sessionId, int execNodeId, int testDefId) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.executionplanning.WsFaultBean{
    if (executionPlanningService == null)
      _initExecutionPlanningServiceProxy();
    executionPlanningService.setSetupTestDefinition(sessionId, execNodeId, testDefId);
  }
  
  public void setCleanupTestDefinition(java.lang.String sessionId, int execNodeId, int testDefId) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.executionplanning.WsFaultBean{
    if (executionPlanningService == null)
      _initExecutionPlanningServiceProxy();
    executionPlanningService.setCleanupTestDefinition(sessionId, execNodeId, testDefId);
  }
  
  public br.lry.qa.alm.webservices.scm.executionplanning.ManualTester[] getAssignedManualTesters(java.lang.String sessionId, int execDefId) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.executionplanning.WsFaultBean{
    if (executionPlanningService == null)
      _initExecutionPlanningServiceProxy();
    return executionPlanningService.getAssignedManualTesters(sessionId, execDefId);
  }
  
  public int getSetupTestDefinition(java.lang.String sessionId, int execNodeId) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.executionplanning.WsFaultBean{
    if (executionPlanningService == null)
      _initExecutionPlanningServiceProxy();
    return executionPlanningService.getSetupTestDefinition(sessionId, execNodeId);
  }
  
  public int getCleanupTestDefinition(java.lang.String sessionId, int execNodeId) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.executionplanning.WsFaultBean{
    if (executionPlanningService == null)
      _initExecutionPlanningServiceProxy();
    return executionPlanningService.getCleanupTestDefinition(sessionId, execNodeId);
  }
  
  public void deleteAttributeOptions(java.lang.String sessionId, int projectId, java.lang.String attributeName, br.lry.qa.alm.webservices.scm.executionplanning.AttributeOption[] options) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.executionplanning.WsFaultBean{
    if (executionPlanningService == null)
      _initExecutionPlanningServiceProxy();
    executionPlanningService.deleteAttributeOptions(sessionId, projectId, attributeName, options);
  }
  
  public void addAttributeOptions(java.lang.String sessionId, int projectId, java.lang.String attributeName, br.lry.qa.alm.webservices.scm.executionplanning.AttributeOption[] options) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.executionplanning.WsFaultBean{
    if (executionPlanningService == null)
      _initExecutionPlanningServiceProxy();
    executionPlanningService.addAttributeOptions(sessionId, projectId, attributeName, options);
  }
  
  public br.lry.qa.alm.webservices.scm.executionplanning.ExecutionResult getExecutionResult(java.lang.String sessionId, br.lry.qa.alm.webservices.scm.executionplanning.ExecutionHandle handle) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.executionplanning.WsFaultBean{
    if (executionPlanningService == null)
      _initExecutionPlanningServiceProxy();
    return executionPlanningService.getExecutionResult(sessionId, handle);
  }
  
  public java.lang.String[] getPropertyIds(java.lang.String sessionId, int kind) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.executionplanning.WsFaultBean{
    if (executionPlanningService == null)
      _initExecutionPlanningServiceProxy();
    return executionPlanningService.getPropertyIds(sessionId, kind);
  }
  
  public br.lry.qa.alm.webservices.scm.executionplanning.ExecutionHandle[] startExecution(java.lang.String sessionId, int nodeId) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.executionplanning.WsFaultBean{
    if (executionPlanningService == null)
      _initExecutionPlanningServiceProxy();
    return executionPlanningService.startExecution(sessionId, nodeId);
  }
  
  public void updateNode(java.lang.String sessionId, br.lry.qa.alm.webservices.scm.executionplanning.ExecutionNode node) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.executionplanning.WsFaultBean{
    if (executionPlanningService == null)
      _initExecutionPlanningServiceProxy();
    executionPlanningService.updateNode(sessionId, node);
  }
  
  public int addNode(java.lang.String sessionId, int projectId, br.lry.qa.alm.webservices.scm.executionplanning.ExecutionNode node, int parentId) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.executionplanning.WsFaultBean{
    if (executionPlanningService == null)
      _initExecutionPlanningServiceProxy();
    return executionPlanningService.addNode(sessionId, projectId, node, parentId);
  }
  
  
}