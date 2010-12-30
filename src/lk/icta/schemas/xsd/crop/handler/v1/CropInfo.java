/**
 * CropInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package lk.icta.schemas.xsd.crop.handler.v1;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import util.Connection;

public class CropInfo implements java.io.Serializable {
	private java.lang.String name;
	public static final int CROPTYPE_LOCATION = 1;
	public static final int CROPTYPE_CROP = 2;
	public static final int CROPTYPE_PRICE = 4;
	public static final int CROPTYPE_CROP_LOCATION = 3;
	public static final int CROPTYPE_CROP_LOCATION_PRICE = 7;

	public static final int LISTTYPE_LOCATION = 8;
	public static final int LISTTYPE_CROP = 9;

	public static final int PRICE_LARGERTHAN = 0;
	public static final int PRICE_LESSTHAN = 1;
	private java.math.BigDecimal price;
	private Connection connection = null;
	String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	private java.lang.String location;

	public CropInfo() {

	}

	public ArrayList<String> getList(int type) throws Exception {
		String query = null;
		ArrayList<String> list = null;
		if (type == LISTTYPE_LOCATION) {
			query = "select * from location";
			connection = new Connection();
			ResultSet rs = connection.executeQuery(query);
			list = filllistlocation(rs);
		} else {
			query = "select * from crop";
			connection = new Connection();
			ResultSet rs = connection.executeQuery(query);
			list = filllistCrop(rs);
		}
		connection.close();
		connection = null;
		return list;
	}

	private ArrayList<String> filllistCrop(ResultSet rs) throws SQLException {
		ArrayList<String> list;
		list = new ArrayList();
		while (rs.next()) {
			String id = rs.getString("cropid");
			String name = rs.getString("cropname");
			list.add(id);
			list.add(name);
		}
		return list;
	}

	private ArrayList<String> filllistlocation(ResultSet rs)
			throws SQLException {
		ArrayList<String> list = new ArrayList<String>();
		while (rs.next()) {
			String re = rs.getString("location");
			list.add(re);
		}
		return list;
	}

	public ArrayList getCrops(int type, String[] cropvalue,
			String[] locationvalue, String pricevalue, int pricetype)
			throws Exception {
		connection = new Connection();
		String query = "select  locationprice.cropid as crop_id,cropname,location,price from locationprice";

		if (type == CROPTYPE_CROP) {
			String id = "";
			id = breaktoarray(cropvalue, id);
			query += " left join crop on locationprice.cropid= trim(crop.cropid) where locationprice.cropid in( "
					+ id + " ) ";
			System.out.println(query);
		} else if (type == CROPTYPE_LOCATION) {

			String id = "";
			id = breaktoarray(locationvalue, id);

			query += " left join crop on locationprice.cropid=trim(crop.cropid) where location in ( "
					+ id + " )  ";

		} else if (type == CROPTYPE_CROP_LOCATION) {
			String id1 = "";
			String id2 = "";
			id1 = breaktoarray(cropvalue, id1);
			id2 = breaktoarray(locationvalue, id2);
			query += " left join crop on locationprice.cropid=trim(crop.cropid) where location in ("
					+ id2 + ") and locationprice.cropid in ( " + id1 + " ) ";
		} else if (type == CROPTYPE_PRICE) {

			query += " where price ";
			if (pricetype == CropInfo.PRICE_LESSTHAN) {
				query += " < ";
			} else {
				query += " > ";
			}
			query += pricevalue + " ";
		} else if (type == CROPTYPE_CROP_LOCATION_PRICE) {
			String id1 = "";
			String id2 = "";
			id1 = breaktoarray(cropvalue, id1);
			id2 = breaktoarray(locationvalue, id2);
			query += " left join crop on locationprice.cropid=trim(crop.cropid) where location in ("
					+ id2
					+ ") and locationprice.cropid in ( "
					+ id1
					+ " ) and price ";
			if (pricetype == CropInfo.PRICE_LESSTHAN) {
				query += " < ";
			} else {
				query += " > ";
			}
			query += pricevalue + " ";

		} else if (type == (CROPTYPE_CROP + CROPTYPE_PRICE)) {
			String id = "";
			id = breaktoarray(cropvalue, id);
			query += " left join crop on locationprice.cropid=trim(crop.cropid) where locationprice.cropid in( "
					+ id + " ) and ";
			query += "  price ";
			if (pricetype == CropInfo.PRICE_LESSTHAN) {
				query += " < ";
			} else {
				query += " > ";
			}
			query += pricevalue + " ";
		} else if (type == CROPTYPE_LOCATION + CROPTYPE_PRICE) {
			String id = "";
			id = breaktoarray(locationvalue, id);
			query += " left join crop on locationprice.cropid=trim(crop.cropid) where location in ( "
					+ id + " ) and ";
			query += "  price ";
			if (pricetype == CropInfo.PRICE_LESSTHAN) {
				query += " < ";
			} else {
				query += " > ";
			}
			query += pricevalue + " ";

		}
		System.out.println(query);
		ResultSet rs = connection.executeQuery(query);
		ArrayList list = new ArrayList();
		while (rs.next()) {
			CropInfo cr = new CropInfo();
			cr.setId(rs.getString("crop_id"));
			cr.setName(rs.getString("cropname"));
			cr.setLocation(rs.getString("location"));
			cr.setPrice(new java.math.BigDecimal(rs.getString("price")));
			list.add(cr);
		}
		connection.close();
		connection = null;
		return list;
	}

	private String breaktoarray(String[] cropvalue, String id) {
		int i = 0;
		for (String s : cropvalue) {
			id += "'" + s + "'";
			if (i != cropvalue.length - 1) {
				id += " , ";
			}
			i++;
		}
		return id;
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
