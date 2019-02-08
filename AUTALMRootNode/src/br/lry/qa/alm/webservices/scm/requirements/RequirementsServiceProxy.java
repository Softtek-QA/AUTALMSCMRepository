package br.lry.qa.alm.webservices.scm.requirements;

public class RequirementsServiceProxy implements br.lry.qa.alm.webservices.scm.requirements.RequirementsService {
  private String _endpoint = null;
  private br.lry.qa.alm.webservices.scm.requirements.RequirementsService requirementsService = null;
  
  public RequirementsServiceProxy() {
    _initRequirementsServiceProxy();
  }
  
  public RequirementsServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initRequirementsServiceProxy();
  }
  
  private void _initRequirementsServiceProxy() {
    try {
      requirementsService = (new br.lry.qa.alm.webservices.scm.requirements.RequirementsServiceServiceLocator()).getRequirementsServicePort();
      if (requirementsService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)requirementsService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)requirementsService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (requirementsService != null)
      ((javax.xml.rpc.Stub)requirementsService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public br.lry.qa.alm.webservices.scm.requirements.RequirementsService getRequirementsService() {
    if (requirementsService == null)
      _initRequirementsServiceProxy();
    return requirementsService;
  }
  
  public br.lry.qa.alm.webservices.scm.requirements.PropertyValue getProperty(java.lang.String sessionId, int requirementId, java.lang.String propertyId) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.requirements.WsFaultBean{
    if (requirementsService == null)
      _initRequirementsServiceProxy();
    return requirementsService.getProperty(sessionId, requirementId, propertyId);
  }
  
  public void updateProperties(java.lang.String sessionId, int requirementId, br.lry.qa.alm.webservices.scm.requirements.PropertyValue[] properties) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.requirements.WsFaultBean{
    if (requirementsService == null)
      _initRequirementsServiceProxy();
    requirementsService.updateProperties(sessionId, requirementId, properties);
  }
  
  public br.lry.qa.alm.webservices.scm.requirements.Requirement getRequirement(java.lang.String sessionId, int requirementId) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.requirements.WsFaultBean{
    if (requirementsService == null)
      _initRequirementsServiceProxy();
    return requirementsService.getRequirement(sessionId, requirementId);
  }
  
  public java.lang.String logonUser(java.lang.String username, java.lang.String plainPwd) throws java.rmi.RemoteException{
    if (requirementsService == null)
      _initRequirementsServiceProxy();
    return requirementsService.logonUser(username, plainPwd);
  }
  
  public br.lry.qa.alm.webservices.scm.requirements.Project[] getProjects(java.lang.String sessionId) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.requirements.WsFaultBean{
    if (requirementsService == null)
      _initRequirementsServiceProxy();
    return requirementsService.getProjects(sessionId);
  }
  
  public br.lry.qa.alm.webservices.scm.requirements.Project getProject(java.lang.String sessionId, int projectId) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.requirements.WsFaultBean{
    if (requirementsService == null)
      _initRequirementsServiceProxy();
    return requirementsService.getProject(sessionId, projectId);
  }
  
  public br.lry.qa.alm.webservices.scm.requirements.Test[] getAssignedTests(java.lang.String sessionId, int requirementId) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.requirements.WsFaultBean{
    if (requirementsService == null)
      _initRequirementsServiceProxy();
    return requirementsService.getAssignedTests(sessionId, requirementId);
  }
  
  public void deleteRequirement(java.lang.String sessionId, int requirementId, boolean recursiv) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.requirements.WsFaultBean{
    if (requirementsService == null)
      _initRequirementsServiceProxy();
    requirementsService.deleteRequirement(sessionId, requirementId, recursiv);
  }
  
  public br.lry.qa.alm.webservices.scm.requirements.PropertyMetaInfo getPropertyInfo(java.lang.String sessionId, int projectId, java.lang.String propertyId) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.requirements.WsFaultBean{
    if (requirementsService == null)
      _initRequirementsServiceProxy();
    return requirementsService.getPropertyInfo(sessionId, projectId, propertyId);
  }
  
  public br.lry.qa.alm.webservices.scm.requirements.Requirement[] getTopLevelRequirements(java.lang.String sessionId, int projectId) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.requirements.WsFaultBean{
    if (requirementsService == null)
      _initRequirementsServiceProxy();
    return requirementsService.getTopLevelRequirements(sessionId, projectId);
  }
  
  public br.lry.qa.alm.webservices.scm.requirements.Requirement[] getRequirementChildren(java.lang.String sessionId, int projectId, int requirementId) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.requirements.WsFaultBean{
    if (requirementsService == null)
      _initRequirementsServiceProxy();
    return requirementsService.getRequirementChildren(sessionId, projectId, requirementId);
  }
  
  public void setRequirementFlagStatus(java.lang.String sessionId, int requirementId, int flagType, java.lang.Boolean includeChildren, java.lang.String comments) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.requirements.WsFaultBean{
    if (requirementsService == null)
      _initRequirementsServiceProxy();
    requirementsService.setRequirementFlagStatus(sessionId, requirementId, flagType, includeChildren, comments);
  }
  
  public br.lry.qa.alm.webservices.scm.requirements.CustomProperty getCustomProperty(java.lang.String sessionId, int propertyId) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.requirements.WsFaultBean{
    if (requirementsService == null)
      _initRequirementsServiceProxy();
    return requirementsService.getCustomProperty(sessionId, propertyId);
  }
  
  public void insertCustomProperty(java.lang.String sessionId, br.lry.qa.alm.webservices.scm.requirements.CustomProperty newProperty) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.requirements.WsFaultBean{
    if (requirementsService == null)
      _initRequirementsServiceProxy();
    requirementsService.insertCustomProperty(sessionId, newProperty);
  }
  
  public br.lry.qa.alm.webservices.scm.requirements.CustomProperty[] getCustomProperties(java.lang.String sessionId, int projectId) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.requirements.WsFaultBean{
    if (requirementsService == null)
      _initRequirementsServiceProxy();
    return requirementsService.getCustomProperties(sessionId, projectId);
  }
  
  public int updateRequirement(java.lang.String sessionId, int projectId, br.lry.qa.alm.webservices.scm.requirements.Requirement requirement, int prevSiblingId) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.requirements.WsFaultBean{
    if (requirementsService == null)
      _initRequirementsServiceProxy();
    return requirementsService.updateRequirement(sessionId, projectId, requirement, prevSiblingId);
  }
  
  public java.lang.String[] getPropertyIds(java.lang.String sessionId, int projectId) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.requirements.WsFaultBean{
    if (requirementsService == null)
      _initRequirementsServiceProxy();
    return requirementsService.getPropertyIds(sessionId, projectId);
  }
  
  public void assignTest(java.lang.String sessionId, int requirementId, int testId) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.requirements.WsFaultBean{
    if (requirementsService == null)
      _initRequirementsServiceProxy();
    requirementsService.assignTest(sessionId, requirementId, testId);
  }
  
  public java.lang.String updateProperty(java.lang.String sessionId, int requirementId, br.lry.qa.alm.webservices.scm.requirements.PropertyValue property) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.requirements.WsFaultBean{
    if (requirementsService == null)
      _initRequirementsServiceProxy();
    return requirementsService.updateProperty(sessionId, requirementId, property);
  }
  
  public void unassignTest(java.lang.String sessionId, int requirementId, int testId) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.requirements.WsFaultBean{
    if (requirementsService == null)
      _initRequirementsServiceProxy();
    requirementsService.unassignTest(sessionId, requirementId, testId);
  }
  
  public void deleteCustomProperty(java.lang.String sessionId, int propertyId) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.requirements.WsFaultBean{
    if (requirementsService == null)
      _initRequirementsServiceProxy();
    requirementsService.deleteCustomProperty(sessionId, propertyId);
  }
  
  
}