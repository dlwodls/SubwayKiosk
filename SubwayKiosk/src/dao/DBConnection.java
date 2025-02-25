package dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	public static void main(String[] args ) {
		String DRIVER = "com.mysql.cj.jdbc.Driver";
		String DBURL = "jdbc:mysql://127.0.0.1:3306/subway";
		String DBID = "root";
		String DBPW = "dlwodls1422!!";
		
		try {
			Class.forName(DRIVER);
			
			Connection con = DriverManager.getConnection(DBURL, DBID, DBPW);
			System.out.println("연결 성공");
			con.close();
		} catch (ClassNotFoundException e) {
			System.out.println("JDBC 드라이버를 찾을 수 없습니다.");
		} catch (SQLException e) {
			System.out.println("DB 연결 오류");
		}
	}
}
