package br.lry.qa.alm.webservices.scm;

import java.awt.List;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.HashMap;

import javax.xml.ws.handler.LogicalHandler;
import javax.xml.ws.handler.LogicalMessageContext;
import javax.xml.ws.handler.MessageContext;

import br.lry.qa.alm.webservices.scm.executionplanning.NodeParameter;
import br.lry.qa.alm.webservices.scm.executionplanning.ProjectAttribute;
import br.lry.qa.alm.webservices.scm.tests.ManualTestStep;
import br.lry.qa.alm.webservices.scm.tests.PlanningNode;
import br.lry.qa.alm.webservices.scm.tests.Project;
import br.lry.qa.alm.webservices.scm.tests.PropertyValue;
import br.lry.qa.alm.webservices.scm.tests.TestsServiceProxy;

public class AUTALMManage {
	
	
	/**
	 * Projetos configurados na estrutura ALM - Gest�o de Governan�a
	 * 
	 * @author Softtek-QA
	 *
	 */
	public enum AUT_ALM_PROJECTS{
		VA_VENDAS_ASSISTIDAS,
		AC_ATENDIMENTO_AOS_CLIENTES,
		AC_GESTAO_COMERCIAL,
		AC_MARKET_PLACE_ECOMMERCE,
		AC_SAFE,
		AC_SAP_ECQ,
		AC_SAP,
		VA_CONTAINER_VENDAS_ASSISTIDAS,
		AC_CONTAINER_ATENDIMENTO_AOS_CLIENTES,
		AC_CONTAINER_GESTAO_COMERCIAL,
		AC_CONTAINER_MARKET_PLACE_ECOMMERCE,
		AC_CONTAINER_SAFE,
		AC_CONTAINER_SAP_ECQ,
		AC_CONTAINER_SAP;;		
		@Override
		public String toString() {
			// TODO Auto-generated method stub			
			switch(this) {
			case AC_ATENDIMENTO_AOS_CLIENTES:{
				return "1";
			}
			case AC_GESTAO_COMERCIAL:{
				return "1";
			}
			case AC_MARKET_PLACE_ECOMMERCE:{
				return "1";
			}
			case AC_SAFE:{
				return "1";
			}
			case AC_SAP:{
				return "1";
			}
			case AC_SAP_ECQ:{
				return "1";
			}
			case VA_VENDAS_ASSISTIDAS:{
				return "1";
			}
			case AC_CONTAINER_ATENDIMENTO_AOS_CLIENTES:{
				return "113";
			}
			case AC_CONTAINER_GESTAO_COMERCIAL:{
				return "113";
			}
			case AC_CONTAINER_MARKET_PLACE_ECOMMERCE:{
				return "113";
			}
			case AC_CONTAINER_SAFE:{
				return "113";
			}
			case AC_CONTAINER_SAP:{
				return "113";
			}
			case AC_CONTAINER_SAP_ECQ:{
				return "113";
			}
			case VA_CONTAINER_VENDAS_ASSISTIDAS:{
				return "255";
			}
			default:{
				return "1";
			}
			}
		}
	}
	
	
	public enum AUT_ALM_TESTS_TYPES{
		SILK4J,
		JUNIT,
		SILKPERFORM,
		MANUAL;
		
