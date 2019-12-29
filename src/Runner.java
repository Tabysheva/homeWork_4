public class Runner extends Thread {
    private int rn;
    private String route;

    public Runner(int rn, String route) {
        this.rn = rn;
        this.route = route;
    }

    public synchronized void run() {
        try {
            if (rn < 5 && route.equals("forwards")) {
                System.out.println("Runner " + rn + " Берет палочку ");
                System.out.println("Runner " + rn + " Бежит к Runner " + (rn + 1));
                sleep(1000);
            }
            if (rn == 5) {
                System.out.println("Runner " + rn + " Берет палочку ");
                System.out.println("Runner " + rn + " Бежит к финишу ");
                sleep(1000);
                System.out.println(" Runner " + rn + " Бежит к Runner " + (rn - 1));
            }
            if (rn > 1 && route.equals("backwards")) {
                System.out.println("Runner " + (rn) + " Берет палочку ");
                System.out.println("Runner " + (rn) + " Бежит к Runner " + (rn - 1));
                sleep(1000);
            }
            if (rn == 1 && route.equals("backwards")) {
                System.out.println("Runner" + (rn) + " Берет палочку ");
            }
        } catch (InterruptedException e) {
        }

    }
}


