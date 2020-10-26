package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyDemo01 {
    public static void main(String[] args) {
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;

        try {
            fileInputStream = new FileInputStream("E:\\大三Java\\threadLearn\\src\\io\\temp");
            fileOutputStream = new FileOutputStream("E:\\大三Java\\threadLearn\\src\\map\\temp");

            byte[] bytes = new byte[1024* 1024];

            int readCount = 0;
            while ((readCount = fileInputStream.read(bytes)) != -1){
                fileOutputStream.write(bytes,0,readCount);
            }

//            while (true){
//                int readCount02 = fileInputStream.read(bytes);
//                if (readCount02 == -1){
//                    break;
//                }
//                System.out.println();
//            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
