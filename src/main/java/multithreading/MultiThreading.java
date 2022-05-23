package multithreading;

public class MultiThreading extends Thread {
    private int threadNumber;
    public MultiThreading(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    @Override
    public void run(){
        for (int i = 1; i <=5; i++) {
            System.out.println(i + " from thread number " + threadNumber);

            //Willingly stopping thread no. 3
            if (threadNumber == 3) {
                throw new RuntimeException();
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}