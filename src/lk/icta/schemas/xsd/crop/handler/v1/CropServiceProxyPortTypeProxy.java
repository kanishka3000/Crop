package lk.icta.schemas.xsd.crop.handler.v1;

public class CropServiceProxyPortTypeProxy implements lk.icta.schemas.xsd.crop.handler.v1.CropServiceProxyPortType {
  private String _endpoint = null;
  private lk.icta.schemas.xsd.crop.handler.v1.CropServiceProxyPortType cropServiceProxyPortType = null;
  
  public CropServiceProxyPortTypeProxy() {
    _initCropServiceProxyPortTypeProxy();
  }
  
  public CropServiceProxyPortTypeProxy(String endpoint) {
    _endpoint = endpoint;
    _initCropServiceProxyPortTypeProxy();
  }
  
  private void _initCropServiceProxyPortTypeProxy() {
    try {
      cropServiceProxyPortType = (new lk.icta.schemas.xsd.crop.handler.v1.CropServiceProxyLocator()).getCropServiceProxyHttpsSoap11Endpoint();
      if (cropServiceProxyPortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)cropServiceProxyPortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)cropServiceProxyPortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (cropServiceProxyPortType != null)
      ((javax.xml.rpc.Stub)cropServiceProxyPortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public lk.icta.schemas.xsd.crop.handler.v1.CropServiceProxyPortType getCropServiceProxyPortType() {
    if (cropServiceProxyPortType == null)
      _initCropServiceProxyPortTypeProxy();
    return cropServiceProxyPortType;
  }
  
  public lk.icta.schemas.xsd.crop.handler.v1.CropInfo[] getCropDataList(java.lang.String code) throws java.rmi.RemoteException{
    if (cropServiceProxyPortType == null)
      _initCropServiceProxyPortTypeProxy();
    return cropServiceProxyPortType.getCropDataList(code);
  }
  
  
}