
class NamingThread extends Thread{
    @Override
    public void run() {
        System.out.println("Running Thread....!");
    }

    public static void main(String[] args) {
        NamingThread t1 = new NamingThread();
        NamingThread t2 = new NamingThread();

        System.out.println("Name of thread 0-"+t1.getName());
        System.out.println("Name of thread 1-"+t2.getName());

        t1.start();
        t2.start();


        t1.setName("E.H.Guru Prasad Reddy");

        System.out.println("After Changing name :- "+t1.getName());
    }

}
