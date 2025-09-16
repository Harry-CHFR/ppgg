package ch1_collection.file;

import java.io.File;

public class FileEx1 {

    public static void main(String[] args) {

        File file = new File("D:\\reset.min.css");
        String absolutePath = file.getAbsolutePath();
        System.out.println("absolutePath = " + absolutePath);

        long totalSpace = file.getTotalSpace();
        System.out.println("totalSpace = " + totalSpace);

        String parent = file.getParent();
        System.out.println("parent = " + parent);

        file.renameTo(new File("D:\\back_reset.min.css"));





    }
}
