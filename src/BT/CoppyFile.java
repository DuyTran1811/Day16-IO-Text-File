package BT;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class CoppyFile {
//    private static final String pathFileTo = "/Users/turtle/Documents/Module-2/Day16/src/noname.txt";
//    private static final String pathFileT2 = "/Users/turtle/Documents/Module-2/Day16/src/noname.txt";
//    public static void main(String[] args) {
//        try {
//            InputStream inStream = new FileInputStream(pathFileTo);
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//        OutputStream outputStream = null;
//    }
    private static final String pathFileTo = "/Users/turtle/Documents/Module-2/Day16/src/noname.txt";
    private static final String pathFileTo2 = "/Users/turtle/Documents/Module-2/Day16/src/nonam2.txt";

    public static void main(String[] args) {
        File srcFile = new File(pathFileTo);
        File destFile = new File(pathFileTo2);
        copyFileUsingStream(srcFile, destFile);
    }

    private static void copyFileUsingStream(File source, File dest) {
        InputStream is = null;
        OutputStream os = null;
        try {
            is = new FileInputStream(source);
            os = new FileOutputStream(dest);
            int length;
            byte[] buffer = new byte[1024];
            while ((length = is.read(buffer)) > 0) {
                os.write(buffer, 0, length);
            }
            System.out.println("Sao Chep Thanh Cong");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

//    private static void copyFileUsingJava7Files(File src, File dest) throws IOException {
//        Files.copy(src.toPath(),dest.toPath(), StandardCopyOption.REPLACE_EXISTING);
//    }

}
