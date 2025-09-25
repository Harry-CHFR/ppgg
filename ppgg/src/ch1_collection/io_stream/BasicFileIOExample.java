package ch1_collection.io_stream;

import java.io.*;

public class BasicFileIOExample {
    public static void main(String[] args) {
        // 1. FileOutputStream을 사용한 파일 쓰기
        writeToFile();

        // 2. FileInputStream을 사용한 파일 읽기
//        readFromFile();
    }

    // 파일에 데이터 쓰기
    public static void writeToFile() {
        try (FileOutputStream fos = new FileOutputStream(new File("D:\\project\\sjkim\\ppgg\\ppgg\\src\\ch1_collection\\io_stream\\writer.txt"))) {
            String data = "안녕하세요! Java IO Stream 예제입니다.\n두 번째 줄입니다.";
            byte[] bytes = data.getBytes("UTF-8");
            fos.write(bytes);
            System.out.println("파일 쓰기 완료");
        } catch (IOException e) {
            System.err.println("파일 쓰기 중 오류: " + e.getMessage());
        }
    }

    // 파일에서 데이터 읽기
    public static void readFromFile() {
        try (FileInputStream fis = new FileInputStream(new File("D:\\project\\sjkim\\ppgg\\ppgg\\src\\ch1_collection\\io_stream\\admin.sql"))) {

            /**
             * buffer 변수에 항상 읽은 데이터가 들어감
             */
            byte[] buffer = new byte[2048];

            /**
             * 파일에 있는 문자를 유니코드로 숫자화 시켜서 int 로 값을 가짐
             * 그래서 나중에 다시 글자로 보고싶으면 (char) 로 하거나 String
             */
            int bytesRead = fis.read(buffer);

            if (bytesRead > 0) {
                String content = new String(buffer, 0, bytesRead, "UTF-8");
                System.out.println("파일 내용:");
                System.out.println(content);
            }
        } catch (IOException e) {
            System.err.println("파일 읽기 중 오류: " + e.getMessage());
        }
    }
}
