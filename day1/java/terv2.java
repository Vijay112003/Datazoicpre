import java.util.Random;

class RandomNumberGenerator extends Thread {
    public void run() {
        int n=10;
        Random random = new Random();
        while (n-->0) {
            int num = random.nextInt(100);
            System.out.println("Generated Number: " + num);
            if (num % 2 == 0) {
                new SquareCalculator(num).start();
            } else {
                new CubeCalculator(num).start();
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class SquareCalculator extends Thread {
    private int number;

    SquareCalculator(int number) {
        this.number = number;
    }

    public void run() {
        System.out.println("Square of " + number + " is: " + (number * number));
    }
}

class CubeCalculator extends Thread {
    private int number;

    CubeCalculator(int number) {
        this.number = number;
    }

    public void run() {
        System.out.println("Cube of " + number + " is: " + (number * number * number));
    }
}

class Terv2 {
    public static void main(String[] args) {
        new RandomNumberGenerator().start();
    }
}