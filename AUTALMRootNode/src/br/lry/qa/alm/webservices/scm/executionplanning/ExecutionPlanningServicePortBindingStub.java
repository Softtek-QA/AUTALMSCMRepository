/**
 * ExecutionPlanningServicePortBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.lry.qa.alm.webservices.scm.executionplanning;

public class ExecutionPlanningServicePortBindingStub extends org.apache.axis.client.Stub implements br.lry.qa.alm.webservices.scm.executionplanning.ExecutionPlanningService {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[33];
        _initOperationDesc1();
        _initOperationDesc2();
        _initOperationDesc3();
        _initOperationDesc4();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getParameters");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sessionId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "execNodeId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.microfocus.com/silkcentral/webservices/executionplanning", "nodeParameter"));
        oper.setReturnClass(br.lry.qa.alm.webservices.scm.executionplanning.NodeParameter[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.microfocus.com/silkcentral/webservices/executionplanning", "WSFaultException"),
                      "com.microfocus.www.silkcentral.webservices.executionplanning.WsFaultBean",
                      new javax.xml.namespace.QName("http://www.microfocus.com/silkcentral/webservices/executionplanning", "wsFaultBean"), 
                      true
                     ));
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getAttributes");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sessionId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "projectId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.microfocus.com/silkcentral/webservices/executionplanning", "projectAttribute"));
        oper.setReturnClass(br.lry.qa.alm.webservices.scm.executionplanning.ProjectAttribute[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.microfocus.com/silkcentral/webservices/executionplanning", "WSFaultException"),
                      "com.microfocus.www.silkcentral.webservices.executionplanning.WsFaultBean",
                      new javax.xml.namespace.QName("http://www.microfocus.com/silkcentral/webservices/executionplanning", "wsFaultBean"), 
                      true
                     ));
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getNode");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sessionId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "nodeId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.microfocus.com/silkcentral/webservices/executionplanning", "executionNode"));
        oper.setReturnClass(br.lry.qa.alm.webservices.scm.executionplanning.ExecutionNode.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.microfocus.com/silkcentral/webservices/executionplanning", "WSFaultException"),
                      "com.microfocus.www.silkcentral.webservices.executionplanning.WsFaultBean",
                      new javax.xml.namespace.QName("http://www.microfocus.com/silkcentral/webservices/executionplanning", "wsFaultBean"), 
                      true
                     ));
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("updateAttributes");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sessionId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "projectId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "attributes"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.microfocus.com/silkcentral/webservices/executionplanning", "projectAttribute"), br.lry.qa.alm.webservices.scm.executionplanning.ProjectAttribute[].class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.microfocus.com/silkcentral/webservices/executionplanning", "projectAttribute"));
        oper.setReturnClass(br.lry.qa.alm.webservices.scm.executionplanning.ProjectAttribute[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.microfocus.com/silkcentral/webservices/executionplanning", "WSFaultException"),
                      "com.microfocus.www.silkcentral.webservices.executionplanning.WsFaultBean",
                      new javax.xml.namespace.QName("http://www.microfocus.com/silkcentral/webservices/executionplanning", "wsFaultBean"), 
                      true
                     ));
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getNodes");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sessionId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "projectId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "name"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.microfocus.com/silkcentral/webservices/executionplanning", "executionNode"));
        oper.setReturnClass(br.lry.qa.alm.webservices.scm.executionplanning.ExecutionNode[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.microfocus.com/silkcentral/webservices/executionplanning", "WSFaultException"),
                      "com.microfocus.www.silkcentral.webservices.executionplanning.WsFaultBean",
                      new javax.xml.namespace.QName("http://www.microfocus.com/silkcentral/webservices/executionplanning", "wsFaultBean"), 
                      true
                     ));
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("setParameter");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sessionId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "execNodeId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parameterName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parameterValue"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.microfocus.com/silkcentral/webservices/executionplanning", "WSFaultException"),
                      "com.microfocus.www.silkcentral.webservices.executionplanning.WsFaultBean",
                      new javax.xml.namespace.QName("http://www.microfocus.com/silkcentral/webservices/executionplanning", "wsFaultBean"), 
                      true
                     ));
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getKeywords");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sessionId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "execNodeId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.microfocus.com/silkcentral/webservices/executionplanning", "WSFaultException"),
                      "com.microfocus.www.silkcentral.webservices.executionplanning.WsFaultBean",
                      new javax.xml.namespace.QName("http://www.microfocus.com/silkcentral/webservices/executionplanning", "wsFaultBean"), 
                      true
                     ));
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("setKeywords");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sessionId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "execNodeId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "keywords"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String[].class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.microfocus.com/silkcentral/webservices/executionplanning", "WSFaultException"),
                      "com.microfocus.www.silkcentral.webservices.executionplanning.WsFaultBean",
                      new javax.xml.namespace.QName("http://www.microfocus.com/silkcentral/webservices/executionplanning", "wsFaultBean"), 
                      true
                     ));
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getChildNodes");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sessionId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parentNodeId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.microfocus.com/silkcentral/webservices/executionplanning", "executionNode"));
        oper.setReturnClass(br.lry.qa.alm.webservices.scm.executionplanning.ExecutionNode[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.microfocus.com/silkcentral/webservices/executionplanning", "WSFaultException"),
                      "com.microfocus.www.silkcentral.webservices.executionplanning.WsFaultBean",
                      new javax.xml.namespace.QName("http://www.microfocus.com/silkcentral/webservices/executionplanning", "wsFaultBean"), 
                      true
                     ));
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("logonUser");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "username"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "plainPwd"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.microfocus.com/silkcentral/webservices/executionplanning", "WSFaultException"),
                      "com.microfocus.www.silkcentral.webservices.executionplanning.WsFaultBean",
                      new javax.xml.namespace.QName("http://www.microfocus.com/silkcentral/webservices/executionplanning", "wsFaultBean"), 
                      true
                     ));
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getManualTesters");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sessionId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "projectId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.microfocus.com/silkcentral/webservices/executionplanning", "manualTester"));
        oper.setReturnClass(br.lry.qa.alm.webservices.scm.executionplanning.ManualTester[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.microfocus.com/silkcentral/webservices/executionplanning", "WSFaultException"),
                      "com.microfocus.www.silkcentral.webservices.executionplanning.WsFaultBean",
                      new javax.xml.namespace.QName("http://www.microfocus.com/silkcentral/webservices/executionplanning", "wsFaultBean"), 
                      true
                     ));
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("deleteNode");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sessionId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "nodeId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.microfocus.com/silkcentral/webservices/executionplanning", "WSFaultException"),
                      "com.microfocus.www.silkcentral.webservices.executionplanning.WsFaultBean",
                      new javax.xml.namespace.QName("http://www.microfocus.com/silkcentral/webservices/executionplanning", "wsFaultBean"), 
                      true
                     ));
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getPropertyInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sessionId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "kind"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.microfocus.com/silkcentral/webservices/executionplanning", "propertyMetaInfo"));
        oper.setReturnClass(br.lry.qa.alm.webservices.scm.executionplanning.PropertyMetaInfo.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.microfocus.com/silkcentral/webservices/executionplanning", "WSFaultException"),
                      "com.microfocus.www.silkcentral.webservices.executionplanning.WsFaultBean",
                      new javax.xml.namespace.QName("http://www.microfocus.com/silkcentral/webservices/executionplanning", "wsFaultBean"), 
                      true
                     ));
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("startExecutionWithOptionsInternal");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg0"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg3"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg4"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg5"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.microfocus.com/silkcentral/webservices/executionplanning", ">startExecutionWithOptionsInternal>arg5"), br.lry.qa.alm.webservices.scm.executionplanning.StartExecutionWithOptionsInternalArg5Entry[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("", "entry"));
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "arg6"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.microfocus.com/silkcentral/webservices/executionplanning", "executionHandle"));
        oper.setReturnClass(br.lry.qa.alm.webservices.scm.executionplanning.ExecutionHandle[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.microfocus.com/silkcentral/webservices/executionplanning", "WSFaultException"),
                      "com.microfocus.www.silkcentral.webservices.executionplanning.WsFaultBean",
                      new javax.xml.namespace.QName("http://www.microfocus.com/silkcentral/webservices/executionplanning", "wsFaultBean"), 
                      true
                     ));
        _operations[13] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getExecutionRootNode");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sessionId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "projectId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.microfocus.com/silkcentral/webservices/executionplanning", "executionNode"));
        oper.setReturnClass(br.lry.qa.alm.webservices.scm.executionplanning.ExecutionNode.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.microfocus.com/silkcentral/webservices/executionplanning", "WSFaultException"),
                      "com.microfocus.www.silkcentral.webservices.executionplanning.WsFaultBean",
                      new javax.xml.namespace.QName("http://www.microfocus.com/silkcentral/webservices/executionplanning", "wsFaultBean"), 
                      true
                     ));
        _operations[14] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getStateOfExecution");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sessionId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.microfocus.com/silkcentral/webservices/executionplanning", "executionHandle"), br.lry.qa.alm.webservices.scm.executionplanning.ExecutionHandle.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.microfocus.com/silkcentral/webservices/executionplanning", "WSFaultException"),
                      "com.microfocus.www.silkcentral.webservices.executionplanning.WsFaultBean",
                      new javax.xml.namespace.QName("http://www.microfocus.com/silkcentral/webservices/executionplanning", "wsFaultBean"), 
                      true
                     ));
        _operations[15] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("startExecutionWithOptions");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sessionId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "nodeId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "build"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "option"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sinceBuild"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.microfocus.com/silkcentral/webservices/executionplanning", "executionHandle"));
        oper.setReturnClass(br.lry.qa.alm.webservices.scm.executionplanning.ExecutionHandle[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.microfocus.com/silkcentral/webservices/executionplanning", "WSFaultException"),
                      "com.microfocus.www.silkcentral.webservices.executionplanning.WsFaultBean",
                      new javax.xml.namespace.QName("http://www.microfocus.com/silkcentral/webservices/executionplanning", "wsFaultBean"), 
                      true
                     ));
        _operations[16] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("setAssignedManualTesters");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sessionId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "execDefId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "manualTesterIds"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), java.lang.Integer[].class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.microfocus.com/silkcentral/webservices/executionplanning", "WSFaultException"),
                      "com.microfocus.www.silkcentral.webservices.executionplanning.WsFaultBean",
                      new javax.xml.namespace.QName("http://www.microfocus.com/silkcentral/webservices/executionplanning", "wsFaultBean"), 
                      true
                     ));
        _operations[17] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getExecutionResultURL");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sessionId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "executionDefId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "executionTimestamp"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "execServerHostName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "execServerPort"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.microfocus.com/silkcentral/webservices/executionplanning", "WSFaultException"),
                      "com.microfocus.www.silkcentral.webservices.executionplanning.WsFaultBean",
                      new javax.xml.namespace.QName("http://www.microfocus.com/silkcentral/webservices/executionplanning", "wsFaultBean"), 
                      true
                     ));
        _operations[18] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("deleteAttributes");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sessionId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "projectId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "attributes"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.microfocus.com/silkcentral/webservices/executionplanning", "projectAttribute"), br.lry.qa.alm.webservices.scm.executionplanning.ProjectAttribute[].class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.microfocus.com/silkcentral/webservices/executionplanning", "WSFaultException"),
                      "com.microfocus.www.silkcentral.webservices.executionplanning.WsFaultBean",
                      new javax.xml.namespace.QName("http://www.microfocus.com/silkcentral/webservices/executionplanning", "wsFaultBean"), 
                      true
                     ));
        _operations[19] = oper;

    }

    private static void _initOperationDesc3(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("addAttributes");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sessionId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "projectId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "attributes"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.microfocus.com/silkcentral/webservices/executionplanning", "projectAttribute"), br.lry.qa.alm.webservices.scm.executionplanning.ProjectAttribute[].class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.microfocus.com/silkcentral/webservices/executionplanning", "projectAttribute"));
        oper.setReturnClass(br.lry.qa.alm.webservices.scm.executionplanning.ProjectAttribute[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.microfocus.com/silkcentral/webservices/executionplanning", "WSFaultException"),
                      "com.microfocus.www.silkcentral.webservices.executionplanning.WsFaultBean",
                      new javax.xml.namespace.QName("http://www.microfocus.com/silkcentral/webservices/executionplanning", "wsFaultBean"), 
                      true
                     ));
        _operations[20] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("setSetupTestDefinition");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sessionId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "execNodeId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "testDefId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.microfocus.com/silkcentral/webservices/executionplanning", "WSFaultException"),
                      "com.microfocus.www.silkcentral.webservices.executionplanning.WsFaultBean",
                      new javax.xml.namespace.QName("http://www.microfocus.com/silkcentral/webservices/executionplanning", "wsFaultBean"), 
                      true
                     ));
        _operations[21] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("setCleanupTestDefinition");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sessionId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "execNodeId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "testDefId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.microfocus.com/silkcentral/webservices/executionplanning", "WSFaultException"),
                      "com.microfocus.www.silkcentral.webservices.executionplanning.WsFaultBean",
                      new javax.xml.namespace.QName("http://www.microfocus.com/silkcentral/webservices/executionplanning", "wsFaultBean"), 
                      true
                     ));
        _operations[22] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getAssignedManualTesters");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sessionId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "execDefId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.microfocus.com/silkcentral/webservices/executionplanning", "manualTester"));
        oper.setReturnClass(br.lry.qa.alm.webservices.scm.executionplanning.ManualTester[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.microfocus.com/silkcentral/webservices/executionplanning", "WSFaultException"),
                      "com.microfocus.www.silkcentral.webservices.executionplanning.WsFaultBean",
                      new javax.xml.namespace.QName("http://www.microfocus.com/silkcentral/webservices/executionplanning", "wsFaultBean"), 
                      true
                     ));
        _operations[23] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getSetupTestDefinition");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sessionId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "execNodeId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.microfocus.com/silkcentral/webservices/executionplanning", "WSFaultException"),
                      "com.microfocus.www.silkcentral.webservices.executionplanning.WsFaultBean",
                      new javax.xml.namespace.QName("http://www.microfocus.com/silkcentral/webservices/executionplanning", "wsFaultBean"), 
                      true
                     ));
        _operations[24] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getCleanupTestDefinition");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sessionId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "execNodeId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.microfocus.com/silkcentral/webservices/executionplanning", "WSFaultException"),
                      "com.microfocus.www.silkcentral.webservices.executionplanning.WsFaultBean",
                      new javax.xml.namespace.QName("http://www.microfocus.com/silkcentral/webservices/executionplanning", "wsFaultBean"), 
                      true
                     ));
        _operations[25] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("deleteAttributeOptions");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sessionId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "projectId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "attributeName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "options"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.microfocus.com/silkcentral/webservices/executionplanning", "attributeOption"), br.lry.qa.alm.webservices.scm.executionplanning.AttributeOption[].class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.microfocus.com/silkcentral/webservices/executionplanning", "WSFaultException"),
                      "com.microfocus.www.silkcentral.webservices.executionplanning.WsFaultBean",
                      new javax.xml.namespace.QName("http://www.microfocus.com/silkcentral/webservices/executionplanning", "wsFaultBean"), 
                      true
                     ));
        _operations[26] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("addAttributeOptions");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sessionId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "projectId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "attributeName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "options"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.microfocus.com/silkcentral/webservices/executionplanning", "attributeOption"), br.lry.qa.alm.webservices.scm.executionplanning.AttributeOption[].class, false, false);
        param.setOmittable(true);
        param.setNillable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.microfocus.com/silkcentral/webservices/executionplanning", "WSFaultException"),
                      "com.microfocus.www.silkcentral.webservices.executionplanning.WsFaultBean",
                      new javax.xml.namespace.QName("http://www.microfocus.com/silkcentral/webservices/executionplanning", "wsFaultBean"), 
                      true
                     ));
        _operations[27] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getExecutionResult");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sessionId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.microfocus.com/silkcentral/webservices/executionplanning", "executionHandle"), br.lry.qa.alm.webservices.scm.executionplanning.ExecutionHandle.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.microfocus.com/silkcentral/webservices/executionplanning", "executionResult"));
        oper.setReturnClass(br.lry.qa.alm.webservices.scm.executionplanning.ExecutionResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.microfocus.com/silkcentral/webservices/executionplanning", "WSFaultException"),
                      "com.microfocus.www.silkcentral.webservices.executionplanning.WsFaultBean",
                      new javax.xml.namespace.QName("http://www.microfocus.com/silkcentral/webservices/executionplanning", "wsFaultBean"), 
                      true
                     ));
        _operations[28] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getPropertyIds");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sessionId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "kind"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.microfocus.com/silkcentral/webservices/executionplanning", "WSFaultException"),
                      "com.microfocus.www.silkcentral.webservices.executionplanning.WsFaultBean",
                      new javax.xml.namespace.QName("http://www.microfocus.com/silkcentral/webservices/executionplanning", "wsFaultBean"), 
                      true
                     ));
        _operations[29] = oper;

    }

    private static void _initOperationDesc4(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("startExecution");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sessionId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "nodeId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.microfocus.com/silkcentral/webservices/executionplanning", "executionHandle"));
        oper.setReturnClass(br.lry.qa.alm.webservices.scm.executionplanning.ExecutionHandle[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.microfocus.com/silkcentral/webservices/executionplanning", "WSFaultException"),
                      "com.microfocus.www.silkcentral.webservices.executionplanning.WsFaultBean",
                      new javax.xml.namespace.QName("http://www.microfocus.com/silkcentral/webservices/executionplanning", "wsFaultBean"), 
                      true
                     ));
        _operations[30] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("updateNode");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sessionId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "node"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.microfocus.com/silkcentral/webservices/executionplanning", "executionNode"), br.lry.qa.alm.webservices.scm.executionplanning.ExecutionNode.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.microfocus.com/silkcentral/webservices/executionplanning", "WSFaultException"),
                      "com.microfocus.www.silkcentral.webservices.executionplanning.WsFaultBean",
                      new javax.xml.namespace.QName("http://www.microfocus.com/silkcentral/webservices/executionplanning", "wsFaultBean"), 
                      true
                     ));
        _operations[31] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("addNode");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sessionId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "projectId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "node"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.microfocus.com/silkcentral/webservices/executionplanning", "executionNode"), br.lry.qa.alm.webservices.scm.executionplanning.ExecutionNode.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "parentId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "return"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        oper.addFault(new org.apache.axis.description.FaultDesc(
                      new javax.xml.namespace.QName("http://www.microfocus.com/silkcentral/webservices/executionplanning", "WSFaultException"),
                      "com.microfocus.www.silkcentral.webservices.executionplanning.WsFaultBean",
                      new javax.xml.namespace.QName("http://www.microfocus.com/silkcentral/webservices/executionplanning", "wsFaultBean"), 
                      true
                     ));
        _operations[32] = oper;

    }

    public ExecutionPlanningServicePortBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public ExecutionPlanningServicePortBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public ExecutionPlanningServicePortBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://www.microfocus.com/silkcentral/webservices/executionplanning", ">>startExecutionWithOptionsInternal>arg5>entry");
            cachedSerQNames.add(qName);
            cls = br.lry.qa.alm.webservices.scm.executionplanning.StartExecutionWithOptionsInternalArg5Entry.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.microfocus.com/silkcentral/webservices/executionplanning", ">startExecutionWithOptionsInternal>arg5");
            cachedSerQNames.add(qName);
            cls = br.lry.qa.alm.webservices.scm.executionplanning.StartExecutionWithOptionsInternalArg5Entry[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.microfocus.com/silkcentral/webservices/executionplanning", ">>startExecutionWithOptionsInternal>arg5>entry");
            qName2 = new javax.xml.namespace.QName("", "entry");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://www.microfocus.com/silkcentral/webservices/executionplanning", "attributeOption");
            cachedSerQNames.add(qName);
            cls = br.lry.qa.alm.webservices.scm.executionplanning.AttributeOption.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.microfocus.com/silkcentral/webservices/executionplanning", "executionHandle");
            cachedSerQNames.add(qName);
            cls = br.lry.qa.alm.webservices.scm.executionplanning.ExecutionHandle.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.microfocus.com/silkcentral/webservices/executionplanning", "executionNode");
            cachedSerQNames.add(qName);
            cls = br.lry.qa.alm.webservices.scm.executionplanning.ExecutionNode.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.microfocus.com/silkcentral/webservices/executionplanning", "executionResult");
            cachedSerQNames.add(qName);
            cls = br.lry.qa.alm.webservices.scm.executionplanning.ExecutionResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.microfocus.com/silkcentral/webservices/executionplanning", "manualTester");
            cachedSerQNames.add(qName);
            cls = br.lry.qa.alm.webservices.scm.executionplanning.ManualTester.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.microfocus.com/silkcentral/webservices/executionplanning", "nodeParameter");
            cachedSerQNames.add(qName);
            cls = br.lry.qa.alm.webservices.scm.executionplanning.NodeParameter.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.microfocus.com/silkcentral/webservices/executionplanning", "parameterData");
            cachedSerQNames.add(qName);
            cls = br.lry.qa.alm.webservices.scm.executionplanning.ParameterData.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.microfocus.com/silkcentral/webservices/executionplanning", "projectAttribute");
            cachedSerQNames.add(qName);
            cls = br.lry.qa.alm.webservices.scm.executionplanning.ProjectAttribute.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.microfocus.com/silkcentral/webservices/executionplanning", "propertyMetaInfo");
            cachedSerQNames.add(qName);
            cls = br.lry.qa.alm.webservices.scm.executionplanning.PropertyMetaInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.microfocus.com/silkcentral/webservices/executionplanning", "propertyValue");
            cachedSerQNames.add(qName);
            cls = br.lry.qa.alm.webservices.scm.executionplanning.PropertyValue.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.microfocus.com/silkcentral/webservices/executionplanning", "testDefinitionResult");
            cachedSerQNames.add(qName);
            cls = br.lry.qa.alm.webservices.scm.executionplanning.TestDefinitionResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.microfocus.com/silkcentral/webservices/executionplanning", "wsFaultBean");
            cachedSerQNames.add(qName);
            cls = br.lry.qa.alm.webservices.scm.executionplanning.WsFaultBean.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public br.lry.qa.alm.webservices.scm.executionplanning.NodeParameter[] getParameters(java.lang.String sessionId, int execNodeId) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.executionplanning.WsFaultBean {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.microfocus.com/silkcentral/webservices/executionplanning", "getParameters"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionId, new java.lang.Integer(execNodeId)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.lry.qa.alm.webservices.scm.executionplanning.NodeParameter[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.lry.qa.alm.webservices.scm.executionplanning.NodeParameter[]) org.apache.axis.utils.JavaUtils.convert(_resp, br.lry.qa.alm.webservices.scm.executionplanning.NodeParameter[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof br.lry.qa.alm.webservices.scm.executionplanning.WsFaultBean) {
              throw (br.lry.qa.alm.webservices.scm.executionplanning.WsFaultBean) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public br.lry.qa.alm.webservices.scm.executionplanning.ProjectAttribute[] getAttributes(java.lang.String sessionId, int projectId) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.executionplanning.WsFaultBean {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.microfocus.com/silkcentral/webservices/executionplanning", "getAttributes"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionId, new java.lang.Integer(projectId)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.lry.qa.alm.webservices.scm.executionplanning.ProjectAttribute[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.lry.qa.alm.webservices.scm.executionplanning.ProjectAttribute[]) org.apache.axis.utils.JavaUtils.convert(_resp, br.lry.qa.alm.webservices.scm.executionplanning.ProjectAttribute[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof br.lry.qa.alm.webservices.scm.executionplanning.WsFaultBean) {
              throw (br.lry.qa.alm.webservices.scm.executionplanning.WsFaultBean) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public br.lry.qa.alm.webservices.scm.executionplanning.ExecutionNode getNode(java.lang.String sessionId, int nodeId) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.executionplanning.WsFaultBean {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.microfocus.com/silkcentral/webservices/executionplanning", "getNode"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionId, new java.lang.Integer(nodeId)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.lry.qa.alm.webservices.scm.executionplanning.ExecutionNode) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.lry.qa.alm.webservices.scm.executionplanning.ExecutionNode) org.apache.axis.utils.JavaUtils.convert(_resp, br.lry.qa.alm.webservices.scm.executionplanning.ExecutionNode.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof br.lry.qa.alm.webservices.scm.executionplanning.WsFaultBean) {
              throw (br.lry.qa.alm.webservices.scm.executionplanning.WsFaultBean) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public br.lry.qa.alm.webservices.scm.executionplanning.ProjectAttribute[] updateAttributes(java.lang.String sessionId, int projectId, br.lry.qa.alm.webservices.scm.executionplanning.ProjectAttribute[] attributes) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.executionplanning.WsFaultBean {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.microfocus.com/silkcentral/webservices/executionplanning", "updateAttributes"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionId, new java.lang.Integer(projectId), attributes});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.lry.qa.alm.webservices.scm.executionplanning.ProjectAttribute[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.lry.qa.alm.webservices.scm.executionplanning.ProjectAttribute[]) org.apache.axis.utils.JavaUtils.convert(_resp, br.lry.qa.alm.webservices.scm.executionplanning.ProjectAttribute[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof br.lry.qa.alm.webservices.scm.executionplanning.WsFaultBean) {
              throw (br.lry.qa.alm.webservices.scm.executionplanning.WsFaultBean) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public br.lry.qa.alm.webservices.scm.executionplanning.ExecutionNode[] getNodes(java.lang.String sessionId, int projectId, java.lang.String name) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.executionplanning.WsFaultBean {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.microfocus.com/silkcentral/webservices/executionplanning", "getNodes"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionId, new java.lang.Integer(projectId), name});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.lry.qa.alm.webservices.scm.executionplanning.ExecutionNode[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.lry.qa.alm.webservices.scm.executionplanning.ExecutionNode[]) org.apache.axis.utils.JavaUtils.convert(_resp, br.lry.qa.alm.webservices.scm.executionplanning.ExecutionNode[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof br.lry.qa.alm.webservices.scm.executionplanning.WsFaultBean) {
              throw (br.lry.qa.alm.webservices.scm.executionplanning.WsFaultBean) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void setParameter(java.lang.String sessionId, int execNodeId, java.lang.String parameterName, java.lang.String parameterValue) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.executionplanning.WsFaultBean {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.microfocus.com/silkcentral/webservices/executionplanning", "setParameter"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionId, new java.lang.Integer(execNodeId), parameterName, parameterValue});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof br.lry.qa.alm.webservices.scm.executionplanning.WsFaultBean) {
              throw (br.lry.qa.alm.webservices.scm.executionplanning.WsFaultBean) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.String[] getKeywords(java.lang.String sessionId, int execNodeId) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.executionplanning.WsFaultBean {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.microfocus.com/silkcentral/webservices/executionplanning", "getKeywords"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionId, new java.lang.Integer(execNodeId)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String[]) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof br.lry.qa.alm.webservices.scm.executionplanning.WsFaultBean) {
              throw (br.lry.qa.alm.webservices.scm.executionplanning.WsFaultBean) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void setKeywords(java.lang.String sessionId, int execNodeId, java.lang.String[] keywords) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.executionplanning.WsFaultBean {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.microfocus.com/silkcentral/webservices/executionplanning", "setKeywords"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionId, new java.lang.Integer(execNodeId), keywords});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof br.lry.qa.alm.webservices.scm.executionplanning.WsFaultBean) {
              throw (br.lry.qa.alm.webservices.scm.executionplanning.WsFaultBean) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public br.lry.qa.alm.webservices.scm.executionplanning.ExecutionNode[] getChildNodes(java.lang.String sessionId, int parentNodeId) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.executionplanning.WsFaultBean {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.microfocus.com/silkcentral/webservices/executionplanning", "getChildNodes"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionId, new java.lang.Integer(parentNodeId)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.lry.qa.alm.webservices.scm.executionplanning.ExecutionNode[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.lry.qa.alm.webservices.scm.executionplanning.ExecutionNode[]) org.apache.axis.utils.JavaUtils.convert(_resp, br.lry.qa.alm.webservices.scm.executionplanning.ExecutionNode[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof br.lry.qa.alm.webservices.scm.executionplanning.WsFaultBean) {
              throw (br.lry.qa.alm.webservices.scm.executionplanning.WsFaultBean) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.String logonUser(java.lang.String username, java.lang.String plainPwd) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.executionplanning.WsFaultBean {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.microfocus.com/silkcentral/webservices/executionplanning", "logonUser"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {username, plainPwd});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof br.lry.qa.alm.webservices.scm.executionplanning.WsFaultBean) {
              throw (br.lry.qa.alm.webservices.scm.executionplanning.WsFaultBean) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public br.lry.qa.alm.webservices.scm.executionplanning.ManualTester[] getManualTesters(java.lang.String sessionId, int projectId) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.executionplanning.WsFaultBean {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.microfocus.com/silkcentral/webservices/executionplanning", "getManualTesters"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionId, new java.lang.Integer(projectId)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.lry.qa.alm.webservices.scm.executionplanning.ManualTester[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.lry.qa.alm.webservices.scm.executionplanning.ManualTester[]) org.apache.axis.utils.JavaUtils.convert(_resp, br.lry.qa.alm.webservices.scm.executionplanning.ManualTester[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof br.lry.qa.alm.webservices.scm.executionplanning.WsFaultBean) {
              throw (br.lry.qa.alm.webservices.scm.executionplanning.WsFaultBean) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void deleteNode(java.lang.String sessionId, int nodeId) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.executionplanning.WsFaultBean {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.microfocus.com/silkcentral/webservices/executionplanning", "deleteNode"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionId, new java.lang.Integer(nodeId)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof br.lry.qa.alm.webservices.scm.executionplanning.WsFaultBean) {
              throw (br.lry.qa.alm.webservices.scm.executionplanning.WsFaultBean) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public br.lry.qa.alm.webservices.scm.executionplanning.PropertyMetaInfo getPropertyInfo(java.lang.String sessionId, int kind, java.lang.String id) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.executionplanning.WsFaultBean {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.microfocus.com/silkcentral/webservices/executionplanning", "getPropertyInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionId, new java.lang.Integer(kind), id});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.lry.qa.alm.webservices.scm.executionplanning.PropertyMetaInfo) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.lry.qa.alm.webservices.scm.executionplanning.PropertyMetaInfo) org.apache.axis.utils.JavaUtils.convert(_resp, br.lry.qa.alm.webservices.scm.executionplanning.PropertyMetaInfo.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof br.lry.qa.alm.webservices.scm.executionplanning.WsFaultBean) {
              throw (br.lry.qa.alm.webservices.scm.executionplanning.WsFaultBean) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public br.lry.qa.alm.webservices.scm.executionplanning.ExecutionHandle[] startExecutionWithOptionsInternal(java.lang.String arg0, int arg1, java.lang.String arg2, int arg3, java.lang.String arg4, br.lry.qa.alm.webservices.scm.executionplanning.StartExecutionWithOptionsInternalArg5Entry[] arg5, java.lang.String arg6) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.executionplanning.WsFaultBean {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.microfocus.com/silkcentral/webservices/executionplanning", "startExecutionWithOptionsInternal"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {arg0, new java.lang.Integer(arg1), arg2, new java.lang.Integer(arg3), arg4, arg5, arg6});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.lry.qa.alm.webservices.scm.executionplanning.ExecutionHandle[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.lry.qa.alm.webservices.scm.executionplanning.ExecutionHandle[]) org.apache.axis.utils.JavaUtils.convert(_resp, br.lry.qa.alm.webservices.scm.executionplanning.ExecutionHandle[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof br.lry.qa.alm.webservices.scm.executionplanning.WsFaultBean) {
              throw (br.lry.qa.alm.webservices.scm.executionplanning.WsFaultBean) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public br.lry.qa.alm.webservices.scm.executionplanning.ExecutionNode getExecutionRootNode(java.lang.String sessionId, int projectId) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.executionplanning.WsFaultBean {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[14]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.microfocus.com/silkcentral/webservices/executionplanning", "getExecutionRootNode"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionId, new java.lang.Integer(projectId)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.lry.qa.alm.webservices.scm.executionplanning.ExecutionNode) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.lry.qa.alm.webservices.scm.executionplanning.ExecutionNode) org.apache.axis.utils.JavaUtils.convert(_resp, br.lry.qa.alm.webservices.scm.executionplanning.ExecutionNode.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof br.lry.qa.alm.webservices.scm.executionplanning.WsFaultBean) {
              throw (br.lry.qa.alm.webservices.scm.executionplanning.WsFaultBean) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public int getStateOfExecution(java.lang.String sessionId, br.lry.qa.alm.webservices.scm.executionplanning.ExecutionHandle handle) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.executionplanning.WsFaultBean {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[15]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.microfocus.com/silkcentral/webservices/executionplanning", "getStateOfExecution"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionId, handle});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof br.lry.qa.alm.webservices.scm.executionplanning.WsFaultBean) {
              throw (br.lry.qa.alm.webservices.scm.executionplanning.WsFaultBean) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public br.lry.qa.alm.webservices.scm.executionplanning.ExecutionHandle[] startExecutionWithOptions(java.lang.String sessionId, int nodeId, java.lang.String build, int option, java.lang.String sinceBuild) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.executionplanning.WsFaultBean {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[16]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.microfocus.com/silkcentral/webservices/executionplanning", "startExecutionWithOptions"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionId, new java.lang.Integer(nodeId), build, new java.lang.Integer(option), sinceBuild});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.lry.qa.alm.webservices.scm.executionplanning.ExecutionHandle[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.lry.qa.alm.webservices.scm.executionplanning.ExecutionHandle[]) org.apache.axis.utils.JavaUtils.convert(_resp, br.lry.qa.alm.webservices.scm.executionplanning.ExecutionHandle[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof br.lry.qa.alm.webservices.scm.executionplanning.WsFaultBean) {
              throw (br.lry.qa.alm.webservices.scm.executionplanning.WsFaultBean) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void setAssignedManualTesters(java.lang.String sessionId, int execDefId, java.lang.Integer[] manualTesterIds) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.executionplanning.WsFaultBean {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[17]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.microfocus.com/silkcentral/webservices/executionplanning", "setAssignedManualTesters"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionId, new java.lang.Integer(execDefId), manualTesterIds});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof br.lry.qa.alm.webservices.scm.executionplanning.WsFaultBean) {
              throw (br.lry.qa.alm.webservices.scm.executionplanning.WsFaultBean) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.String getExecutionResultURL(java.lang.String sessionId, int executionDefId, long executionTimestamp, java.lang.String execServerHostName, int execServerPort) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.executionplanning.WsFaultBean {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[18]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.microfocus.com/silkcentral/webservices/executionplanning", "getExecutionResultURL"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionId, new java.lang.Integer(executionDefId), new java.lang.Long(executionTimestamp), execServerHostName, new java.lang.Integer(execServerPort)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof br.lry.qa.alm.webservices.scm.executionplanning.WsFaultBean) {
              throw (br.lry.qa.alm.webservices.scm.executionplanning.WsFaultBean) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void deleteAttributes(java.lang.String sessionId, int projectId, br.lry.qa.alm.webservices.scm.executionplanning.ProjectAttribute[] attributes) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.executionplanning.WsFaultBean {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[19]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.microfocus.com/silkcentral/webservices/executionplanning", "deleteAttributes"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionId, new java.lang.Integer(projectId), attributes});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof br.lry.qa.alm.webservices.scm.executionplanning.WsFaultBean) {
              throw (br.lry.qa.alm.webservices.scm.executionplanning.WsFaultBean) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public br.lry.qa.alm.webservices.scm.executionplanning.ProjectAttribute[] addAttributes(java.lang.String sessionId, int projectId, br.lry.qa.alm.webservices.scm.executionplanning.ProjectAttribute[] attributes) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.executionplanning.WsFaultBean {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[20]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.microfocus.com/silkcentral/webservices/executionplanning", "addAttributes"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionId, new java.lang.Integer(projectId), attributes});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.lry.qa.alm.webservices.scm.executionplanning.ProjectAttribute[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.lry.qa.alm.webservices.scm.executionplanning.ProjectAttribute[]) org.apache.axis.utils.JavaUtils.convert(_resp, br.lry.qa.alm.webservices.scm.executionplanning.ProjectAttribute[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof br.lry.qa.alm.webservices.scm.executionplanning.WsFaultBean) {
              throw (br.lry.qa.alm.webservices.scm.executionplanning.WsFaultBean) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void setSetupTestDefinition(java.lang.String sessionId, int execNodeId, int testDefId) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.executionplanning.WsFaultBean {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[21]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.microfocus.com/silkcentral/webservices/executionplanning", "setSetupTestDefinition"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionId, new java.lang.Integer(execNodeId), new java.lang.Integer(testDefId)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof br.lry.qa.alm.webservices.scm.executionplanning.WsFaultBean) {
              throw (br.lry.qa.alm.webservices.scm.executionplanning.WsFaultBean) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void setCleanupTestDefinition(java.lang.String sessionId, int execNodeId, int testDefId) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.executionplanning.WsFaultBean {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[22]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.microfocus.com/silkcentral/webservices/executionplanning", "setCleanupTestDefinition"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionId, new java.lang.Integer(execNodeId), new java.lang.Integer(testDefId)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof br.lry.qa.alm.webservices.scm.executionplanning.WsFaultBean) {
              throw (br.lry.qa.alm.webservices.scm.executionplanning.WsFaultBean) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public br.lry.qa.alm.webservices.scm.executionplanning.ManualTester[] getAssignedManualTesters(java.lang.String sessionId, int execDefId) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.executionplanning.WsFaultBean {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[23]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.microfocus.com/silkcentral/webservices/executionplanning", "getAssignedManualTesters"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionId, new java.lang.Integer(execDefId)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.lry.qa.alm.webservices.scm.executionplanning.ManualTester[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.lry.qa.alm.webservices.scm.executionplanning.ManualTester[]) org.apache.axis.utils.JavaUtils.convert(_resp, br.lry.qa.alm.webservices.scm.executionplanning.ManualTester[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof br.lry.qa.alm.webservices.scm.executionplanning.WsFaultBean) {
              throw (br.lry.qa.alm.webservices.scm.executionplanning.WsFaultBean) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public int getSetupTestDefinition(java.lang.String sessionId, int execNodeId) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.executionplanning.WsFaultBean {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[24]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.microfocus.com/silkcentral/webservices/executionplanning", "getSetupTestDefinition"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionId, new java.lang.Integer(execNodeId)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof br.lry.qa.alm.webservices.scm.executionplanning.WsFaultBean) {
              throw (br.lry.qa.alm.webservices.scm.executionplanning.WsFaultBean) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public int getCleanupTestDefinition(java.lang.String sessionId, int execNodeId) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.executionplanning.WsFaultBean {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[25]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.microfocus.com/silkcentral/webservices/executionplanning", "getCleanupTestDefinition"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionId, new java.lang.Integer(execNodeId)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof br.lry.qa.alm.webservices.scm.executionplanning.WsFaultBean) {
              throw (br.lry.qa.alm.webservices.scm.executionplanning.WsFaultBean) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void deleteAttributeOptions(java.lang.String sessionId, int projectId, java.lang.String attributeName, br.lry.qa.alm.webservices.scm.executionplanning.AttributeOption[] options) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.executionplanning.WsFaultBean {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[26]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.microfocus.com/silkcentral/webservices/executionplanning", "deleteAttributeOptions"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionId, new java.lang.Integer(projectId), attributeName, options});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof br.lry.qa.alm.webservices.scm.executionplanning.WsFaultBean) {
              throw (br.lry.qa.alm.webservices.scm.executionplanning.WsFaultBean) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void addAttributeOptions(java.lang.String sessionId, int projectId, java.lang.String attributeName, br.lry.qa.alm.webservices.scm.executionplanning.AttributeOption[] options) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.executionplanning.WsFaultBean {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[27]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.microfocus.com/silkcentral/webservices/executionplanning", "addAttributeOptions"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionId, new java.lang.Integer(projectId), attributeName, options});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof br.lry.qa.alm.webservices.scm.executionplanning.WsFaultBean) {
              throw (br.lry.qa.alm.webservices.scm.executionplanning.WsFaultBean) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public br.lry.qa.alm.webservices.scm.executionplanning.ExecutionResult getExecutionResult(java.lang.String sessionId, br.lry.qa.alm.webservices.scm.executionplanning.ExecutionHandle handle) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.executionplanning.WsFaultBean {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[28]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.microfocus.com/silkcentral/webservices/executionplanning", "getExecutionResult"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionId, handle});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.lry.qa.alm.webservices.scm.executionplanning.ExecutionResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.lry.qa.alm.webservices.scm.executionplanning.ExecutionResult) org.apache.axis.utils.JavaUtils.convert(_resp, br.lry.qa.alm.webservices.scm.executionplanning.ExecutionResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof br.lry.qa.alm.webservices.scm.executionplanning.WsFaultBean) {
              throw (br.lry.qa.alm.webservices.scm.executionplanning.WsFaultBean) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public java.lang.String[] getPropertyIds(java.lang.String sessionId, int kind) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.executionplanning.WsFaultBean {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[29]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.microfocus.com/silkcentral/webservices/executionplanning", "getPropertyIds"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionId, new java.lang.Integer(kind)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String[]) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof br.lry.qa.alm.webservices.scm.executionplanning.WsFaultBean) {
              throw (br.lry.qa.alm.webservices.scm.executionplanning.WsFaultBean) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public br.lry.qa.alm.webservices.scm.executionplanning.ExecutionHandle[] startExecution(java.lang.String sessionId, int nodeId) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.executionplanning.WsFaultBean {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[30]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.microfocus.com/silkcentral/webservices/executionplanning", "startExecution"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionId, new java.lang.Integer(nodeId)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (br.lry.qa.alm.webservices.scm.executionplanning.ExecutionHandle[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (br.lry.qa.alm.webservices.scm.executionplanning.ExecutionHandle[]) org.apache.axis.utils.JavaUtils.convert(_resp, br.lry.qa.alm.webservices.scm.executionplanning.ExecutionHandle[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof br.lry.qa.alm.webservices.scm.executionplanning.WsFaultBean) {
              throw (br.lry.qa.alm.webservices.scm.executionplanning.WsFaultBean) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public void updateNode(java.lang.String sessionId, br.lry.qa.alm.webservices.scm.executionplanning.ExecutionNode node) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.executionplanning.WsFaultBean {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[31]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.microfocus.com/silkcentral/webservices/executionplanning", "updateNode"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionId, node});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        extractAttachments(_call);
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof br.lry.qa.alm.webservices.scm.executionplanning.WsFaultBean) {
              throw (br.lry.qa.alm.webservices.scm.executionplanning.WsFaultBean) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

    public int addNode(java.lang.String sessionId, int projectId, br.lry.qa.alm.webservices.scm.executionplanning.ExecutionNode node, int parentId) throws java.rmi.RemoteException, br.lry.qa.alm.webservices.scm.executionplanning.WsFaultBean {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[32]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.microfocus.com/silkcentral/webservices/executionplanning", "addNode"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sessionId, new java.lang.Integer(projectId), node, new java.lang.Integer(parentId)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
    if (axisFaultException.detail != null) {
        if (axisFaultException.detail instanceof java.rmi.RemoteException) {
              throw (java.rmi.RemoteException) axisFaultException.detail;
         }
        if (axisFaultException.detail instanceof br.lry.qa.alm.webservices.scm.executionplanning.WsFaultBean) {
              throw (br.lry.qa.alm.webservices.scm.executionplanning.WsFaultBean) axisFaultException.detail;
         }
   }
  throw axisFaultException;
}
    }

}
