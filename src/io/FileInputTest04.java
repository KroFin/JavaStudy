package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputTest04 {
    public static void main(String[] args) {
        FileInputStream fls;
        try {

            //这种方式不适合读取大文件，因为byte数组不能太大
            fls = new FileInputStream("E:\\大三Java\\threadLearn\\src\\io\\temp");
            byte[] bytes = new byte[4];

            int readCount;

            while ((readCount = fls.read(bytes)) != -1){
                System.out.print(new String(bytes, 0,readCount));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
