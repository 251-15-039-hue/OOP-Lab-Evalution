class PrinterManager {

    private static PrinterManager instance;
    private int jobCounter;

    private PrinterManager() {
        jobCounter = 0;
    }

    public static PrinterManager getInstance() {
        if (instance == null) {
            instance = new PrinterManager();
        }

        return instance;
    }

    public void printJob(String job) {
        jobCounter++;
        System.out.println(job);
    }

    public int getJobCounter() {
        return jobCounter;
    }
}

public class Main {
    public static void main(String[] args) {

        PrinterManager p1 = PrinterManager.getInstance();
        PrinterManager p2 = PrinterManager.getInstance();

        p1.printJob("Job 1");
        p2.printJob("Job 2");
        p1.printJob("Job 3");

        System.out.println("Final Job Counter: " +
                           p1.getJobCounter());
    }
}
