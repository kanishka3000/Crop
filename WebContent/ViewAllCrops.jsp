<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@page import="lk.icta.schemas.xsd.crop.handler.v1.CropInfo"%>
<%@page import="java.util.ArrayList"%><html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table>
<%
CropInfo cp=new CropInfo();
ArrayList list=cp.getList(CropInfo.LISTTYPE_CROP);
int i=0;
for(Object c:list){
	String s=(String)c;
	if(i%2==0){
		out.print("<tr>");
	}
%>

<td><%=s %><td>


<%
if(i%2==0){
	
}else{
	out.print("</tr>");
}
i++;
} %>
</table>
</body>
</html>