/**
 **** Thread:-
     ---> Thread is a light weight sub process
     ---> A thread is a process of executing multiple threads simultaneously is called multithreading
Creating threads in Java :-
     -->To create thread in java use the following approaches
        1.By Extending the thread class
        2.By Implementing the Runnable interface
 */

// Java program to create a thread by extending the thread class

class Test extends Thread{
    public void run(){

        for(int i=1;i<=5;i++){
            System.out.println(i);
        }

    }
}

class Main{
    public static void main(String[] args) {


            Test m =new  Test();
            m.start();


    }
}

