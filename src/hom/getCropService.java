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
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		CropInfo info=new CropInfo();
		ArrayList list=null;
		if(request.getParameter("service").equals("location")){
			System.out.println("in");
			try {
				list=info.getCrops(CropInfo.CROPTYPE_LOCATION, request.getParameter("id"));
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else{
			try {
				list=info.getCrops(CropInfo.CROPTYPE_CROP, request.getParameter("id"));
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		String resut="<?xml version=\"1.0\"?>";
		resut+="<crops>";
		for(Object o:list){
			CropInfo infoin=(CropInfo)o;
		resut+="<crop>";
		resut+="<location>"+infoin.getLocation()+"</location>";
		resut+="<price>"+infoin.getPrice()+"</price>";
		resut+="<name>"+infoin.getName()+"</name>";
		resut+="</crop>";
		}
		resut+="</crops>";
		PrintWriter out=response.getWriter();
		out.print(resut);
		out.flush();
		out.close();
		
		
	}

}
