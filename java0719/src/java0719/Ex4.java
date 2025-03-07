package java0719;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class Ex4 {

	public static void main(String[] args) {
		String createString = "drop table customer";
		
		String URL = "jdbc:mysql://192.168.56.1:3306/spring5fs";
		Connection con = null;
		Statement stmt = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(URL, "spring5", "spring5");
			System.out.println("[Mysql 접속]");
			stmt = con.createStatement();
			int num = stmt.executeUpdate(createString);
			System.out.println("[테이블 삭제] " + num);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}

}

/*
 * CRUD
 * Create(Insert문), Read(Select문), Update, Delete 
*/
