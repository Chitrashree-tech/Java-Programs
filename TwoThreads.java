public class TwoThreads{

    static class DisplayBMSCollegeThread extends Thread {
                public void run() {
            try {
                while (true) {
                    System.out.println("BMS College of Engineering");
                    Thread.sleep(10000);
                }
            } catch (InterruptedException e) {
                System.out.println("Thread Interrupted");
            }
        }
    }

    static class DisplayCSEThread extends Thread {
                public void run() {
            try {
                while (true) {
                    System.out.println("CSE");
                    Thread.sleep(2000);
                }
            } catch (InterruptedException e) {
                System.out.println("Thread Interrupted");
            }
        }
    }

    public static void main(String[] args) {
        Thread bmsThread = new DisplayBMSCollegeThread();
        Thread cseThread = new DisplayCSEThread();
        bmsThread.start();
        cseThread.start();
    }
}
