package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JDBC02 {
   public static final String driver = "oracle.jdbc.OracleDriver";
   public static final String url = "jdbc:oracle:thin:@localhost:1521:xe";
   public static final String id = "TEST_USER";
   public static final String password = "1234";
   
   
   public static void main(String[] args) {
      //메뉴를 고르시오. 1번 누르면 전체 다 보여주기 2.번 누르면 해당되는 번호 찾아서 하나만 보여주기 3. 삭제하기. 0 종료합니다.
      Scanner scanner = new Scanner(System.in);
      int off = 1;
      while(true) {
         System.out.println("0 : 종료 , 1 : 전체보기 , 2 : 하나만 보기 , 3 : 하나 삭제 ,  4 : 입력 , 5 : 수정");
         int n =  scanner.nextInt();
         switch(n) {
            case 0 :
               off = 0;
            break;
            case 1 :
               getData();
            break;
            case 2 :
               getOneData();
            break;
            case 3 :
               deleteData();
            break;
            case 4 :
               insertData();
            break;
            case 5 :
               updateData();
            break;
         }
         if(off==0) {
            System.out.println("종료합니다.");
            break;
         }
      }
   }
   //console에서 지우고 싶은 id를 찾아서 지우기...
   // 값을 지우기...
   //
   public static void insertData() {
      //내용을 입력하시오.
      //아이디를 입력허시오.
      //패스워드를 입력하시오.
      //이름을 입력하시오.
         Connection conn = null;
         PreparedStatement pstmt = null;
         String sql = "INSERT INTO BOARD VALUES (SEQ_BOARD.NEXTVAL, ?, ?, ?, ?)";
         Scanner scanner = new Scanner(System.in);
         System.out.println("아이디를 입력하시오.");
         String newID = scanner.nextLine();
         System.out.println("비밀번호를 입력하시오.");
         String newPW = scanner.nextLine();
         System.out.println("이름을 입력하시오.");
         String newName = scanner.nextLine();
         System.out.println("내용를 입력하시오.");
         String newContents = scanner.nextLine();
         try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, id, password);
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, newID);
            pstmt.setString(2, newPW);
            pstmt.setString(3, newName);
            pstmt.setString(4, newContents);
            int result = pstmt.executeUpdate();
            if(result>0) {
               System.out.println("입력되었습니다.");
            } else {
               System.out.println("DB오류");
            }
         } catch (ClassNotFoundException e) {
            e.printStackTrace();
         } catch (SQLException e) {
            e.printStackTrace();
         } finally {
            try {
               if (pstmt != null) pstmt.close();
               if (conn != null) conn.close();
            } catch (SQLException e) {
               e.printStackTrace();
            }
         }
   }
   
   
   public static void updateData() {
      //어떤 아이디를 바꿀껀지 입력하시오.  입력받고
      //뭘로 바꿀지 아이디를 입력하시오.  입력받고
      //패스워드를 입력하시오.....
      //아이디가 바껴서 출력되게끔 하시오.
      Connection conn = null;
      PreparedStatement pstmt = null;
      String sql = "UPDATE BOARD SET ID = ? WHERE ID = ? AND PW = ?";
      Scanner scanner = new Scanner(System.in);
      System.out.println("어떤 아이디를 바꿀껀지 입력하시오");
      String selectedID = scanner.nextLine();
      System.out.println("뭘로 바꿀지 아이디를 입력하시오");
      String changeID = scanner.nextLine();
      System.out.println("패스워드를 입력하시오");
      String selectedPW = scanner.nextLine();
      
      try {
         Class.forName(driver);
         conn = DriverManager.getConnection(url, id, password);
         pstmt = conn.prepareStatement(sql);
         pstmt.setString(1, changeID);
         pstmt.setString(2, selectedID);
         pstmt.setString(3, selectedPW);
         int result = pstmt.executeUpdate();
         if(result>0) {
            System.out.println("아이디가 수정되었습니다.");
         } else {
            System.out.println("아이디 또는 패스워드가 잘못되었습니다.");
         }
      } catch (ClassNotFoundException e) {
         e.printStackTrace();
      } catch (SQLException e) {
         e.printStackTrace();
      }
   }
   public static void deleteData() {
      Connection conn = null;  //연결
      PreparedStatement pstmt = null;   //오라클에게 미리 질문 던져 놓기....
      String sql = "DELETE FROM BOARD WHERE ID = ? AND PW = ?";
      Scanner scanner = new Scanner(System.in);
      System.out.println("삭제할 아이디를 입력하시오.");
      String selectedID = scanner.nextLine();
      System.out.println("비밀번호를 입력하시오.");
      String selectedPW = scanner.nextLine();
      try {
         Class.forName(driver);
         conn = DriverManager.getConnection(url, id, password);
         pstmt = conn.prepareStatement(sql);
         pstmt.setString(1, selectedID);
         pstmt.setString(2, selectedPW);
         int result = pstmt.executeUpdate();  //테이블의 값에 영향을 미치는 sql은 executeUpdate()
         System.out.println("result==="+result);
      } catch (ClassNotFoundException e) {
         e.printStackTrace();
      } catch (SQLException e) {
         e.printStackTrace();
      } finally {
         try {
            if (pstmt!=null) pstmt.close();
            if (conn!=null) conn.close();
         } catch (SQLException e) {
            e.printStackTrace();
         }
      }
   }
   //값 받아오기....
   public static void getData() {
      Connection conn = null;  //연결
      Statement stmt = null;   //질문
      ResultSet rs = null;     //결과
      String sql = "SELECT * FROM BOARD ORDER BY NO DESC";
      
      try {
         Class.forName(driver);
         conn = DriverManager.getConnection(url, id, password);
         stmt = conn.createStatement();
         rs = stmt.executeQuery(sql);
         //다음 결과가 있으면
         while(rs.next()) {
            String no = rs.getString("NO");  // 1번부터 시작한다.  rs.getString(1);
            String id = rs.getString("ID");  // 1번부터 시작한다.  rs.getString(1);
            String pw = rs.getString("PW");  // 1번부터 시작한다.  rs.getString(1);
            String name = rs.getString("NAME");  // 1번부터 시작한다.  rs.getString(1);
            String contents = rs.getString("CONTENTS");  // 1번부터 시작한다.  rs.getString(1);
            System.out.printf("no : %s\t",no);
            System.out.printf("id : %s\t",id);
            System.out.printf("pw : %s\t",pw);
            System.out.printf("name : %s\t",name);
            System.out.printf("contents : %s\t",contents);
            System.out.println();
         }
         
      } catch (ClassNotFoundException e) {
         e.printStackTrace();
      } catch (SQLException e) {
         e.printStackTrace();
      } finally {
         try {
            if(rs!=null) rs.close();
            if(stmt!=null) stmt.close();
            if(conn!=null) conn.close();
         } catch (Exception e) {
            e.printStackTrace();
         }
      }
   }
   
   public static void getOneData() {
      Connection conn = null;  //연결
      PreparedStatement pstmt = null;   //질문
      ResultSet rs = null;     //결과
      String sql = "SELECT * FROM BOARD WHERE NO = ?";
      
      Scanner scanner = new Scanner(System.in);
      System.out.println("몇번 게시물을 보고싶은건가요?");
      int selectedNo =  scanner.nextInt();
      
      try {
         Class.forName(driver);
         conn =  DriverManager.getConnection(url, id, password);
         pstmt = conn.prepareStatement(sql);
         pstmt.setInt(1,selectedNo);
         rs = pstmt.executeQuery();
         while(rs.next()) {
            String no = rs.getString("NO");  // 1번부터 시작한다.  rs.getString(1);
            String id = rs.getString("ID");  // 1번부터 시작한다.  rs.getString(1);
            String pw = rs.getString("PW");  // 1번부터 시작한다.  rs.getString(1);
            String name = rs.getString("NAME");  // 1번부터 시작한다.  rs.getString(1);
            String contents = rs.getString("CONTENTS");  // 1번부터 시작한다.  rs.getString(1);
            System.out.printf("no : %s\t",no);
            System.out.printf("id : %s\t",id);
            System.out.printf("pw : %s\t",pw);
            System.out.printf("name : %s\t",name);
            System.out.printf("contents : %s\t",contents);
            System.out.println();
         }
      } catch (ClassNotFoundException e) {
         e.printStackTrace();
      } catch (SQLException e) {
         e.printStackTrace();
      } finally {
         try {
            if(rs!=null) rs.close();
            if(pstmt!=null) pstmt.close();
            if(conn!=null) conn.close();
         } catch (Exception e) {
            e.printStackTrace();
         }
      }
   }
}






