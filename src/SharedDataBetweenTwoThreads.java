public class SharedDataBetweenTwoThreads {
    public static class MyTask implements Runnable{
        private int count =0;

        @Override
        public void run() {
            String threadName = Thread.currentThread().getName();

            System.out.println(" Running  "+threadName);

            for(int i=0;i<42_00;i++){
                synchronized (this){
                    this.count++;

                    //read and write operation
                }
            }

            //read operation
            synchronized (this){
                System.out.println(" Count:  "+threadName + this.count);
            }
        }

        public synchronized  int getCount(){
            return this.count;
        }
    }

    private static void sleep(long millis){
        try{
            Thread.sleep(millis);

        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args){
        MyTask myTask = new MyTask();

        Thread thread1 = new Thread(myTask,"Thread 1");
        Thread thread2 = new Thread(myTask,"Thread 2");

        thread1.start();

        thread2.start();

        sleep(8);

        System.out.println("Count at t0 : "+myTask.getCount());

        sleep(10);

        System.out.println("Count at t1 :  "+myTask.getCount());

        sleep(12);

        System.out.println("Count at t2 :  "+myTask.getCount());

    }
}
