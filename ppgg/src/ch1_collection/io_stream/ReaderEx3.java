package ch1_collection.io_stream;

import java.io.File;
import java.io.FileReader;

public class ReaderEx3 {

    public static void main(String[] args) {

        File file = new File("D:\\project\\sjkim\\ppgg\\ppgg\\src\\ch1_collection\\io_stream\\admin.sql");

        System.out.println("file = " + file);
        System.out.println("file.getName() = " + file.getName());


        try(
                FileReader fileReader = new FileReader(file);
        ) {


            int data = 0;
            int index = 1;
            String line = "";

            while((data = fileReader.read()) != -1) {
//                System.out.print( "[ " + index+" ] data = " + data);
                char text = (char) data;    // 한글자
                line += text;   // 글자를 누적함
//                System.out.print(text);
                if(text == ';') {
                    System.out.println("끝 도달 => " + line);
                    line = "";
                }
                index++;
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }
}
