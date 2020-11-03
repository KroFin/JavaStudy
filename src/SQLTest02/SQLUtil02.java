package SQLTest;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SQLUtil {
    public static File createADatabase(String databaseName) throws SQLUtilException {
        File file = new File(databaseName+".txt");
        if (!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return file;
    }

    public static void insertIntoDataBase(File database , ArrayList list){

        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(database));
            for (Object object : list){
                oos.writeObject(object);
            }
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static ArrayList selectInfoFromDataBase(File database) throws IOException, ClassNotFoundException, SQLUtilException {
        ArrayList list = new ArrayList();
        FileInputStream fileInputStream = new FileInputStream(database);
        ObjectInputStream ois = new ObjectInputStream(fileInputStream);
        while (fileInputStream.available() > 0 ){
            Object obj = ois.readObject();
            list.add(obj);
        }
        ois.close();
        return list;
    }
}
