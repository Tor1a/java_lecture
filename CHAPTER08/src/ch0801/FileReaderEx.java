package ch0801;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx {
   public static void main(String[] args) {
      FileReader fr = null; 
      // ����¿� ���õ� �͵��� try~catch�� ���μ� ����ó���Ѵ�.
         try {
            //fr = new FileReader("C:\\Windows\\system.ini");
            fr = new FileReader("test.txt");
            //console�� ���
            int c; // �������� ���������� �б����� int c�� �����ϰ� ����Ҷ��� �ű⿡ �´� char ����ȯ�ؼ� ����Ѵ�.
            //c = fr.read(); // ������� �ȵ����� ����ó��
            //System.out.print((char)c);
            //eof  ������ ���� �������� ���� -1�� ��ȯ�Ѵ�.
            while((c = fr.read()) != -1) {
               System.out.print((char) c);
            }
            fr.close();
         } catch (FileNotFoundException e) {
            e.printStackTrace();
         } catch (IOException e) {
            e.printStackTrace();
         }
         
   }
}