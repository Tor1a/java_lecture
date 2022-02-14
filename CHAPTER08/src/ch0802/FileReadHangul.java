package ch0802;

import java.io.FileInputStream; // ��� ����� ���õ� �͵��� io ��Ű���� �� �ִ�. 
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileReadHangul {
   public static void main(String[] args) {
      FileInputStream fis = null;
      InputStreamReader in = null;
      try {
         fis = new FileInputStream("C:\\Users\\user-000\\Desktop\\test.txt");    //���ڸ� ����Ʈ �о ���....
         //in = new InputStreamReader(fis,"UTF-8");  // byte �� FileInputStream�� �Ű������� �޴� MS949
         in = new InputStreamReader(fis,"EUC-KR");  // ANSI���� ms949/euc-kr    utf-8  utf-8
         int c;  // eof  -1�� ��ȯ
         while((c = in.read()) != -1 ) {
             System.out.print((char) c);
         }
         in.close();
         fis.close();
      } catch (IOException e) {
         e.printStackTrace();
      }
   }
}