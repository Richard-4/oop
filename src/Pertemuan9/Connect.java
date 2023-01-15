package Pertemuan9;

import java.sql.*;

public class Connect {
	private final String USERNAME = "root";
	private final String PASSWORD = "";
	private final String DATABASE = "pet_store";
	private final String HOST = "localhost:3306";
	private final String CONNECTION = String.format("jdbc:mysql://%s/%s", HOST, DATABASE);

	private Connection con;
	private Statement st;

	// singleton
	private static Connect connect = null;
//	private String name;

	private Connect() {
//		this.name = name;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(CONNECTION, USERNAME, PASSWORD);
			st = con.createStatement();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static Connect getConnection() {
		if (connect == null) {
			return connect = new Connect();
		}
//		connect.name = name;
		return connect;
	}
	
	// query select
	public ResultSet executeQuery(String query) {
		ResultSet rs = null;
		try {
			rs = st.executeQuery(query);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rs;
	}
}