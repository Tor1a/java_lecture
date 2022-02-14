package jdbc;

import java.beans.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.sun.jdi.connect.spi.Connection;

public class JDBC01 {
	// static 미리 메모리에 상주
	public static final String driver= "oracle.jdbc.OracleDriver";
	public static final String url = "jdbc:oracle:thin:@localhost:1521:xe";
	public static final String id = "TEST_USER";
	public static final String password = "1234";
	
	public static void main(String[] args) {
		Connection conn = null;
		Statemente stmt = null;
		ResultSet rs = null;
		String sql = "SELECT * FROM MEMBERS";  // members 에서 모든 컬럼의 값을 가져오기
		
		// 1. driver를 통해 db연결	
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, id, password);
			stmt = conn.createSatement(); // query 준비
			rs = stmt.executeQuery(sql); // query 실행하고 결과값 반환
			// rs값을 출력 몇개가 있는지 모른다
			while(rs.next()) {
				String id = rs.getString("ID");
				String password = rs.getString("password");
				String name = rs.getString("name");
				String email = rs.getString("email");
				System.out.println("id: %s\t",id);
				System.out.println("password: %s\t",password);
				System.out.println("name: %s\t",name);
				System.out.println("email: %s\t",email);
				System.out.println();
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch(SQLException e){
			e.printStackTrace();
		}finally {
			try {
				if(rs!=null) rs.close();
				if(stmt!=null) stmt.close();
				if(conn !=null) conn/close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}
