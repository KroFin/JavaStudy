package io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class IOProTest01 {
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("E:\\大三Java\\threadLearn\\src\\io\\userinfo");
            Properties properties = new Properties();
            properties.load(reader);

            System.out.println(properties.getProperty("username"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
