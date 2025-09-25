package ch1_collection.io_stream;

import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class ReaderEx4 {

    public static void main(String[] args) {

        File file = new File("D:\\project\\sjkim\\ppgg\\ppgg\\src\\ch1_collection\\io_stream\\admin.sql");

        System.out.println("file = " + file);
        System.out.println("file.getName() = " + file.getName());


        int data = 0;
        int index = 1;
        String line = "";
        List<String> sqlList = new ArrayList<>();


        try (
                FileReader fileReader = new FileReader(file);
        ) {

            while ((data = fileReader.read()) != -1) {
                char text = (char) data;    // 한글자
                line += text;   // 글자를 누적함
                if (text == ';') {
                    sqlList.add(line);
                    line = "";
                }
                index++;
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }


        for (String sql : sqlList) {
            System.out.println("sql = " + sql);
        }


    }
}
