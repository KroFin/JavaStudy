package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest01 {

    private static FileInputStream fileInputStream;

    public static void main(String[] args){
        try {
            fileInputStream = new FileInputStream("E:\\大三Java\\threadLearn\\src\\io\\temp");
            int readDate = fileInputStream.read();
            System.out.println(readDate);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileInputStream != null){
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
