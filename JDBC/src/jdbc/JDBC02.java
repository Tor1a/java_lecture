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
      //�޴��� ���ÿ�. 1�� ������ ��ü �� �����ֱ� 2.�� ������ �ش�Ǵ� ��ȣ ã�Ƽ� �ϳ��� �����ֱ� 3. �����ϱ�. 0 �����մϴ�.
      Scanner scanner = new Scanner(System.in);
      int off = 1;
      while(true) {
         System.out.println("0 : ���� , 1 : ��ü���� , 2 : �ϳ��� ���� , 3 : �ϳ� ���� ,  4 : �Է� , 5 : ����");
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
            System.out.println("�����մϴ�.");
            break;
         }
      }
   }
   //console���� ����� ���� id�� ã�Ƽ� �����...
   // ���� �����...
   //
   public static void insertData() {
      //������ �Է��Ͻÿ�.
      //���̵� �Է���ÿ�.
      //�н����带 �Է��Ͻÿ�.
      //�̸��� �Է��Ͻÿ�.
         Connection conn = null;
         PreparedStatement pstmt = null;
         String sql = "INSERT INTO BOARD VALUES (SEQ_BOARD.NEXTVAL, ?, ?, ?, ?)";
         Scanner scanner = new Scanner(System.in);
         System.out.println("���̵� �Է��Ͻÿ�.");
         String newID = scanner.nextLine();
         System.out.println("��й�ȣ�� �Է��Ͻÿ�.");
         String newPW = scanner.nextLine();
         System.out.println("�̸��� �Է��Ͻÿ�.");
         String newName = scanner.nextLine();
         System.out.println("���븦 �Է��Ͻÿ�.");
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
               System.out.println("�ԷµǾ����ϴ�.");
            } else {
               System.out.println("DB����");
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
      //� ���̵� �ٲܲ��� �Է��Ͻÿ�.  �Է¹ް�
      //���� �ٲ��� ���̵� �Է��Ͻÿ�.  �Է¹ް�
      //�н����带 �Է��Ͻÿ�.....
      //���̵� �ٲ��� ��µǰԲ� �Ͻÿ�.
      Connection conn = null;
      PreparedStatement pstmt = null;
      String sql = "UPDATE BOARD SET ID = ? WHERE ID = ? AND PW = ?";
      Scanner scanner = new Scanner(System.in);
      System.out.println("� ���̵� �ٲܲ��� �Է��Ͻÿ�");
      String selectedID = scanner.nextLine();
      System.out.println("���� �ٲ��� ���̵� �Է��Ͻÿ�");
      String changeID = scanner.nextLine();
      System.out.println("�н����带 �Է��Ͻÿ�");
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
            System.out.println("���̵� �����Ǿ����ϴ�.");
         } else {
            System.out.println("���̵� �Ǵ� �н����尡 �߸��Ǿ����ϴ�.");
         }
      } catch (ClassNotFoundException e) {
         e.printStackTrace();
      } catch (SQLException e) {
         e.printStackTrace();
      }
   }
   public static void deleteData() {
      Connection conn = null;  //����
      PreparedStatement pstmt = null;   //����Ŭ���� �̸� ���� ���� ����....
      String sql = "DELETE FROM BOARD WHERE ID = ? AND PW = ?";
      Scanner scanner = new Scanner(System.in);
      System.out.println("������ ���̵� �Է��Ͻÿ�.");
      String selectedID = scanner.nextLine();
      System.out.println("��й�ȣ�� �Է��Ͻÿ�.");
      String selectedPW = scanner.nextLine();
      try {
         Class.forName(driver);
         conn = DriverManager.getConnection(url, id, password);
         pstmt = conn.prepareStatement(sql);
         pstmt.setString(1, selectedID);
         pstmt.setString(2, selectedPW);
         int result = pstmt.executeUpdate();  //���̺��� ���� ������ ��ġ�� sql�� executeUpdate()
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
   //�� �޾ƿ���....
   public static void getData() {
      Connection conn = null;  //����
      Statement stmt = null;   //����
      ResultSet rs = null;     //���
      String sql = "SELECT * FROM BOARD ORDER BY NO DESC";
      
      try {
         Class.forName(driver);
         conn = DriverManager.getConnection(url, id, password);
         stmt = conn.createStatement();
         rs = stmt.executeQuery(sql);
         //���� ����� ������
         while(rs.next()) {
            String no = rs.getString("NO");  // 1������ �����Ѵ�.  rs.getString(1);
            String id = rs.getString("ID");  // 1������ �����Ѵ�.  rs.getString(1);
            String pw = rs.getString("PW");  // 1������ �����Ѵ�.  rs.getString(1);
            String name = rs.getString("NAME");  // 1������ �����Ѵ�.  rs.getString(1);
            String contents = rs.getString("CONTENTS");  // 1������ �����Ѵ�.  rs.getString(1);
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
      Connection conn = null;  //����
      PreparedStatement pstmt = null;   //����
      ResultSet rs = null;     //���
      String sql = "SELECT * FROM BOARD WHERE NO = ?";
      
      Scanner scanner = new Scanner(System.in);
      System.out.println("��� �Խù��� ��������ǰ���?");
      int selectedNo =  scanner.nextInt();
      
      try {
         Class.forName(driver);
         conn =  DriverManager.getConnection(url, id, password);
         pstmt = conn.prepareStatement(sql);
         pstmt.setInt(1,selectedNo);
         rs = pstmt.executeQuery();
         while(rs.next()) {
            String no = rs.getString("NO");  // 1������ �����Ѵ�.  rs.getString(1);
            String id = rs.getString("ID");  // 1������ �����Ѵ�.  rs.getString(1);
            String pw = rs.getString("PW");  // 1������ �����Ѵ�.  rs.getString(1);
            String name = rs.getString("NAME");  // 1������ �����Ѵ�.  rs.getString(1);
            String contents = rs.getString("CONTENTS");  // 1������ �����Ѵ�.  rs.getString(1);
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






