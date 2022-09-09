        /**
         **** Thread:-
         ---> Thread is a light weight sub process
         ---> A thread is a process of executing multiple threads simultaneously is called multithreading
         Creating threads in Java :-
         -->To create thread in java use the following approaches
         1.By Extending the thread class
         2.By Implementing the Runnable interface
         */

// Java Programming Implementing the runnable interface in threads
class Test1 implements Runnable{

    @Override
    public void run() {
        try {
            System.out.println("Thread " + Thread.currentThread().getId() + " is running");
        }catch (Exception e){
               System.out.println("Exception is Catch");
           }
        }
}
class MultiThreading {

    public static void main(String[] args)  {


        int n=10;

        for (int i= 0; i<n; i++){
            Thread t = new Thread(new Test1());
                t.start();
        }

    }
}
