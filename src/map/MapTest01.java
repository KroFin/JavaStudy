package map;

import com.sun.source.tree.NewArrayTree;

import java.util.*;

public class MapTest01 {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"steve");
        map.put(2,"miller");
        map.put(3,"KroFin");

        //遍历Map集合
        //获取所有的Key，所有的Key是一个Set集合
        Set<Integer> keys = map.keySet();
//        Iterator<Integer> it = keys.iterator();
//        while (it.hasNext()){
//            Integer key = it.next();
//            String value = map.get(key);
//            System.out.println(value);
//        }

        for (Integer integer : keys){
            String value = map.get(integer);
            System.out.println(value);
        }
        Properties properties = new Properties();
    }
}
