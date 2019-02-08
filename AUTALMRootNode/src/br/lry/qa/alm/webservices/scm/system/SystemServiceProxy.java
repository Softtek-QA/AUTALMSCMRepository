package br.lry.qa.alm.webservices.scm.system;

public class SystemServiceProxy implements br.lry.qa.alm.webservices.scm.system.SystemService {
  private String _endpoint = null;
  private br.lry.qa.alm.webservices.scm.system.SystemService systemService = null;
  
  public SystemServiceProxy() {
    _initSystemServiceProxy();
  }
  
  public SystemServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initSystemServiceProxy();
  }
  
  private void _initSystemServiceProxy() {
    try {
      systemService = (new br.lry.qa.alm.webservices.scm.system.SystemServiceServiceLocator()).getSystemServicePort();
      if (systemService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)systemService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)systemService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (systemService != null)
      ((javax.xml.rpc.Stub)systemService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public br.lry.qa.alm.webservices.scm.system.SystemService getSystemService() {
    if (systemService == null)
      _initSystemServiceProxy();
    return systemService;
  }
  
  public boolean keepAlive(java.lang.String sessionId) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.system.WsFaultBean{
    if (systemService == null)
      _initSystemServiceProxy();
    return systemService.keepAlive(sessionId);
  }
  
  public java.lang.String logonUser(java.lang.String username, java.lang.String plainPwd) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.system.WsFaultBean{
    if (systemService == null)
      _initSystemServiceProxy();
    return systemService.logonUser(username, plainPwd);
  }
  
  public java.lang.String convertToReadableTime(long time) throws java.rmi.RemoteException{
    if (systemService == null)
      _initSystemServiceProxy();
    return systemService.convertToReadableTime(time);
  }
  
  public long convertFromReadableTime(java.lang.String time) throws java.rmi.RemoteException{
    if (systemService == null)
      _initSystemServiceProxy();
    return systemService.convertFromReadableTime(time);
  }
  
  public java.lang.String getRepositoryInstanceID(java.lang.String sessionId) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.system.WsFaultBean{
    if (systemService == null)
      _initSystemServiceProxy();
    return systemService.getRepositoryInstanceID(sessionId);
  }
  
  
}