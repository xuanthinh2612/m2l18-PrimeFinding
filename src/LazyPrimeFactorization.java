public class LazyPrimeFactorization implements Runnable {
    private int number;

    public LazyPrimeFactorization(int number) {
        this.number = number;
    }

    @Override

    public void run() {
        for (int i = 0; i <= number; i++) {
            if (isPrime(i)) System.out.println("stupid " + i);
        }

    }

    private boolean isPrime(int num) {
        if (num < 2) return false;
        if (num == 2 || num == 3) return true;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

}
