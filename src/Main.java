public class Main {

    public static void main(String[] args) {
        for (int i = 1; i <=5; i++) {
            Runner runner = new Runner(i, "forwards");
            runner.run();
            try {
                runner.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        for (int i = 4; i >=1 ; i--) {
            Runner runner = new Runner(i,"backwards");
            runner.run();
            try {
                runner.join();
            } catch (InterruptedException e) {e.printStackTrace();}
        }
    }
}
