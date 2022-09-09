


class WorkerThread implements Runnable {
    private final String message;
    public WorkerThread(String s){
        this.message=s;
    }
    public void run() {
        System.out.println(Thread.currentThread().getName()+" (Start) message = "+message);
        processMessage();
        System.out.println(Thread.currentThread().getName()+" (End)");
    }
    private void processMessage() {
        try {  Thread.sleep(6000);  } catch (InterruptedException e) { e.printStackTrace(); }
    }
}
