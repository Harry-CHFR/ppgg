package ch1_collection.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class FileEx3 {

    public static void main(String[] args) throws Exception {

        FileInputStream fis = new FileInputStream(new File("D:\\back_reset.min.css"));

        int data = -1;
        while ((data = fis.read()) != -1) {
            // byte를 char로 변환하여 출력
            System.out.print((char) data);
        }

        fis.close();

    }
}
