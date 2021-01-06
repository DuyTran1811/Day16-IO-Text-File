package TH;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ReadFileExample {
    public static void main(String[] args) {
        System.out.println("Nhap Dau Vao");
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();
        ReadFileExample reader = new ReadFileExample();
        reader.readFileExample(path);
    }
    void readFileExample(String filePath) {
        try {
            File file = new File(filePath);
            if (!file.exists()) {
                throw new FileNotFoundException("File Khong Ton Tai");
            }
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            int sum = 0;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                sum += Integer.parseInt(line);
            }
            br.close();
            System.out.println("Tổng: "+ sum);
        } catch (Exception e) {
            System.out.println("File Không Tồn Tại Hoặc Nội Dung Lỗi");
        }
    }
}
