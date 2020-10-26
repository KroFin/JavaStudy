package thread;

public class ThreadTest02 {
    public static void main(String[] args) {

        MyThreadAnother myThreadAnother = new MyThreadAnother();
        Thread thread = new Thread(myThreadAnother);
        thread.start();

        for (int i = 0 ; i <1000 ; i++){
            System.out.println("主线程："+i);
        }
    }
}

class MyThreadAnother implements Runnable{

    @Override
    public void run() {
        for (int i = 0 ; i <1000 ; i++){
            System.out.println("分支线程："+i);
        }
    }
}