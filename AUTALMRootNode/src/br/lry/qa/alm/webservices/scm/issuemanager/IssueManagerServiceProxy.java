package br.lry.qa.alm.webservices.scm.issuemanager;

public class IssueManagerServiceProxy implements br.lry.qa.alm.webservices.scm.issuemanager.IssueManagerService {
  private String _endpoint = null;
  private br.lry.qa.alm.webservices.scm.issuemanager.IssueManagerService issueManagerService = null;
  
  public IssueManagerServiceProxy() {
    _initIssueManagerServiceProxy();
  }
  
  public IssueManagerServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initIssueManagerServiceProxy();
  }
  
  private void _initIssueManagerServiceProxy() {
    try {
      issueManagerService = (new br.lry.qa.alm.webservices.scm.issuemanager.IssueManagerServiceServiceLocator()).getIssueManagerServicePort();
      if (issueManagerService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)issueManagerService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)issueManagerService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (issueManagerService != null)
      ((javax.xml.rpc.Stub)issueManagerService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public br.lry.qa.alm.webservices.scm.issuemanager.IssueManagerService getIssueManagerService() {
    if (issueManagerService == null)
      _initIssueManagerServiceProxy();
    return issueManagerService;
  }
  
  public java.lang.String getStatus(java.lang.String sessionId, int projectId, int issueNumber) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.issuemanager.WsFaultBean{
    if (issueManagerService == null)
      _initIssueManagerServiceProxy();
    return issueManagerService.getStatus(sessionId, projectId, issueNumber);
  }
  
  public java.lang.String logonUser(java.lang.String username, java.lang.String plainPwd) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.issuemanager.WsFaultBean{
    if (issueManagerService == null)
      _initIssueManagerServiceProxy();
    return issueManagerService.logonUser(username, plainPwd);
  }
  
  public br.lry.qa.alm.webservices.scm.issuemanager.ImComponent[] getComponents(java.lang.String sessionId, int projectId, java.lang.String product) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.issuemanager.WsFaultBean{
    if (issueManagerService == null)
      _initIssueManagerServiceProxy();
    return issueManagerService.getComponents(sessionId, projectId, product);
  }
  
  public br.lry.qa.alm.webservices.scm.issuemanager.Project[] getProjects(java.lang.String sessionId) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.issuemanager.WsFaultBean{
    if (issueManagerService == null)
      _initIssueManagerServiceProxy();
    return issueManagerService.getProjects(sessionId);
  }
  
  public java.lang.String[] getComponentNamesByProductIssueType(java.lang.String sessionId, int projectId, java.lang.String product, java.lang.String issueType) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.issuemanager.WsFaultBean{
    if (issueManagerService == null)
      _initIssueManagerServiceProxy();
    return issueManagerService.getComponentNamesByProductIssueType(sessionId, projectId, product, issueType);
  }
  
  public java.lang.String[] getComponentNamesByProduct(java.lang.String sessionId, int projectId, java.lang.String product) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.issuemanager.WsFaultBean{
    if (issueManagerService == null)
      _initIssueManagerServiceProxy();
    return issueManagerService.getComponentNamesByProduct(sessionId, projectId, product);
  }
  
  public boolean editIssueDescription(java.lang.String sessionId, int projectId, int issueNumber, java.lang.String description, boolean append) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.issuemanager.WsFaultBean{
    if (issueManagerService == null)
      _initIssueManagerServiceProxy();
    return issueManagerService.editIssueDescription(sessionId, projectId, issueNumber, description, append);
  }
  
  public java.lang.String[] getProductNames(java.lang.String sessionId, int projectId) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.issuemanager.WsFaultBean{
    if (issueManagerService == null)
      _initIssueManagerServiceProxy();
    return issueManagerService.getProductNames(sessionId, projectId);
  }
  
  public br.lry.qa.alm.webservices.scm.issuemanager.Product[] getProducts(java.lang.String sessionId, int projectId) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.issuemanager.WsFaultBean{
    if (issueManagerService == null)
      _initIssueManagerServiceProxy();
    return issueManagerService.getProducts(sessionId, projectId);
  }
  
  public java.lang.String[] getPossibleStates(java.lang.String sessionId, int projectId) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.issuemanager.WsFaultBean{
    if (issueManagerService == null)
      _initIssueManagerServiceProxy();
    return issueManagerService.getPossibleStates(sessionId, projectId);
  }
  
  public br.lry.qa.alm.webservices.scm.issuemanager.StatisticEntity[] getIssueStatistics(java.lang.String sessionId, int projectId) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.issuemanager.WsFaultBean{
    if (issueManagerService == null)
      _initIssueManagerServiceProxy();
    return issueManagerService.getIssueStatistics(sessionId, projectId);
  }
  
  public java.lang.String[] getSeverities(java.lang.String sessionId, int projectId, java.lang.String product, java.lang.String issueType) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.issuemanager.WsFaultBean{
    if (issueManagerService == null)
      _initIssueManagerServiceProxy();
    return issueManagerService.getSeverities(sessionId, projectId, product, issueType);
  }
  
  public java.lang.String[] getReleases(java.lang.String sessionId, int projectId, java.lang.String product) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.issuemanager.WsFaultBean{
    if (issueManagerService == null)
      _initIssueManagerServiceProxy();
    return issueManagerService.getReleases(sessionId, projectId, product);
  }
  
  public java.lang.String[] getLOV(java.lang.String sessionId, int projectId, int listId, java.lang.String groupCode) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.issuemanager.WsFaultBean{
    if (issueManagerService == null)
      _initIssueManagerServiceProxy();
    return issueManagerService.getLOV(sessionId, projectId, listId, groupCode);
  }
  
  public java.lang.String[][] getLOVLists(java.lang.String sessionId, int projectId) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.issuemanager.WsFaultBean{
    if (issueManagerService == null)
      _initIssueManagerServiceProxy();
    return issueManagerService.getLOVLists(sessionId, projectId);
  }
  
  public java.lang.String[] getInboxes(java.lang.String sessionId, int projectId) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.issuemanager.WsFaultBean{
    if (issueManagerService == null)
      _initIssueManagerServiceProxy();
    return issueManagerService.getInboxes(sessionId, projectId);
  }
  
  public br.lry.qa.alm.webservices.scm.issuemanager.IssueStatusInformation[] getStatusArray(java.lang.String sessionId, int projectId, java.lang.Integer[] issueNumbers) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.issuemanager.WsFaultBean{
    if (issueManagerService == null)
      _initIssueManagerServiceProxy();
    return issueManagerService.getStatusArray(sessionId, projectId, issueNumbers);
  }
  
  public br.lry.qa.alm.webservices.scm.issuemanager.IssueInformation getIssueInfo(java.lang.String sessionId, int projectId, int issueNumber, int depth) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.issuemanager.WsFaultBean{
    if (issueManagerService == null)
      _initIssueManagerServiceProxy();
    return issueManagerService.getIssueInfo(sessionId, projectId, issueNumber, depth);
  }
  
  public java.lang.String[][] getGUIObjects(java.lang.String sessionId, int projectId) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.issuemanager.WsFaultBean{
    if (issueManagerService == null)
      _initIssueManagerServiceProxy();
    return issueManagerService.getGUIObjects(sessionId, projectId);
  }
  
  public java.lang.String[] getIssueTypes(java.lang.String sessionId, int projectId) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.issuemanager.WsFaultBean{
    if (issueManagerService == null)
      _initIssueManagerServiceProxy();
    return issueManagerService.getIssueTypes(sessionId, projectId);
  }
  
  public int createIssue(java.lang.String sessionId, int projectId, br.lry.qa.alm.webservices.scm.issuemanager.IssueInformation issue) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.issuemanager.WsFaultBean{
    if (issueManagerService == null)
      _initIssueManagerServiceProxy();
    return issueManagerService.createIssue(sessionId, projectId, issue);
  }
  
  public br.lry.qa.alm.webservices.scm.issuemanager.Platform[] getPlatforms(java.lang.String sessionId, int projectId) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.issuemanager.WsFaultBean{
    if (issueManagerService == null)
      _initIssueManagerServiceProxy();
    return issueManagerService.getPlatforms(sessionId, projectId);
  }
  
  public java.lang.String[] getPlatformNames(java.lang.String sessionId, int projectId) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.issuemanager.WsFaultBean{
    if (issueManagerService == null)
      _initIssueManagerServiceProxy();
    return issueManagerService.getPlatformNames(sessionId, projectId);
  }
  
  
}