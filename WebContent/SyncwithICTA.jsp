<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@page import="hom.webstat"%><html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Sync with ICTA</title>
</head>
<body>
<%
	new Thread(new Runnable() {
		public void run() {
			webstat syncer = new webstat();
			try{
			syncer.main(new String[1]);}catch(Exception e){
				
			}

		}

	}).start();
%>
Synchronizing data with ICTA has started in the background.....

</body>
</html>