package test;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Test {

    public static void main(String[] args) {
        try {
            // 직접 경로 지정 (필요시 수정)
            String sqlDirectoryPath = "src/test"; // 여기 수정!
            File currentDir = new File(sqlDirectoryPath);

            // 또는 현재 working directory 사용
            // File currentDir = new File(System.getProperty("user.dir"));

            System.out.println("검색 디렉토리: " + currentDir.getAbsolutePath());
            System.out.println("디렉토리 존재 여부: " + currentDir.exists());

            if (!currentDir.exists()) {
                System.out.println("❌ 디렉토리가 존재하지 않습니다!");
                return;
            }

            // 현재 디렉토리의 모든 파일 출력
            System.out.println("\n디렉토리 내 모든 파일:");
            File[] allFiles = currentDir.listFiles();
            if (allFiles != null) {
                for (File file : allFiles) {
                    System.out.println("- " + file.getName() + (file.isDirectory() ? " (폴더)" : ""));
                }
            }

            // .sql 파일들 찾기
            File[] files = currentDir.listFiles(new FilenameFilter() {
                @Override
                public boolean accept(File dir, String name) {
                    return name.toLowerCase().endsWith(".sql");
                }
            });

            if (files == null || files.length == 0) {
                System.out.println("\n❌ SQL 파일이 없습니다.");
                return;
            }

            // 파일명 순서로 정렬
            Arrays.sort(files, new Comparator<File>() {
                @Override
                public int compare(File f1, File f2) {
                    return f1.getName().compareTo(f2.getName());
                }
            });

            System.out.println("\n✅ 발견된 SQL 파일들:");
            for (File file : files) {
                System.out.println("- " + file.getName());
            }

            // 출력 파일
            File outputFile = new File(currentDir, "total_insert.sql");
            FileWriter fileWriter = new FileWriter(outputFile);
            BufferedWriter writer = new BufferedWriter(fileWriter);

            try {
                for (File sqlFile : files) {
                    // 파일명을 주석으로 추가
                    writer.write("-- ========================================");
                    writer.newLine();
                    writer.write("-- " + sqlFile.getName());
                    writer.newLine();
                    writer.write("-- ========================================");
                    writer.newLine();
                    writer.newLine();

                    // 파일 읽기
                    FileReader fileReader = new FileReader(sqlFile);
                    BufferedReader reader = new BufferedReader(fileReader);

                    try {
                        String line;
                        while ((line = reader.readLine()) != null) {
                            writer.write(line);
                            writer.newLine();
                        }
                    } finally {
                        reader.close();
                        fileReader.close();
                    }

                    writer.newLine();
                    writer.newLine();
                }

                System.out.println("\n🎉 병합 완료!");
                System.out.println("📁 출력 파일: " + outputFile.getAbsolutePath());
                System.out.println("📊 총 " + files.length + "개 파일 합침");

            } finally {
                writer.close();
                fileWriter.close();
            }

        } catch (Exception e) {
            System.err.println("❌ 오류 발생: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
