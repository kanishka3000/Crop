/**
 * CropServiceProxyLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package lk.icta.schemas.xsd.crop.handler.v1;

public class CropServiceProxyLocator extends org.apache.axis.client.Service implements lk.icta.schemas.xsd.crop.handler.v1.CropServiceProxy {

    public CropServiceProxyLocator() {
    }


    public CropServiceProxyLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public CropServiceProxyLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for CropServiceProxyHttpSoap12Endpoint
    private java.lang.String CropServiceProxyHttpSoap12Endpoint_address = "http://www.srilanka.lk:9080/services/CropServiceProxy.CropServiceProxyHttpSoap12Endpoint";

    public java.lang.String getCropServiceProxyHttpSoap12EndpointAddress() {
        return CropServiceProxyHttpSoap12Endpoint_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String CropServiceProxyHttpSoap12EndpointWSDDServiceName = "CropServiceProxyHttpSoap12Endpoint";

    public java.lang.String getCropServiceProxyHttpSoap12EndpointWSDDServiceName() {
        return CropServiceProxyHttpSoap12EndpointWSDDServiceName;
    }

    public void setCropServiceProxyHttpSoap12EndpointWSDDServiceName(java.lang.String name) {
        CropServiceProxyHttpSoap12EndpointWSDDServiceName = name;
    }

    public lk.icta.schemas.xsd.crop.handler.v1.CropServiceProxyPortType getCropServiceProxyHttpSoap12Endpoint() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(CropServiceProxyHttpSoap12Endpoint_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getCropServiceProxyHttpSoap12Endpoint(endpoint);
    }

    public lk.icta.schemas.xsd.crop.handler.v1.CropServiceProxyPortType getCropServiceProxyHttpSoap12Endpoint(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            lk.icta.schemas.xsd.crop.handler.v1.CropServiceProxySoap12BindingStub _stub = new lk.icta.schemas.xsd.crop.handler.v1.CropServiceProxySoap12BindingStub(portAddress, this);
            _stub.setPortName(getCropServiceProxyHttpSoap12EndpointWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setCropServiceProxyHttpSoap12EndpointEndpointAddress(java.lang.String address) {
        CropServiceProxyHttpSoap12Endpoint_address = address;
    }


    // Use to get a proxy class for CropServiceProxyHttpsSoap11Endpoint
    private java.lang.String CropServiceProxyHttpsSoap11Endpoint_address = "https://www.srilanka.lk:9443/services/CropServiceProxy.CropServiceProxyHttpsSoap11Endpoint";

    public java.lang.String getCropServiceProxyHttpsSoap11EndpointAddress() {
        return CropServiceProxyHttpsSoap11Endpoint_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String CropServiceProxyHttpsSoap11EndpointWSDDServiceName = "CropServiceProxyHttpsSoap11Endpoint";

    public java.lang.String getCropServiceProxyHttpsSoap11EndpointWSDDServiceName() {
        return CropServiceProxyHttpsSoap11EndpointWSDDServiceName;
    }

    public void setCropServiceProxyHttpsSoap11EndpointWSDDServiceName(java.lang.String name) {
        CropServiceProxyHttpsSoap11EndpointWSDDServiceName = name;
    }

    public lk.icta.schemas.xsd.crop.handler.v1.CropServiceProxyPortType getCropServiceProxyHttpsSoap11Endpoint() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(CropServiceProxyHttpsSoap11Endpoint_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getCropServiceProxyHttpsSoap11Endpoint(endpoint);
    }

    public lk.icta.schemas.xsd.crop.handler.v1.CropServiceProxyPortType getCropServiceProxyHttpsSoap11Endpoint(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            lk.icta.schemas.xsd.crop.handler.v1.CropServiceProxySoap11BindingStub _stub = new lk.icta.schemas.xsd.crop.handler.v1.CropServiceProxySoap11BindingStub(portAddress, this);
            _stub.setPortName(getCropServiceProxyHttpsSoap11EndpointWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setCropServiceProxyHttpsSoap11EndpointEndpointAddress(java.lang.String address) {
        CropServiceProxyHttpsSoap11Endpoint_address = address;
    }


    // Use to get a proxy class for CropServiceProxyHttpsSoap12Endpoint
    private java.lang.String CropServiceProxyHttpsSoap12Endpoint_address = "https://www.srilanka.lk:9443/services/CropServiceProxy.CropServiceProxyHttpsSoap12Endpoint";

    public java.lang.String getCropServiceProxyHttpsSoap12EndpointAddress() {
        return CropServiceProxyHttpsSoap12Endpoint_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String CropServiceProxyHttpsSoap12EndpointWSDDServiceName = "CropServiceProxyHttpsSoap12Endpoint";

    public java.lang.String getCropServiceProxyHttpsSoap12EndpointWSDDServiceName() {
        return CropServiceProxyHttpsSoap12EndpointWSDDServiceName;
    }

    public void setCropServiceProxyHttpsSoap12EndpointWSDDServiceName(java.lang.String name) {
        CropServiceProxyHttpsSoap12EndpointWSDDServiceName = name;
    }

    public lk.icta.schemas.xsd.crop.handler.v1.CropServiceProxyPortType getCropServiceProxyHttpsSoap12Endpoint() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(CropServiceProxyHttpsSoap12Endpoint_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getCropServiceProxyHttpsSoap12Endpoint(endpoint);
    }

    public lk.icta.schemas.xsd.crop.handler.v1.CropServiceProxyPortType getCropServiceProxyHttpsSoap12Endpoint(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            lk.icta.schemas.xsd.crop.handler.v1.CropServiceProxySoap12BindingStub _stub = new lk.icta.schemas.xsd.crop.handler.v1.CropServiceProxySoap12BindingStub(portAddress, this);
            _stub.setPortName(getCropServiceProxyHttpsSoap12EndpointWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setCropServiceProxyHttpsSoap12EndpointEndpointAddress(java.lang.String address) {
        CropServiceProxyHttpsSoap12Endpoint_address = address;
    }


    // Use to get a proxy class for CropServiceProxyHttpSoap11Endpoint
    private java.lang.String CropServiceProxyHttpSoap11Endpoint_address = "http://www.srilanka.lk:9080/services/CropServiceProxy.CropServiceProxyHttpSoap11Endpoint";

    public java.lang.String getCropServiceProxyHttpSoap11EndpointAddress() {
        return CropServiceProxyHttpSoap11Endpoint_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String CropServiceProxyHttpSoap11EndpointWSDDServiceName = "CropServiceProxyHttpSoap11Endpoint";

    public java.lang.String getCropServiceProxyHttpSoap11EndpointWSDDServiceName() {
        return CropServiceProxyHttpSoap11EndpointWSDDServiceName;
    }

    public void setCropServiceProxyHttpSoap11EndpointWSDDServiceName(java.lang.String name) {
        CropServiceProxyHttpSoap11EndpointWSDDServiceName = name;
    }

    public lk.icta.schemas.xsd.crop.handler.v1.CropServiceProxyPortType getCropServiceProxyHttpSoap11Endpoint() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(CropServiceProxyHttpSoap11Endpoint_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getCropServiceProxyHttpSoap11Endpoint(endpoint);
    }

    public lk.icta.schemas.xsd.crop.handler.v1.CropServiceProxyPortType getCropServiceProxyHttpSoap11Endpoint(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            lk.icta.schemas.xsd.crop.handler.v1.CropServiceProxySoap11BindingStub _stub = new lk.icta.schemas.xsd.crop.handler.v1.CropServiceProxySoap11BindingStub(portAddress, this);
            _stub.setPortName(getCropServiceProxyHttpSoap11EndpointWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setCropServiceProxyHttpSoap11EndpointEndpointAddress(java.lang.String address) {
        CropServiceProxyHttpSoap11Endpoint_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     * This service has multiple ports for a given interface;
     * the proxy implementation returned may be indeterminate.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (lk.icta.schemas.xsd.crop.handler.v1.CropServiceProxyPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                lk.icta.schemas.xsd.crop.handler.v1.CropServiceProxySoap12BindingStub _stub = new lk.icta.schemas.xsd.crop.handler.v1.CropServiceProxySoap12BindingStub(new java.net.URL(CropServiceProxyHttpSoap12Endpoint_address), this);
                _stub.setPortName(getCropServiceProxyHttpSoap12EndpointWSDDServiceName());
                return _stub;
            }
            if (lk.icta.schemas.xsd.crop.handler.v1.CropServiceProxyPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                lk.icta.schemas.xsd.crop.handler.v1.CropServiceProxySoap11BindingStub _stub = new lk.icta.schemas.xsd.crop.handler.v1.CropServiceProxySoap11BindingStub(new java.net.URL(CropServiceProxyHttpsSoap11Endpoint_address), this);
                _stub.setPortName(getCropServiceProxyHttpsSoap11EndpointWSDDServiceName());
                return _stub;
            }
            if (lk.icta.schemas.xsd.crop.handler.v1.CropServiceProxyPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                lk.icta.schemas.xsd.crop.handler.v1.CropServiceProxySoap12BindingStub _stub = new lk.icta.schemas.xsd.crop.handler.v1.CropServiceProxySoap12BindingStub(new java.net.URL(CropServiceProxyHttpsSoap12Endpoint_address), this);
                _stub.setPortName(getCropServiceProxyHttpsSoap12EndpointWSDDServiceName());
                return _stub;
            }
            if (lk.icta.schemas.xsd.crop.handler.v1.CropServiceProxyPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                lk.icta.schemas.xsd.crop.handler.v1.CropServiceProxySoap11BindingStub _stub = new lk.icta.schemas.xsd.crop.handler.v1.CropServiceProxySoap11BindingStub(new java.net.URL(CropServiceProxyHttpSoap11Endpoint_address), this);
                _stub.setPortName(getCropServiceProxyHttpSoap11EndpointWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("CropServiceProxyHttpSoap12Endpoint".equals(inputPortName)) {
            return getCropServiceProxyHttpSoap12Endpoint();
        }
        else if ("CropServiceProxyHttpsSoap11Endpoint".equals(inputPortName)) {
            return getCropServiceProxyHttpsSoap11Endpoint();
        }
        else if ("CropServiceProxyHttpsSoap12Endpoint".equals(inputPortName)) {
            return getCropServiceProxyHttpsSoap12Endpoint();
        }
        else if ("CropServiceProxyHttpSoap11Endpoint".equals(inputPortName)) {
            return getCropServiceProxyHttpSoap11Endpoint();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://schemas.icta.lk/xsd/crop/handler/v1/", "CropServiceProxy");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://schemas.icta.lk/xsd/crop/handler/v1/", "CropServiceProxyHttpSoap12Endpoint"));
            ports.add(new javax.xml.namespace.QName("http://schemas.icta.lk/xsd/crop/handler/v1/", "CropServiceProxyHttpsSoap11Endpoint"));
            ports.add(new javax.xml.namespace.QName("http://schemas.icta.lk/xsd/crop/handler/v1/", "CropServiceProxyHttpsSoap12Endpoint"));
            ports.add(new javax.xml.namespace.QName("http://schemas.icta.lk/xsd/crop/handler/v1/", "CropServiceProxyHttpSoap11Endpoint"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("CropServiceProxyHttpSoap12Endpoint".equals(portName)) {
            setCropServiceProxyHttpSoap12EndpointEndpointAddress(address);
        }
        else 
if ("CropServiceProxyHttpsSoap11Endpoint".equals(portName)) {
            setCropServiceProxyHttpsSoap11EndpointEndpointAddress(address);
        }
        else 
if ("CropServiceProxyHttpsSoap12Endpoint".equals(portName)) {
            setCropServiceProxyHttpsSoap12EndpointEndpointAddress(address);
        }
        else 
if ("CropServiceProxyHttpSoap11Endpoint".equals(portName)) {
            setCropServiceProxyHttpSoap11EndpointEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
