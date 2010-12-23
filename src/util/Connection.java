package util;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Connection {
	java.sql.Connection conn;
	java.sql.Statement statement;

	public Connection() throws Exception {
		CProperties pr=CProperties.getInstance();
		Class.forName("org.sqlite.JDBC");
		conn = DriverManager
				.getConnection("jdbc:sqlite:"+pr.getProperty("dbpath"));
		statement = conn.createStatement();
	}

	public ResultSet executeQuery(String query) throws Exception {

		ResultSet rs = statement.executeQuery(query);
		// st.close();
		return rs;
	}

	public void query(String query) throws Exception {
		
	}

	public void execute(String query) throws Exception{
		// TODO Auto-generated method stub
		statement.executeUpdate(query);
	}
	public void close()throws Exception{
		statement.close();
		conn.close();
	}

}
