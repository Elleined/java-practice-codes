package multithreading;

public class MultiThreadingExam {

    public MultiThreadingExam() {
        Thread thread1 = new Thread(() -> {
            try {
                System.out.println("Thread1 Started!");
                int i = 0;
                while (i <= 10) {
                    Thread.sleep(10);
                    System.out.println(i);
                    i++;
                }
            } catch (InterruptedException ignored) {}
        }, "Thread1");

        Thread thread2 = new Thread(() -> {
            try {
                thread1.join();
                System.out.printf("%s is %s%n", thread1.getName(), thread1.getState());
                System.out.println("Thread2 Started!");
                int i = 11;
                while (i <= 20) {
                    Thread.sleep(10);
                    System.out.println(i);
                    i++;
                }
            } catch (InterruptedException ignored) {}
        }, "Thread2");
        thread1.start();
        thread2.start();
    }
}
