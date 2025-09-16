package ch1_collection.file;

import java.io.File;
import java.io.IOException;

public class FileEx2 {

    public static void main(String[] args) {

        try {
            File file = new File("DA:\\test.txt");
            file.createNewFile();

        } catch(Exception e) {
            e.printStackTrace();
        }


    }
}
