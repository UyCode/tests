package com.uycode;

import java.io.*;

public class TryWithResource {

    public static void main(String[] args) throws IOException {
        copy("D:\\GitLab\\tests\\src\\com\\uycode\\test.txt", "D:\\GitLab\\tests\\src\\com\\uycode\\dist.txt");
    }

    static void copy(String src, String dst) throws IOException {
        int BUFFER_SIZE = 10;
        try(InputStream in = new FileInputStream(src);
            OutputStream out = new FileOutputStream(dst)
        ) {
            byte[] bytes = new byte[BUFFER_SIZE];
            int n;
            while((n = in.read(bytes)) >= 0){
                out.write(bytes, 0, n);
            }
        }
    }

    static String firstLineOfFile(String path, String defaultVal) {
        InputStream in;
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            return br.readLine();
        }catch (IOException e) {
            return defaultVal;
        }
    }
}
