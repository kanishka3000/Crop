/**
 * CropInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package lk.icta.schemas.xsd.crop.handler.v1;

import java.sql.ResultSet;
import java.util.ArrayList;

import util.Connection;

public class CropInfo implements java.io.Serializable {
	private java.lang.String name;
	public static int CROPTYPE_LOCATION = 1;
	public static int CROPTYPE_CROP = 0;
	private java.math.BigDecimal price;
	private Connection connection = null;

	private java.lang.String location;

	public CropInfo() {

	}

	public ArrayList getCrops(int type, String id) throws Exception {
		connection = new Connection();
		String query;
		if (type == CROPTYPE_CROP) {
			query = "select * from locationprice where cropid='" + id + "'";
		} else {
			query = "select * from locationprice where location='" + id + "'";

		}
		ResultSet rs = connection.executeQuery(query);
		ArrayList list = new ArrayList();
		while (rs.next()) {
			CropInfo cr = new CropInfo();
			cr.setName(rs.getString("cropid"));
			cr.setLocation(rs.getString("location"));
			cr.setPrice(new java.math.BigDecimal(rs.getString("price")));
			list.add(cr);
		}
		return list;
	}

	public CropInfo(java.lang.String name, java.math.BigDecimal price,
			java.lang.String location) {
		this.name = name;
		this.price = price;
		this.location = location;
	}

	/**
	 * Gets the name value for this CropInfo.
	 * 
	 * @return name
	 */
	public java.lang.String getName() {
		return name;
	}

	/**
	 * Sets the name value for this CropInfo.
	 * 
	 * @param name
	 */
	public void setName(java.lang.String name) {
		this.name = name;
	}

	/**
	 * Gets the price value for this CropInfo.
	 * 
	 * @return price
	 */
	public java.math.BigDecimal getPrice() {
		return price;
	}

	/**
	 * Sets the price value for this CropInfo.
	 * 
	 * @param price
	 */
	public void setPrice(java.math.BigDecimal price) {
		this.price = price;
	}

	/**
	 * Gets the location value for this CropInfo.
	 * 
	 * @return location
	 */
	public java.lang.String getLocation() {
		return location;
	}

	/**
	 * Sets the location value for this CropInfo.
	 * 
	 * @param location
	 */
	public void setLocation(java.lang.String location) {
		this.location = location;
	}

	private java.lang.Object __equalsCalc = null;

	public synchronized boolean equals(java.lang.Object obj) {
		if (!(obj instanceof CropInfo))
			return false;
		CropInfo other = (CropInfo) obj;
		if (obj == null)
			return false;
		if (this == obj)
			return true;
		if (__equalsCalc != null) {
			return (__equalsCalc == obj);
		}
		__equalsCalc = obj;
		boolean _equals;
		_equals = true
				&& ((this.name == null && other.getName() == null) || (this.name != null && this.name
						.equals(other.getName())))
				&& ((this.price == null && other.getPrice() == null) || (this.price != null && this.price
						.equals(other.getPrice())))
				&& ((this.location == null && other.getLocation() == null) || (this.location != null && this.location
						.equals(other.getLocation())));
		__equalsCalc = null;
		return _equals;
	}

	private boolean __hashCodeCalc = false;

	public synchronized int hashCode() {
		if (__hashCodeCalc) {
			return 0;
		}
		__hashCodeCalc = true;
		int _hashCode = 1;
		if (getName() != null) {
			_hashCode += getName().hashCode();
		}
		if (getPrice() != null) {
			_hashCode += getPrice().hashCode();
		}
		if (getLocation() != null) {
			_hashCode += getLocation().hashCode();
		}
		__hashCodeCalc = false;
		return _hashCode;
	}

	// Type metadata
	private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
			CropInfo.class, true);

	static {
		typeDesc.setXmlType(new javax.xml.namespace.QName(
				"http://schemas.icta.lk/xsd/crop/handler/v1/", "CropInfo"));
		org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("name");
		elemField.setXmlName(new javax.xml.namespace.QName(
				"http://schemas.icta.lk/xsd/crop/handler/v1/", "name"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("price");
		elemField.setXmlName(new javax.xml.namespace.QName(
				"http://schemas.icta.lk/xsd/crop/handler/v1/", "price"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "decimal"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
		elemField.setFieldName("location");
		elemField.setXmlName(new javax.xml.namespace.QName(
				"http://schemas.icta.lk/xsd/crop/handler/v1/", "location"));
		elemField.setXmlType(new javax.xml.namespace.QName(
				"http://www.w3.org/2001/XMLSchema", "string"));
		elemField.setMinOccurs(0);
		elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
	}

	/**
	 * Return type metadata object
	 */
	public static org.apache.axis.description.TypeDesc getTypeDesc() {
		return typeDesc;
	}

	/**
	 * Get Custom Serializer
	 */
	public static org.apache.axis.encoding.Serializer getSerializer(
			java.lang.String mechType, java.lang.Class _javaType,
			javax.xml.namespace.QName _xmlType) {
		return new org.apache.axis.encoding.ser.BeanSerializer(_javaType,
				_xmlType, typeDesc);
	}

	/**
	 * Get Custom Deserializer
	 */
	public static org.apache.axis.encoding.Deserializer getDeserializer(
			java.lang.String mechType, java.lang.Class _javaType,
			javax.xml.namespace.QName _xmlType) {
		return new org.apache.axis.encoding.ser.BeanDeserializer(_javaType,
				_xmlType, typeDesc);
	}

}
