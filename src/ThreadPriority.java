public class ThreadPriority extends Thread{
    @Override
    public void run() {
        System.out.println("These is inside run() method");

    }

    public static void main(String[] args) {

        Thread.currentThread().setPriority(9);


        System.out.println("Priority of the main thread :-"+Thread.currentThread().getPriority());

        Thread.currentThread().setPriority(3);

        System.out.println("Priority of the main thread :-"+Thread.currentThread().getPriority());

        ThreadPriority threadPriority = new ThreadPriority();

        System.out.println("Priority of the  thread:- "+threadPriority.getPriority());

        System.out.println("Priority of the  thread:- "+threadPriority.getPriority());


    }

}
