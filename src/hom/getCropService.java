package hom;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import lk.icta.schemas.xsd.crop.handler.v1.CropInfo;

import util.Connection;

/**
 * Servlet implementation class getCropService
 */
public class getCropService extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */

	public getCropService() {
		super();

		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		CropInfo info = new CropInfo();
		ArrayList list = null;
		String resut = "<?xml version=\"1.0\"?>";
		String cropString = request.getParameter("crop");
		String locationString = request.getParameter("location");
		String priceString = request.getParameter("price");// only one price is
															// allowed.
		String pricetypes = request.getParameter("pricetype");// less than or
																// greater than

		String service = request.getParameter("service");
		int pricetype=2;
		if (service == null) {
			int id = 0;
			String[] cropid = null;
			String[] locationid = null;
			String price = "0";
			price=priceString;
			if (cropString != null) {
				id = CropInfo.CROPTYPE_CROP;
				cropid = cropString.split(",");
			}
			if (locationString != null) {
				id += CropInfo.CROPTYPE_LOCATION;
				locationid = locationString.split(",");
			}
			if (priceString != null) {
				id += CropInfo.CROPTYPE_PRICE;
			}
			if(pricetypes!=null && pricetypes.equals("lt")){
				pricetype=CropInfo.PRICE_LESSTHAN;
			}else{
				pricetype=CropInfo.PRICE_LARGERTHAN;
			}
			
			System.out.println(id);
			try {
				list = info.getCrops(id, cropid, locationid, price,pricetype);
				resut = cropResult(list, resut);
				System.out.println(list);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		} else {
			try {
				if (request.getParameter("id").equals("location")) {
					list = info.getList(CropInfo.LISTTYPE_LOCATION);
					resut = listResult(list, resut);
				} else if (request.getParameter("id").equals("crop")) {
					list = info.getList(CropInfo.LISTTYPE_CROP);
					resut = fillCroplist(list, resut);

				}

			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		PrintWriter out = response.getWriter();
		out.print(resut);
		out.flush();
		out.close();

	}

	private String fillCroplist(ArrayList list, String resut) {
		int i = 0;
		resut += "<list>";
		for (Object o : list) {

			if (i % 2 == 0) {
				resut += "<crop>";
				resut += "<id>" + (String) o + "</id>";

			} else {
				resut += "<name>" + (String) o + "</name>";
				resut += "</crop>";
			}
			i++;
		}
		resut += "</list>";
		return resut;
	}

	private String listResult(ArrayList list, String resut) {
		resut += "<list>";
		for (Object o : list) {

			resut += "<item>" + (String) o + "</item>";

		}
		resut += "</list>";
		return resut;
	}

	private String cropResult(ArrayList list, String resut) {
		resut += "<crops>";
		for (Object o : list) {
			CropInfo infoin = (CropInfo) o;
			resut += "<crop>";
			resut += "<location>" + infoin.getLocation() + "</location>";
			resut += "<price>" + infoin.getPrice() + "</price>";
			resut += "<id>"+ infoin.getId()+"</id>";
			resut += "<name>" + infoin.getName() + "</name>";
			resut += "</crop>";
		}
		resut += "</crops>";
		return resut;
	}

}
