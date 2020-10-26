package io;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo01 {
    public static void main(String[] args) {
        FileWriter fileWriter = null;

        try {
            fileWriter = new FileWriter("E:\\大三Java\\threadLearn\\src\\io\\tempOut" ,true);

            //true代表可以累加编写

            char[] chars = {'我','是','中','国','人'};
            fileWriter.write(chars);

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
