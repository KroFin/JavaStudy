package io;

import java.io.*;
import java.lang.invoke.StringConcatFactory;

public class PathCopyTest01 {
    public static void main(String[] args) {


    }

    public static void copyFile(File path01, File path02){

        if (path01.isFile()){
            return;
        }

        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;

        String pathName01 = "E:\\大三Java\\threadLearn\\src\\algorithm";
        String pathName02 = "E:\\大三Java\\threadLearn\\src\\algorithmCopy";

        File file = new File(pathName01);
        File[] files = file.listFiles();

        File file2 = new File(pathName02);
        if (!file2.exists()){
            file2.mkdir();
        }
        for (File file1 : files){

            copyFile(file1,path02);

            if (file1.isDirectory()){
                System.out.println(file1);
            }

//            try {
//                fileInputStream = new FileInputStream();
//                fileOutputStream = new FileOutputStream();
//
//                byte[] bytes = new byte[1024];
//
//                try {
//                    int count ;
//                    while ((count = fileInputStream.read(bytes)) != -1){
//                        fileOutputStream.write(bytes,0,count);
//                    }
//                } catch (IOException e) {
//                    e.printStackTrace();
//                } finally {
//                    try {
//                        fileInputStream.close();
//                    } catch (IOException e) {
//                        e.printStackTrace();
//                    }
//
//                    try {
//                        fileOutputStream.close();
//                    } catch (IOException e) {
//                        e.printStackTrace();
//                    }
//                }
//
//            } catch (FileNotFoundException e) {
//                e.printStackTrace();
//            }
        }
    }
}
