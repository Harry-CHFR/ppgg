package ch1_collection.io_stream;

import java.io.File;
import java.io.FileInputStream;

public class InputStreamEx1 {

    public static void main(String[] args) {

        File file = new File("D:\\project\\sjkim\\ppgg\\ppgg\\src\\ch1_collection\\io_stream\\java.txt");

        System.out.println("file = " + file);
        System.out.println("file.getName() = " + file.getName());


        int data = 0;
        int count = 1;
        byte[] buffer = new byte[4096]; // 4KB

        try (
                FileInputStream fileReader = new FileInputStream(file);
        ) {


            // 반복문
            /**
             * 한번 읽을때 마다 4KB 씩 읽겠다
             */
            while ((data = fileReader.read(buffer)) != -1) {
                String s = new String(buffer, 0, data);
                System.out.println(s);
                System.out.println("💫`");
                count++;
            }

            System.out.println("읽은 횟수 = " + count);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }




    }
}
