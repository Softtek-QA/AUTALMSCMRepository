package br.lry.qa.alm.webservices.scm.filters;

public class FilterServiceProxy implements br.lry.qa.alm.webservices.scm.filters.FilterService {
  private String _endpoint = null;
  private br.lry.qa.alm.webservices.scm.filters.FilterService filterService = null;
  
  public FilterServiceProxy() {
    _initFilterServiceProxy();
  }
  
  public FilterServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initFilterServiceProxy();
  }
  
  private void _initFilterServiceProxy() {
    try {
      filterService = (new br.lry.qa.alm.webservices.scm.filters.FilterServiceServiceLocator()).getFilterServicePort();
      if (filterService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)filterService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)filterService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (filterService != null)
      ((javax.xml.rpc.Stub)filterService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public br.lry.qa.alm.webservices.scm.filters.FilterService getFilterService() {
    if (filterService == null)
      _initFilterServiceProxy();
    return filterService;
  }
  
  public br.lry.qa.alm.webservices.scm.filters.Filter getFilter(java.lang.String sessionId, int filterId) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.filters.WsFaultBean{
    if (filterService == null)
      _initFilterServiceProxy();
    return filterService.getFilter(sessionId, filterId);
  }
  
  public int createFilter(java.lang.String sessionId, int projectId, br.lry.qa.alm.webservices.scm.filters.Filter filter) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.filters.WsFaultBean{
    if (filterService == null)
      _initFilterServiceProxy();
    return filterService.createFilter(sessionId, projectId, filter);
  }
  
  public br.lry.qa.alm.webservices.scm.filters.Filter[] getFilters(java.lang.String sessionId, int projectId) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.filters.WsFaultBean{
    if (filterService == null)
      _initFilterServiceProxy();
    return filterService.getFilters(sessionId, projectId);
  }
  
  public java.lang.String[] getCriteria(java.lang.String sessionId, int projectId, java.lang.String category) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.filters.WsFaultBean{
    if (filterService == null)
      _initFilterServiceProxy();
    return filterService.getCriteria(sessionId, projectId, category);
  }
  
  public java.lang.String[] getPropertyValues(java.lang.String sessionId, int projectId, java.lang.String criterion, java.lang.String property) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.filters.WsFaultBean{
    if (filterService == null)
      _initFilterServiceProxy();
    return filterService.getPropertyValues(sessionId, projectId, criterion, property);
  }
  
  public java.lang.String logonUser(java.lang.String username, java.lang.String plainPwd) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.filters.WsFaultBean{
    if (filterService == null)
      _initFilterServiceProxy();
    return filterService.logonUser(username, plainPwd);
  }
  
  public java.lang.String[] getCategories(java.lang.String sessionId) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.filters.WsFaultBean{
    if (filterService == null)
      _initFilterServiceProxy();
    return filterService.getCategories(sessionId);
  }
  
  public void updateFilter(java.lang.String sessionId, br.lry.qa.alm.webservices.scm.filters.Filter filter) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.filters.WsFaultBean{
    if (filterService == null)
      _initFilterServiceProxy();
    filterService.updateFilter(sessionId, filter);
  }
  
  public java.lang.String[] getCriterionProperties(java.lang.String sessionId, int projectId, java.lang.String criterion) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.filters.WsFaultBean{
    if (filterService == null)
      _initFilterServiceProxy();
    return filterService.getCriterionProperties(sessionId, projectId, criterion);
  }
  
  public java.lang.String[] getPropertyOperators(java.lang.String sessionId, int projectId, java.lang.String criterion, java.lang.String property) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.filters.WsFaultBean{
    if (filterService == null)
      _initFilterServiceProxy();
    return filterService.getPropertyOperators(sessionId, projectId, criterion, property);
  }
  
  public void deleteFilter(java.lang.String sessionId, int filterId) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.filters.WsFaultBean{
    if (filterService == null)
      _initFilterServiceProxy();
    filterService.deleteFilter(sessionId, filterId);
  }
  
  public java.lang.String[] getCombinations(java.lang.String sessionId) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.filters.WsFaultBean{
    if (filterService == null)
      _initFilterServiceProxy();
    return filterService.getCombinations(sessionId);
  }
  
  
}