import com.sun.source.tree.IfTree;
import print.*;
import service.A;
import service.B;

import java.util.Scanner;
import java.util.concurrent.*;

/**
 *
 */

class OOTest04{
    public static void main(String[] args) {
//        Animal animal = new Animal();
//        animal.move();
//
//        Cat cat = new Cat();
//        cat.move();
//        cat.catchMouse();
//
//        Bird bird = new Bird();
//        bird.move();
//
//        //使用多态语法
//
//        Animal animal1 = new Cat();
//        animal1.move();
//
//        Cat cat1 = (Cat) animal1;
//        cat1.catchMouse();

//        Animal animal2 = new Bird();
//        if (animal2 instanceof Cat){
//            Cat cat2 = (Cat) animal2;
//        }else if (animal2 instanceof Bird){
//            Bird bird1 = (Bird) animal2;
//        }

//        Scanner scanner = new Scanner(System.in);
//
//        Humen h = new Humen();
//
//        Bird bird = new Bird();
//
//        Cat cat = new Cat();
//
//        h.Move(cat);

        B b = new A();
        b.m1();


    }
}

class OOTest03{

    static {
        System.out.println("静态代码块执行");
    }

    public static void main(String[] args) {
        Chinese zhangshan = new Chinese();
        zhangshan.Chinese("1","zhangshan",Chinese.country);
    }
}


class OOTest02{
    public static void main(String[] arg){
//        U u = new U();
//        u.setUsername("Steve");
//        u.setPassword("123456");
//        System.out.println(u.getUsername());

        doSome();

        OOTest02 ooTest02 = new OOTest02();
        ooTest02.doOther();

    }
    public static void doSome(){

    }

    public void doOther(){

    }
}


class AnotherMain{
    public static void main(String[] args){
        //使用递归计算1-N的值
        System.out.println("请输入N的值：");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int valueFinal = sum(n);
        System.out.println(valueFinal);
    }

    public static int sum(int a){
        if(a == 1){
            return 1;
        }
        return a + sum(a-1);
    }
}


public class Main {

//    public static class MyThread extends Thread{
//
//        @Override
//        public void run(){
//            System.out.println("MyThread");
//        }
//    }

    static class Task implements Callable<Integer>{

        @Override
        public Integer call() throws Exception {

            Thread.sleep(1000);

            return 2;
        }
    }

    public static class YouThread implements Runnable{

        @Override
        public void run() {
            System.out.println("Your New Thread");
        }
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {

//        new Thread(new YouThread()).start();

        //Java 8 中的新特性，用函数的方式创建新的线程
//        new Thread(() -> {
//            System.out.println("This is yourThread too");
//        }).start();

//        ExecutorService executorService = Executors.newCachedThreadPool();
//        FutureTask<Integer> futureTask = new FutureTask<>(new Task());
//        executorService.submit(futureTask);
//        System.out.println(futureTask.get());

        Thread a = new Thread();
        System.out.println("线程A的优先级为：" + a.getPriority());
        Thread b = new Thread();
        b.setPriority(10);
        System.out.println("线程B的优先级为：" + b.getPriority());
    }
}
