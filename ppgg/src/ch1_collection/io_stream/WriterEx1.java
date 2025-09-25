package ch1_collection.io_stream;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class WriterEx1 {

    public static void main(String[] args) {

        File file = new File("D:\\project\\sjkim\\ppgg\\ppgg\\src\\ch1_collection\\io_stream\\writer.txt");

        // try resource catch
        try (
                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file, true))
        ) {


            bufferedWriter.newLine();
            bufferedWriter.write("안녕하세요");
            bufferedWriter.newLine();
            bufferedWriter.write("안녕하세요2");
            bufferedWriter.newLine();
            bufferedWriter.write("안녕하세요3");




        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
