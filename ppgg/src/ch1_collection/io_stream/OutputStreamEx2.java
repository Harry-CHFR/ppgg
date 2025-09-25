package ch1_collection.io_stream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStreamEx2 {

    public static void main(String[] args) throws Exception {

        File file = new File("D:\\project\\sjkim\\ppgg\\ppgg\\src\\ch1_collection\\io_stream\\output.txt");

        System.out.println("file = " + file);
        System.out.println("file.getName() = " + file.getName());


        int data = 0;
        int count = 1;
        byte[] buffer = new byte[4096]; // 4KB



        try (
                FileOutputStream fileOutputStream = new FileOutputStream(file);
        ) {

            fileOutputStream.write("윾가 브리드\n".getBytes());
            fileOutputStream.write("아야어여\n".getBytes());
            fileOutputStream.write("아야어여\n".getBytes());
            fileOutputStream.write("아야어여\n".getBytes());
            fileOutputStream.write("아야어여\n".getBytes());
            fileOutputStream.write("아야어여\n".getBytes());
            fileOutputStream.write("아야어여\n".getBytes());
            fileOutputStream.write("아야어여\n".getBytes());
            fileOutputStream.write("아야어여\n".getBytes());
            fileOutputStream.write("아야어여\n".getBytes());
            fileOutputStream.write("아야어여\n".getBytes());
            fileOutputStream.write("아야어여\n".getBytes());
            fileOutputStream.write("아야어여\n".getBytes());
            fileOutputStream.write("아야어여\n".getBytes());




        } catch (Exception e) {
            throw new RuntimeException(e);
        }




    }
}
