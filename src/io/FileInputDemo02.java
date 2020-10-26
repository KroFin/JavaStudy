package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputDemo02 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {

            int fileData;

            fis = new FileInputStream("E:\\大三Java\\threadLearn\\src\\io\\temp");
            while ((fileData = fis.read()) != -1){
                System.out.println(fileData);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fis != null){
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
