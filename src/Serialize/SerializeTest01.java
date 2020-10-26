package Serialize;

import java.io.*;

public class SerializeTest01 {
    public static void main(String[] args) {
        Student student = new Student("KroFin", "123456");

        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("log"));

            oos.writeObject(student);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
