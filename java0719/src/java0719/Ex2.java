package java0719;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Ex2 {

	public static void main(String[] args) {
		String URL = "jdbc:mysql://192.168.56.1:3306/spring5fs";
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(URL, "spring5", "spring5");
			System.out.println("Mysql 접속");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}

}
