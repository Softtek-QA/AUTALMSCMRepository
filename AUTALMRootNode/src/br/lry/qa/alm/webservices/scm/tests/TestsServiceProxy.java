package br.lry.qa.alm.webservices.scm.tests;

public class TestsServiceProxy implements br.lry.qa.alm.webservices.scm.tests.TestsService {
  private String _endpoint = null;
  private br.lry.qa.alm.webservices.scm.tests.TestsService testsService = null;
  
  public TestsServiceProxy() {
    _initTestsServiceProxy();
  }
  
  public TestsServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initTestsServiceProxy();
  }
  
  private void _initTestsServiceProxy() {
    try {
      testsService = (new br.lry.qa.alm.webservices.scm.tests.TestsServiceServiceLocator()).getTestsServicePort();
      if (testsService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)testsService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else {
            _endpoint = (String)((javax.xml.rpc.Stub)testsService)._getProperty("javax.xml.rpc.service.endpoint.address");
        }
      }      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (testsService != null)
      ((javax.xml.rpc.Stub)testsService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public br.lry.qa.alm.webservices.scm.tests.TestsService getTestsService() {
    if (testsService == null)
      _initTestsServiceProxy();
    return testsService;
  }
  
  public br.lry.qa.alm.webservices.scm.tests.PropertyValue getProperty(java.lang.String sessionId, int nodeId, java.lang.String propertyId) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.tests.WsFaultBean{
    if (testsService == null)
      _initTestsServiceProxy();
    return testsService.getProperty(sessionId, nodeId, propertyId);
  }
  
  public br.lry.qa.alm.webservices.scm.tests.ProjectAttribute[] getAttributes(java.lang.String sessionId, int projectId) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.tests.WsFaultBean{
    if (testsService == null)
      _initTestsServiceProxy();
    return testsService.getAttributes(sessionId, projectId);
  }
  
  public br.lry.qa.alm.webservices.scm.tests.PlanningNode getNode(java.lang.String sessionId, int nodeId) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.tests.WsFaultBean{
    if (testsService == null)
      _initTestsServiceProxy();
    return testsService.getNode(sessionId, nodeId);
  }
  
  public br.lry.qa.alm.webservices.scm.tests.ProjectAttribute[] updateAttributes(java.lang.String sessionId, int projectId, br.lry.qa.alm.webservices.scm.tests.ProjectAttribute[] attributes) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.tests.WsFaultBean{
    if (testsService == null)
      _initTestsServiceProxy();
    return testsService.updateAttributes(sessionId, projectId, attributes);
  }
  
  public void convertToManualTest(java.lang.String sessionId, int testId) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.tests.WsFaultBean{
    if (testsService == null)
      _initTestsServiceProxy();
    testsService.convertToManualTest(sessionId, testId);
  }
  
  public boolean updateProperties(java.lang.String sessionId, br.lry.qa.alm.webservices.scm.tests.PropertyValue[] properties) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.tests.WsFaultBean{
    if (testsService == null)
      _initTestsServiceProxy();
    return testsService.updateProperties(sessionId, properties);
  }
  
  public br.lry.qa.alm.webservices.scm.tests.NamedEntity[] getTestContainers(java.lang.String sessionId, int projectId) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.tests.WsFaultBean{
    if (testsService == null)
      _initTestsServiceProxy();
    return testsService.getTestContainers(sessionId, projectId);
  }
  
  public br.lry.qa.alm.webservices.scm.tests.PlanningNode[] getChildNodes(java.lang.String sessionId, int projectId, int parentNodeId, br.lry.qa.alm.webservices.scm.tests.NodeFilter filter) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.tests.WsFaultBean{
    if (testsService == null)
      _initTestsServiceProxy();
    return testsService.getChildNodes(sessionId, projectId, parentNodeId, filter);
  }
  
  public java.lang.String logonUser(java.lang.String username, java.lang.String plainPwd) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.tests.WsFaultBean{
    if (testsService == null)
      _initTestsServiceProxy();
    return testsService.logonUser(username, plainPwd);
  }
  
  public br.lry.qa.alm.webservices.scm.tests.Project[] getProjects(java.lang.String sessionId) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.tests.WsFaultBean{
    if (testsService == null)
      _initTestsServiceProxy();
    return testsService.getProjects(sessionId);
  }
  
  public br.lry.qa.alm.webservices.scm.tests.Project getProject(java.lang.String sessionId, int projectId) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.tests.WsFaultBean{
    if (testsService == null)
      _initTestsServiceProxy();
    return testsService.getProject(sessionId, projectId);
  }
  
  public boolean deleteNode(java.lang.String sessionId, int nodeId) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.tests.WsFaultBean{
    if (testsService == null)
      _initTestsServiceProxy();
    return testsService.deleteNode(sessionId, nodeId);
  }
  
  public br.lry.qa.alm.webservices.scm.tests.PropertyMetaInfo getPropertyInfo(java.lang.String sessionId, int projectId, java.lang.String nodeTypeId, java.lang.String propertyId) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.tests.WsFaultBean{
    if (testsService == null)
      _initTestsServiceProxy();
    return testsService.getPropertyInfo(sessionId, projectId, nodeTypeId, propertyId);
  }
  
  public int getIntegrationDefaultFolderId(java.lang.String sessionId, int projectId) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.tests.WsFaultBean{
    if (testsService == null)
      _initTestsServiceProxy();
    return testsService.getIntegrationDefaultFolderId(sessionId, projectId);
  }
  
  public void setIntegrationDefaultFolder(java.lang.String sessionId, int projectId, int folderId) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.tests.WsFaultBean{
    if (testsService == null)
      _initTestsServiceProxy();
    testsService.setIntegrationDefaultFolder(sessionId, projectId, folderId);
  }
  
  public br.lry.qa.alm.webservices.scm.tests.ManualTestStep[] getManualTestSteps(java.lang.String sessionId, int testId) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.tests.WsFaultBean{
    if (testsService == null)
      _initTestsServiceProxy();
    return testsService.getManualTestSteps(sessionId, testId);
  }
  
  public void deleteManualTestStep(java.lang.String sessionId, int testId, int stepPos) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.tests.WsFaultBean{
    if (testsService == null)
      _initTestsServiceProxy();
    testsService.deleteManualTestStep(sessionId, testId, stepPos);
  }
  
  public void addManualTestStep(java.lang.String sessionId, int testId, br.lry.qa.alm.webservices.scm.tests.ManualTestStep step) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.tests.WsFaultBean{
    if (testsService == null)
      _initTestsServiceProxy();
    testsService.addManualTestStep(sessionId, testId, step);
  }
  
  public void updateManualTestStep(java.lang.String sessionId, int testId, br.lry.qa.alm.webservices.scm.tests.ManualTestStep step) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.tests.WsFaultBean{
    if (testsService == null)
      _initTestsServiceProxy();
    testsService.updateManualTestStep(sessionId, testId, step);
  }
  
  public br.lry.qa.alm.webservices.scm.tests.CustomStepProperty[] getCustomStepPropertyNames(java.lang.String sessionId, int projectId) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.tests.WsFaultBean{
    if (testsService == null)
      _initTestsServiceProxy();
    return testsService.getCustomStepPropertyNames(sessionId, projectId);
  }
  
  public int addCustomStepProperty(java.lang.String sessionId, int projectId, int sequence, java.lang.String propertyname) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.tests.WsFaultBean{
    if (testsService == null)
      _initTestsServiceProxy();
    return testsService.addCustomStepProperty(sessionId, projectId, sequence, propertyname);
  }
  
  public int deleteCustomStepProperty(java.lang.String sessionId, int projectId, int propertyId) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.tests.WsFaultBean{
    if (testsService == null)
      _initTestsServiceProxy();
    return testsService.deleteCustomStepProperty(sessionId, projectId, propertyId);
  }
  
  public java.lang.String[] getPropertyIdsByNodeType(java.lang.String sessionId, int projectId, java.lang.String nodeTypeId, java.lang.String propertyTypeId) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.tests.WsFaultBean{
    if (testsService == null)
      _initTestsServiceProxy();
    return testsService.getPropertyIdsByNodeType(sessionId, projectId, nodeTypeId, propertyTypeId);
  }
  
  public java.lang.String[] getPropertyTypeIds(java.lang.String sessionId, int projectId, java.lang.String nodeTypeId) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.tests.WsFaultBean{
    if (testsService == null)
      _initTestsServiceProxy();
    return testsService.getPropertyTypeIds(sessionId, projectId, nodeTypeId);
  }
  
  public br.lry.qa.alm.webservices.scm.tests.DataSource[] getDataSourcesForProject(java.lang.String sessionId, int projectId) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.tests.WsFaultBean{
    if (testsService == null)
      _initTestsServiceProxy();
    return testsService.getDataSourcesForProject(sessionId, projectId);
  }
  
  public br.lry.qa.alm.webservices.scm.tests.DataSet[] getDataSetForDataSource(java.lang.String sessionId, int dataSourceId) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.tests.WsFaultBean{
    if (testsService == null)
      _initTestsServiceProxy();
    return testsService.getDataSetForDataSource(sessionId, dataSourceId);
  }
  
  public java.lang.Integer[] getLibraryIdsForProject(java.lang.String sessionId, int projectId) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.tests.WsFaultBean{
    if (testsService == null)
      _initTestsServiceProxy();
    return testsService.getLibraryIdsForProject(sessionId, projectId);
  }
  
  public java.lang.String[] getLibraryNamesForProject(java.lang.String sessionId, int projectId) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.tests.WsFaultBean{
    if (testsService == null)
      _initTestsServiceProxy();
    return testsService.getLibraryNamesForProject(sessionId, projectId);
  }
  
  public void deleteAttributes(java.lang.String sessionId, int projectId, br.lry.qa.alm.webservices.scm.tests.ProjectAttribute[] attributes) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.tests.WsFaultBean{
    if (testsService == null)
      _initTestsServiceProxy();
    testsService.deleteAttributes(sessionId, projectId, attributes);
  }
  
  public br.lry.qa.alm.webservices.scm.tests.ProjectAttribute[] addAttributes(java.lang.String sessionId, int projectId, br.lry.qa.alm.webservices.scm.tests.ProjectAttribute[] attributes) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.tests.WsFaultBean{
    if (testsService == null)
      _initTestsServiceProxy();
    return testsService.addAttributes(sessionId, projectId, attributes);
  }
  
  public boolean deleteProperty(java.lang.String sessionId, br.lry.qa.alm.webservices.scm.tests.PropertyValue property) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.tests.WsFaultBean{
    if (testsService == null)
      _initTestsServiceProxy();
    return testsService.deleteProperty(sessionId, property);
  }
  
  public void deleteAttributeOptions(java.lang.String sessionId, int projectId, java.lang.String attributeName, br.lry.qa.alm.webservices.scm.tests.AttributeOption[] options) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.tests.WsFaultBean{
    if (testsService == null)
      _initTestsServiceProxy();
    testsService.deleteAttributeOptions(sessionId, projectId, attributeName, options);
  }
  
  public void addAttributeOptions(java.lang.String sessionId, int projectId, java.lang.String attributeName, br.lry.qa.alm.webservices.scm.tests.AttributeOption[] options) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.tests.WsFaultBean{
    if (testsService == null)
      _initTestsServiceProxy();
    testsService.addAttributeOptions(sessionId, projectId, attributeName, options);
  }
  
  public int createTestPackage(java.lang.String sessionId, int packageParentNodeId, java.lang.String xmlPackage) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.tests.WsFaultBean{
    if (testsService == null)
      _initTestsServiceProxy();
    return testsService.createTestPackage(sessionId, packageParentNodeId, xmlPackage);
  }
  
  public void updateTestPackage(java.lang.String sessionId, int packageNodeId, java.lang.String xmlPackage) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.tests.WsFaultBean{
    if (testsService == null)
      _initTestsServiceProxy();
    testsService.updateTestPackage(sessionId, packageNodeId, xmlPackage);
  }
  
  public void uploadTestPackageResult(java.lang.String sessionId, int packageNodeId, java.lang.String xmlPackage) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.tests.WsFaultBean{
    if (testsService == null)
      _initTestsServiceProxy();
    testsService.uploadTestPackageResult(sessionId, packageNodeId, xmlPackage);
  }
  
  public java.lang.String[] getPropertyIds(java.lang.String sessionId) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.tests.WsFaultBean{
    if (testsService == null)
      _initTestsServiceProxy();
    return testsService.getPropertyIds(sessionId);
  }
  
  public boolean updateNode(java.lang.String sessionId, br.lry.qa.alm.webservices.scm.tests.PlanningNode node) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.tests.WsFaultBean{
    if (testsService == null)
      _initTestsServiceProxy();
    return testsService.updateNode(sessionId, node);
  }
  
  public boolean updateProperty(java.lang.String sessionId, br.lry.qa.alm.webservices.scm.tests.PropertyValue property) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.tests.WsFaultBean{
    if (testsService == null)
      _initTestsServiceProxy();
    return testsService.updateProperty(sessionId, property);
  }
  
  public java.lang.Integer[] getNodeIds(java.lang.String sessionId, br.lry.qa.alm.webservices.scm.tests.PropertyValue property) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.tests.WsFaultBean{
    if (testsService == null)
      _initTestsServiceProxy();
    return testsService.getNodeIds(sessionId, property);
  }
  
  public void automateTest(java.lang.String sessionId, int testId, java.lang.String testType) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.tests.WsFaultBean{
    if (testsService == null)
      _initTestsServiceProxy();
    testsService.automateTest(sessionId, testId, testType);
  }
  
  public int addNode(java.lang.String sessionId, int projectId, int parentNodeId, br.lry.qa.alm.webservices.scm.tests.PlanningNode node) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.tests.WsFaultBean{
    if (testsService == null)
      _initTestsServiceProxy();
    return testsService.addNode(sessionId, projectId, parentNodeId, node);
  }
  
  public int addManualTest(java.lang.String sessionId, int testContainerId, java.lang.String name, java.lang.String description, br.lry.qa.alm.webservices.scm.tests.ManualTestStep[] steps, br.lry.qa.alm.webservices.scm.tests.NodeParameter[] params) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.tests.WsFaultBean{
    if (testsService == null)
      _initTestsServiceProxy();
    return testsService.addManualTest(sessionId, testContainerId, name, description, steps, params);
  }
  
  public java.lang.String[] getNodeTypeIds(java.lang.String sessionId) throws java.rmi.RemoteException{
    if (testsService == null)
      _initTestsServiceProxy();
    return testsService.getNodeTypeIds(sessionId);
  }
  
  
}