package ch1_collection.io_stream;

import java.io.*;

public class ReaderEx1 {

    public static void main(String[] args) {

        File file = new File("D:\\project\\sjkim\\ppgg\\ppgg\\src\\ch1_collection\\io_stream\\admin.sql");

        System.out.println("file = " + file);
        System.out.println("file.getName() = " + file.getName());


        FileReader fileReader = null;
        try {

            fileReader = new FileReader(file);

            int data = 0;
            int index = 1;
            while((data = fileReader.read()) != -1) {
//                System.out.print( "[ " + index+" ] data = " + data);
                System.out.print((char) data);
                index++;
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            if(fileReader != null) {
                try {
                    fileReader.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }

            }
        }


    }
}
