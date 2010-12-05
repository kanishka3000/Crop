package hom;

import java.net.URL;
import java.sql.ResultSet;
import java.util.ArrayList;

import util.Connection;

import lk.icta.schemas.xsd.crop.handler.v1.CropInfo;
import lk.icta.schemas.xsd.crop.handler.v1.CropServiceProxySoap12BindingStub;

public class webstat {
	public static void main(String args[]) throws Exception {

		String query = "select * from crop";
		Connection conn = new Connection();
		ResultSet rs = conn.executeQuery("select * from crop");
		ArrayList<String> list = new ArrayList<String>();
		while (rs.next()) {
			list.add(rs.getString("cropid"));
		}

		CropServiceProxySoap12BindingStub cst = new CropServiceProxySoap12BindingStub(
				new URL(
						"http://www.srilanka.lk:9080/services/CropServiceProxy.CropServiceProxyHttpSoap12Endpoint"),
				null);
		query="delete from locationprice";
		conn.execute(query);
		CropInfo[] crops;
		for (String s : list) {
			crops = cst.getCropDataList(s);
			for (CropInfo crop : crops) {
				query="insert into locationprice(cropid,location,price) values ('"+s+"','"+crop.getLocation()+"','"+crop.getPrice()+"')";
				System.out.println(crop.getName() + "==" + crop.getPrice()
						+ crop.getLocation());
				conn.execute(query);
			}
		}

	}
}