		@Override
		public String toString() {
			switch(this) {
			case JUNIT:{
				return "JUnitTestType";
			}
			case SILK4J:{
				return "JUnitTestType";
			}
			case SILKPERFORM:{
				return "SilkPerformer";
			}
			default:{
				return "JUnitTestType";
			}
		}		
		}
	}
	/**
	 * @param paramsConfiguration
	 * @return
	 */
	public boolean autInsertTestAutomation(java.util.HashMap<String,Object> paramsConfiguration) {
		String user = paramsConfiguration.get("AUT_USER_ALM").toString();
		String pwd = paramsConfiguration.get("AUT_PWD_ALM").toString();
		AUT_ALM_PROJECTS pjt = (AUT_ALM_PROJECTS)paramsConfiguration.get("AUT_PROJECT_ALM");
		AUT_ALM_PROJECTS cntId = (AUT_ALM_PROJECTS)paramsConfiguration.get("AUT_PROJECT_CONTAINER");
		Integer containerId = Integer.parseInt(cntId.toString());
		Integer projectId = Integer.parseInt(pjt.toString());
		String containerNameByProject = paramsConfiguration.get("AUT_PROJECT_CONTAINER").toString();
		String ctName = paramsConfiguration.get("AUT_NOME_CTP").toString();
		String ctDescription = paramsConfiguration.get("AUT_DESCRICAO_CTP").toString();		
		AUT_ALM_TESTS_TYPES typeTest = (AUT_ALM_TESTS_TYPES)paramsConfiguration.get("AUT_TIPO_TESTE");		
		
		
		try {			
			System.out.println("AUT INFO: CONNECTING ALM WEB SERVICE");
			TestsServiceProxy tstManager = new TestsServiceProxy();
			String sessionId = tstManager.logonUser(user, pwd);
			
			if(sessionId!=null) {
				System.out.println("AUT INFO: ALM WEBSERVCE IS CONNECTED");								
				br.lry.qa.alm.webservices.scm.tests.ManualTestStep[] steps = (ManualTestStep[])paramsConfiguration.get("AUT_PASSOS_CTP");				
				br.lry.qa.alm.webservices.scm.tests.NodeParameter[] params = (br.lry.qa.alm.webservices.scm.tests.NodeParameter[])paramsConfiguration.get("AUT_PARAMETROS_CTP");								
				Integer idTest = tstManager.addManualTest(sessionId.toString(), containerId, ctName, ctDescription, steps , params);			
				tstManager.automateTest(sessionId, idTest, typeTest.toString());				
											
				Project pjtObj = tstManager.getProject(sessionId, projectId);
				
				System.out.println(pjtObj.getDescription());
				System.out.println(String.format("AUT INFO: ID DO CASO DE TESTES INCLUIDO : %s",idTest,null));											
			}
			
			return true;
		}
		catch(java.lang.Exception e) {
			
			System.out.println("AUT ERROR: EXCEPTION FOR CONNECT ALM WEB SERVICE");
			System.out.println(e.getMessage());
			e.printStackTrace();
			
			return false;
		}
	}
	
	
	/**
	 * 
	 * M�todo de inicializa��o
	 * 
	 * @param args - Parametros de inicializa��o dos testes
	 */
	public static void main(String[] args) {
		AUTALMManage pjtManager = new AUTALMManage();
		
		java.util.HashMap<String, Object> parametersConfig = new java.util.HashMap<String,Object>();
		parametersConfig.put("AUT_SERVER_ALM", "192.168.0.101:19120");
		parametersConfig.put("AUT_USER_ALM", "admin");
		parametersConfig.put("AUT_PWD_ALM", "admin");
		parametersConfig.put("AUT_URL_WEBSERVICE_ALM", String.format("http://%s/Services1.0/jaxws/tests?wsdl",parametersConfig.get("AUT_SERVER_ALM").toString()));
		parametersConfig.put("AUT_PROJECT_ALM", AUT_ALM_PROJECTS.VA_VENDAS_ASSISTIDAS);
		parametersConfig.put("AUT_PROJECT_CONTAINER", AUT_ALM_PROJECTS.VA_CONTAINER_VENDAS_ASSISTIDAS);		
		parametersConfig.put("AUT_NOME_CTP", "NOME CASO DE TESTE");
		parametersConfig.put("AUT_DESCRICAO_CTP", "DESCRICAO DO CASO DE TESTES");
		parametersConfig.put("AUT_TIPO_TESTE", AUT_ALM_TESTS_TYPES.SILK4J);		
		parametersConfig.put("AUT_PASSOS_CTP", new br.lry.qa.alm.webservices.scm.tests.ManualTestStep[] {});
		parametersConfig.put("AUT_PARAMETROS_CTP", new br.lry.qa.alm.webservices.scm.tests.NodeParameter[] {});
		
		pjtManager.autInsertTestAutomation(parametersConfig);
				
	
	}

}