package br.lry.qa.alm.webservices.scm.administration;

public class AdministrationServiceProxy implements br.lry.qa.alm.webservices.scm.administration.AdministrationService {
  private String _endpoint = null;
  private br.lry.qa.alm.webservices.scm.administration.AdministrationService administrationService = null;
  
  public AdministrationServiceProxy() {
    _initAdministrationServiceProxy();
  }
  
  public AdministrationServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initAdministrationServiceProxy();
  }
  
  private void _initAdministrationServiceProxy() {
    try {
      administrationService = (new br.lry.qa.alm.webservices.scm.administration.AdministrationServiceServiceLocator()).getAdministrationServicePort();
      if (administrationService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)administrationService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)administrationService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (administrationService != null)
      ((javax.xml.rpc.Stub)administrationService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public br.lry.qa.alm.webservices.scm.administration.AdministrationService getAdministrationService() {
    if (administrationService == null)
      _initAdministrationServiceProxy();
    return administrationService;
  }
  
  public br.lry.qa.alm.webservices.scm.administration.Location[] getLocations(java.lang.String sessionId) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.administration.WsFaultBean{
    if (administrationService == null)
      _initAdministrationServiceProxy();
    return administrationService.getLocations(sessionId);
  }
  
  public br.lry.qa.alm.webservices.scm.administration.Role[] getAllRoles(java.lang.String sessionId) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.administration.WsFaultBean{
    if (administrationService == null)
      _initAdministrationServiceProxy();
    return administrationService.getAllRoles(sessionId);
  }
  
  public java.lang.String[] getVersions(java.lang.String sessionId, java.lang.String product) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.administration.WsFaultBean{
    if (administrationService == null)
      _initAdministrationServiceProxy();
    return administrationService.getVersions(sessionId, product);
  }
  
  public java.lang.String[] getBuilds(java.lang.String sessionId, java.lang.String product, java.lang.String version) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.administration.WsFaultBean{
    if (administrationService == null)
      _initAdministrationServiceProxy();
    return administrationService.getBuilds(sessionId, product, version);
  }
  
  public java.lang.String[] getActiveVersions(java.lang.String sessionId, java.lang.String product) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.administration.WsFaultBean{
    if (administrationService == null)
      _initAdministrationServiceProxy();
    return administrationService.getActiveVersions(sessionId, product);
  }
  
  public void deactivateExecServer(java.lang.String sessionId, int execServerId) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.administration.WsFaultBean{
    if (administrationService == null)
      _initAdministrationServiceProxy();
    administrationService.deactivateExecServer(sessionId, execServerId);
  }
  
  public java.lang.String logonUser(java.lang.String username, java.lang.String plainPwd) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.administration.WsFaultBean{
    if (administrationService == null)
      _initAdministrationServiceProxy();
    return administrationService.logonUser(username, plainPwd);
  }
  
  public java.lang.String[] getComponents(java.lang.String sessionId, java.lang.String product) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.administration.WsFaultBean{
    if (administrationService == null)
      _initAdministrationServiceProxy();
    return administrationService.getComponents(sessionId, product);
  }
  
  public br.lry.qa.alm.webservices.scm.administration.Project[] getProjects(java.lang.String sessionId) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.administration.WsFaultBean{
    if (administrationService == null)
      _initAdministrationServiceProxy();
    return administrationService.getProjects(sessionId);
  }
  
  public int createUser(java.lang.String sessionId, br.lry.qa.alm.webservices.scm.administration.UserDetails userDetails) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.administration.WsFaultBean{
    if (administrationService == null)
      _initAdministrationServiceProxy();
    return administrationService.createUser(sessionId, userDetails);
  }
  
  public void updateProject(java.lang.String sessionId, br.lry.qa.alm.webservices.scm.administration.Project project) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.administration.WsFaultBean{
    if (administrationService == null)
      _initAdministrationServiceProxy();
    administrationService.updateProject(sessionId, project);
  }
  
  public int createProject(java.lang.String sessionId, br.lry.qa.alm.webservices.scm.administration.Project project) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.administration.WsFaultBean{
    if (administrationService == null)
      _initAdministrationServiceProxy();
    return administrationService.createProject(sessionId, project);
  }
  
  public br.lry.qa.alm.webservices.scm.administration.User[] getUsers(java.lang.String sessionId, java.lang.String login) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.administration.WsFaultBean{
    if (administrationService == null)
      _initAdministrationServiceProxy();
    return administrationService.getUsers(sessionId, login);
  }
  
  public void updateUser(java.lang.String sessionId, br.lry.qa.alm.webservices.scm.administration.UserDetails userDetails) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.administration.WsFaultBean{
    if (administrationService == null)
      _initAdministrationServiceProxy();
    administrationService.updateUser(sessionId, userDetails);
  }
  
  public void setProxyUsernameAndPasswordForLocation(java.lang.String sessionId, int locationId, java.lang.String proxyUsername, java.lang.String proxyPassword) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.administration.WsFaultBean{
    if (administrationService == null)
      _initAdministrationServiceProxy();
    administrationService.setProxyUsernameAndPasswordForLocation(sessionId, locationId, proxyUsername, proxyPassword);
  }
  
  public br.lry.qa.alm.webservices.scm.administration.Project getProjectById(java.lang.String sessionId, int projectId) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.administration.WsFaultBean{
    if (administrationService == null)
      _initAdministrationServiceProxy();
    return administrationService.getProjectById(sessionId, projectId);
  }
  
  public java.lang.String[] getProducts(java.lang.String sessionId) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.administration.WsFaultBean{
    if (administrationService == null)
      _initAdministrationServiceProxy();
    return administrationService.getProducts(sessionId);
  }
  
  public java.lang.String[] getProjectNames(java.lang.String sessionId) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.administration.WsFaultBean{
    if (administrationService == null)
      _initAdministrationServiceProxy();
    return administrationService.getProjectNames(sessionId);
  }
  
  public void updateLocation(java.lang.String sessionId, br.lry.qa.alm.webservices.scm.administration.LocationDetails locationDetails) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.administration.WsFaultBean{
    if (administrationService == null)
      _initAdministrationServiceProxy();
    administrationService.updateLocation(sessionId, locationDetails);
  }
  
  public void updateExecServer(java.lang.String sessionId, br.lry.qa.alm.webservices.scm.administration.ExecServer execServer) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.administration.WsFaultBean{
    if (administrationService == null)
      _initAdministrationServiceProxy();
    administrationService.updateExecServer(sessionId, execServer);
  }
  
  public void updateUserGroup(java.lang.String sessionId, br.lry.qa.alm.webservices.scm.administration.UserGroup usergroup) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.administration.WsFaultBean{
    if (administrationService == null)
      _initAdministrationServiceProxy();
    administrationService.updateUserGroup(sessionId, usergroup);
  }
  
  public br.lry.qa.alm.webservices.scm.administration.Project[] findProjects(java.lang.String sessionId, java.lang.String projectName) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.administration.WsFaultBean{
    if (administrationService == null)
      _initAdministrationServiceProxy();
    return administrationService.findProjects(sessionId, projectName);
  }
  
  public void deleteLocations(java.lang.String sessionId, java.lang.Integer[] locationIds) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.administration.WsFaultBean{
    if (administrationService == null)
      _initAdministrationServiceProxy();
    administrationService.deleteLocations(sessionId, locationIds);
  }
  
  public void activateProjects(java.lang.String sessionId, java.lang.Integer[] projectIds) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.administration.WsFaultBean{
    if (administrationService == null)
      _initAdministrationServiceProxy();
    administrationService.activateProjects(sessionId, projectIds);
  }
  
  public void deleteProjects(java.lang.String sessionId, java.lang.Integer[] projectIds) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.administration.WsFaultBean{
    if (administrationService == null)
      _initAdministrationServiceProxy();
    administrationService.deleteProjects(sessionId, projectIds);
  }
  
  public br.lry.qa.alm.webservices.scm.administration.UserDetails getUserDetails(java.lang.String sessionId, int userId) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.administration.WsFaultBean{
    if (administrationService == null)
      _initAdministrationServiceProxy();
    return administrationService.getUserDetails(sessionId, userId);
  }
  
  public void deleteUsers(java.lang.String sessionId, java.lang.Integer[] userIdsToDelete) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.administration.WsFaultBean{
    if (administrationService == null)
      _initAdministrationServiceProxy();
    administrationService.deleteUsers(sessionId, userIdsToDelete);
  }
  
  public int getRoleIdByName(java.lang.String sessionId, java.lang.String roleName) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.administration.WsFaultBean{
    if (administrationService == null)
      _initAdministrationServiceProxy();
    return administrationService.getRoleIdByName(sessionId, roleName);
  }
  
  public void deleteRoleByName(java.lang.String sessionId, java.lang.String deletedRoleName) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.administration.WsFaultBean{
    if (administrationService == null)
      _initAdministrationServiceProxy();
    administrationService.deleteRoleByName(sessionId, deletedRoleName);
  }
  
  public int createExecServer(java.lang.String sessionId, br.lry.qa.alm.webservices.scm.administration.ExecServer execServer) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.administration.WsFaultBean{
    if (administrationService == null)
      _initAdministrationServiceProxy();
    return administrationService.createExecServer(sessionId, execServer);
  }
  
  public int createUsergroup(java.lang.String sessionId, br.lry.qa.alm.webservices.scm.administration.UserGroup userGroup) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.administration.WsFaultBean{
    if (administrationService == null)
      _initAdministrationServiceProxy();
    return administrationService.createUsergroup(sessionId, userGroup);
  }
  
  public br.lry.qa.alm.webservices.scm.administration.UserGroup getGroupByName(java.lang.String sessionId, java.lang.String groupName) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.administration.WsFaultBean{
    if (administrationService == null)
      _initAdministrationServiceProxy();
    return administrationService.getGroupByName(sessionId, groupName);
  }
  
  public br.lry.qa.alm.webservices.scm.administration.UserGroup getGroupById(java.lang.String sessionId, int groupId) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.administration.WsFaultBean{
    if (administrationService == null)
      _initAdministrationServiceProxy();
    return administrationService.getGroupById(sessionId, groupId);
  }
  
  public void deleteUserGroup(java.lang.String sessionId, int groupId) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.administration.WsFaultBean{
    if (administrationService == null)
      _initAdministrationServiceProxy();
    administrationService.deleteUserGroup(sessionId, groupId);
  }
  
  public br.lry.qa.alm.webservices.scm.administration.Role getRoleById(java.lang.String sessionId, int roleId) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.administration.WsFaultBean{
    if (administrationService == null)
      _initAdministrationServiceProxy();
    return administrationService.getRoleById(sessionId, roleId);
  }
  
  public boolean addVersion(java.lang.String sessionId, java.lang.String product, java.lang.String version, java.lang.String descr, boolean isActive) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.administration.WsFaultBean{
    if (administrationService == null)
      _initAdministrationServiceProxy();
    return administrationService.addVersion(sessionId, product, version, descr, isActive);
  }
  
  public boolean addBuild(java.lang.String sessionId, java.lang.String product, java.lang.String version, java.lang.String build, java.lang.String descr, boolean isActive) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.administration.WsFaultBean{
    if (administrationService == null)
      _initAdministrationServiceProxy();
    return administrationService.addBuild(sessionId, product, version, build, descr, isActive);
  }
  
  public boolean isBuildActive(java.lang.String sessionId, java.lang.String product, java.lang.String version, java.lang.String build) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.administration.WsFaultBean{
    if (administrationService == null)
      _initAdministrationServiceProxy();
    return administrationService.isBuildActive(sessionId, product, version, build);
  }
  
  public void setBuildActive(java.lang.String sessionId, java.lang.String product, java.lang.String version, java.lang.String build, boolean active) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.administration.WsFaultBean{
    if (administrationService == null)
      _initAdministrationServiceProxy();
    administrationService.setBuildActive(sessionId, product, version, build, active);
  }
  
  public br.lry.qa.alm.webservices.scm.administration.Project[] getProjectsForUser(java.lang.String sessionId, int userId) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.administration.WsFaultBean{
    if (administrationService == null)
      _initAdministrationServiceProxy();
    return administrationService.getProjectsForUser(sessionId, userId);
  }
  
  public void deactivateProjects(java.lang.String sessionId, java.lang.Integer[] projectIds) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.administration.WsFaultBean{
    if (administrationService == null)
      _initAdministrationServiceProxy();
    administrationService.deactivateProjects(sessionId, projectIds);
  }
  
  public br.lry.qa.alm.webservices.scm.administration.Location[] getLocationsForProject(java.lang.String sessionId, int projectId) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.administration.WsFaultBean{
    if (administrationService == null)
      _initAdministrationServiceProxy();
    return administrationService.getLocationsForProject(sessionId, projectId);
  }
  
  public br.lry.qa.alm.webservices.scm.administration.LocationDetails getLocationDetails(java.lang.String sessionId, int locationId) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.administration.WsFaultBean{
    if (administrationService == null)
      _initAdministrationServiceProxy();
    return administrationService.getLocationDetails(sessionId, locationId);
  }
  
  public br.lry.qa.alm.webservices.scm.administration.ExecServer getExecServerById(java.lang.String sessionId, int execServerId) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.administration.WsFaultBean{
    if (administrationService == null)
      _initAdministrationServiceProxy();
    return administrationService.getExecServerById(sessionId, execServerId);
  }
  
  public br.lry.qa.alm.webservices.scm.administration.ExecServer[] getExecServersOfLocation(java.lang.String sessionId, int locationId) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.administration.WsFaultBean{
    if (administrationService == null)
      _initAdministrationServiceProxy();
    return administrationService.getExecServersOfLocation(sessionId, locationId);
  }
  
  public void activateExecServer(java.lang.String sessionId, int execServerId, int locationId) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.administration.WsFaultBean{
    if (administrationService == null)
      _initAdministrationServiceProxy();
    administrationService.activateExecServer(sessionId, execServerId, locationId);
  }
  
  public boolean addLocationToProject(java.lang.String sessionId, int projectId, int locationId) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.administration.WsFaultBean{
    if (administrationService == null)
      _initAdministrationServiceProxy();
    return administrationService.addLocationToProject(sessionId, projectId, locationId);
  }
  
  public boolean removeLocationFromProject(java.lang.String sessionId, int projectId, int locationId) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.administration.WsFaultBean{
    if (administrationService == null)
      _initAdministrationServiceProxy();
    return administrationService.removeLocationFromProject(sessionId, projectId, locationId);
  }
  
  public br.lry.qa.alm.webservices.scm.administration.UserGroupMembership[] getMembershipsOfGroup(java.lang.String sessionId, int groupId) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.administration.WsFaultBean{
    if (administrationService == null)
      _initAdministrationServiceProxy();
    return administrationService.getMembershipsOfGroup(sessionId, groupId);
  }
  
  public br.lry.qa.alm.webservices.scm.administration.UserGroupMembership[] getMembershipsOfUser(java.lang.String sessionId, int userId) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.administration.WsFaultBean{
    if (administrationService == null)
      _initAdministrationServiceProxy();
    return administrationService.getMembershipsOfUser(sessionId, userId);
  }
  
  public br.lry.qa.alm.webservices.scm.administration.UserGroupMembership[] getAllMemberships(java.lang.String sessionId) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.administration.WsFaultBean{
    if (administrationService == null)
      _initAdministrationServiceProxy();
    return administrationService.getAllMemberships(sessionId);
  }
  
  public void updateMembershipsOfGroup(java.lang.String sessionId, int groupId, br.lry.qa.alm.webservices.scm.administration.UserGroupMembership[] memberships) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.administration.WsFaultBean{
    if (administrationService == null)
      _initAdministrationServiceProxy();
    administrationService.updateMembershipsOfGroup(sessionId, groupId, memberships);
  }
  
  public void updateMembershipsOfUser(java.lang.String sessionId, int userId, br.lry.qa.alm.webservices.scm.administration.UserGroupMembership[] memberships) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.administration.WsFaultBean{
    if (administrationService == null)
      _initAdministrationServiceProxy();
    administrationService.updateMembershipsOfUser(sessionId, userId, memberships);
  }
  
  public java.lang.String getProductNameById(java.lang.String sessionId, int productId) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.administration.WsFaultBean{
    if (administrationService == null)
      _initAdministrationServiceProxy();
    return administrationService.getProductNameById(sessionId, productId);
  }
  
  public boolean isMixedModeAuthentication(java.lang.String sessionId, int userId) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.administration.WsFaultBean{
    if (administrationService == null)
      _initAdministrationServiceProxy();
    return administrationService.isMixedModeAuthentication(sessionId, userId);
  }
  
  public void setMixedModeAuthentication(java.lang.String sessionId, int userId, boolean useMixedMode) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.administration.WsFaultBean{
    if (administrationService == null)
      _initAdministrationServiceProxy();
    administrationService.setMixedModeAuthentication(sessionId, userId, useMixedMode);
  }
  
  public java.lang.String[] getExecServerKeywords(java.lang.String sessionId, int execServerId) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.administration.WsFaultBean{
    if (administrationService == null)
      _initAdministrationServiceProxy();
    return administrationService.getExecServerKeywords(sessionId, execServerId);
  }
  
  public void updateExecServerKeywords(java.lang.String sessionId, int execServerId, java.lang.String[] keywords) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.administration.WsFaultBean{
    if (administrationService == null)
      _initAdministrationServiceProxy();
    administrationService.updateExecServerKeywords(sessionId, execServerId, keywords);
  }
  
  public void deleteExecServer(java.lang.String sessionId, int execServerId) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.administration.WsFaultBean{
    if (administrationService == null)
      _initAdministrationServiceProxy();
    administrationService.deleteExecServer(sessionId, execServerId);
  }
  
  public int copyProject(java.lang.String sessionId, int projectId, java.lang.String newProjectName, java.lang.String[] copyProjectProperties) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.administration.WsFaultBean{
    if (administrationService == null)
      _initAdministrationServiceProxy();
    return administrationService.copyProject(sessionId, projectId, newProjectName, copyProjectProperties);
  }
  
  public int createLocation(java.lang.String sessionId, br.lry.qa.alm.webservices.scm.administration.LocationDetails locationDetails) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.administration.WsFaultBean{
    if (administrationService == null)
      _initAdministrationServiceProxy();
    return administrationService.createLocation(sessionId, locationDetails);
  }
  
  public int duplicateRole(java.lang.String sessionId, int roleId, java.lang.String newRoleName, java.lang.String newRoleDesc) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.administration.WsFaultBean{
    if (administrationService == null)
      _initAdministrationServiceProxy();
    return administrationService.duplicateRole(sessionId, roleId, newRoleName, newRoleDesc);
  }
  
  public br.lry.qa.alm.webservices.scm.administration.UserGroup[] getAllUserGroups(java.lang.String sessionId) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.administration.WsFaultBean{
    if (administrationService == null)
      _initAdministrationServiceProxy();
    return administrationService.getAllUserGroups(sessionId);
  }
  
  public java.lang.String[] getPlatforms(java.lang.String sessionId) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.administration.WsFaultBean{
    if (administrationService == null)
      _initAdministrationServiceProxy();
    return administrationService.getPlatforms(sessionId);
  }
  
  
}