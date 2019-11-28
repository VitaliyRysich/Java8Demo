public class RunableExample {
    public static void main(String[] args) {
        Thread myThread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Printed inside runable");
            }
        });

        myThread.run();

        Thread lambdaThread = new Thread(()-> System.out.println("Printed inside runable lambda"));
        lambdaThread.run();
    }
}
