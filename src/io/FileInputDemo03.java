package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputDemo03 {
    public static void main(String[] args) {
        FileInputStream fls = null;
        try {
            fls = new FileInputStream("E:\\大三Java\\threadLearn\\src\\io\\temp");
            byte[] bytes = new byte[4];
            int readCount = fls.read(bytes);
            System.out.println(new String(bytes,0,readCount));

            readCount = fls.read(bytes);
            System.out.println(new String(bytes,0,readCount));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
