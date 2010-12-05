package util;

import java.sql.ResultSet;

public class dbtest {
public static void main(String args[])throws Exception{
	Connection co=new Connection();
	ResultSet rs= co.executeQuery("select * from crop");
}
}
