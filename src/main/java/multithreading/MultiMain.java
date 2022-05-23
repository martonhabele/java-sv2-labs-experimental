package multithreading;

public class MultiMain {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            MultiThreading myMulti = new MultiThreading(i);
            myMulti.start();
        }
    }
}