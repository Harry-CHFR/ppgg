package ch1_collection.io_stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class OutputStreamEx1 {

    public static void main(String[] args) {

        File file = new File("D:\\project\\sjkim\\ppgg\\ppgg\\src\\ch1_collection\\io_stream\\output.txt");

        System.out.println("file = " + file);
        System.out.println("file.getName() = " + file.getName());


        int data = 0;
        int count = 1;
        byte[] buffer = new byte[1024]; // 4KB



        try (
                FileOutputStream fileOutputStream = new FileOutputStream(file);
        ) {

            // 65 는 유니코드 값이고, 문자로는 A 다, A 가 출력되길 기대
            fileOutputStream.write(65);




        } catch (Exception e) {
            throw new RuntimeException(e);
        }




    }
}
