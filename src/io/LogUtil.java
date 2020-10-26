package io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class LogUtil {
    public static void log(String msg){
        try {
            PrintStream ps = new PrintStream(new FileOutputStream("log",true) , true);
            System.setOut(ps);
            Date date = new Date();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String time = simpleDateFormat.format(date);
            System.out.println(time + " : "+ msg);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
