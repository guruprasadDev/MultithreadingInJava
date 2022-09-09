/**
     DeadLock:-
          Deadlock  in java is a part of multithreading. Deadlock can occur in a situation when
         a thread is waiting for an object look, that is required by another thread and second
         thread is waiting for an object lock that is acquired by first thread.
 */


public class DeadLockInJava {

    final String fName = "Guru Prasad";
    final String lName = "Esambattu";



    Thread t1 = new Thread(){
        @Override
        public void run() {
            while (true){
                synchronized(fName){
                    try{
                        System.out.println(Thread.currentThread().getName()+" Locked "+ fName );

                        Thread.sleep(100);
                    }catch (InterruptedException ie){
                        ie.printStackTrace();
                    }
                        synchronized (lName){
                            System.out.println(Thread.currentThread().getName()+" Locked "+ lName );

                            System.out.println("Full name "+fName+" "+lName);
                        }
                }
            }
        }
    };


    Thread t2 = new Thread(){
        @Override
        public void run() {
            while (true){
                synchronized(lName){
                    try{
                        System.out.println(Thread.currentThread().getName()+" Locked "+ lName );

                        System.out.println(Thread.currentThread().getName()+" Locked "+ lName );
                        Thread.sleep(100);
                    }catch (InterruptedException ie){
                        ie.printStackTrace();
                    }
                    synchronized (fName){
                        System.out.println(Thread.currentThread().getName()+" Locked "+ fName );

                        System.out.println("Full name "+fName+" "+lName);
                    }
                }
            }
        }
    };

    public static void main(String[] args) {
        DeadLockInJava obj = new DeadLockInJava();
        obj.t1.start();
        obj.t2.start();
    }
}
