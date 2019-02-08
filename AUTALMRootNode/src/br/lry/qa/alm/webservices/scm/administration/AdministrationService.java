/**
 * AdministrationService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.lry.qa.alm.webservices.scm.administration;

public interface AdministrationService extends java.rmi.Remote {
    public br.lry.qa.alm.webservices.scm.administration.Location[] getLocations(java.lang.String sessionId) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.administration.WsFaultBean;
    public br.lry.qa.alm.webservices.scm.administration.Role[] getAllRoles(java.lang.String sessionId) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.administration.WsFaultBean;
    public java.lang.String[] getVersions(java.lang.String sessionId, java.lang.String product) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.administration.WsFaultBean;
    public java.lang.String[] getBuilds(java.lang.String sessionId, java.lang.String product, java.lang.String version) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.administration.WsFaultBean;
    public java.lang.String[] getActiveVersions(java.lang.String sessionId, java.lang.String product) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.administration.WsFaultBean;
    public void deactivateExecServer(java.lang.String sessionId, int execServerId) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.administration.WsFaultBean;
    public java.lang.String logonUser(java.lang.String username, java.lang.String plainPwd) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.administration.WsFaultBean;
    public java.lang.String[] getComponents(java.lang.String sessionId, java.lang.String product) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.administration.WsFaultBean;
    public br.lry.qa.alm.webservices.scm.administration.Project[] getProjects(java.lang.String sessionId) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.administration.WsFaultBean;
    public int createUser(java.lang.String sessionId, br.lry.qa.alm.webservices.scm.administration.UserDetails userDetails) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.administration.WsFaultBean;
    public void updateProject(java.lang.String sessionId, br.lry.qa.alm.webservices.scm.administration.Project project) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.administration.WsFaultBean;
    public int createProject(java.lang.String sessionId, br.lry.qa.alm.webservices.scm.administration.Project project) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.administration.WsFaultBean;
    public br.lry.qa.alm.webservices.scm.administration.User[] getUsers(java.lang.String sessionId, java.lang.String login) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.administration.WsFaultBean;
    public void updateUser(java.lang.String sessionId, br.lry.qa.alm.webservices.scm.administration.UserDetails userDetails) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.administration.WsFaultBean;
    public void setProxyUsernameAndPasswordForLocation(java.lang.String sessionId, int locationId, java.lang.String proxyUsername, java.lang.String proxyPassword) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.administration.WsFaultBean;
    public br.lry.qa.alm.webservices.scm.administration.Project getProjectById(java.lang.String sessionId, int projectId) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.administration.WsFaultBean;
    public java.lang.String[] getProducts(java.lang.String sessionId) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.administration.WsFaultBean;
    public java.lang.String[] getProjectNames(java.lang.String sessionId) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.administration.WsFaultBean;
    public void updateLocation(java.lang.String sessionId, br.lry.qa.alm.webservices.scm.administration.LocationDetails locationDetails) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.administration.WsFaultBean;
    public void updateExecServer(java.lang.String sessionId, br.lry.qa.alm.webservices.scm.administration.ExecServer execServer) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.administration.WsFaultBean;
    public void updateUserGroup(java.lang.String sessionId, br.lry.qa.alm.webservices.scm.administration.UserGroup usergroup) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.administration.WsFaultBean;
    public br.lry.qa.alm.webservices.scm.administration.Project[] findProjects(java.lang.String sessionId, java.lang.String projectName) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.administration.WsFaultBean;
    public void deleteLocations(java.lang.String sessionId, java.lang.Integer[] locationIds) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.administration.WsFaultBean;
    public void activateProjects(java.lang.String sessionId, java.lang.Integer[] projectIds) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.administration.WsFaultBean;
    public void deleteProjects(java.lang.String sessionId, java.lang.Integer[] projectIds) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.administration.WsFaultBean;
    public br.lry.qa.alm.webservices.scm.administration.UserDetails getUserDetails(java.lang.String sessionId, int userId) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.administration.WsFaultBean;
    public void deleteUsers(java.lang.String sessionId, java.lang.Integer[] userIdsToDelete) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.administration.WsFaultBean;
    public int getRoleIdByName(java.lang.String sessionId, java.lang.String roleName) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.administration.WsFaultBean;
    public void deleteRoleByName(java.lang.String sessionId, java.lang.String deletedRoleName) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.administration.WsFaultBean;
    public int createExecServer(java.lang.String sessionId, br.lry.qa.alm.webservices.scm.administration.ExecServer execServer) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.administration.WsFaultBean;
    public int createUsergroup(java.lang.String sessionId, br.lry.qa.alm.webservices.scm.administration.UserGroup userGroup) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.administration.WsFaultBean;
    public br.lry.qa.alm.webservices.scm.administration.UserGroup getGroupByName(java.lang.String sessionId, java.lang.String groupName) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.administration.WsFaultBean;
    public br.lry.qa.alm.webservices.scm.administration.UserGroup getGroupById(java.lang.String sessionId, int groupId) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.administration.WsFaultBean;
    public void deleteUserGroup(java.lang.String sessionId, int groupId) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.administration.WsFaultBean;
    public br.lry.qa.alm.webservices.scm.administration.Role getRoleById(java.lang.String sessionId, int roleId) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.administration.WsFaultBean;
    public boolean addVersion(java.lang.String sessionId, java.lang.String product, java.lang.String version, java.lang.String descr, boolean isActive) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.administration.WsFaultBean;
    public boolean addBuild(java.lang.String sessionId, java.lang.String product, java.lang.String version, java.lang.String build, java.lang.String descr, boolean isActive) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.administration.WsFaultBean;
    public boolean isBuildActive(java.lang.String sessionId, java.lang.String product, java.lang.String version, java.lang.String build) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.administration.WsFaultBean;
    public void setBuildActive(java.lang.String sessionId, java.lang.String product, java.lang.String version, java.lang.String build, boolean active) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.administration.WsFaultBean;
    public br.lry.qa.alm.webservices.scm.administration.Project[] getProjectsForUser(java.lang.String sessionId, int userId) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.administration.WsFaultBean;
    public void deactivateProjects(java.lang.String sessionId, java.lang.Integer[] projectIds) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.administration.WsFaultBean;
    public br.lry.qa.alm.webservices.scm.administration.Location[] getLocationsForProject(java.lang.String sessionId, int projectId) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.administration.WsFaultBean;
    public br.lry.qa.alm.webservices.scm.administration.LocationDetails getLocationDetails(java.lang.String sessionId, int locationId) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.administration.WsFaultBean;
    public br.lry.qa.alm.webservices.scm.administration.ExecServer getExecServerById(java.lang.String sessionId, int execServerId) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.administration.WsFaultBean;
    public br.lry.qa.alm.webservices.scm.administration.ExecServer[] getExecServersOfLocation(java.lang.String sessionId, int locationId) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.administration.WsFaultBean;
    public void activateExecServer(java.lang.String sessionId, int execServerId, int locationId) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.administration.WsFaultBean;
    public boolean addLocationToProject(java.lang.String sessionId, int projectId, int locationId) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.administration.WsFaultBean;
    public boolean removeLocationFromProject(java.lang.String sessionId, int projectId, int locationId) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.administration.WsFaultBean;
    public br.lry.qa.alm.webservices.scm.administration.UserGroupMembership[] getMembershipsOfGroup(java.lang.String sessionId, int groupId) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.administration.WsFaultBean;
    public br.lry.qa.alm.webservices.scm.administration.UserGroupMembership[] getMembershipsOfUser(java.lang.String sessionId, int userId) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.administration.WsFaultBean;
    public br.lry.qa.alm.webservices.scm.administration.UserGroupMembership[] getAllMemberships(java.lang.String sessionId) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.administration.WsFaultBean;
    public void updateMembershipsOfGroup(java.lang.String sessionId, int groupId, br.lry.qa.alm.webservices.scm.administration.UserGroupMembership[] memberships) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.administration.WsFaultBean;
    public void updateMembershipsOfUser(java.lang.String sessionId, int userId, br.lry.qa.alm.webservices.scm.administration.UserGroupMembership[] memberships) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.administration.WsFaultBean;
    public java.lang.String getProductNameById(java.lang.String sessionId, int productId) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.administration.WsFaultBean;
    public boolean isMixedModeAuthentication(java.lang.String sessionId, int userId) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.administration.WsFaultBean;
    public void setMixedModeAuthentication(java.lang.String sessionId, int userId, boolean useMixedMode) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.administration.WsFaultBean;
    public java.lang.String[] getExecServerKeywords(java.lang.String sessionId, int execServerId) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.administration.WsFaultBean;
    public void updateExecServerKeywords(java.lang.String sessionId, int execServerId, java.lang.String[] keywords) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.administration.WsFaultBean;
    public void deleteExecServer(java.lang.String sessionId, int execServerId) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.administration.WsFaultBean;
    public int copyProject(java.lang.String sessionId, int projectId, java.lang.String newProjectName, java.lang.String[] copyProjectProperties) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.administration.WsFaultBean;
    public int createLocation(java.lang.String sessionId, br.lry.qa.alm.webservices.scm.administration.LocationDetails locationDetails) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.administration.WsFaultBean;
    public int duplicateRole(java.lang.String sessionId, int roleId, java.lang.String newRoleName, java.lang.String newRoleDesc) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.administration.WsFaultBean;
    public br.lry.qa.alm.webservices.scm.administration.UserGroup[] getAllUserGroups(java.lang.String sessionId) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.administration.WsFaultBean;
    public java.lang.String[] getPlatforms(java.lang.String sessionId) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.administration.WsFaultBean;
}
